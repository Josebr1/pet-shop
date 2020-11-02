package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IAtendimentoController;
import br.com.cru.petshop.dao.AtendimentoDAO;
import br.com.cru.petshop.dao.interfaces.IAtendimentoDAO;
import br.com.cru.petshop.models.Atendimento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtendimentoController implements IAtendimentoController {

    private IAtendimentoDAO mAtendimentoDAO;

    public AtendimentoController() {
        this.mAtendimentoDAO = new AtendimentoDAO();
    }

    @Override
    public Atendimento findById(int id) {
        try {
            return this.mAtendimentoDAO.findById(id);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AtendimentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Atendimento();
    }

    @Override
    public void insertAndUpdate(Atendimento model) {
        try {
            if (model.getId() == 0) {
                this.mAtendimentoDAO.insert(model);
            } else {
                this.mAtendimentoDAO.update(model);
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AtendimentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Atendimento> all() {
        try {
            return this.mAtendimentoDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AtendimentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

}
