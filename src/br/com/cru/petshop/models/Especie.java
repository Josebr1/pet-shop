package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;
import java.util.Objects;

public class Especie {
    
    private int idEspecie;
    
    @Required
    private String descricao;

    public Especie(){}
    
    public Especie(int id){
        this.idEspecie = id;
    }
    
    public Especie(int idEspecie, String descricao) {
        this.idEspecie = idEspecie;
        this.descricao = descricao;
    }
    
     public Especie(String descricao) {
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

    @Override
    public String toString() {
        return descricao;
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Especie other = (Especie) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
    
}
