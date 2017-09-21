package br.edu.ifce.diagtur.objetos;

/**
 * Created by Alberto Zaranza on 21/08/2017.
 */

public class EquipamentoHoteleiro {

    private String categoria, tipo, subtipo, codigo,
            uf, municipio, distrito, classificacao,
            denominacao, razao_social, razao_proprietario,
            informacoes, endereco, telefone, fax,
            homepage, email, telefone_reserva, registro_embratur,
            data_inicio, citar,
            apart_sgl_preco, apart_sgl_aposento_com_banheiro, apart_sgl_aposento_sem_banheiro,
            apart_dbl_preco, apart_dbl_com_banheiro, apart_dbl_sem_banheiro,
            apart_tpl_preco, apart_tpl_com_banheiro, apart_tpl_sem_banheiro,
            luxo_sgl_preco, luxo_sgl_aposento_com_banheiro, luxo_sgl_aposento_sem_banheiro,
            luxo_dbl_preco, luxo_dbl_com_banheiro, luxo_dbl_sem_banheiro,
            luxo_tpl_preco, luxo_tpl_com_banheiro, luxo_tpl_sem_banheiro,
            suite_executiva_preco, suite_executiva_com_banheiro, suite_executiva_sem_banheiro,
            suite_presidencial_preco, suite_presidencial_com_banheiro, suite_presidencial_sem_banheiro,
            chale_preco, chale_com_banheiro, chale_sem_banheiro,
            permanencia_media_hotel,
            kitinete_preco, kitinete_com_banheiro, kitinete_sem_banheiro,
            um_quarto_preco, um_quarto_com_banheiro, um_quarto_sem_banheiro,
            dois_quartos_preco, dois_quartos_com_banheiro, dois_quartos_sem_banheiro,
            tres_quarto_preco, tres_quartos_com_banheiro, tres_quartos_sem_banheiro,
            permanencia_media_flat,
            coletivo_preco, coletivo_com_banheiro, coletivo_sem_banheiro,
            quarto_preco, quarto_com_banheiro, quarto_sem_banheiro,
            permanencia_media_quarto,
            unidade_habitacional, cama_casal, cama_solteiro, leitos,
            apartamento_ocupado, numero_hospedes, cartao,
            total_camareira, salario_camareira,
            total_carregadores, salario_carregadores,
            total_cozinheiro, salario_cozinheiro,
            total_faxineiro, salario_faxineiro,
            total_garcon, salario_garcon,
            total_porteiro, salario_porteiro,
            total_recepcionista, salario_recepcionista,
            total_outros, salario_outros,
            observacoes, auth, data_submissao, divulgacao, hospede;

    private String natureza, cadeia_hoteleira, hotel_pousada, cafe_manha, diaria, cartao_rg;

    private String permanencia_hotel_pousada_checkbox, albergue_checkbox, ar_checkbox,
            banheiro_checkbox, chuveiro_eletrico_checkbox, cofre_checkbox,
            fogao_checkbox, frigobar_checkbox, guarda_roupa_checkbox, sala_checkbox,
            som_checkbox, telefone_checkbox, televisao_checkbox, ventilador_checkbox,
            auditorio_checkbox, bar_checkbox, telefone_comunitario_checkbox,
            estacionamento_checkbox, piscina_checkbox, quadra_checkbox, salao_checkbox,
            sala_reuniao_checkbox, sauna_checkbox, som_ambiente_checkbox,
            televisao_comunitaria_checkbox;

