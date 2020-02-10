/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilhete.imprimir;

import java.io.Serializable;


/**
 *
 * @author T2Ti
 */
public class Bilhete implements Serializable {
    private Integer id;
    private String origem;
    private String destino;
    private String data_viagem;
    private String hora_viagem;
    private String servico;
    private String poltrona;
    private String plataforma;
    private String prefixo;
    private String tipo;
    private String linha;
    private String tarifa;
    private String taxa;
    private String valorTotal;
    private String desconto;
    private String valorApagar;
    private String chaveAcesso;
    private String passageiro;
    private String documento;
    private String data_venda;
    private String hora_venda;
    private String num_sistema;
    private String tipoBpe;
    private String icms;
    private String tipoPagt;
    
    
    public Bilhete() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @return the data_viagem
     */
    public String getData_viagem() {
        return data_viagem;
    }

    /**
     * @return the hora_viagem
     */
    public String getHora_viagem() {
        return hora_viagem;
    }

    /**
     * @return the poltrona
     */
    public String getPoltrona() {
        return poltrona;
    }

    /**
     * @return the tarifa
     */
    public String getTarifa() {
        return tarifa;
    }

    /**
     * @return the passageiro
     */
    public String getPassageiro() {
        return passageiro;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @return the data_venda
     */
    public String getData_venda() {
        return data_venda;
    }

    /**
     * @return the hora_venda
     */
    public String getHora_venda() {
        return hora_venda;
    }

    /**
     * @return the num_sistema
     */
    public String getNum_sistema() {
        return num_sistema;
    }

    /**
     * @return the icms
     */
    public String getIcms() {
        return icms;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @param data_viagem the data_viagem to set
     */
    public void setData_viagem(String data_viagem) {
        this.data_viagem = data_viagem;
    }

    /**
     * @param hora_viagem the hora_viagem to set
     */
    public void setHora_viagem(String hora_viagem) {
        this.hora_viagem = hora_viagem;
    }

    /**
     * @param poltrona the poltrona to set
     */
    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * @param passageiro the passageiro to set
     */
    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @param data_venda the data_venda to set
     */
    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    /**
     * @param hora_venda the hora_venda to set
     */
    public void setHora_venda(String hora_venda) {
        this.hora_venda = hora_venda;
    }

    /**
     * @param num_sistema the num_sistema to set
     */
    public void setNum_sistema(String num_sistema) {
        this.num_sistema = num_sistema;
    }

    /**
     * @param icms the icms to set
     */
    public void setIcms(String icms) {
        this.icms = icms;
    }

    /**
     * @return the servico
     */
    public String getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(String servico) {
        this.servico = servico;
    }

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * @return the prefixo
     */
    public String getPrefixo() {
        return prefixo;
    }

    /**
     * @param prefixo the prefixo to set
     */
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the linha
     */
    public String getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(String linha) {
        this.linha = linha;
    }

    /**
     * @return the taxa
     */
    public String getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }

    /**
     * @return the valorTotal
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the desconto
     */
    public String getDesconto() {
        return desconto;
    }

    /**
     * @return the valorApagar
     */
    public String getValorApagar() {
        return valorApagar;
    }

    /**
     * @return the chaveAcesso
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    /**
     * @param valorApagar the valorApagar to set
     */
    public void setValorApagar(String valorApagar) {
        this.valorApagar = valorApagar;
    }

    /**
     * @param chaveAcesso the chaveAcesso to set
     */
    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    /**
     * @return the tipoBpe
     */
    public String getTipoBpe() {
        return tipoBpe;
    }

    /**
     * @param tipoBpe the tipoBpe to set
     */
    public void setTipoBpe(String tipoBpe) {
        this.tipoBpe = tipoBpe;
    }

    /**
     * @return the tipoPagt
     */
    public String getTipoPagt() {
        return tipoPagt;
    }

    /**
     * @param tipoPagt the tipoPagt to set
     */
    public void setTipoPagt(String tipoPagt) {
        this.tipoPagt = tipoPagt;
    }

}
