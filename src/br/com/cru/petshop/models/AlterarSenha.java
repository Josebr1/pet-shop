package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Email;
import br.com.cru.petshop.annotations.Password;
import br.com.cru.petshop.annotations.Required;

public class AlterarSenha {
    
    @Email
    @Required
    private String email;
    @Required
    @Password
    private String senha;
    @Required
    @Password
    private String repeatSenha;

    public AlterarSenha(String email, String senha, String repeatSenha) {
        this.email = email;
        this.senha = senha;
        this.repeatSenha = repeatSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRepeatSenha() {
        return repeatSenha;
    }

    public void setRepeatSenha(String repeatSenha) {
        this.repeatSenha = repeatSenha;
    }
    
    
    
}
