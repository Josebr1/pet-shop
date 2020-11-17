package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;
import java.util.Date;

public class ContaReceber {

    private int id;
    @Required
    private String tipoConta;
    @Required
    private double valor;
    @Required
    private Date dataCredito;
    private boolean creditoRealizado;
    private String observacao;
    @Required
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

    public ContaReceber(int id, String tipoConta, double valor, Date dataCredito, boolean creditoRealizado, String observacao, FormasPagamento formaPagamento) {
        this.id = id;
        this.tipoConta = tipoConta;
        this.valor = valor;
        this.dataCredito = dataCredito;
        this.creditoRealizado = creditoRealizado;
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

    public boolean isCreditoRealizado() {
        return creditoRealizado;
    }

    public void setCreditoRealizado(boolean creditoRealizado) {
        this.creditoRealizado = creditoRealizado;
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
