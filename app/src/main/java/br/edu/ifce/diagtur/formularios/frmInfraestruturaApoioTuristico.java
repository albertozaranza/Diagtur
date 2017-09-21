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
import br.edu.ifce.diagtur.objetos.Infraestrutura;

public class frmInfraestruturaApoioTuristico extends AppCompatActivity {

    // Declaração EditText
    private EditText editTextCategoria, editTextCodigo,
            editTextUF, editTextMunicipio, editTextCep, editTextDDD, editTextDistanciaCapital,
            editTextMunicipiosLimitrofes, editTextPopulacaoTotal, editTextPopulacaoUrbana,
            editTextArea, editTextAltitudeMedia, editTextIndicePrecipitacao,
            editTextJanMaxima, editTextJanMedia, editTextJanMinima,
            editTextFevMaxima, editTextFevMedia, editTextFevMinima,
            editTextMarMaxima, editTextMarMedia, editTextMarMinima,
            editTextAbrMaxima, editTextAbrMedia, editTextAbrMinima,
            editTextMaioMaxima, editTextMaioMedia, editTextMaioMinima,
            editTextJunMaxima, editTextJunMedia, editTextJunMinima,
            editTextJulMaxima, editTextJulMedia, editTextJulMinima,
            editTextAgoMaxima, editTextAgoMedia, editTextAgoMinima,
            editTextSetMaxima, editTextSetMedia, editTextSetMinima,
            editTextOutMaxima, editTextOutMedia, editTextOutMinima,
            editTextNovMaxima, editTextNovMedia, editTextNovMinima,
            editTextDezMaxima, editTextDezMedia, editTextDezMinima,
            editTextDistanciaSede, editTextExtensao, editTextNomePrefeito,
            editTextEnderecoPrefeitura, editTextEmailPrefeitura,
            editTextHomePagePrefeitura, editTextNomeTurismo, editTextEnderecoTurismo,
            editTextCargoTurismo, editTextAtividades, editTextCaracterizacaoTuristica,
            editTextFeriadosLocal, editTextDomiciliosAtendidos, editTextEmpresaAbastecimento,
            editTextJornalLocal, editTextObservacoes;

    private String clima_stg = "", campoRepouso_stg = "", asfalto_stg = "", estadoConservasao_stg = "",
            orgaoOficial_stg = "", esgoto_stg = "", energia_stg = "", limpezaPublica_stg = "",
            estacaoEmissora_stg = "", radio_stg = "", planosUrbanisticos_stg = "";

