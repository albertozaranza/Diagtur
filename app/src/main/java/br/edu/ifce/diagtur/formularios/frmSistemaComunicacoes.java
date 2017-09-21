package br.edu.ifce.diagtur.formularios;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

import br.edu.ifce.diagtur.R;
import br.edu.ifce.diagtur.objetos.SistemaComunicacoes;

public class frmSistemaComunicacoes extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextTipo, editTextSubtipo, editTextCodigo, editTextUF,
            editTextMunicipio, editTextDistrito, editTextOrdem, editTextEstabelecimento,
            editTextEndereco, editTextPublico, editTextPrivado, editTextAtendimento, editTextEspecificacao;

    // Conexão com o Firebase
    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_sistema_comunicacoes);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.sc));

        // Declaração e chamada de evento do botão de save
        Button btnSalvar = (Button) findViewById(R.id.buttonSalvar);
        btnSalvar.setOnClickListener(btnSalvarAction);

        // Atribuição dos EditText
        editTextCategoria = (EditText) findViewById(R.id.editTextCategoria);
        editTextTipo = (EditText) findViewById(R.id.editTextTipo);
        editTextSubtipo = (EditText) findViewById(R.id.editTextSubtipo);
        editTextCodigo = (EditText) findViewById(R.id.editTextCodigo);
        editTextUF = (EditText) findViewById(R.id.editTextUF);
        editTextMunicipio = (EditText) findViewById(R.id.editTextMunicipio);
        editTextDistrito = (EditText) findViewById(R.id.editTextDistrito);
        editTextOrdem = (EditText) findViewById(R.id.editTextOrdem);
        editTextEstabelecimento = (EditText) findViewById(R.id.editTextNomeEstabelecimento);
        editTextEndereco = (EditText) findViewById(R.id.editTextEndereco);
        editTextPublico = (EditText) findViewById(R.id.editTextPublico);
        editTextPrivado = (EditText) findViewById(R.id.editTextPrivado);
        editTextAtendimento = (EditText) findViewById(R.id.editTextHorarioAtendimento);
        editTextEspecificacao = (EditText) findViewById(R.id.editTextHorarioEspecificacao);


    }

    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // Instanciação da classe
            SistemaComunicacoes sc = new SistemaComunicacoes();

            // Atribuição de valores
            sc.setAuth(firebaseUser.getEmail());
            sc.setCategoria(editTextCategoria.getText().toString());
            sc.setTipo(editTextTipo.getText().toString());
            sc.setSubtipo(editTextSubtipo.getText().toString());
            sc.setCodigo(editTextCodigo.getText().toString());
            sc.setUf(editTextUF.getText().toString());
            sc.setMunicipio(editTextMunicipio.getText().toString());
            sc.setDistrito(editTextDistrito.getText().toString());
            sc.setOrdem(editTextOrdem.getText().toString());
            sc.setEstabelecimento(editTextEstabelecimento.getText().toString());
            sc.setEndereco(editTextEndereco.getText().toString());
            sc.setPublico(editTextPublico.getText().toString());
            sc.setPrivado(editTextPrivado.getText().toString());
            sc.setAtendimento(editTextAtendimento.getText().toString());
            sc.setEspecificacao(editTextEspecificacao.getText().toString());

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            sc.setData_submissao(s);

            // Inserção no banco
            firebaseReference.child("sistema_comunicacoes").push().setValue(sc);

            // Mensagem de sucesso
            InternetConnection ic = new InternetConnection();
            if(ic.verificaConexao(getApplicationContext())){
                Toast toast = Toast.makeText(getApplicationContext(), "Dados salvos com sucesso!", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Não há conexão com a internet! Os dados serão enviados quando uma conexão com a internet for estabelecida",
                        Toast.LENGTH_LONG);
                toast.show();
            }

            // Encerra a intent
            finish();

        }
    };
}
