package br.edu.ifce.diagtur.formularios;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

import br.edu.ifce.diagtur.R;
import br.edu.ifce.diagtur.objetos.AtrativosTuristicos;

public class frmAtrativosTuristicos extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextTipo ,editTextSubtipo, editTextCodigo,
            editTextUF, editTextMunicipio, editTextDistrito, editTextHierarquia, editTextNome,
            editTextLocalizacao, editTextLocalidadeProxima, editTextDistancia, editTextAcessoMaisUtilizado,
            editTextDetalhamento, editTextDescricao, editTextProtecao, editTextMesesMaiorMovimentacao,
            editTextIntegraRoteirosCitar, editTextTransportesTipoFrequencia, editTextLocalProduto,
            editTextObservacoes, editTextRemissivas;

    // Declaração CheckBox
    private CheckBox visitaGuiada, folhetos;

    // Strings
    private String transportes_stg = "", privacidade_stg = "", qualidade_stg = "", ingresso_stg = "",
            origemVisitante_stg = "", integraRoteiro_stg = "";

    // Conexão com o Firebase
    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_atrativos_turisticos);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.at));

        //getActionBar().setTitle(this.getResources().getString(R.string.at));

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
        editTextHierarquia = (EditText) findViewById(R.id.editTextHierarquia);
        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextLocalizacao = (EditText) findViewById(R.id.editTextLocalizacao);
        editTextLocalidadeProxima = (EditText) findViewById(R.id.editTextLocalidadeProxima);
        editTextDistancia = (EditText) findViewById(R.id.editTextDistancia);
        editTextAcessoMaisUtilizado = (EditText) findViewById(R.id.editTextAcessoMaisUtilizado);
        editTextDetalhamento = (EditText) findViewById(R.id.editTextDetalhamento);
        editTextDescricao = (EditText) findViewById(R.id.editTextDescricao);
        editTextProtecao = (EditText) findViewById(R.id.editTextProtecao);
        editTextMesesMaiorMovimentacao = (EditText) findViewById(R.id.editTextMesesMaiorMovimentacao);
        editTextIntegraRoteirosCitar = (EditText) findViewById(R.id.editTextIntegraRoteirosCitar);
        editTextTransportesTipoFrequencia = (EditText) findViewById(R.id.editTextTransportesTipoFrequencia);
        editTextLocalProduto = (EditText) findViewById(R.id.editTextLocalProduto);
        editTextObservacoes = (EditText) findViewById(R.id.editTextObservacoes);
        editTextRemissivas = (EditText) findViewById(R.id.editTextRemissivas);

        // Atribuição dos RadioGroup
        RadioGroup transportes = (RadioGroup) findViewById(R.id.radioGroupTransportes);
        RadioGroup privacidade = (RadioGroup) findViewById(R.id.radioGroupPNP);
        RadioGroup qualidade = (RadioGroup) findViewById(R.id.radioGroupEstadoConservacao);
        RadioGroup ingresso = (RadioGroup) findViewById(R.id.radioGroupIngresso);
        RadioGroup origemVisitante = (RadioGroup) findViewById(R.id.radioGroupOrigemVisitantes);
        RadioGroup integraRoteiro = (RadioGroup) findViewById(R.id.radioGroupRoteiros);

        // Verificação de opção dos RadioGroup
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

        ingresso.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonPago:
                        ingresso_stg = "pago";
                        break;
                    case R.id.radioButtonGratuito:
                        ingresso_stg = "gratuito";
                        break;
                    case R.id.radioButtonNaoExiste:
                        ingresso_stg = "não existe";
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

        // Atribuição dos CheckBox
        visitaGuiada = (CheckBox) findViewById(R.id.checkBoxVisitaGuiada);
        folhetos = (CheckBox) findViewById(R.id.checkBoxFolhetos);

    }

    // Evento de clique no botão Salvar
    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // Instanciação da classe
            AtrativosTuristicos at = new AtrativosTuristicos();

            // Atribuição de valores
            at.setAuth(firebaseUser.getEmail());
            at.setCategoria(editTextCategoria.getText().toString());
            at.setTipo(editTextTipo.getText().toString());
            at.setSubtipo(editTextSubtipo.getText().toString());
            at.setCodigo(editTextCodigo.getText().toString());
            at.setUf(editTextUF.getText().toString());
            at.setMunicipio(editTextMunicipio.getText().toString());
            at.setDistrito(editTextDistrito.getText().toString());
            at.setHierarquia(editTextHierarquia.getText().toString());
            at.setNome(editTextNome.getText().toString());
            at.setLocalizacao(editTextLocalizacao.getText().toString());
            at.setLocalidade_proxima(editTextLocalidadeProxima.getText().toString());
            at.setDistancia(editTextDistancia.getText().toString());
            at.setAcesso_mais_utilizado(editTextAcessoMaisUtilizado.getText().toString());
            at.setDetalhamento(editTextDetalhamento.getText().toString());
            at.setDescricao(editTextDescricao.getText().toString());
            at.setProtecao(editTextProtecao.getText().toString());
            at.setMeses_maior_movimentacao(editTextMesesMaiorMovimentacao.getText().toString());
            at.setIntegra_roteiros_citar(editTextIntegraRoteirosCitar.getText().toString());
            at.setTransportes_tipo_frequencia(editTextTransportesTipoFrequencia.getText().toString());
            at.setLocal_produto(editTextLocalProduto.getText().toString());
            at.setObservacoes(editTextObservacoes.getText().toString());
            at.setRemissivas(editTextRemissivas.getText().toString());
            at.setTransporte(transportes_stg);
            at.setPrivacidade(privacidade_stg);
            at.setQualidade(qualidade_stg);
            at.setIngresso(ingresso_stg);
            at.setOrigem_visitante(origemVisitante_stg);
            at.setIntegra_roteiro(integraRoteiro_stg);

            // Verificação das CheckBox
            if(visitaGuiada.isChecked()){
                at.setVisita_guiada("true");
            }else {
                at.setVisita_guiada("false");
            }

            if(folhetos.isChecked()){
                at.setFolhetos("true");
            }else {
                at.setFolhetos("false");
            }

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            at.setData_submissao(s);

            // Inserção no banco
            firebaseReference.child("atratitivo_turistico").push().setValue(at);

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
