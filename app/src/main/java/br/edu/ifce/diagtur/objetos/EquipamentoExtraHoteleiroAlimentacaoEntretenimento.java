package br.edu.ifce.diagtur.objetos;

/**
 * Created by Alberto Zaranza on 21/08/2017.
 */

public class EquipamentoExtraHoteleiroAlimentacaoEntretenimento {

    private String categoria, tipo, subtipo, codigo,
            uf, municipio, distrito, nome_proprietario,
            numero_ordem, nome_estabelecimento, inicio_funcionamento,
            endereco, telefone, fax, total_pessoas_trabalhando,
            especializacao, horário_funcionamento, numero_mesas,
            dias_semana, dias_semana_ao_vivo,
            total_motorista, salario_motorista,
            total_guias, salario_guias,
            total_manobristas, salario_manobristas,
            total_seguranca, salario_seguranca,
            total_administrativo, salario_administrativos,
            total_garcon, salario_garcon,
            total_cozinheiro, salario_cozinheiro,
            total_outros, salario_outros,
            grupos, total_grupos,
            modelos, total_modelos,
            diaria, total_diaria,
            km_adicional, total_km_adicional,
            proprio_quantidade,
            terceirizado_quantidade,
            frota_total,
            citar_passeio,
            proprio_quantidade_condicao, proprio_capacidade,
            terceirizados_frota_utilizada_quantidade, terceirizados_frota_utilizada_capacidade,
            frota_utilizada_total, frota_utilizada_capacidade_total, auth, data_submissao;



    private String passeio;

    private String aLaCarte, entregaDomicilio, rodizio, selfService, boate, estacionamento,
            motorista, playGround, somMecanico, telao, televisao, showArtistico, showAoVivo;

    public EquipamentoExtraHoteleiroAlimentacaoEntretenimento() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getNome_proprietario() {
        return nome_proprietario;
    }

    public void setNome_proprietario(String nome_proprietario) {
        this.nome_proprietario = nome_proprietario;
    }

    public String getNumero_ordem() {
        return numero_ordem;
    }

    public void setNumero_ordem(String numero_ordem) {
        this.numero_ordem = numero_ordem;
    }

    public String getNome_estabelecimento() {
        return nome_estabelecimento;
    }

    public void setNome_estabelecimento(String nome_estabelecimento) {
        this.nome_estabelecimento = nome_estabelecimento;
    }

    public String getInicio_funcionamento() {
        return inicio_funcionamento;
    }

