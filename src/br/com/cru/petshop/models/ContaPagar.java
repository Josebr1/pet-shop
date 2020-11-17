package br.com.cru.petshop.models;

import java.util.Date;

public class ContaPagar {
    
    private int id;
    private String descricao;
    private Date vencimento;
    private Double valor;
    private boolean contaPaga;
    private Date dataPagamento;
    private Double valorPago;
    private Fornecedor fornecedor;

    public ContaPagar() {}
    
    public ContaPagar(int id, String descricao, Date vencimento, Double valor, boolean contaPaga, Date dataPagamento, Double valorPago, Fornecedor fornecedor) {
        this.id = id;
        this.descricao = descricao;
        this.vencimento = vencimento;
        this.valor = valor;
        this.contaPaga = contaPaga;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isContaPaga() {
        return contaPaga;
    }

    public void setContaPaga(boolean contaPaga) {
        this.contaPaga = contaPaga;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
