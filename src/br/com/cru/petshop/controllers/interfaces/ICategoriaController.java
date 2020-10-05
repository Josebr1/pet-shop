package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.Categoria;

import java.util.List;

public interface ICategoriaController {

    void insertAndUpdate(Categoria categoria);
    List<Categoria> all();
    Categoria getByDescription(String s);
    void delete(String s);
}
