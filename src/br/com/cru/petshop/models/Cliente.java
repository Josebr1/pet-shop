package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Email;
import br.com.cru.petshop.annotations.MaskRequired;
import br.com.cru.petshop.annotations.Required;
import br.com.cru.petshop.models.enums.Sexo;
import java.util.Date;

public class Cliente {
    
    private int idCliente;
    @Required
    private String nome;
    @MaskRequired
    private String documento;
    @Required
    @Email
    private String email;
    @Required
    private Date dataNascimento;
    @Required
    private Sexo sexo;
    @MaskRequired
    private String fone;
    @Required
    private Endereco endereco;

    public Cliente() {
        
    }

    public Cliente(int idCliente, String nome, String documento, String email, Date dataNascimento, Sexo sexo, String fone, Endereco endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.fone = fone;
        this.endereco = endereco;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento.replaceAll("[^0-9+]", "");
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getFone() {
        return fone
                .replaceAll("[^0-9+]", "");
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
