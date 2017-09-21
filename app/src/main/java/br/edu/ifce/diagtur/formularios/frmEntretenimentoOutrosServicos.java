package br.edu.ifce.diagtur.formularios;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

import br.edu.ifce.diagtur.R;
import br.edu.ifce.diagtur.objetos.Entretenimento;

public class frmEntretenimentoOutrosServicos extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextTipo, editTextSubtipo,
            editTextCodigo, editTextUF, editTextMunicipio, editTextDistrito,
            editTextDenominacao, editTextLocalizacao, editTextTelefone, editTextFax, editTextHomepage,
            editTextEmail, editTextRegistro, editTextLocalidadeProxima, editTextDistancia, editTextLocaliacaoProxima,
            editTextCaracterizacaoEquipamento, editTextCapacidadeEquipamento, editTextServicosOferecidos, editTextObservacoes;

    // Strings
    private String transporte_stg = "", privacidade_stg = "", transporteUrbano_stg = "";

    // Conexão com o Firebase
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_entretenimento_outros_servicos);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.ent));

        // Atribuição e chamada de evento do evento de clique do botão de save
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
        editTextLocalizacao = (EditText) findViewById(R.id.editTextLocalizacao);
        editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        editTextFax = (EditText) findViewById(R.id.editTextFax);
        editTextHomepage = (EditText) findViewById(R.id.editTextHomePage);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextRegistro = (EditText) findViewById(R.id.editTextRegistroEmbratur);
        editTextLocalidadeProxima = (EditText) findViewById(R.id.editTextLocalidadeProxima);
        editTextDistancia = (EditText) findViewById(R.id.editTextDistancia);
        editTextLocaliacaoProxima = (EditText) findViewById(R.id.editTextLocalizacaoProxima);
        editTextCaracterizacaoEquipamento = (EditText) findViewById(R.id.editTextCaracterizacaoEquipamento);
        editTextCapacidadeEquipamento = (EditText) findViewById(R.id.editTextCapacidadeEquipamento);
        editTextServicosOferecidos = (EditText) findViewById(R.id.editTextServicosOferecidos);
        editTextObservacoes = (EditText) findViewById(R.id.editTextObservacoes);

        editTextTelefone.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, editTextTelefone));
        editTextFax.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, editTextFax));

        // Atribuição dos RadioGroup
        RadioGroup transporte = (RadioGroup) findViewById(R.id.radioGroupTransportesAcesso);
        RadioGroup privacidade = (RadioGroup) findViewById(R.id.radioGroupPNP);
        RadioGroup transporteUrbano = (RadioGroup) findViewById(R.id.radioGroupTransportes);

        // Verificação de opção dos RadioGroup
        transporte.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonRodoviario:
                        transporte_stg = "rodoviario";
                        break;
                    case R.id.radioButtonFerroviario:
                        transporte_stg = "ferroviario";
                        break;
                    case R.id.radioButtonHidroviario:
                        transporte_stg = "hidroviario";
                        break;
                    case R.id.radioButtonAereo:
                        transporte_stg = "aereo";
                        break;
                }
            }
        });

        privacidade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonP:
                        privacidade_stg = "privativo";
                        break;
                    case R.id.radioButtonNP:
                        privacidade_stg = "não privativo";
                        break;
                }
            }
        });

        transporteUrbano.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonOnibus:
                        transporteUrbano_stg = "onibus";
                        break;
                    case R.id.radioButtonMetro:
                        transporteUrbano_stg = "metro";
                        break;
                    case R.id.radioButtonTaxi:
                        transporteUrbano_stg = "taxi";
                        break;
                    case R.id.radioButtonBonde:
                        transporteUrbano_stg = "bonde";
                        break;
                    case R.id.radioButtonOutros:
                        transporteUrbano_stg = "outros";
                        break;
                }
            }
        });

    }

    // Evento de clique no botão Salvar
    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Entretenimento et = new Entretenimento();

            // Atribuição de valores
            et.setAuth(firebaseUser.getEmail());
            et.setCategoria(editTextCategoria.getText().toString());
            et.setTipo(editTextTipo.getText().toString());
            et.setSubtipo(editTextSubtipo.getText().toString());
            et.setCodigo(editTextCodigo.getText().toString());
            et.setUf(editTextUF.getText().toString());
            et.setMunicipio(editTextMunicipio.getText().toString());
            et.setDistrito(editTextDistrito.getText().toString());
            et.setDenominacao(editTextDenominacao.getText().toString());
            et.setLocalizacao(editTextLocalizacao.getText().toString());
            et.setTelefone(editTextTelefone.getText().toString());
            et.setFax(editTextFax.getText().toString());
            et.setHomepage(editTextHomepage.getText().toString());
            et.setEmail(editTextEmail.getText().toString());
            et.setRegistro(editTextRegistro.getText().toString());
            et.setLocalidade_proxima(editTextLocalidadeProxima.getText().toString());
            et.setDistancia(editTextDistancia.getText().toString());
            et.setLocalizacao_proxima(editTextLocaliacaoProxima.getText().toString());
            et.setCaracterizacao_equipamento(editTextCaracterizacaoEquipamento.getText().toString());
            et.setCapacidade_equipamento(editTextCapacidadeEquipamento.getText().toString());
            et.setServicos_oferecidos(editTextServicosOferecidos.getText().toString());
            et.setObservacoes(editTextObservacoes.getText().toString());
            et.setTransporte(transporte_stg);
            et.setPrivacidade(privacidade_stg);
            et.setTransporte_urbano(transporteUrbano_stg);

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            et.setData_submissao(s);

            // Inserção no banco
            firebaseReference.child("entretenimento").push().setValue(et);

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
