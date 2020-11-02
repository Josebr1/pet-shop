package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IAnimalController;
import br.com.cru.petshop.dao.AnimalDAO;
import br.com.cru.petshop.dao.interfaces.IAnimalDAO;
import br.com.cru.petshop.models.Animal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

public class AnimalController implements IAnimalController {

    private IAnimalDAO mAnimalDAO;

    public AnimalController() {
        this.mAnimalDAO = new AnimalDAO();
    }

    @Override
    public void insertAndUpdate(Animal model) {
        try {
            if (model.getId() == 0) {
                this.mAnimalDAO.insert(model);
            } else {
                this.mAnimalDAO.update(model);
            }

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
            if (ex instanceof JdbcSQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
            }
        }

    }

    @Override
    public List<Animal> all() {
        try {
            return this.mAnimalDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

    @Override
    public Animal findById(int id) {
        try {
            return this.mAnimalDAO.findById(id);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Animal();
    }

}
