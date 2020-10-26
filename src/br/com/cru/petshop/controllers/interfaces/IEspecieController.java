package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.Especie;

import java.util.List;

public interface IEspecieController {

    void insertAndUpdate(Especie categoria);
    List<Especie> all();
    Especie getByDescription(String s);
    void delete(String s);
}
