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
import br.edu.ifce.diagtur.objetos.EquipamentoExtraHoteleiroAlimentacaoEntretenimento;

public class frmEquipamentoExtraHoteleiroAlimentacaoEntretenimento extends AppCompatActivity {

    private EditText editTextCategoria, editTextTipo, editTextSubtipo, editTextCodigo,
            editTextUF, editTextMunicipio, editTextDistrito, editTextNomeProprietario,
            editTextNumeroOrdem, editTextNomeEstabelecimento, editTextInicioFuncionamento,
            editTextEndereco, editTextTelefone, editTextFax, editTextTotalPessoasTrabalhando,
            editTextEspecializacao, editTextHorarioFuncionamento, editTextNumeroMesas,
            editTextDiasSemana, editTextDiasSemanaAoVivo,
            editTextTotalMotorista, editTextSalarioMotorista,
            editTextTotalGuias, editTextSalarioGuias,
            editTextTotalManobristas, editTextSalarioManobristas,
            editTextTotalSeguranca, editTextSalarioSeguranca,
            editTextTotalAdministrativo, editTextSalarioAdministrativos,
            editTextTotalGarcon, editTextSalarioGarcon,
            editTextTotalCozinheiro, editTextSalarioCozinheiro,
            editTextTotalOutros, editTextSalarioOutros,
            editTextGrupos, editTextTotalGrupos,
            editTextModelos, editTextTotalModelos,
            editTextDiaria, editTextTotalDiaria,
            editTextKMAdicional, editTextTotalKMAdicional,
            editTextProprioQuantidade,
            editTextTerceirizadoQuantidade,
            editTextFrotaTotal,
            editTextCitarPasseio,
            editTextProprioQuantidadeCondicao, editTextProprioCapacidade,
            editTextTerceirizadosFrotaUtilizadaQuantidade, editTextTerceirizadosFrotaUtilizadaCapacidade,
            editTextFrotaUtilizadaTotal, editTextFrotaUtilizadaCapacidadeTotal;

    private String passeio_stg = "";