    public EquipamentoHoteleiro() {
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getRazao_proprietario() {
        return razao_proprietario;
    }

    public void setRazao_proprietario(String razao_proprietario) {
        this.razao_proprietario = razao_proprietario;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
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

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone_reserva() {
        return telefone_reserva;
    }

    public void setTelefone_reserva(String telefone_reserva) {
        this.telefone_reserva = telefone_reserva;
    }

    public String getRegistro_embratur() {
        return registro_embratur;
    }

    public void setRegistro_embratur(String registro_embratur) {
        this.registro_embratur = registro_embratur;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getCitar() {
        return citar;
    }

    public void setCitar(String citar) {
        this.citar = citar;
    }

    public String getApart_sgl_preco() {
        return apart_sgl_preco;
    }

    public void setApart_sgl_preco(String apart_sgl_preco) {
        this.apart_sgl_preco = apart_sgl_preco;
    }

    public String getApart_sgl_aposento_com_banheiro() {
        return apart_sgl_aposento_com_banheiro;
    }

    public void setApart_sgl_aposento_com_banheiro(String apart_sgl_aposento_com_banheiro) {
        this.apart_sgl_aposento_com_banheiro = apart_sgl_aposento_com_banheiro;
    }

    public String getApart_sgl_aposento_sem_banheiro() {
        return apart_sgl_aposento_sem_banheiro;
    }

    public void setApart_sgl_aposento_sem_banheiro(String apart_sgl_aposento_sem_banheiro) {
        this.apart_sgl_aposento_sem_banheiro = apart_sgl_aposento_sem_banheiro;
    }

    public String getApart_dbl_preco() {
        return apart_dbl_preco;
    }

    public void setApart_dbl_preco(String apart_dbl_preco) {
        this.apart_dbl_preco = apart_dbl_preco;
    }

    public String getApart_dbl_com_banheiro() {
        return apart_dbl_com_banheiro;
    }

    public void setApart_dbl_com_banheiro(String apart_dbl_com_banheiro) {
        this.apart_dbl_com_banheiro = apart_dbl_com_banheiro;
    }

    public String getApart_dbl_sem_banheiro() {
        return apart_dbl_sem_banheiro;
    }

    public void setApart_dbl_sem_banheiro(String apart_dbl_sem_banheiro) {
        this.apart_dbl_sem_banheiro = apart_dbl_sem_banheiro;
    }

    public String getApart_tpl_preco() {
        return apart_tpl_preco;
    }

    public void setApart_tpl_preco(String apart_tpl_preco) {
        this.apart_tpl_preco = apart_tpl_preco;
    }

    public String getApart_tpl_com_banheiro() {
        return apart_tpl_com_banheiro;
    }

    public void setApart_tpl_com_banheiro(String apart_tpl_com_banheiro) {
        this.apart_tpl_com_banheiro = apart_tpl_com_banheiro;
    }

    public String getApart_tpl_sem_banheiro() {
        return apart_tpl_sem_banheiro;
    }

    public void setApart_tpl_sem_banheiro(String apart_tpl_sem_banheiro) {
        this.apart_tpl_sem_banheiro = apart_tpl_sem_banheiro;
    }

    public String getLuxo_sgl_preco() {
        return luxo_sgl_preco;
    }

    public void setLuxo_sgl_preco(String luxo_sgl_preco) {
        this.luxo_sgl_preco = luxo_sgl_preco;
    }

    public String getLuxo_sgl_aposento_com_banheiro() {
        return luxo_sgl_aposento_com_banheiro;
    }

    public void setLuxo_sgl_aposento_com_banheiro(String luxo_sgl_aposento_com_banheiro) {
        this.luxo_sgl_aposento_com_banheiro = luxo_sgl_aposento_com_banheiro;
    }

    public String getLuxo_sgl_aposento_sem_banheiro() {
        return luxo_sgl_aposento_sem_banheiro;
    }

    public void setLuxo_sgl_aposento_sem_banheiro(String luxo_sgl_aposento_sem_banheiro) {
        this.luxo_sgl_aposento_sem_banheiro = luxo_sgl_aposento_sem_banheiro;
    }

    public String getLuxo_dbl_preco() {
        return luxo_dbl_preco;
    }

    public void setLuxo_dbl_preco(String luxo_dbl_preco) {
        this.luxo_dbl_preco = luxo_dbl_preco;
    }

    public String getLuxo_dbl_com_banheiro() {
        return luxo_dbl_com_banheiro;
    }

    public void setLuxo_dbl_com_banheiro(String luxo_dbl_com_banheiro) {
        this.luxo_dbl_com_banheiro = luxo_dbl_com_banheiro;
    }

    public String getLuxo_dbl_sem_banheiro() {
        return luxo_dbl_sem_banheiro;
    }

    public void setLuxo_dbl_sem_banheiro(String luxo_dbl_sem_banheiro) {
        this.luxo_dbl_sem_banheiro = luxo_dbl_sem_banheiro;
    }

    public String getLuxo_tpl_preco() {
        return luxo_tpl_preco;
    }

    public void setLuxo_tpl_preco(String luxo_tpl_preco) {
        this.luxo_tpl_preco = luxo_tpl_preco;
    }

    public String getLuxo_tpl_com_banheiro() {
        return luxo_tpl_com_banheiro;
    }

    public void setLuxo_tpl_com_banheiro(String luxo_tpl_com_banheiro) {
        this.luxo_tpl_com_banheiro = luxo_tpl_com_banheiro;
    }

    public String getLuxo_tpl_sem_banheiro() {
        return luxo_tpl_sem_banheiro;
    }

    public void setLuxo_tpl_sem_banheiro(String luxo_tpl_sem_banheiro) {
        this.luxo_tpl_sem_banheiro = luxo_tpl_sem_banheiro;
    }

    public String getSuite_executiva_preco() {
        return suite_executiva_preco;
    }

    public void setSuite_executiva_preco(String suite_executiva_preco) {
        this.suite_executiva_preco = suite_executiva_preco;
    }

    public String getSuite_executiva_com_banheiro() {
        return suite_executiva_com_banheiro;
    }

    public void setSuite_executiva_com_banheiro(String suite_executiva_com_banheiro) {
        this.suite_executiva_com_banheiro = suite_executiva_com_banheiro;
    }

    public String getSuite_executiva_sem_banheiro() {
        return suite_executiva_sem_banheiro;
    }

    public void setSuite_executiva_sem_banheiro(String suite_executiva_sem_banheiro) {
        this.suite_executiva_sem_banheiro = suite_executiva_sem_banheiro;
    }

    public String getSuite_presidencial_preco() {
        return suite_presidencial_preco;
    }

    public void setSuite_presidencial_preco(String suite_presidencial_preco) {
        this.suite_presidencial_preco = suite_presidencial_preco;
    }

    public String getSuite_presidencial_com_banheiro() {
        return suite_presidencial_com_banheiro;
    }

    public void setSuite_presidencial_com_banheiro(String suite_presidencial_com_banheiro) {
        this.suite_presidencial_com_banheiro = suite_presidencial_com_banheiro;
    }

    public String getSuite_presidencial_sem_banheiro() {
        return suite_presidencial_sem_banheiro;
    }

    public void setSuite_presidencial_sem_banheiro(String suite_presidencial_sem_banheiro) {
        this.suite_presidencial_sem_banheiro = suite_presidencial_sem_banheiro;
    }

    public String getChale_preco() {
        return chale_preco;
    }

    public void setChale_preco(String chale_preco) {
        this.chale_preco = chale_preco;
    }

    public String getChale_com_banheiro() {
        return chale_com_banheiro;
    }

    public void setChale_com_banheiro(String chale_com_banheiro) {
        this.chale_com_banheiro = chale_com_banheiro;
    }

    public String getChale_sem_banheiro() {
        return chale_sem_banheiro;
    }

    public void setChale_sem_banheiro(String chale_sem_banheiro) {
        this.chale_sem_banheiro = chale_sem_banheiro;
    }

    public String getPermanencia_media_hotel() {
        return permanencia_media_hotel;
    }

    public void setPermanencia_media_hotel(String permanencia_media_hotel) {
        this.permanencia_media_hotel = permanencia_media_hotel;
    }

    public String getKitinete_preco() {
        return kitinete_preco;
    }

    public void setKitinete_preco(String kitinete_preco) {
        this.kitinete_preco = kitinete_preco;
    }

    public String getKitinete_com_banheiro() {
        return kitinete_com_banheiro;
    }

    public void setKitinete_com_banheiro(String kitinete_com_banheiro) {
        this.kitinete_com_banheiro = kitinete_com_banheiro;
    }

    public String getKitinete_sem_banheiro() {
        return kitinete_sem_banheiro;
    }

    public void setKitinete_sem_banheiro(String kitinete_sem_banheiro) {
        this.kitinete_sem_banheiro = kitinete_sem_banheiro;
    }

    public String getUm_quarto_preco() {
        return um_quarto_preco;
    }

    public void setUm_quarto_preco(String um_quarto_preco) {
        this.um_quarto_preco = um_quarto_preco;
    }

    public String getUm_quarto_com_banheiro() {
        return um_quarto_com_banheiro;
    }

    public void setUm_quarto_com_banheiro(String um_quarto_com_banheiro) {
        this.um_quarto_com_banheiro = um_quarto_com_banheiro;
    }

    public String getUm_quarto_sem_banheiro() {
        return um_quarto_sem_banheiro;
    }

    public void setUm_quarto_sem_banheiro(String um_quarto_sem_banheiro) {
        this.um_quarto_sem_banheiro = um_quarto_sem_banheiro;
    }

    public String getDois_quartos_preco() {
        return dois_quartos_preco;
    }

    public void setDois_quartos_preco(String dois_quartos_preco) {
        this.dois_quartos_preco = dois_quartos_preco;
    }

    public String getDois_quartos_com_banheiro() {
        return dois_quartos_com_banheiro;
    }

    public void setDois_quartos_com_banheiro(String dois_quartos_com_banheiro) {
        this.dois_quartos_com_banheiro = dois_quartos_com_banheiro;
    }

    public String getDois_quartos_sem_banheiro() {
        return dois_quartos_sem_banheiro;
    }

    public void setDois_quartos_sem_banheiro(String dois_quartos_sem_banheiro) {
        this.dois_quartos_sem_banheiro = dois_quartos_sem_banheiro;
    }

    public String getTres_quarto_preco() {
        return tres_quarto_preco;
    }

    public void setTres_quarto_preco(String tres_quarto_preco) {
        this.tres_quarto_preco = tres_quarto_preco;
    }

    public String getTres_quartos_com_banheiro() {
        return tres_quartos_com_banheiro;
    }

    public void setTres_quartos_com_banheiro(String tres_quartos_com_banheiro) {
        this.tres_quartos_com_banheiro = tres_quartos_com_banheiro;
    }

    public String getTres_quartos_sem_banheiro() {
        return tres_quartos_sem_banheiro;
    }

    public void setTres_quartos_sem_banheiro(String tres_quartos_sem_banheiro) {
        this.tres_quartos_sem_banheiro = tres_quartos_sem_banheiro;
    }

    public String getPermanencia_media_flat() {
        return permanencia_media_flat;
    }

    public void setPermanencia_media_flat(String permanencia_media_flat) {
        this.permanencia_media_flat = permanencia_media_flat;
    }

    public String getColetivo_preco() {
        return coletivo_preco;
    }

    public void setColetivo_preco(String coletivo_preco) {
        this.coletivo_preco = coletivo_preco;
    }

    public String getColetivo_com_banheiro() {
        return coletivo_com_banheiro;
    }

    public void setColetivo_com_banheiro(String coletivo_com_banheiro) {
        this.coletivo_com_banheiro = coletivo_com_banheiro;
    }

    public String getColetivo_sem_banheiro() {
        return coletivo_sem_banheiro;
    }

    public void setColetivo_sem_banheiro(String coletivo_sem_banheiro) {
        this.coletivo_sem_banheiro = coletivo_sem_banheiro;
    }

    public String getQuarto_preco() {
        return quarto_preco;
    }

    public void setQuarto_preco(String quarto_preco) {
        this.quarto_preco = quarto_preco;
    }

    public String getQuarto_com_banheiro() {
        return quarto_com_banheiro;
    }

    public void setQuarto_com_banheiro(String quarto_com_banheiro) {
        this.quarto_com_banheiro = quarto_com_banheiro;
    }

    public String getQuarto_sem_banheiro() {
        return quarto_sem_banheiro;
    }

    public void setQuarto_sem_banheiro(String quarto_sem_banheiro) {
        this.quarto_sem_banheiro = quarto_sem_banheiro;
    }

    public String getPermanencia_media_quarto() {
        return permanencia_media_quarto;
    }

    public void setPermanencia_media_quarto(String permanencia_media_quarto) {
        this.permanencia_media_quarto = permanencia_media_quarto;
    }

    public String getUnidade_habitacional() {
        return unidade_habitacional;
    }

    public void setUnidade_habitacional(String unidade_habitacional) {
        this.unidade_habitacional = unidade_habitacional;
    }

    public String getCama_casal() {
        return cama_casal;
    }

    public void setCama_casal(String cama_casal) {
        this.cama_casal = cama_casal;
    }

    public String getCama_solteiro() {
        return cama_solteiro;
    }

    public void setCama_solteiro(String cama_solteiro) {
        this.cama_solteiro = cama_solteiro;
    }

    public String getLeitos() {
        return leitos;
    }

    public void setLeitos(String leitos) {
        this.leitos = leitos;
    }

    public String getApartamento_ocupado() {
        return apartamento_ocupado;
    }

    public void setApartamento_ocupado(String apartamento_ocupado) {
        this.apartamento_ocupado = apartamento_ocupado;
    }

    public String getNumero_hospedes() {
        return numero_hospedes;
    }

    public void setNumero_hospedes(String numero_hospedes) {
        this.numero_hospedes = numero_hospedes;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getTotal_camareira() {
        return total_camareira;
    }

    public void setTotal_camareira(String total_camareira) {
        this.total_camareira = total_camareira;
    }

    public String getSalario_camareira() {
        return salario_camareira;
    }

    public void setSalario_camareira(String salario_camareira) {
        this.salario_camareira = salario_camareira;
    }

    public String getTotal_carregadores() {
        return total_carregadores;
    }

    public void setTotal_carregadores(String total_carregadores) {
        this.total_carregadores = total_carregadores;
    }

    public String getSalario_carregadores() {
        return salario_carregadores;
    }

    public void setSalario_carregadores(String salario_carregadores) {
        this.salario_carregadores = salario_carregadores;
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

    public String getTotal_faxineiro() {
        return total_faxineiro;
    }

    public void setTotal_faxineiro(String total_faxineiro) {
        this.total_faxineiro = total_faxineiro;
    }

    public String getSalario_faxineiro() {
        return salario_faxineiro;
    }

    public void setSalario_faxineiro(String salario_faxineiro) {
        this.salario_faxineiro = salario_faxineiro;
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

    public String getTotal_porteiro() {
        return total_porteiro;
    }

    public void setTotal_porteiro(String total_porteiro) {
        this.total_porteiro = total_porteiro;
    }

    public String getSalario_porteiro() {
        return salario_porteiro;
    }

    public void setSalario_porteiro(String salario_porteiro) {
        this.salario_porteiro = salario_porteiro;
    }

    public String getTotal_recepcionista() {
        return total_recepcionista;
    }

    public void setTotal_recepcionista(String total_recepcionista) {
        this.total_recepcionista = total_recepcionista;
    }

    public String getSalario_recepcionista() {
        return salario_recepcionista;
    }

    public void setSalario_recepcionista(String salario_recepcionista) {
        this.salario_recepcionista = salario_recepcionista;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getCadeia_hoteleira() {
        return cadeia_hoteleira;
    }

    public void setCadeia_hoteleira(String cadeia_hoteleira) {
        this.cadeia_hoteleira = cadeia_hoteleira;
    }

    public String getHotel_pousada() {
        return hotel_pousada;
    }

    public void setHotel_pousada(String hotel_pousada) {
        this.hotel_pousada = hotel_pousada;
    }

    public String getCafe_manha() {
        return cafe_manha;
    }

    public void setCafe_manha(String cafe_manha) {
        this.cafe_manha = cafe_manha;
    }

    public String getDiaria() {
        return diaria;
    }

    public void setDiaria(String diaria) {
        this.diaria = diaria;
    }

    public String getCartao_rg() {
        return cartao_rg;
    }

    public void setCartao_rg(String cartao_rg) {
        this.cartao_rg = cartao_rg;
    }

    public String getPermanencia_hotel_pousada_checkbox() {
        return permanencia_hotel_pousada_checkbox;
    }

    public void setPermanencia_hotel_pousada_checkbox(String permanencia_hotel_pousada_checkbox) {
        this.permanencia_hotel_pousada_checkbox = permanencia_hotel_pousada_checkbox;
    }

    public String getAlbergue_checkbox() {
        return albergue_checkbox;
    }

    public void setAlbergue_checkbox(String albergue_checkbox) {
        this.albergue_checkbox = albergue_checkbox;
    }

    public String getAr_checkbox() {
        return ar_checkbox;
    }

    public void setAr_checkbox(String ar_checkbox) {
        this.ar_checkbox = ar_checkbox;
    }

    public String getBanheiro_checkbox() {
        return banheiro_checkbox;
    }

    public void setBanheiro_checkbox(String banheiro_checkbox) {
        this.banheiro_checkbox = banheiro_checkbox;
    }

    public String getChuveiro_eletrico_checkbox() {
        return chuveiro_eletrico_checkbox;
    }

    public void setChuveiro_eletrico_checkbox(String chuveiro_eletrico_checkbox) {
        this.chuveiro_eletrico_checkbox = chuveiro_eletrico_checkbox;
    }

    public String getCofre_checkbox() {
        return cofre_checkbox;
    }

    public void setCofre_checkbox(String cofre_checkbox) {
        this.cofre_checkbox = cofre_checkbox;
    }

    public String getFogao_checkbox() {
        return fogao_checkbox;
    }

    public void setFogao_checkbox(String fogao_checkbox) {
        this.fogao_checkbox = fogao_checkbox;
    }

    public String getFrigobar_checkbox() {
        return frigobar_checkbox;
    }

    public void setFrigobar_checkbox(String frigobar_checkbox) {
        this.frigobar_checkbox = frigobar_checkbox;
    }

    public String getGuarda_roupa_checkbox() {
        return guarda_roupa_checkbox;
    }

    public void setGuarda_roupa_checkbox(String guarda_roupa_checkbox) {
        this.guarda_roupa_checkbox = guarda_roupa_checkbox;
    }

    public String getSala_checkbox() {
        return sala_checkbox;
    }

    public void setSala_checkbox(String sala_checkbox) {
        this.sala_checkbox = sala_checkbox;
    }

    public String getSom_checkbox() {
        return som_checkbox;
    }

    public void setSom_checkbox(String som_checkbox) {
        this.som_checkbox = som_checkbox;
    }

    public String getTelefone_checkbox() {
        return telefone_checkbox;
    }

    public void setTelefone_checkbox(String telefone_checkbox) {
        this.telefone_checkbox = telefone_checkbox;
    }

    public String getTelevisao_checkbox() {
        return televisao_checkbox;
    }

    public void setTelevisao_checkbox(String televisao_checkbox) {
        this.televisao_checkbox = televisao_checkbox;
    }

    public String getVentilador_checkbox() {
        return ventilador_checkbox;
    }

    public void setVentilador_checkbox(String ventilador_checkbox) {
        this.ventilador_checkbox = ventilador_checkbox;
    }

    public String getAuditorio_checkbox() {
        return auditorio_checkbox;
    }

    public void setAuditorio_checkbox(String auditorio_checkbox) {
        this.auditorio_checkbox = auditorio_checkbox;
    }

    public String getBar_checkbox() {
        return bar_checkbox;
    }

    public void setBar_checkbox(String bar_checkbox) {
        this.bar_checkbox = bar_checkbox;
    }

    public String getTelefone_comunitario_checkbox() {
        return telefone_comunitario_checkbox;
    }

    public void setTelefone_comunitario_checkbox(String telefone_comunitario_checkbox) {
        this.telefone_comunitario_checkbox = telefone_comunitario_checkbox;
    }

    public String getEstacionamento_checkbox() {
        return estacionamento_checkbox;
    }

    public void setEstacionamento_checkbox(String estacionamento_checkbox) {
        this.estacionamento_checkbox = estacionamento_checkbox;
    }

    public String getPiscina_checkbox() {
        return piscina_checkbox;
    }

    public void setPiscina_checkbox(String piscina_checkbox) {
        this.piscina_checkbox = piscina_checkbox;
    }

    public String getQuadra_checkbox() {
        return quadra_checkbox;
    }

    public void setQuadra_checkbox(String quadra_checkbox) {
        this.quadra_checkbox = quadra_checkbox;
    }

    public String getSalao_checkbox() {
        return salao_checkbox;
    }

    public void setSalao_checkbox(String salao_checkbox) {
        this.salao_checkbox = salao_checkbox;
    }

    public String getSala_reuniao_checkbox() {
        return sala_reuniao_checkbox;
    }

    public void setSala_reuniao_checkbox(String sala_reuniao_checkbox) {
        this.sala_reuniao_checkbox = sala_reuniao_checkbox;
    }

    public String getSauna_checkbox() {
        return sauna_checkbox;
    }

    public void setSauna_checkbox(String sauna_checkbox) {
        this.sauna_checkbox = sauna_checkbox;
    }

    public String getSom_ambiente_checkbox() {
        return som_ambiente_checkbox;
    }

    public void setSom_ambiente_checkbox(String som_ambiente_checkbox) {
        this.som_ambiente_checkbox = som_ambiente_checkbox;
    }

    public String getTelevisao_comunitaria_checkbox() {
        return televisao_comunitaria_checkbox;
    }

    public void setTelevisao_comunitaria_checkbox(String televisao_comunitaria_checkbox) {
        this.televisao_comunitaria_checkbox = televisao_comunitaria_checkbox;
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

    public String getDivulgacao() {
        return divulgacao;
    }

    public void setDivulgacao(String divulgacao) {
        this.divulgacao = divulgacao;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }
}
