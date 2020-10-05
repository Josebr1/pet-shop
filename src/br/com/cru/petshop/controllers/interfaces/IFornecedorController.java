/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.Fornecedor;

import java.util.List;

/**
 *
 * @author antonio
 */
public interface IFornecedorController {
    void insertAndUpdate(Fornecedor f);
    List<Fornecedor> all();
    Fornecedor getById(int id);
}
