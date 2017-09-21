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
import br.edu.ifce.diagtur.objetos.SistemaTransportes;

public class frmSistemaTransporte extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextTipo, editTextSubtipo,
            editTextCodigo, editTextUF, editTextMunicipio, editTextDistrito,
            editTextDenominacao, editTextEndereco, editTextTrecho, editTextEmpresa,
            editTextExtensao, editTextKM, editTextTempo, editTextHoras, editTextTipoVeiculo,
            editTextHorarios;

    // Conexão com o Firebase
    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_sistema_transporte);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.st));

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
        editTextDenominacao = (EditText) findViewById(R.id.editTextDenominacao);
        editTextEndereco = (EditText) findViewById(R.id.editTextEndereco);
        editTextTrecho = (EditText) findViewById(R.id.editTextTrecho1);
        editTextEmpresa = (EditText) findViewById(R.id.editTextEmpresa1);
        editTextExtensao = (EditText) findViewById(R.id.editTextExtensao1);
        editTextKM = (EditText) findViewById(R.id.editTextKm1);
        editTextTempo = (EditText) findViewById(R.id.editTextTempoViagem1);
        editTextHoras = (EditText) findViewById(R.id.editTextHoras1);
        editTextTipoVeiculo = (EditText) findViewById(R.id.editTextTipoVeiculo1);
        editTextHorarios = (EditText) findViewById(R.id.editTextHorario1);

    }

    // Evento de clique no botão Salvar
    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // Instanciação da classe
            SistemaTransportes st = new SistemaTransportes();

            // Atribuição de valores
            st.setAuth(firebaseUser.getEmail());
            st.setCategoria(editTextCategoria.getText().toString());
            st.setTipo(editTextTipo.getText().toString());
            st.setSubtipo(editTextSubtipo.getText().toString());
            st.setCodigo(editTextCodigo.getText().toString());
            st.setUf(editTextUF.getText().toString());
            st.setMunicipio(editTextMunicipio.getText().toString());
            st.setDistrito(editTextDistrito.getText().toString());
            st.setDenominacao(editTextDenominacao.getText().toString());
            st.setEndereco(editTextEndereco.getText().toString());
            st.setTrecho(editTextTrecho.getText().toString());
            st.setEmpresa(editTextEmpresa.getText().toString());
            st.setExtensao(editTextExtensao.getText().toString());
            st.setKm(editTextKM.getText().toString());
            st.setTempo(editTextTempo.getText().toString());
            st.setHoras(editTextHoras.getText().toString());
            st.setTipo_veiculo(editTextTipoVeiculo.getText().toString());
            st.setHorarios(editTextHorarios.getText().toString());

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            st.setData_submissao(s);

            // Inserção no banco
            firebaseReference.child("sistema_transporte").push().setValue(st);

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
