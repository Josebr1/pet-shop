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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

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

            if(model.getId()== 0)
                this.mContaReceberDAO.insert(model);
            else 
                this.mContaReceberDAO.update(model);

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, e);
            if (e instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");

        }
    }

    @Override
    public List<ContaReceber> all() {
        try {
            return this.mContaReceberDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, e);
        }
        return new ArrayList<>();
    }

    @Override
    public ContaReceber findById(int id) {
        try {
            return this.mContaReceberDAO.findById(id);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, e);
        }
        return new ContaReceber();
    }
}
