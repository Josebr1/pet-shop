package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IContaReceberController;
import br.com.cru.petshop.dao.ContaReceberDAO;
import br.com.cru.petshop.dao.FormasPagamentoDAO;
import br.com.cru.petshop.dao.interfaces.IContaReceberDAO;
import br.com.cru.petshop.dao.interfaces.IFormasPagamentoDAO;
import br.com.cru.petshop.models.ContaReceber;
import br.com.cru.petshop.models.FormasPagamento;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaReceberController implements IContaReceberController {

    private IContaReceberDAO mContaReceberDAO;
    private IFormasPagamentoDAO mFormasPagamentoDAO;

    public ContaReceberController() {
        this.mContaReceberDAO = new ContaReceberDAO();
        this.mFormasPagamentoDAO = new FormasPagamentoDAO();
    }

    @Override
    public void insertAndUpdate(ContaReceber model) {
        try {
            FormasPagamento f = this.mFormasPagamentoDAO.getByDescription(model.getFormaPagamento().getDescricao());

            if(f == null)
                throw new InstantiationException();

            model.setFormaPagamento(f);

            this.mContaReceberDAO.insert(model);

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ContaReceber> all() {
        try {
            return this.mContaReceberDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
