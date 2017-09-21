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
import br.edu.ifce.diagtur.objetos.EquipamentoExtraHoteleiro;

public class frmEquipamentoExtraHoteleiro extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextTipo, editTextSubtipo, editTextCodigo, editTextUF, editTextMunicipio,
            editTextDistrito, editTextHierarquia, editTextDenominacao, editTextLocalizacao, editTextTelefone, editTextFax,
            editTextHomepage,
            editTextEmail, editTextLocalidadeProxima, editTextDistancia, editTextAreaTotal, editTextCapacidadeTotal,
            editTextPropietario, editTextGerente,
            editTextAdministracaoNumero, editTextSanitarioNumero, editTextQuenteNumero,
            editTextFrioNumero, editTextQuadraNumero, editTextChurrascariaNumero,
            editTextPratoNumero, editTextRoupaNumero, editTextIluminacaoNumero, editTextTomadaNumero,
            editTextCantinaNumero, editTextFarmaciaNumero, editTextRestauranteNumero,
            editTextBarracaNumero, editTextTrailerNumero, editTextOutrosNumero, editTextConvenioNome, editTextObservacao;

    // Declaração CheckBox
    private CheckBox administracao, sanitario, quente, frio, quadra, churrascaria, prato, roupa, iluminacao,
            tomada, cantina, farmacia, restaurante, barraca, trailer, outros;

    // Strings
    private String transporte_stg = "", privacidade_stg = "", condicao_acesso_stg = "", propriedade_stg = "",
            area_cercada_stg = "", socios_stg = "", convenio_stg = "";

    // Conexão com o Firebase
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_equipamento_extra_hoteleiro);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.ext));

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
        editTextHierarquia = (EditText) findViewById(R.id.editTextHierarquia);
        editTextDenominacao = (EditText) findViewById(R.id.editTextDenominacao);
        editTextLocalizacao = (EditText) findViewById(R.id.editTextLocalizacao);
        editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        editTextFax = (EditText) findViewById(R.id.editTextFax);
        editTextHomepage = (EditText) findViewById(R.id.editTextHomePage);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextLocalidadeProxima = (EditText) findViewById(R.id.editTextLocalidadeProxima);
        editTextDistancia = (EditText) findViewById(R.id.editTextDistancia);
        editTextAreaTotal = (EditText) findViewById(R.id.editTextAreaTotal);
        editTextCapacidadeTotal = (EditText) findViewById(R.id.editTextCapacidadeTotal);
        editTextPropietario = (EditText) findViewById(R.id.editTextPropietario);
        editTextGerente = (EditText) findViewById(R.id.editTextGerente);
        editTextAdministracaoNumero = (EditText) findViewById(R.id.editTextADMNumero);
        editTextSanitarioNumero = (EditText) findViewById(R.id.editTextSanitariosNumero);
        editTextQuenteNumero = (EditText) findViewById(R.id.editTextQuenteNumero);
        editTextFrioNumero = (EditText) findViewById(R.id.editTextFrioNumero);
        editTextQuadraNumero = (EditText) findViewById(R.id.editTextQuadraNumero);
        editTextChurrascariaNumero = (EditText) findViewById(R.id.editTextChurrascariaNumero);
        editTextPratoNumero = (EditText) findViewById(R.id.editTextLavaPratoNumero);
        editTextRoupaNumero = (EditText) findViewById(R.id.editTextLavaRoupaNumero);
        editTextIluminacaoNumero = (EditText) findViewById(R.id.editTextIluminacaoNumero);
        editTextTomadaNumero = (EditText) findViewById(R.id.editTextTomadaNumero);
        editTextCantinaNumero = (EditText) findViewById(R.id.editTextCantinaNumero);
        editTextFarmaciaNumero = (EditText) findViewById(R.id.editTextFarmaciaNumero);
        editTextRestauranteNumero = (EditText) findViewById(R.id.editTextRestauranteNumero);
        editTextBarracaNumero = (EditText) findViewById(R.id.editTextBarracaNumero);
        editTextTrailerNumero = (EditText) findViewById(R.id.editTextTrailerNumero);
        editTextOutrosNumero = (EditText) findViewById(R.id.editTextOutroNumero);
        editTextConvenioNome = (EditText) findViewById(R.id.editTextQualConvenio);
        editTextObservacao = (EditText) findViewById(R.id.editTextObservacoesComplementares);

        editTextTelefone.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, editTextTelefone));
        editTextFax.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, editTextFax));

        // Atribuição dos RadioGroup
        RadioGroup transporte = (RadioGroup) findViewById(R.id.radioGroupMeiosDeAcesso);
        RadioGroup privacidade = (RadioGroup) findViewById(R.id.radioGroupPNP);
        RadioGroup condicao_acesso = (RadioGroup) findViewById(R.id.radioGroupCondicoesDeAcesso);
        RadioGroup propriedade = (RadioGroup) findViewById(R.id.radioGroupPropriedades);
        RadioGroup area_cercada = (RadioGroup) findViewById(R.id.radioGroupAreasCercadas);
        RadioGroup socios = (RadioGroup) findViewById(R.id.radioGroupAceitaSocio);
        RadioGroup convenio = (RadioGroup) findViewById(R.id.radioGroupTemConvenios);

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

        condicao_acesso.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonBom:
                        condicao_acesso_stg = "bom";
                        break;
                    case R.id.radioButtonRegular:
                        condicao_acesso_stg = "regular";
                        break;
                    case R.id.radioButtonRuim:
                        condicao_acesso_stg = "ruim";
                        break;
                }
            }
        });

        propriedade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonPublica:
                        propriedade_stg = "publica";
                        break;
                    case R.id.radioButtonPrivada:
                        propriedade_stg = "privada";
                        break;
                }
            }
        });

        area_cercada.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonAreaSim:
                        area_cercada_stg = "sim";
                        break;
                    case R.id.radioButtonAreaNao:
                        area_cercada_stg = "não";
                        break;
                }
            }
        });

        socios.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonSocioSim:
                        socios_stg = "sim";
                        break;
                    case R.id.radioButtonSocioNao:
                        socios_stg = "não";
                        break;
                }
            }
        });

        convenio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonConvenioSim:
                        convenio_stg = "sim";
                        break;
                    case R.id.radioButtonConvenioNao:
                        convenio_stg = "não";
                        break;
                }
            }
        });

        // Atribuição dos CheckBox
        administracao = (CheckBox) findViewById(R.id.checkBoxAdministracao);
        sanitario = (CheckBox) findViewById(R.id.checkBoxSanitario);
        quente = (CheckBox) findViewById(R.id.checkBoxQuente);
        frio = (CheckBox) findViewById(R.id.checkBoxFrio);
        quadra = (CheckBox) findViewById(R.id.checkBoxQuadra);
        churrascaria = (CheckBox) findViewById(R.id.checkBoxChurrascaria);
        prato = (CheckBox) findViewById(R.id.checkBoxPrato);
        roupa = (CheckBox) findViewById(R.id.checkBoxRoupa);
        iluminacao = (CheckBox) findViewById(R.id.checkBoxIluminacao);
        tomada = (CheckBox) findViewById(R.id.checkBoxTomada);
        cantina = (CheckBox) findViewById(R.id.checkBoxCantina);
        farmacia = (CheckBox) findViewById(R.id.checkBoxFarmacia);
        restaurante = (CheckBox) findViewById(R.id.checkBoxRestaurante);
        barraca = (CheckBox) findViewById(R.id.checkBoxBarraca);
        trailer = (CheckBox) findViewById(R.id.checkBoxTrailer);
        outros = (CheckBox) findViewById(R.id.checkBoxOutros);

    }

    // Evento de clique no botão Salvar
    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // Instanciação da classe
            EquipamentoExtraHoteleiro ext = new EquipamentoExtraHoteleiro();

            // Atribuição de valores
            ext.setAuth(firebaseUser.getEmail());
            ext.setCategoria(editTextCategoria.getText().toString());
            ext.setTipo(editTextTipo.getText().toString());
            ext.setSubtipo(editTextSubtipo.getText().toString());
            ext.setCodigo(editTextCodigo.getText().toString());
            ext.setUf(editTextUF.getText().toString());
            ext.setMunicipio(editTextMunicipio.getText().toString());
            ext.setDistrito(editTextDistrito.getText().toString());
            ext.setHierarquia(editTextHierarquia.getText().toString());
            ext.setDenominacao(editTextDenominacao.getText().toString());
            ext.setLocalizacao(editTextLocalizacao.getText().toString());
            ext.setTelefone(editTextTelefone.getText().toString());
            ext.setFax(editTextFax.getText().toString());
            ext.setHomepage(editTextHomepage.getText().toString());
            ext.setEmail(editTextEmail.getText().toString());
            ext.setLocalidade_proxima(editTextLocalidadeProxima.getText().toString());
            ext.setDistancia(editTextDistancia.getText().toString());
            ext.setArea_total(editTextAreaTotal.getText().toString());
            ext.setCapacidade_total(editTextCapacidadeTotal.getText().toString());
            ext.setPropietario(editTextPropietario.getText().toString());
            ext.setGerente(editTextGerente.getText().toString());
            ext.setAdministracao_numero(editTextAdministracaoNumero.getText().toString());
            ext.setSanitario_numero(editTextSanitarioNumero.getText().toString());
            ext.setQuente_numero(editTextQuenteNumero.getText().toString());
            ext.setFrio_numero(editTextFrioNumero.getText().toString());
            ext.setQuadra_numero(editTextQuadraNumero.getText().toString());
            ext.setChurrascaria_numero(editTextChurrascariaNumero.getText().toString());
            ext.setPrato_numero(editTextPratoNumero.getText().toString());
            ext.setRoupa_numero(editTextRoupaNumero.getText().toString());
            ext.setIluminacao_numero(editTextIluminacaoNumero.getText().toString());
            ext.setTomada_numero(editTextTomadaNumero.getText().toString());
            ext.setCantina_numero(editTextCantinaNumero.getText().toString());
            ext.setFarmacia_numero(editTextFarmaciaNumero.getText().toString());
            ext.setRestaurante_numero(editTextRestauranteNumero.getText().toString());
            ext.setBarraca_numero(editTextBarracaNumero.getText().toString());
            ext.setTrailer_numero(editTextTrailerNumero.getText().toString());
            ext.setOutros_numero(editTextOutrosNumero.getText().toString());
            ext.setConvenio_nome(editTextConvenioNome.getText().toString());
            ext.setObservacao(editTextObservacao.getText().toString());
            ext.setTransporte(transporte_stg);
            ext.setPrivacidade(privacidade_stg);
            ext.setCondicao_acesso(condicao_acesso_stg);
            ext.setPropriedade(propriedade_stg);
            ext.setArea_cercada(area_cercada_stg);
            ext.setSocios(socios_stg);
            ext.setConvenio(convenio_stg);

            // Verificação das CheckBox
            if(administracao.isChecked()){
                ext.setAdministracao("true");
            }else {
                ext.setAdministracao("false");
            }

            if(sanitario.isChecked()){
                ext.setSanitario("true");
            }else {
                ext.setSanitario("false");
            }

            if(quente.isChecked()){
                ext.setQuente("true");
            }else {
                ext.setQuente("false");
            }

            if(frio.isChecked()){
                ext.setFrio("true");
            }else {
                ext.setFrio("false");
            }

            if(quadra.isChecked()){
                ext.setQuadra("true");
            }else {
                ext.setQuadra("false");
            }

            if(churrascaria.isChecked()){
                ext.setChurrascaria("true");
            }else {
                ext.setChurrascaria("false");
            }

            if(prato.isChecked()){
                ext.setPrato("true");
            }else {
                ext.setPrato("false");
            }

            if(roupa.isChecked()){
                ext.setRoupa("true");
            }else {
                ext.setRoupa("false");
            }

            if(iluminacao.isChecked()){
                ext.setIluminacao("true");
            }else {
                ext.setIluminacao("false");
            }

            if(tomada.isChecked()){
                ext.setTomada("true");
            }else {
                ext.setTomada("false");
            }

            if(cantina.isChecked()){
                ext.setCantina("true");
            }else {
                ext.setCantina("false");
            }

            if(farmacia.isChecked()){
                ext.setFarmacia("true");
            }else {
                ext.setFarmacia("false");
            }

            if(restaurante.isChecked()){
                ext.setRestaurante("true");
            }else {
                ext.setRestaurante("false");
            }

            if(barraca.isChecked()){
                ext.setBarraca("true");
            }else {
                ext.setBarraca("false");
            }

            if(trailer.isChecked()){
                ext.setTrailer("true");
            }else {
                ext.setTrailer("false");
            }

            if(outros.isChecked()){
                ext.setOutros("true");
            }else {
                ext.setOutros("false");
            }

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            ext.setData_submissao(s);

            // Inserção no banco
            firebaseReference.child("equipamento_extra_hoteleiro_at").push().setValue(ext);

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
