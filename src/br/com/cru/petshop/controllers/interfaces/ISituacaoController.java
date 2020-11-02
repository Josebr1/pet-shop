package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.Situacao;

public interface ISituacaoController extends IGenericDAO<Situacao>{
    Situacao getByDescription(String s);
    void delete(String s);
}
