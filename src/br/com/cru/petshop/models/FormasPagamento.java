package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;

public class FormasPagamento {

    private int idFormaPagamento;
    @Required
    private String descricao;

    public FormasPagamento(int idFormaPagamento, String descricao) {
        this.idFormaPagamento = idFormaPagamento;
        this.descricao = descricao;
    }

    public FormasPagamento(String descricao) {
        this.descricao = descricao;
    }

    public FormasPagamento() {
    }

    public int getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(int idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
