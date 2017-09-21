package br.edu.ifce.diagtur.objetos;

/**
 * Created by Alberto Zaranza on 21/08/2017.
 */

public class Infraestrutura {

    private String categoria, codigo,
            uf, municipio, cep, ddd, distancia_capital,
            municipios_limitrofes, populacao_total, populacao_urbana,
            area, altitude_media, indice_precipitacao,
            jan_maxima, jan_media, jan_minima,
            fev_maxima, fev_media, fev_minima,
            mar_maxima, mar_media, mar_minima,
            abr_maxima, abr_media, abr_minima,
            maio_maxima, maio_media, maio_minima,
            jun_maxima, jun_media, jun_minima,
            jul_maxima, jul_media, jul_minima,
            ago_maxima, ago_media, ago_minima,
            set_maxima, set_media, set_minima,
            out_maxima, out_media, out_minima,
            nov_maxima, nov_media, nov_minima,
            dez_maxima, dez_media, dez_minima,
            distancia_sede, extensao, nome_prefeito,
            endereco_prefeitura, email_prefeitura,
            homepage_prefeitura, nome_turismo, endereco_turismo,
            cargo_turismo, atividades, caracterizacao_turistica,
            feriados_local, domicilios_atendidos, empresa_abastecimento,
            jornal_local, observacoes, auth, data_submissao;

    private String clima, campo_repouso, asfalto, estado_conservasao,
            orgao_oficial, esgoto, energia, limpeza_publica, estacao_emissora,
            radio, planos_urbanisticos;

    private String rodoviario, ferroviario, aereo, federal, estadual, muninicipal,
            taxi, onibus, bonde, animal, outros, agua, poco, rio;

    public Infraestrutura() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDistancia_capital() {
        return distancia_capital;
    }

    public void setDistancia_capital(String distancia_capital) {
        this.distancia_capital = distancia_capital;
    }

    public String getMunicipios_limitrofes() {
        return municipios_limitrofes;
    }

    public void setMunicipios_limitrofes(String municipios_limitrofes) {
        this.municipios_limitrofes = municipios_limitrofes;
    }

    public String getPopulacao_total() {
        return populacao_total;
    }

    public void setPopulacao_total(String populacao_total) {
        this.populacao_total = populacao_total;
    }

    public String getPopulacao_urbana() {
        return populacao_urbana;
    }

