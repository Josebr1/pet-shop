package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;

public class Especie {
    
    private int idEspecie;
    
    @Required
    private String descricao;

    public Especie(){}
    
    public Especie(int idEspecie, String descricao) {
        this.idEspecie = idEspecie;
        this.descricao = descricao;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
