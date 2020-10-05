package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IFormasPagamentoController;
import br.com.cru.petshop.dao.FormasPagamentoDAO;
import br.com.cru.petshop.dao.interfaces.IFormasPagamentoDAO;
import br.com.cru.petshop.models.FormasPagamento;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormasPagamentoController implements IFormasPagamentoController {

    private IFormasPagamentoDAO mFormasPagamentoDAO;

    public FormasPagamentoController() {
        this.mFormasPagamentoDAO = new FormasPagamentoDAO();
    }

    @Override
    public void insertAndUpdate(FormasPagamento formasPagamento) {
        try {
            if(formasPagamento.getIdFormaPagamento() == 0)
                this.mFormasPagamentoDAO.insert(formasPagamento);
            else
                this.mFormasPagamentoDAO.update(formasPagamento);
        } catch (InstantiationException | SQLException | IllegalAccessException | ClassNotFoundException e) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, e);
            if (e instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
        }
    }

    @Override
    public List<FormasPagamento> all() {
        try {
            return this.mFormasPagamentoDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public void delete(String selectedValue) {
        try {
            this.mFormasPagamentoDAO.deleteByDescription(selectedValue);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public FormasPagamento getByDescription(String descricao) {
        try {
            return this.mFormasPagamentoDAO.getByDescription(descricao);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new FormasPagamento();
    }
}