    public void setPopulacao_urbana(String populacao_urbana) {
        this.populacao_urbana = populacao_urbana;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAltitude_media() {
        return altitude_media;
    }

    public void setAltitude_media(String altitude_media) {
        this.altitude_media = altitude_media;
    }

    public String getIndice_precipitacao() {
        return indice_precipitacao;
    }

    public void setIndice_precipitacao(String indice_precipitacao) {
        this.indice_precipitacao = indice_precipitacao;
    }

    public String getJan_maxima() {
        return jan_maxima;
    }

    public void setJan_maxima(String jan_maxima) {
        this.jan_maxima = jan_maxima;
    }

    public String getJan_media() {
        return jan_media;
    }

    public void setJan_media(String jan_media) {
        this.jan_media = jan_media;
    }

    public String getJan_minima() {
        return jan_minima;
    }

    public void setJan_minima(String jan_minima) {
        this.jan_minima = jan_minima;
    }

    public String getFev_maxima() {
        return fev_maxima;
    }

    public void setFev_maxima(String fev_maxima) {
        this.fev_maxima = fev_maxima;
    }

    public String getFev_media() {
        return fev_media;
    }

    public void setFev_media(String fev_media) {
        this.fev_media = fev_media;
    }

    public String getFev_minima() {
        return fev_minima;
    }

    public void setFev_minima(String fev_minima) {
        this.fev_minima = fev_minima;
    }

    public String getMar_maxima() {
        return mar_maxima;
    }

    public void setMar_maxima(String mar_maxima) {
        this.mar_maxima = mar_maxima;
    }

    public String getMar_media() {
        return mar_media;
    }

    public void setMar_media(String mar_media) {
        this.mar_media = mar_media;
    }

    public String getMar_minima() {
        return mar_minima;
    }

    public void setMar_minima(String mar_minima) {
        this.mar_minima = mar_minima;
    }

    public String getAbr_maxima() {
        return abr_maxima;
    }

    public void setAbr_maxima(String abr_maxima) {
        this.abr_maxima = abr_maxima;
    }

    public String getAbr_media() {
        return abr_media;
    }

    public void setAbr_media(String abr_media) {
        this.abr_media = abr_media;
    }

    public String getAbr_minima() {
        return abr_minima;
    }

    public void setAbr_minima(String abr_minima) {
        this.abr_minima = abr_minima;
    }

    public String getMaio_maxima() {
        return maio_maxima;
    }

    public void setMaio_maxima(String maio_maxima) {
        this.maio_maxima = maio_maxima;
    }

    public String getMaio_media() {
        return maio_media;
    }

    public void setMaio_media(String maio_media) {
        this.maio_media = maio_media;
    }

    public String getMaio_minima() {
        return maio_minima;
    }

    public void setMaio_minima(String maio_minima) {
        this.maio_minima = maio_minima;
    }

    public String getJun_maxima() {
        return jun_maxima;
    }

    public void setJun_maxima(String jun_maxima) {
        this.jun_maxima = jun_maxima;
    }

    public String getJun_media() {
        return jun_media;
    }

    public void setJun_media(String jun_media) {
        this.jun_media = jun_media;
    }

    public String getJun_minima() {
        return jun_minima;
    }

    public void setJun_minima(String jun_minima) {
        this.jun_minima = jun_minima;
    }

    public String getJul_maxima() {
        return jul_maxima;
    }

    public void setJul_maxima(String jul_maxima) {
        this.jul_maxima = jul_maxima;
    }

    public String getJul_media() {
        return jul_media;
    }

    public void setJul_media(String jul_media) {
        this.jul_media = jul_media;
    }

    public String getJul_minima() {
        return jul_minima;
    }

    public void setJul_minima(String jul_minima) {
        this.jul_minima = jul_minima;
    }

    public String getAgo_maxima() {
        return ago_maxima;
    }

    public void setAgo_maxima(String ago_maxima) {
        this.ago_maxima = ago_maxima;
    }

    public String getAgo_media() {
        return ago_media;
    }

    public void setAgo_media(String ago_media) {
        this.ago_media = ago_media;
    }

    public String getAgo_minima() {
        return ago_minima;
    }

    public void setAgo_minima(String ago_minima) {
        this.ago_minima = ago_minima;
    }

    public String getSet_maxima() {
        return set_maxima;
    }

    public void setSet_maxima(String set_maxima) {
        this.set_maxima = set_maxima;
    }

    public String getSet_media() {
        return set_media;
    }

    public void setSet_media(String set_media) {
        this.set_media = set_media;
    }

    public String getSet_minima() {
        return set_minima;
    }

    public void setSet_minima(String set_minima) {
        this.set_minima = set_minima;
    }

    public String getOut_maxima() {
        return out_maxima;
    }

    public void setOut_maxima(String out_maxima) {
        this.out_maxima = out_maxima;
    }

    public String getOut_media() {
        return out_media;
    }

    public void setOut_media(String out_media) {
        this.out_media = out_media;
    }

    public String getOut_minima() {
        return out_minima;
    }

    public void setOut_minima(String out_minima) {
        this.out_minima = out_minima;
    }

    public String getNov_maxima() {
        return nov_maxima;
    }

    public void setNov_maxima(String nov_maxima) {
        this.nov_maxima = nov_maxima;
    }

    public String getNov_media() {
        return nov_media;
    }

    public void setNov_media(String nov_media) {
        this.nov_media = nov_media;
    }

    public String getNov_minima() {
        return nov_minima;
    }

    public void setNov_minima(String nov_minima) {
        this.nov_minima = nov_minima;
    }

    public String getDez_maxima() {
        return dez_maxima;
    }

    public void setDez_maxima(String dez_maxima) {
        this.dez_maxima = dez_maxima;
    }

    public String getDez_media() {
        return dez_media;
    }

    public void setDez_media(String dez_media) {
        this.dez_media = dez_media;
    }

    public String getDez_minima() {
        return dez_minima;
    }

    public void setDez_minima(String dez_minima) {
        this.dez_minima = dez_minima;
    }

    public String getDistancia_sede() {
        return distancia_sede;
    }

    public void setDistancia_sede(String distancia_sede) {
        this.distancia_sede = distancia_sede;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String getNome_prefeito() {
        return nome_prefeito;
    }

    public void setNome_prefeito(String nome_prefeito) {
        this.nome_prefeito = nome_prefeito;
    }

    public String getEndereco_prefeitura() {
        return endereco_prefeitura;
    }

    public void setEndereco_prefeitura(String endereco_prefeitura) {
        this.endereco_prefeitura = endereco_prefeitura;
    }

    public String getEmail_prefeitura() {
        return email_prefeitura;
    }

    public void setEmail_prefeitura(String email_prefeitura) {
        this.email_prefeitura = email_prefeitura;
    }

    public String getHomepage_prefeitura() {
        return homepage_prefeitura;
    }

    public void setHomepage_prefeitura(String homepage_prefeitura) {
        this.homepage_prefeitura = homepage_prefeitura;
    }

    public String getNome_turismo() {
        return nome_turismo;
    }

    public void setNome_turismo(String nome_turismo) {
        this.nome_turismo = nome_turismo;
    }

    public String getEndereco_turismo() {
        return endereco_turismo;
    }

    public void setEndereco_turismo(String endereco_turismo) {
        this.endereco_turismo = endereco_turismo;
    }

    public String getCargo_turismo() {
        return cargo_turismo;
    }

    public void setCargo_turismo(String cargo_turismo) {
        this.cargo_turismo = cargo_turismo;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getCaracterizacao_turistica() {
        return caracterizacao_turistica;
    }

    public void setCaracterizacao_turistica(String caracterizacao_turistica) {
        this.caracterizacao_turistica = caracterizacao_turistica;
    }

    public String getFeriados_local() {
        return feriados_local;
    }

    public void setFeriados_local(String feriados_local) {
        this.feriados_local = feriados_local;
    }

    public String getDomicilios_atendidos() {
        return domicilios_atendidos;
    }

    public void setDomicilios_atendidos(String domicilios_atendidos) {
        this.domicilios_atendidos = domicilios_atendidos;
    }

    public String getEmpresa_abastecimento() {
        return empresa_abastecimento;
    }

    public void setEmpresa_abastecimento(String empresa_abastecimento) {
        this.empresa_abastecimento = empresa_abastecimento;
    }

    public String getJornal_local() {
        return jornal_local;
    }

    public void setJornal_local(String jornal_local) {
        this.jornal_local = jornal_local;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getCampo_repouso() {
        return campo_repouso;
    }

    public void setCampo_repouso(String campo_repouso) {
        this.campo_repouso = campo_repouso;
    }

    public String getAsfalto() {
        return asfalto;
    }

    public void setAsfalto(String asfalto) {
        this.asfalto = asfalto;
    }

    public String getEstado_conservasao() {
        return estado_conservasao;
    }

    public void setEstado_conservasao(String estado_conservasao) {
        this.estado_conservasao = estado_conservasao;
    }

    public String getOrgao_oficial() {
        return orgao_oficial;
    }

    public void setOrgao_oficial(String orgao_oficial) {
        this.orgao_oficial = orgao_oficial;
    }

    public String getEsgoto() {
        return esgoto;
    }

    public void setEsgoto(String esgoto) {
        this.esgoto = esgoto;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    public String getLimpeza_publica() {
        return limpeza_publica;
    }

    public void setLimpeza_publica(String limpeza_publica) {
        this.limpeza_publica = limpeza_publica;
    }

    public String getEstacao_emissora() {
        return estacao_emissora;
    }

    public void setEstacao_emissora(String estacao_emissora) {
        this.estacao_emissora = estacao_emissora;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getPlanos_urbanisticos() {
        return planos_urbanisticos;
    }

    public void setPlanos_urbanisticos(String planos_urbanisticos) {
        this.planos_urbanisticos = planos_urbanisticos;
    }

    public String getRodoviario() {
        return rodoviario;
    }

    public void setRodoviario(String rodoviario) {
        this.rodoviario = rodoviario;
    }

    public String getFerroviario() {
        return ferroviario;
    }

    public void setFerroviario(String ferroviario) {
        this.ferroviario = ferroviario;
    }

    public String getAereo() {
        return aereo;
    }

    public void setAereo(String aereo) {
        this.aereo = aereo;
    }

    public String getFederal() {
        return federal;
    }

    public void setFederal(String federal) {
        this.federal = federal;
    }

    public String getEstadual() {
        return estadual;
    }

    public void setEstadual(String estadual) {
        this.estadual = estadual;
    }

    public String getMuninicipal() {
        return muninicipal;
    }

    public void setMuninicipal(String muninicipal) {
        this.muninicipal = muninicipal;
    }

    public String getTaxi() {
        return taxi;
    }

    public void setTaxi(String taxi) {
        this.taxi = taxi;
    }

    public String getOnibus() {
        return onibus;
    }

    public void setOnibus(String onibus) {
        this.onibus = onibus;
    }

    public String getBonde() {
        return bonde;
    }

    public void setBonde(String bonde) {
        this.bonde = bonde;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getPoco() {
        return poco;
    }

    public void setPoco(String poco) {
        this.poco = poco;
    }

    public String getRio() {
        return rio;
    }

    public void setRio(String rio) {
        this.rio = rio;
    }

    public String getData_submissao() {
        return data_submissao;
    }

    public void setData_submissao(String data_submissao) {
        this.data_submissao = data_submissao;
    }
}
