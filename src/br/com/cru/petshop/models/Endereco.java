package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;
import org.h2.util.StringUtils;

public class Endereco {
    
    private int id;
    @Required
    private String cep;
    
    @Required
    private String logradouro;
    
    @Required
    private String bairro;
    
    @Required
    private String cidade;
    
    private String referencia;
    
    @Required
    private String numero;
    
    private String complemento;
    
    @Required
    private String uf;

    public Endereco(){}
    
    public Endereco(int id){
        this.id = id;
    }
    
    public Endereco(int id, String cep, String logradouro, String bairro, String cidade, String referencia, String numero, String complemento, String uf) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.referencia = referencia;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        if(!StringUtils.isNullOrEmpty(cep))
            return cep.replace("-", "");
        else
            return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return logradouro + " " + numero + ", " + bairro + ", " + cidade + "-" + uf;
    }
    
    
    
}
