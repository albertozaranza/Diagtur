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
import br.edu.ifce.diagtur.objetos.AtrativosTuristicosNaturais;

public class frmAtrativosTuristicosNaturais extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextTipo ,editTextSubtipo, editTextCodigo,
            editTextUF, editTextMunicipio, editTextDistrito, editTextHierarquia, editTextNome,
            editTextLocalizacao, editTextLocalidadeProxima, editTextDistancia, editTextAcessoMaisUtilizado,
            editTextDetalhamento, editTextDescricao, editTextAcessibilidadeTemporal, editTextEquipamento,
            editTextMesesMaiorMovimentacao, editTextIntegraRoteirosCitar, editTextObservacoes, editTextRemissivas,
            editTextAtividadeOcorrenteCitar;

    // Declaração Strings
    private String transportes_stg = "", privacidade_stg = "", qualidade_stg = "", acessibilidadeTemporal_stg = "",
            tempo_stg = "", atividadeOcorrente_stg = "", origemVisitante_stg = "", integraRoteiro_stg = "";

    // Conexão com o Firebase
    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_atrativos_turisticos_naturais);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.atn));

        // Atribuição e chamada de evento de clique do botão de save
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
        editTextHierarquia = (EditText) findViewById(R.id.editTextHierarquia);
        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextLocalizacao = (EditText) findViewById(R.id.editTextLocalizacao);
        editTextLocalidadeProxima = (EditText) findViewById(R.id.editTextLocalidadeProxima);
        editTextDistancia = (EditText) findViewById(R.id.editTextDistancia);
        editTextAcessoMaisUtilizado = (EditText) findViewById(R.id.editTextAcessoMaisUtilizado);
        editTextDetalhamento = (EditText) findViewById(R.id.editTextDetalhamento);
        editTextDescricao = (EditText) findViewById(R.id.editTextDescricao);
        editTextAcessibilidadeTemporal = (EditText) findViewById(R.id.editTexAcessibilidadeTemporalCitar);
        editTextEquipamento = (EditText) findViewById(R.id.editTextEquipamentoServico);
        editTextMesesMaiorMovimentacao = (EditText) findViewById(R.id.editTextMesesMaiorMovimentacao);
        editTextIntegraRoteirosCitar = (EditText) findViewById(R.id.editTextIntegraRoteirosCitar);
        editTextObservacoes = (EditText) findViewById(R.id.editTextObservacoes);
        editTextRemissivas = (EditText) findViewById(R.id.editTextRemissivas);
        editTextAtividadeOcorrenteCitar = (EditText) findViewById(R.id.editTextAtividadeOcorrenteCitar);

        // Atribuição dos RadioGroup
        RadioGroup transportes = (RadioGroup) findViewById(R.id.radioGroupTransportes);
        RadioGroup privacidade = (RadioGroup) findViewById(R.id.radioGroupPNP);
        RadioGroup qualidade = (RadioGroup) findViewById(R.id.radioGroupQualidade);
        RadioGroup acessibilidadeTemporal = (RadioGroup) findViewById(R.id.radioGroupAcessibilidadeTemporal);
        RadioGroup tempo = (RadioGroup) findViewById(R.id.radioGroupTempo);
        RadioGroup atividadeOcorrente = (RadioGroup) findViewById(R.id.radioGroupAtividadesOcorrentes);
        RadioGroup origemVisitante = (RadioGroup) findViewById(R.id.radioGroupOrigemVisitantes);
        RadioGroup integraRoteiro = (RadioGroup) findViewById(R.id.radioGroupRoteiros);

        transportes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonRodoviario:
                        transportes_stg = "rodoviario";
                        break;
                    case R.id.radioButtonFerroviario:
                        transportes_stg = "ferroviario";
                        break;
                    case R.id.radioButtonHidroviario:
                        transportes_stg = "hidroviario";
                        break;
                    case R.id.radioButtonAereo:
                        transportes_stg = "aereo";
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

        qualidade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonBomQualidade:
                        qualidade_stg = "bom";
                        break;
                    case R.id.radioButtonRegularQualidade:
                        qualidade_stg = "regular";
                        break;
                    case R.id.radioButtonRuimQualidade:
                        qualidade_stg = "ruim";
                        break;
                }
            }
        });

        acessibilidadeTemporal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonBomQualidade:
                        acessibilidadeTemporal_stg = "permanente";
                        break;
                    case R.id.radioButtonRegularQualidade:
                        acessibilidadeTemporal_stg = "temporário";
                        break;
                }
            }
        });


        tempo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonHoras:
                        tempo_stg = "horas";
                        break;
                    case R.id.radioButtonDias:
                        tempo_stg = "3 dias";
                        break;
                    case R.id.radioButtonPernoite:
                        tempo_stg = "pernoite";
                        break;
                    case R.id.radioButtonMaisDias:
                        tempo_stg = "mais de 3 dias";
                        break;
                }
            }
        });

        atividadeOcorrente.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonSimAO:
                        atividadeOcorrente_stg = "sim";
                        break;
                    case R.id.radioButtonNaoAO:
                        atividadeOcorrente_stg = "não";
                        break;
                }
            }
        });

        origemVisitante.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonInternacional:
                        origemVisitante_stg = "internacional";
                        break;
                    case R.id.radioButtonNacional:
                        origemVisitante_stg = "nacional";
                        break;
                    case R.id.radioButtonRegional:
                        origemVisitante_stg = "regional";
                        break;
                    case R.id.radioButtonLocal:
                        origemVisitante_stg = "local";
                        break;
                }
            }
        });

        integraRoteiro.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonSim:
                        integraRoteiro_stg = "sim";
                        break;
                    case R.id.radioButtonNao:
                        integraRoteiro_stg = "não";
                        break;
                }
            }
        });

    }

    // Evento de clique no botão Salvar
    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // Instanciação da classe
            AtrativosTuristicosNaturais atn = new AtrativosTuristicosNaturais();

            // Atribuição de valores
            atn.setAuth(firebaseUser.getEmail());
            atn.setCategoria(editTextCategoria.getText().toString());
            atn.setTipo(editTextTipo.getText().toString());
            atn.setSubtipo(editTextSubtipo.getText().toString());
            atn.setCodigo(editTextCodigo.getText().toString());
            atn.setUf(editTextUF.getText().toString());
            atn.setMunicipio(editTextMunicipio.getText().toString());
            atn.setDistrito(editTextDistrito.getText().toString());
            atn.setHierarquia(editTextHierarquia.getText().toString());
            atn.setNome(editTextNome.getText().toString());
            atn.setLocalizacao(editTextLocalizacao.getText().toString());
            atn.setLocalidade_proxima(editTextLocalidadeProxima.getText().toString());
            atn.setDistancia(editTextDistancia.getText().toString());
            atn.setAcesso_mais_utilizado(editTextAcessoMaisUtilizado.getText().toString());
            atn.setDetalhamento(editTextDetalhamento.getText().toString());
            atn.setDescricao(editTextDescricao.getText().toString());
            atn.setAcessibilidade_temporal(editTextAcessibilidadeTemporal.getText().toString());
            atn.setEquipamento(editTextEquipamento.getText().toString());
            atn.setMeses_maior_movimentacao(editTextMesesMaiorMovimentacao.getText().toString());
            atn.setIntegra_roteiros_citar(editTextIntegraRoteirosCitar.getText().toString());
            atn.setObservacoes(editTextObservacoes.getText().toString());
            atn.setRemissivas(editTextRemissivas.getText().toString());
            atn.setTransporte(transportes_stg);
            atn.setPrivacidade(privacidade_stg);
            atn.setQualidade(qualidade_stg);
            atn.setAcessibilidade_temporal_citar(acessibilidadeTemporal_stg);
            atn.setTempo(tempo_stg);
            atn.setAtividade_ocorrente(atividadeOcorrente_stg);
            atn.setOrigem_visitante(origemVisitante_stg);
            atn.setIntegra_roteiro(integraRoteiro_stg);
            atn.setAtividade_ocorrente_citar(editTextAtividadeOcorrenteCitar.getText().toString());

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            atn.setData_submissao(s);

            // Inserção no banco
            firebaseReference.child("atratitivo_turistico_natural").push().setValue(atn);

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
