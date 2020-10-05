package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.Endereco;

public interface IEnderecoController {
    void insertAndUpdate(Endereco e);
    Endereco getById(int id);
}
