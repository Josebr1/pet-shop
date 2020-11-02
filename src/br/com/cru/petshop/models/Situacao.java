package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;

public class Situacao {
    
    private int id;
    @Required
    private String descricao;

    public Situacao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public Situacao(String descricao) {
        this.descricao = descricao;
    }

    public Situacao() {}
    
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

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