    public void setInicio_funcionamento(String inicio_funcionamento) {
        this.inicio_funcionamento = inicio_funcionamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTotal_pessoas_trabalhando() {
        return total_pessoas_trabalhando;
    }

    public void setTotal_pessoas_trabalhando(String total_pessoas_trabalhando) {
        this.total_pessoas_trabalhando = total_pessoas_trabalhando;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getHorário_funcionamento() {
        return horário_funcionamento;
    }

    public void setHorário_funcionamento(String horário_funcionamento) {
        this.horário_funcionamento = horário_funcionamento;
    }

    public String getNumero_mesas() {
        return numero_mesas;
    }

    public void setNumero_mesas(String numero_mesas) {
        this.numero_mesas = numero_mesas;
    }

    public String getDias_semana() {
        return dias_semana;
    }

    public void setDias_semana(String dias_semana) {
        this.dias_semana = dias_semana;
    }

    public String getDias_semana_ao_vivo() {
        return dias_semana_ao_vivo;
    }

    public void setDias_semana_ao_vivo(String dias_semana_ao_vivo) {
        this.dias_semana_ao_vivo = dias_semana_ao_vivo;
    }

    public String getTotal_motorista() {
        return total_motorista;
    }

    public void setTotal_motorista(String total_motorista) {
        this.total_motorista = total_motorista;
    }

    public String getSalario_motorista() {
        return salario_motorista;
    }

    public void setSalario_motorista(String salario_motorista) {
        this.salario_motorista = salario_motorista;
    }

    public String getTotal_guias() {
        return total_guias;
    }

    public void setTotal_guias(String total_guias) {
        this.total_guias = total_guias;
    }

    public String getSalario_guias() {
        return salario_guias;
    }

    public void setSalario_guias(String salario_guias) {
        this.salario_guias = salario_guias;
    }

    public String getTotal_manobristas() {
        return total_manobristas;
    }

    public void setTotal_manobristas(String total_manobristas) {
        this.total_manobristas = total_manobristas;
    }

    public String getSalario_manobristas() {
        return salario_manobristas;
    }

    public void setSalario_manobristas(String salario_manobristas) {
        this.salario_manobristas = salario_manobristas;
    }

    public String getTotal_seguranca() {
        return total_seguranca;
    }

    public void setTotal_seguranca(String total_seguranca) {
        this.total_seguranca = total_seguranca;
    }

    public String getSalario_seguranca() {
        return salario_seguranca;
    }

    public void setSalario_seguranca(String salario_seguranca) {
        this.salario_seguranca = salario_seguranca;
    }

    public String getTotal_administrativo() {
        return total_administrativo;
    }

    public void setTotal_administrativo(String total_administrativo) {
        this.total_administrativo = total_administrativo;
    }

    public String getSalario_administrativos() {
        return salario_administrativos;
    }

    public void setSalario_administrativos(String salario_administrativos) {
        this.salario_administrativos = salario_administrativos;
    }

    public String getTotal_garcon() {
        return total_garcon;
    }

    public void setTotal_garcon(String total_garcon) {
        this.total_garcon = total_garcon;
    }

    public String getSalario_garcon() {
        return salario_garcon;
    }

    public void setSalario_garcon(String salario_garcon) {
        this.salario_garcon = salario_garcon;
    }

    public String getTotal_cozinheiro() {
        return total_cozinheiro;
    }

    public void setTotal_cozinheiro(String total_cozinheiro) {
        this.total_cozinheiro = total_cozinheiro;
    }

    public String getSalario_cozinheiro() {
        return salario_cozinheiro;
    }

    public void setSalario_cozinheiro(String salario_cozinheiro) {
        this.salario_cozinheiro = salario_cozinheiro;
    }

    public String getTotal_outros() {
        return total_outros;
    }

    public void setTotal_outros(String total_outros) {
        this.total_outros = total_outros;
    }

    public String getSalario_outros() {
        return salario_outros;
    }

    public void setSalario_outros(String salario_outros) {
        this.salario_outros = salario_outros;
    }

    public String getGrupos() {
        return grupos;
    }

    public void setGrupos(String grupos) {
        this.grupos = grupos;
    }

    public String getTotal_grupos() {
        return total_grupos;
    }

    public void setTotal_grupos(String total_grupos) {
        this.total_grupos = total_grupos;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getTotal_modelos() {
        return total_modelos;
    }

    public void setTotal_modelos(String total_modelos) {
        this.total_modelos = total_modelos;
    }

    public String getDiaria() {
        return diaria;
    }

    public void setDiaria(String diaria) {
        this.diaria = diaria;
    }

    public String getTotal_diaria() {
        return total_diaria;
    }

    public void setTotal_diaria(String total_diaria) {
        this.total_diaria = total_diaria;
    }

    public String getKm_adicional() {
        return km_adicional;
    }

    public void setKm_adicional(String km_adicional) {
        this.km_adicional = km_adicional;
    }

    public String getTotal_km_adicional() {
        return total_km_adicional;
    }

    public void setTotal_km_adicional(String total_km_adicional) {
        this.total_km_adicional = total_km_adicional;
    }

    public String getProprio_quantidade() {
        return proprio_quantidade;
    }

    public void setProprio_quantidade(String proprio_quantidade) {
        this.proprio_quantidade = proprio_quantidade;
    }

    public String getTerceirizado_quantidade() {
        return terceirizado_quantidade;
    }

    public void setTerceirizado_quantidade(String terceirizado_quantidade) {
        this.terceirizado_quantidade = terceirizado_quantidade;
    }

    public String getFrota_total() {
        return frota_total;
    }

    public void setFrota_total(String frota_total) {
        this.frota_total = frota_total;
    }

    public String getCitar_passeio() {
        return citar_passeio;
    }

    public void setCitar_passeio(String citar_passeio) {
        this.citar_passeio = citar_passeio;
    }

    public String getProprio_quantidade_condicao() {
        return proprio_quantidade_condicao;
    }

    public void setProprio_quantidade_condicao(String proprio_quantidade_condicao) {
        this.proprio_quantidade_condicao = proprio_quantidade_condicao;
    }

    public String getProprio_capacidade() {
        return proprio_capacidade;
    }

    public void setProprio_capacidade(String proprio_capacidade) {
        this.proprio_capacidade = proprio_capacidade;
    }

    public String getTerceirizados_frota_utilizada_quantidade() {
        return terceirizados_frota_utilizada_quantidade;
    }

    public void setTerceirizados_frota_utilizada_quantidade(String terceirizados_frota_utilizada_quantidade) {
        this.terceirizados_frota_utilizada_quantidade = terceirizados_frota_utilizada_quantidade;
    }

    public String getTerceirizados_frota_utilizada_capacidade() {
        return terceirizados_frota_utilizada_capacidade;
    }

    public void setTerceirizados_frota_utilizada_capacidade(String terceirizados_frota_utilizada_capacidade) {
        this.terceirizados_frota_utilizada_capacidade = terceirizados_frota_utilizada_capacidade;
    }

    public String getFrota_utilizada_total() {
        return frota_utilizada_total;
    }

    public void setFrota_utilizada_total(String frota_utilizada_total) {
        this.frota_utilizada_total = frota_utilizada_total;
    }

    public String getFrota_utilizada_capacidade_total() {
        return frota_utilizada_capacidade_total;
    }

    public void setFrota_utilizada_capacidade_total(String frota_utilizada_capacidade_total) {
        this.frota_utilizada_capacidade_total = frota_utilizada_capacidade_total;
    }

    public String getPasseio() {
        return passeio;
    }

    public void setPasseio(String passeio) {
        this.passeio = passeio;
    }

    public String getaLaCarte() {
        return aLaCarte;
    }

    public void setaLaCarte(String aLaCarte) {
        this.aLaCarte = aLaCarte;
    }

    public String getEntregaDomicilio() {
        return entregaDomicilio;
    }

    public void setEntregaDomicilio(String entregaDomicilio) {
        this.entregaDomicilio = entregaDomicilio;
    }

    public String getRodizio() {
        return rodizio;
    }

    public void setRodizio(String rodizio) {
        this.rodizio = rodizio;
    }

    public String getSelfService() {
        return selfService;
    }

    public void setSelfService(String selfService) {
        this.selfService = selfService;
    }

    public String getBoate() {
        return boate;
    }

    public void setBoate(String boate) {
        this.boate = boate;
    }

    public String getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(String estacionamento) {
        this.estacionamento = estacionamento;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPlayGround() {
        return playGround;
    }

    public void setPlayGround(String playGround) {
        this.playGround = playGround;
    }

    public String getSomMecanico() {
        return somMecanico;
    }

    public void setSomMecanico(String somMecanico) {
        this.somMecanico = somMecanico;
    }

    public String getTelao() {
        return telao;
    }

    public void setTelao(String telao) {
        this.telao = telao;
    }

    public String getTelevisao() {
        return televisao;
    }

    public void setTelevisao(String televisao) {
        this.televisao = televisao;
    }

    public String getShowArtistico() {
        return showArtistico;
    }

    public void setShowArtistico(String showArtistico) {
        this.showArtistico = showArtistico;
    }

    public String getShowAoVivo() {
        return showAoVivo;
    }

    public void setShowAoVivo(String showAoVivo) {
        this.showAoVivo = showAoVivo;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getData_submissao() {
        return data_submissao;
    }

    public void setData_submissao(String data_submissao) {
        this.data_submissao = data_submissao;
    }
}
