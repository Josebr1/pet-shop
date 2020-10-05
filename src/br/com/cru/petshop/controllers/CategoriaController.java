package br.com.cru.petshop.controllers;


import br.com.cru.petshop.controllers.interfaces.ICategoriaController;
import br.com.cru.petshop.dao.CategoriaDAO;
import br.com.cru.petshop.dao.interfaces.ICategoriaDAO;
import br.com.cru.petshop.models.Categoria;

import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaController implements ICategoriaController {

    private ICategoriaDAO mICategoriaDAO;

    public CategoriaController() {
        this.mICategoriaDAO = new CategoriaDAO();
    }

    @Override
    public void insertAndUpdate(Categoria categoria) {
        try {
            if(categoria.getId() == 0)
                this.mICategoriaDAO.insert(categoria);
            else
                this.mICategoriaDAO.update(categoria);
        } catch (InstantiationException | SQLException | IllegalAccessException | ClassNotFoundException e) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, e);
            if (e instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
        }
    }

    @Override
    public List<Categoria> all() {
        try {
            return this.mICategoriaDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

    @Override
    public Categoria getByDescription(String s) {
        try {
            return this.mICategoriaDAO.getByDescription(s);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        try {
            this.mICategoriaDAO.deleteByDescription(s);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
