package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IEnderecoController;
import br.com.cru.petshop.dao.EnderecoDAO;
import br.com.cru.petshop.dao.interfaces.IEnderecoDAO;
import br.com.cru.petshop.models.Endereco;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoController implements IEnderecoController {
    
    private IEnderecoDAO mEnderecoDAO;
    
    public EnderecoController() {
        this.mEnderecoDAO = new EnderecoDAO();
    }

    @Override
    public void insertAndUpdate(Endereco e) {
        try {
            if(e.getId() == 0) this.mEnderecoDAO.insert(e);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EnderecoController.class.getName()).log(Level.SEVERE, null, ex);
            if (ex instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
        }
    }

    @Override
    public Endereco getById(int id) {
        try {
            return this.mEnderecoDAO.getById(id);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Endereco();
    }


}
