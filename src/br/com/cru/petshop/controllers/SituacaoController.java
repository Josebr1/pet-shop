package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.ISituacaoController;
import br.com.cru.petshop.dao.SituacaoDAO;
import br.com.cru.petshop.dao.interfaces.ISituacaoDAO;
import br.com.cru.petshop.models.Situacao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

public class SituacaoController implements ISituacaoController{

    private ISituacaoDAO mSituacaoDAO;
    
    public SituacaoController() {
        this.mSituacaoDAO = new SituacaoDAO();
    }
    
    @Override
    public Situacao findById(int id) {
        try {
            return this.mSituacaoDAO.findById(id);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SituacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Situacao();
    }

    @Override
    public void insertAndUpdate(Situacao model) {
        try {
            if (model.getId() == 0) {
                this.mSituacaoDAO.insert(model);
            } else {
                this.mSituacaoDAO.update(model);
            }

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
            if (ex instanceof JdbcSQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
            }
        }
    }

    @Override
    public List<Situacao> all() {
        try {
            return this.mSituacaoDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SituacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

    @Override
    public Situacao getByDescription(String s) {
        try {
            return this.mSituacaoDAO.getByDescription(s);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SituacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Situacao();
    }

    @Override
    public void delete(String s) {
        try {
            this.mSituacaoDAO.deleteByDescription(s);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SituacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
