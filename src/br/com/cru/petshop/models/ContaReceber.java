package br.com.cru.petshop.models;

import java.util.Date;

public class ContaReceber {

    private int id;
    private String tipoConta;
    private double valor;
    private Date dataCredito;
    private String observacao;
    private FormasPagamento formaPagamento;

    public ContaReceber() {
    }

    public ContaReceber(int id, String tipoConta, double valor, Date dataCredito, String observacao, FormasPagamento formaPagamento) {
        this.id = id;
        this.tipoConta = tipoConta;
        this.valor = valor;
        this.dataCredito = dataCredito;
        this.observacao = observacao;
        this.formaPagamento = formaPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormasPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormasPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
