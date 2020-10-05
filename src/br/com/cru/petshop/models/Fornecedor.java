package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.CNPJ;
import br.com.cru.petshop.annotations.Required;
import org.h2.util.StringUtils;

public class Fornecedor {

    private int id;

    @Required
    @CNPJ
    private String documento;
    
    @Required
    private String nome;
    
    private String celular;
    
    @Required
    private String rg;
    
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        if(!StringUtils.isNullOrEmpty(documento))
            return documento.replace(".","").replace("-","").replace("/", "");
        else
            return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        if (!StringUtils.isNullOrEmpty(celular))
            return celular.replace("(","").replace(")", "").replace("-", "");
        else
            return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
