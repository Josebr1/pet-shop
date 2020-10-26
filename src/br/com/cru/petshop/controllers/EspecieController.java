package br.com.cru.petshop.controllers;




import br.com.cru.petshop.controllers.interfaces.IEspecieController;
import br.com.cru.petshop.dao.EspecieDAO;
import br.com.cru.petshop.dao.interfaces.IEspecieDAO;
import br.com.cru.petshop.models.Especie;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EspecieController implements IEspecieController {

    private IEspecieDAO mIEspecieDAO;

    public EspecieController() {
        this.mIEspecieDAO = new EspecieDAO();
    }

    @Override
    public void insertAndUpdate(Especie categoria) {
        try {
            if(categoria.getIdEspecie() == 0)
                this.mIEspecieDAO.insert(categoria);
            else
                this.mIEspecieDAO.update(categoria);
        } catch (InstantiationException | SQLException | IllegalAccessException | ClassNotFoundException e) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, e);
            if (e instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
        }
    }

    @Override
    public List<Especie> all() {
        try {
            return this.mIEspecieDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

    @Override
    public Especie getByDescription(String s) {
        try {
            return this.mIEspecieDAO.getByDescription(s);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        try {
            this.mIEspecieDAO.deleteByDescription(s);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
