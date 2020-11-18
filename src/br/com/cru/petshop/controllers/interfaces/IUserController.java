package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.Usuario;

import java.util.List;

public interface IUserController {
    boolean primeiroAdm();
    boolean login(Usuario u);
    void insertAndUpdate(Usuario usuario);
    List<Usuario> all();
    Usuario getUserByEmail(String email);
    boolean updateSenha(Usuario u);
}