    // Declaração CheckBox
    private CheckBox rodoviario, ferroviario, aereo, federal, estadual, muninicipal,
            taxi, onibus, bonde, animal, outros, agua, poco, rio;

    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_infraestrutura_apoio_turistico);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.inf));

        Button btnSalvar = (Button) findViewById(R.id.buttonSalvar);
        btnSalvar.setOnClickListener(btnSalvarAction);

        editTextCategoria = (EditText) findViewById(R.id.editTextCategoria);
        editTextCodigo = (EditText) findViewById(R.id.editTextCodificacao);
        editTextUF = (EditText) findViewById(R.id.editTextUF);
        editTextMunicipio = (EditText) findViewById(R.id.editTextMunicipio);
        editTextCep = (EditText) findViewById(R.id.editTextCep);
        editTextDDD = (EditText) findViewById(R.id.editTextDDD);
        editTextDistanciaCapital = (EditText) findViewById(R.id.editTextDistanciaCapital);
        editTextMunicipiosLimitrofes = (EditText) findViewById(R.id.editTextMunicipiosLimitrofes);
        editTextPopulacaoTotal = (EditText) findViewById(R.id.editTextPopulacaoTotal);
        editTextPopulacaoUrbana = (EditText) findViewById(R.id.editTextPopulacaoUrbana);
        editTextArea = (EditText) findViewById(R.id.editTextArea);
        editTextAltitudeMedia = (EditText) findViewById(R.id.editTextAltitudeMedia);
        editTextIndicePrecipitacao = (EditText) findViewById(R.id.editTextIndicePrecipitacao);
        editTextJanMaxima = (EditText) findViewById(R.id.editTextJanMaxima);
        editTextJanMedia = (EditText) findViewById(R.id.editTextJanMedia);
        editTextJanMinima = (EditText) findViewById(R.id.editTextJanMinima);
        editTextFevMaxima = (EditText) findViewById(R.id.editTextFevMaxima);
        editTextFevMedia = (EditText) findViewById(R.id.editTextFevMedia);
        editTextFevMinima = (EditText) findViewById(R.id.editTextFevMinima);
        editTextMarMaxima = (EditText) findViewById(R.id.editTextMarMaxima);
        editTextMarMedia = (EditText) findViewById(R.id.editTextMarMedia);
        editTextMarMinima = (EditText) findViewById(R.id.editTextMarMinima);
        editTextAbrMaxima = (EditText) findViewById(R.id.editTextAbrMaxima);
        editTextAbrMedia = (EditText) findViewById(R.id.editTextAbrMedia);
        editTextAbrMinima = (EditText) findViewById(R.id.editTextAbrMinima);
        editTextMaioMaxima = (EditText) findViewById(R.id.editTextMaiMaxima);
        editTextMaioMedia = (EditText) findViewById(R.id.editTextMaiMedia);
        editTextMaioMinima = (EditText) findViewById(R.id.editTextMaiMinima);
        editTextJunMaxima = (EditText) findViewById(R.id.editTextJunMaxima);
        editTextJunMedia = (EditText) findViewById(R.id.editTextJunMedia);
        editTextJunMinima = (EditText) findViewById(R.id.editTextJunMinima);
        editTextJulMaxima = (EditText) findViewById(R.id.editTextJulMaxima);
        editTextJulMedia = (EditText) findViewById(R.id.editTextJulMedia);
        editTextJulMinima = (EditText) findViewById(R.id.editTextJulMinima);
        editTextAgoMaxima = (EditText) findViewById(R.id.editTextAgoMaxima);
        editTextAgoMedia = (EditText) findViewById(R.id.editTextAgoMedia);
        editTextAgoMinima = (EditText) findViewById(R.id.editTextAgoMinima);
        editTextSetMaxima = (EditText) findViewById(R.id.editTextSetMaxima);
        editTextSetMedia = (EditText) findViewById(R.id.editTextSetMedia);
        editTextSetMinima = (EditText) findViewById(R.id.editTextSetMinima);
        editTextOutMaxima = (EditText) findViewById(R.id.editTextOutMaxima);
        editTextOutMedia = (EditText) findViewById(R.id.editTextOutMedia);
        editTextOutMinima = (EditText) findViewById(R.id.editTextOutMinima);
        editTextNovMaxima = (EditText) findViewById(R.id.editTextNovMaxima);
        editTextNovMedia = (EditText) findViewById(R.id.editTextNovMedia);
        editTextNovMinima = (EditText) findViewById(R.id.editTextNovMinima);
        editTextDezMaxima = (EditText) findViewById(R.id.editTextDezMaxima);
        editTextDezMedia = (EditText) findViewById(R.id.editTextDezMedia);
        editTextDezMinima = (EditText) findViewById(R.id.editTextDezMinima);
        editTextDistanciaSede = (EditText) findViewById(R.id.editTextDistanciaSede);
        editTextExtensao = (EditText) findViewById(R.id.editTextExtensao);
        editTextNomePrefeito = (EditText) findViewById(R.id.editTextPrefeitoNome);
        editTextEnderecoPrefeitura = (EditText) findViewById(R.id.editTextEnderecoPrefeitura);
        editTextEmailPrefeitura = (EditText) findViewById(R.id.editTextEmailPrefeitura);
        editTextHomePagePrefeitura = (EditText) findViewById(R.id.editTextPagePrefeitura);
        editTextNomeTurismo = (EditText) findViewById(R.id.editTextTurismoNome);
        editTextEnderecoTurismo = (EditText) findViewById(R.id.editTextEnderecoTurismo);
        editTextCargoTurismo = (EditText) findViewById(R.id.editTextCargoTurismo);
        editTextAtividades = (EditText) findViewById(R.id.editTextEconomicas);
        editTextCaracterizacaoTuristica = (EditText) findViewById(R.id.editTextCaracterizacaoTuristica);
        editTextFeriadosLocal = (EditText) findViewById(R.id.editTextFeriadosLocal);
        editTextDomiciliosAtendidos = (EditText) findViewById(R.id.editTextDomiciliosAtentidos);
        editTextEmpresaAbastecimento = (EditText) findViewById(R.id.editTextNomeEmpresaAbastecimento);
        editTextJornalLocal = (EditText) findViewById(R.id.editTextJornaisLocaisCitar);
        editTextObservacoes = (EditText) findViewById(R.id.editTextObservacoes);

        RadioGroup clima = (RadioGroup) findViewById(R.id.radioGroupClimas);
        RadioGroup campoRepouso = (RadioGroup) findViewById(R.id.radioGroupCamposRepouso);
        RadioGroup asfalto = (RadioGroup) findViewById(R.id.radioGroupAsfaltadas);
        RadioGroup estadoConservasao = (RadioGroup) findViewById(R.id.radioGroupEstadoConservacao);
        RadioGroup orgaoOficial = (RadioGroup) findViewById(R.id.radioGroupOrgaosOficiais);
        RadioGroup esgoto = (RadioGroup) findViewById(R.id.radioGroupRedeEsgotos);
        RadioGroup energia = (RadioGroup) findViewById(R.id.radioGroupEnergiasEleticas);
        RadioGroup limpezaPublica = (RadioGroup) findViewById(R.id.radioGroupLimpezasPublicas);
        RadioGroup estacaoEmissora = (RadioGroup) findViewById(R.id.radioGroupEstacoesEmissoras);
        RadioGroup radio = (RadioGroup) findViewById(R.id.radioGroupEstacoesEmissorasRadios);
        RadioGroup planosUrbanisticos = (RadioGroup) findViewById(R.id.radioGroupPlanosUrbanisticos);

        clima.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonEquatorial:
                        clima_stg = "equatorial";
                        break;
                    case R.id.radioButtonTropical:
                        clima_stg = "tropical";
                        break;
                    case R.id.radioButtonTemperado:
                        clima_stg = "temperado";
                        break;
                }
            }
        });

        campoRepouso.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonCampoSim:
                        campoRepouso_stg = "sim";
                        break;
                    case R.id.radioButtonCampoNao:
                        campoRepouso_stg = "não";
                        break;
                }
            }
        });

        asfalto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonAsfaltadaSim:
                        asfalto_stg = "sim";
                        break;
                    case R.id.radioButtonAsfaltadaNao:
                        asfalto_stg = "não";
                        break;
                }
            }
        });

        estadoConservasao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonBom:
                        estadoConservasao_stg = "bom";
                        break;
                    case R.id.radioButtonRegular:
                        estadoConservasao_stg = "regular";
                        break;
                    case R.id.radioButtonRuim:
                        estadoConservasao_stg = "ruim";
                        break;
                }
            }
        });

        orgaoOficial.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonOrgaoSim:
                        orgaoOficial_stg = "sim";
                        break;
                    case R.id.radioButtonOrgaoNao:
                        orgaoOficial_stg = "não";
                        break;
                }
            }
        });

        esgoto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonEsgotoSim:
                        esgoto_stg = "sim";
                        break;
                    case R.id.radioButtonEsgotoNao:
                        esgoto_stg = "não";
                        break;
                }
            }
        });

        energia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonGerador:
                        energia_stg = "gerador";
                        break;
                    case R.id.radioButtonRedeEletrica:
                        energia_stg = "rede elétrica";
                        break;
                }
            }
        });

        limpezaPublica.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonLimpezaSim:
                        limpezaPublica_stg = "sim";
                        break;
                    case R.id.radioButtonLimpezaNao:
                        limpezaPublica_stg = "não";
                        break;
                }
            }
        });

        estacaoEmissora.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonEstacaoSim:
                        estacaoEmissora_stg = "sim";
                        break;
                    case R.id.radioButtonEstacaoNao:
                        estacaoEmissora_stg = "não";
                        break;
                }
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonEstacaoRadioSim:
                        radio_stg = "sim";
                        break;
                    case R.id.radioButtonEstacaoNao:
                        radio_stg = "não";
                        break;
                }
            }
        });

        planosUrbanisticos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButtonPlanoSim:
                        planosUrbanisticos_stg = "sim";
                        break;
                    case R.id.radioButtonPlanoNao:
                        planosUrbanisticos_stg = "não";
                        break;
                }
            }
        });

        rodoviario = (CheckBox) findViewById(R.id.checkBoxRodoviario);
        ferroviario = (CheckBox) findViewById(R.id.checkBoxFerroviario);
        aereo = (CheckBox) findViewById(R.id.checkBoxAereo);
        federal = (CheckBox) findViewById(R.id.checkBoxFederal);
        estadual = (CheckBox) findViewById(R.id.checkBoxEstadual);
        muninicipal = (CheckBox) findViewById(R.id.checkBoxMunicipal);
        taxi = (CheckBox) findViewById(R.id.checkBoxTaxi);
        onibus = (CheckBox) findViewById(R.id.checkBoxOnibus);
        bonde = (CheckBox) findViewById(R.id.checkBoxBonde);
        animal = (CheckBox) findViewById(R.id.checkBoxAnimal);
        outros = (CheckBox) findViewById(R.id.checkBoxOutros);
        agua = (CheckBox) findViewById(R.id.checkBoxRedeAgua);
        poco = (CheckBox) findViewById(R.id.checkBoxPoco);
        rio = (CheckBox) findViewById(R.id.checkBoxRio);
    }

    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Infraestrutura inf = new Infraestrutura();

            inf.setAuth(firebaseUser.getEmail());
            inf.setCategoria(editTextCategoria.getText().toString());
            inf.setCodigo(editTextCodigo.getText().toString());
            inf.setUf(editTextUF.getText().toString());
            inf.setMunicipio(editTextMunicipio.getText().toString());
            inf.setCep(editTextCep.getText().toString());
            inf.setDdd(editTextDDD.getText().toString());
            inf.setDistancia_capital(editTextDistanciaCapital.getText().toString());
            inf.setMunicipios_limitrofes(editTextMunicipiosLimitrofes.getText().toString());
            inf.setPopulacao_total(editTextPopulacaoTotal.getText().toString());
            inf.setPopulacao_urbana(editTextPopulacaoUrbana.getText().toString());
            inf.setArea(editTextArea.getText().toString());
            inf.setAltitude_media(editTextAltitudeMedia.getText().toString());
            inf.setIndice_precipitacao(editTextIndicePrecipitacao.getText().toString());
            inf.setJan_maxima(editTextJanMaxima.getText().toString());
            inf.setJan_media(editTextJanMedia.getText().toString());
            inf.setJan_minima(editTextJanMinima.getText().toString());
            inf.setFev_maxima(editTextFevMaxima.getText().toString());
            inf.setFev_media(editTextFevMedia.getText().toString());
            inf.setFev_minima(editTextFevMinima.getText().toString());
            inf.setMar_maxima(editTextMarMaxima.getText().toString());
            inf.setMar_media(editTextMarMedia.getText().toString());
            inf.setMar_minima(editTextMarMinima.getText().toString());
            inf.setAbr_maxima(editTextAbrMaxima.getText().toString());
            inf.setAbr_media(editTextAbrMedia.getText().toString());
            inf.setAbr_minima(editTextAbrMinima.getText().toString());
            inf.setMaio_maxima(editTextMaioMaxima.getText().toString());
            inf.setMaio_media(editTextMaioMedia.getText().toString());
            inf.setMaio_minima(editTextMaioMinima.getText().toString());
            inf.setJun_maxima(editTextJunMaxima.getText().toString());
            inf.setJun_media(editTextJunMedia.getText().toString());
            inf.setJun_minima(editTextJunMinima.getText().toString());
            inf.setJul_maxima(editTextJulMaxima.getText().toString());
            inf.setJul_media(editTextJulMedia.getText().toString());
            inf.setJul_minima(editTextJulMinima.getText().toString());
            inf.setAgo_maxima(editTextAgoMaxima.getText().toString());
            inf.setAgo_media(editTextAgoMedia.getText().toString());
            inf.setAgo_minima(editTextAgoMinima.getText().toString());
            inf.setSet_maxima(editTextSetMaxima.getText().toString());
            inf.setSet_media(editTextSetMedia.getText().toString());
            inf.setSet_minima(editTextSetMinima.getText().toString());
            inf.setOut_maxima(editTextOutMaxima.getText().toString());
            inf.setOut_media(editTextOutMedia.getText().toString());
            inf.setOut_minima(editTextOutMinima.getText().toString());
            inf.setNov_maxima(editTextNovMaxima.getText().toString());
            inf.setNov_media(editTextNovMedia.getText().toString());
            inf.setNov_minima(editTextNovMinima.getText().toString());
            inf.setDez_maxima(editTextDezMaxima.getText().toString());
            inf.setDez_media(editTextDezMedia.getText().toString());
            inf.setDez_minima(editTextDezMinima.getText().toString());
            inf.setDistancia_sede(editTextDistanciaSede.getText().toString());
            inf.setExtensao(editTextExtensao.getText().toString());
            inf.setNome_prefeito(editTextNomePrefeito.getText().toString());
            inf.setEndereco_prefeitura(editTextEnderecoPrefeitura.getText().toString());
            inf.setEmail_prefeitura(editTextEmailPrefeitura.getText().toString());
            inf.setHomepage_prefeitura(editTextHomePagePrefeitura.getText().toString());
            inf.setNome_turismo(editTextNomeTurismo.getText().toString());
            inf.setEndereco_turismo(editTextEnderecoTurismo.getText().toString());
            inf.setCargo_turismo(editTextCargoTurismo.getText().toString());
            inf.setAtividades(editTextAtividades.getText().toString());
            inf.setCaracterizacao_turistica(editTextCaracterizacaoTuristica.getText().toString());
            inf.setFeriados_local(editTextFeriadosLocal.getText().toString());
            inf.setDomicilios_atendidos(editTextDomiciliosAtendidos.getText().toString());
            inf.setEmpresa_abastecimento(editTextEmpresaAbastecimento.getText().toString());
            inf.setJornal_local(editTextJornalLocal.getText().toString());
            inf.setObservacoes(editTextObservacoes.getText().toString());

            inf.setClima(clima_stg);
            inf.setCampo_repouso(campoRepouso_stg);
            inf.setAsfalto(asfalto_stg);
            inf.setEstado_conservasao(estadoConservasao_stg);
            inf.setOrgao_oficial(orgaoOficial_stg);
            inf.setEsgoto(esgoto_stg);
            inf.setEnergia(energia_stg);
            inf.setLimpeza_publica(limpezaPublica_stg);
            inf.setEstacao_emissora(estacaoEmissora_stg);
            inf.setRadio(radio_stg);
            inf.setPlanos_urbanisticos(planosUrbanisticos_stg);

            if(rodoviario.isChecked()){
                inf.setRodoviario("true");
            }else {
                inf.setRodoviario("false");
            }

            if(ferroviario.isChecked()){
                inf.setFerroviario("true");
            }else {
                inf.setFerroviario("false");
            }

            if(aereo.isChecked()){
                inf.setAereo("true");
            }else {
                inf.setAereo("false");
            }

            if(federal.isChecked()){
                inf.setFederal("true");
            }else {
                inf.setFederal("false");
            }

            if(estadual.isChecked()){
                inf.setEstadual("true");
            }else {
                inf.setEstadual("false");
            }

            if(muninicipal.isChecked()){
                inf.setMuninicipal("true");
            }else {
                inf.setMuninicipal("false");
            }

            if(taxi.isChecked()){
                inf.setTaxi("true");
            }else {
                inf.setTaxi("false");
            }

            if(onibus.isChecked()){
                inf.setOnibus("true");
            }else {
                inf.setOnibus("false");
            }

            if(bonde.isChecked()){
                inf.setBonde("true");
            }else {
                inf.setBonde("false");
            }

            if(animal.isChecked()){
                inf.setAnimal("true");
            }else {
                inf.setAnimal("false");
            }

            if(outros.isChecked()){
                inf.setOutros("true");
            }else {
                inf.setOutros("false");
            }

            if(agua.isChecked()){
                inf.setAgua("true");
            }else {
                inf.setAgua("false");
            }

            if(poco.isChecked()){
                inf.setPoco("true");
            }else {
                inf.setPoco("false");
            }

            if(rio.isChecked()){
                inf.setRio("true");
            }else {
                inf.setRio("false");
            }

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            inf.setData_submissao(s);

            firebaseReference.child("infraestrutura_de_apoio_turistico").push().setValue(inf);

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

            finish();

        }
    };
}
