package br.com.cru.petshop.controllers.interfaces;

import br.com.cru.petshop.models.FormasPagamento;

import java.util.List;

public interface IFormasPagamentoController {
    void insertAndUpdate(FormasPagamento formasPagamento);
    List<FormasPagamento> all();
    void delete(String selectedValue);
    FormasPagamento getByDescription(String descricao);
}
