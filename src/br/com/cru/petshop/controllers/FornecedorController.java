/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IFornecedorController;
import br.com.cru.petshop.dao.EnderecoDAO;
import br.com.cru.petshop.dao.FornecedorDAO;
import br.com.cru.petshop.dao.interfaces.IEnderecoDAO;
import br.com.cru.petshop.dao.interfaces.IFornecedorDAO;
import br.com.cru.petshop.models.Endereco;
import br.com.cru.petshop.models.Fornecedor;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonio
 */
public class FornecedorController implements IFornecedorController{

    private IEnderecoDAO mEnderecoDAO;
    private IFornecedorDAO mFornecedorDAO;
    
    public FornecedorController() {
        this.mEnderecoDAO = new EnderecoDAO();
        this.mFornecedorDAO = new FornecedorDAO();
    }
    
    @Override
    public void insertAndUpdate(Fornecedor f) {
        try {
            Endereco e = null;
            
            if(f.getEndereco().getId() == 0) 
                e = mEnderecoDAO.insert(f.getEndereco());
            else
                e = mEnderecoDAO.update(f.getEndereco());
            
            if (e == null)
                throw new InstantiationException();

            f.setEndereco(e);

            if(f.getId() == 0)
                this.mFornecedorDAO.insert(f);
            else
                this.mFornecedorDAO.update(f);
            
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
            if (ex instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
        }
    }

    @Override
    public List<Fornecedor> all() {
        try {
            return this.mFornecedorDAO.all();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public Fornecedor getById(int id) {
        try {
            return this.mFornecedorDAO.getById(id);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Fornecedor();
    }

}
