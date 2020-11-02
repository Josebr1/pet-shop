package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;
import java.util.Date;

public class PedidoFornecedor {
    
    private int id;
    @Required
    private Date previsao;
    @Required
    private String descricao;
    private Fornecedor fornecedor;
    private Usuario usuario;

    public PedidoFornecedor(){
        
    }

    public PedidoFornecedor(int id, Date previsao, String descricao, Fornecedor fornecedor, Usuario usuario) {
        this.id = id;
        this.previsao = previsao;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.usuario = usuario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPrevisao() {
        return previsao;
    }

    public void setPrevisao(Date previsao) {
        this.previsao = previsao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