    private CheckBox aLaCarte, entregaDomicilio, rodizio, selfService, boate, estacionamento,
            motorista, playGround, somMecanico, telao, televisao, showArtistico, showAoVivo;

    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_equipamento_extra_hoteleiro_alimentacao_entreterimento);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(this.getResources().getString(R.string.ehea));

        Button btnSalvar = (Button) findViewById(R.id.buttonSalvar);
        btnSalvar.setOnClickListener(btnSalvarAction);

        editTextCategoria = (EditText) findViewById(R.id.editTextCategoria);
        editTextTipo = (EditText) findViewById(R.id.editTextTipo);
        editTextSubtipo = (EditText) findViewById(R.id.editTextSubtipo);
        editTextCodigo = (EditText) findViewById(R.id.editTextCodigo);
        editTextUF = (EditText) findViewById(R.id.editTextUF);
        editTextMunicipio = (EditText) findViewById(R.id.editTextMunicipio);
        editTextDistrito = (EditText) findViewById(R.id.editTextDistrito);
        editTextNomeProprietario = (EditText) findViewById(R.id.editTextNomeProprietario);
        editTextNumeroOrdem = (EditText) findViewById(R.id.editTextNumeroOrdem);
        editTextNomeEstabelecimento = (EditText) findViewById(R.id.editTextNomeEstabelecimento);
        editTextInicioFuncionamento = (EditText) findViewById(R.id.editTextInicioFuncionamento);
        editTextEndereco = (EditText) findViewById(R.id.editTextEndereco);
        editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        editTextFax = (EditText) findViewById(R.id.editTextFax);
        editTextTotalPessoasTrabalhando = (EditText) findViewById(R.id.editTextTotalPessoasTrabalhando);
        editTextEspecializacao = (EditText) findViewById(R.id.editTextEspecializacao);
        editTextHorarioFuncionamento = (EditText) findViewById(R.id.editTextHorarioFuncionamento);
        editTextNumeroMesas = (EditText) findViewById(R.id.editTextNumerosMesas);
        editTextDiasSemana = (EditText) findViewById(R.id.editTextDiasSemana);
        editTextDiasSemanaAoVivo = (EditText) findViewById(R.id.editTextDiasSemanaAoVivo);
        editTextTotalMotorista = (EditText) findViewById(R.id.editTextTotalMotorista);
        editTextSalarioMotorista = (EditText) findViewById(R.id.editTextSalarioMotorista);
        editTextTotalGuias = (EditText) findViewById(R.id.editTextTotalGuias);
        editTextSalarioGuias = (EditText) findViewById(R.id.editTextSalarioGuias);
        editTextTotalManobristas = (EditText) findViewById(R.id.editTextTotalManobrista);
        editTextSalarioManobristas = (EditText) findViewById(R.id.editTextSalarioManobrista);
        editTextTotalSeguranca = (EditText) findViewById(R.id.editTextTotalSeguranca);
        editTextSalarioSeguranca = (EditText) findViewById(R.id.editTextSalarioSeguranca);
        editTextTotalAdministrativo = (EditText) findViewById(R.id.editTextTotalAdministrativos);
        editTextSalarioAdministrativos = (EditText) findViewById(R.id.editTextSalarioAdministrativos);
        editTextTotalGarcon = (EditText) findViewById(R.id.editTextTotalGarcons);
        editTextSalarioGarcon = (EditText) findViewById(R.id.editTextSalarioGarcons);
        editTextTotalCozinheiro = (EditText) findViewById(R.id.editTextTotalCozinheiros);
        editTextSalarioCozinheiro = (EditText) findViewById(R.id.editTextSalarioCozinheiros);
        editTextTotalOutros = (EditText) findViewById(R.id.editTextTotalOutros);
        editTextSalarioOutros = (EditText) findViewById(R.id.editTextSalarioOutros);
        editTextGrupos = (EditText) findViewById(R.id.editTextGrupos);
        editTextTotalGrupos = (EditText) findViewById(R.id.editTextTotalGrupos);
        editTextModelos = (EditText) findViewById(R.id.editTextModelos);
        editTextTotalModelos = (EditText) findViewById(R.id.editTextTotalModelos);
        editTextDiaria = (EditText) findViewById(R.id.editTextDiaria);
        editTextTotalDiaria = (EditText) findViewById(R.id.editTextTotalDiaria);
        editTextKMAdicional = (EditText) findViewById(R.id.editTextKMAdicional);
        editTextTotalKMAdicional = (EditText) findViewById(R.id.editTextTotalKMAdicional);
        editTextProprioQuantidade = (EditText) findViewById(R.id.editTextProprioQuantidade);
        editTextTerceirizadoQuantidade = (EditText) findViewById(R.id.editTextTerceirizadosQuantidade);
        editTextFrotaTotal = (EditText) findViewById(R.id.editTextFrotaTotal);
        editTextCitarPasseio = (EditText) findViewById(R.id.editTextSeSimCitar);
        editTextProprioQuantidadeCondicao = (EditText) findViewById(R.id.editTextProprioQuantidadeCondicao);
        editTextProprioCapacidade = (EditText) findViewById(R.id.editTextProprioCapacidade);
        editTextTerceirizadosFrotaUtilizadaQuantidade = (EditText) findViewById(R.id.editTextTerceirizadosFrotaUtilizadaQuantidade);
        editTextTerceirizadosFrotaUtilizadaCapacidade = (EditText) findViewById(R.id.editTextTerceirizadosFrotaUtilizadaCapacidade);
        editTextFrotaUtilizadaTotal = (EditText) findViewById(R.id.editTextFrotaUtilizadaTotal);
        editTextFrotaUtilizadaCapacidadeTotal = (EditText) findViewById(R.id.editTextFrotaUtilizadaCapacidadeTotal);

        editTextTelefone.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, editTextTelefone));
        editTextFax.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, editTextFax));

        RadioGroup passeio  = (RadioGroup) findViewById(R.id.radioGroupPasseio);

        passeio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioPasseioSim:
                        passeio_stg = "sim";
                        break;
                    case R.id.radioPasseioNao:
                        passeio_stg = "não";
                        break;
                }
            }
        });

        aLaCarte = (CheckBox) findViewById(R.id.checkBoxALaCarte);
        entregaDomicilio = (CheckBox) findViewById(R.id.checkBoxDomicilio);
        rodizio = (CheckBox) findViewById(R.id.checkBoxRodizio);
        selfService = (CheckBox) findViewById(R.id.checkBoxSelfService);
        boate = (CheckBox) findViewById(R.id.checkBoxBoate);
        estacionamento = (CheckBox) findViewById(R.id.checkBoxEstacionamento);
        motorista = (CheckBox) findViewById(R.id.checkBoxMotorista);
        playGround = (CheckBox) findViewById(R.id.checkBoxPlayGround);
        somMecanico = (CheckBox) findViewById(R.id.checkBoxSomMecanico);
        telao = (CheckBox) findViewById(R.id.checkBoxTelao);
        televisao = (CheckBox) findViewById(R.id.checkBoxTelevisao);
        showArtistico = (CheckBox) findViewById(R.id.checkBoxShowArtistico);
        showAoVivo = (CheckBox) findViewById(R.id.checkBoxShowAoVivo);

    }

    private View.OnClickListener btnSalvarAction = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EquipamentoExtraHoteleiroAlimentacaoEntretenimento ehae = new EquipamentoExtraHoteleiroAlimentacaoEntretenimento();

            ehae.setAuth(firebaseUser.getEmail());
            ehae.setCategoria(editTextCategoria.getText().toString());
            ehae.setTipo(editTextTipo.getText().toString());
            ehae.setSubtipo(editTextSubtipo.getText().toString());
            ehae.setCodigo(editTextCodigo.getText().toString());
            ehae.setUf(editTextUF.getText().toString());
            ehae.setMunicipio(editTextMunicipio.getText().toString());
            ehae.setDistrito(editTextDistrito.getText().toString());
            ehae.setNome_proprietario(editTextNomeProprietario.getText().toString());
            ehae.setNumero_ordem(editTextNumeroOrdem.getText().toString());
            ehae.setNome_estabelecimento(editTextNomeEstabelecimento.getText().toString());
            ehae.setInicio_funcionamento(editTextInicioFuncionamento.getText().toString());
            ehae.setEndereco(editTextEndereco.getText().toString());
            ehae.setTelefone(editTextTelefone.getText().toString());
            ehae.setFax(editTextFax.getText().toString());
            ehae.setTotal_pessoas_trabalhando(editTextTotalPessoasTrabalhando.getText().toString());
            ehae.setEspecializacao(editTextEspecializacao.getText().toString());
            ehae.setHorário_funcionamento(editTextHorarioFuncionamento.getText().toString());
            ehae.setNumero_mesas(editTextNumeroMesas.getText().toString());
            ehae.setDias_semana(editTextDiasSemana.getText().toString());
            ehae.setDias_semana_ao_vivo(editTextDiasSemanaAoVivo.getText().toString());
            ehae.setTotal_motorista(editTextTotalMotorista.getText().toString());
            ehae.setSalario_motorista(editTextSalarioMotorista.getText().toString());
            ehae.setTotal_guias(editTextTotalGuias.getText().toString());
            ehae.setSalario_guias(editTextSalarioGuias.getText().toString());
            ehae.setTotal_manobristas(editTextTotalManobristas.getText().toString());
            ehae.setSalario_manobristas(editTextSalarioManobristas.getText().toString());
            ehae.setTotal_seguranca(editTextTotalSeguranca.getText().toString());
            ehae.setSalario_seguranca(editTextSalarioSeguranca.getText().toString());
            ehae.setTotal_administrativo(editTextTotalAdministrativo.getText().toString());
            ehae.setSalario_administrativos(editTextSalarioAdministrativos.getText().toString());
            ehae.setTotal_garcon(editTextTotalGarcon.getText().toString());
            ehae.setSalario_garcon(editTextSalarioGarcon.getText().toString());
            ehae.setTotal_cozinheiro(editTextTotalCozinheiro.getText().toString());
            ehae.setSalario_cozinheiro(editTextSalarioCozinheiro.getText().toString());
            ehae.setTotal_outros(editTextTotalOutros.getText().toString());
            ehae.setSalario_outros(editTextSalarioOutros.getText().toString());
            ehae.setGrupos(editTextGrupos.getText().toString());
            ehae.setTotal_grupos(editTextTotalGrupos.getText().toString());
            ehae.setModelos(editTextModelos.getText().toString());
            ehae.setTotal_modelos(editTextTotalModelos.getText().toString());
            ehae.setDiaria(editTextDiaria.getText().toString());
            ehae.setTotal_diaria(editTextTotalDiaria.getText().toString());
            ehae.setKm_adicional(editTextKMAdicional.getText().toString());
            ehae.setTotal_km_adicional(editTextTotalKMAdicional.getText().toString());
            ehae.setProprio_quantidade(editTextProprioQuantidade.getText().toString());
            ehae.setTerceirizado_quantidade(editTextTerceirizadoQuantidade.getText().toString());
            ehae.setFrota_total(editTextFrotaTotal.getText().toString());
            ehae.setCitar_passeio(editTextCitarPasseio.getText().toString());
            ehae.setProprio_quantidade_condicao(editTextProprioQuantidadeCondicao.getText().toString());
            ehae.setProprio_capacidade(editTextProprioCapacidade.getText().toString());
            ehae.setTerceirizados_frota_utilizada_quantidade(editTextTerceirizadosFrotaUtilizadaQuantidade.getText().toString());
            ehae.setTerceirizados_frota_utilizada_capacidade(editTextTerceirizadosFrotaUtilizadaCapacidade.getText().toString());
            ehae.setFrota_utilizada_total(editTextFrotaUtilizadaTotal.getText().toString());
            ehae.setFrota_utilizada_capacidade_total(editTextFrotaUtilizadaCapacidadeTotal.getText().toString());
            ehae.setPasseio(passeio_stg);

            if(aLaCarte.isChecked()){
                ehae.setaLaCarte("true");
            } else {
                ehae.setaLaCarte("false");
            }

            if(entregaDomicilio.isChecked()){
                ehae.setEntregaDomicilio("true");
            } else {
                ehae.setEntregaDomicilio("false");
            }

            if(rodizio.isChecked()){
                ehae.setRodizio("true");
            } else {
                ehae.setRodizio("false");
            }

            if(selfService.isChecked()){
                ehae.setSelfService("true");
            } else {
                ehae.setSelfService("false");
            }

            if(boate.isChecked()){
                ehae.setBoate("true");
            } else {
                ehae.setBoate("false");
            }

            if(estacionamento.isChecked()){
                ehae.setEstacionamento("true");
            } else {
                ehae.setEstacionamento("false");
            }

            if(motorista.isChecked()){
                ehae.setMotorista("true");
            } else {
                ehae.setMotorista("false");
            }

            if(playGround.isChecked()){
                ehae.setPlayGround("true");
            } else {
                ehae.setPlayGround("false");
            }

            if(somMecanico.isChecked()){
                ehae.setSomMecanico("true");
            } else {
                ehae.setSomMecanico("false");
            }

            if(telao.isChecked()){
                ehae.setTelao("true");
            } else {
                ehae.setTelao("false");
            }

            if(televisao.isChecked()){
                ehae.setTelevisao("true");
            } else {
                ehae.setTelevisao("false");
            }

            if(showArtistico.isChecked()){
                ehae.setShowArtistico("true");
            } else {
                ehae.setShowArtistico("false");
            }

            if(showAoVivo.isChecked()){
                ehae.setShowAoVivo("true");
            } else {
                ehae.setShowAoVivo("false");
            }

            Date hora = new Date();
            hora.getTime();
            String s = String.valueOf(hora);
            ehae.setData_submissao(s);

            firebaseReference.child("equipamento_extra_hoteleiro_aoe").push().setValue(ehae);

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