package br.com.cru.petshop.controllers;

import br.com.cru.petshop.controllers.interfaces.IClienteController;
import br.com.cru.petshop.dao.ClienteDAO;
import br.com.cru.petshop.dao.interfaces.IClienteDAO;
import br.com.cru.petshop.dao.interfaces.IEnderecoDAO;
import br.com.cru.petshop.models.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

public class ClienteController implements IClienteController{

    private IClienteDAO mClienteDAO;
    private IEnderecoDAO mEnderecoDAO;
    
    public ClienteController() {
        this.mClienteDAO = new ClienteDAO();
    }
    
    @Override
    public void insertAndUpdate(Cliente model) {
        
        try {
            
            if(model.getIdCliente() == 0)
                this.mClienteDAO.insert(model);
            else 
                this.mClienteDAO.update(model);
            
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, e);
            if (e instanceof JdbcSQLIntegrityConstraintViolationException)
                JOptionPane.showMessageDialog(null, "Já existe um registro desse tipo cadastrado!");
        }
        
    }

    @Override
    public List<Cliente> all() {
        try {
            return this.mClienteDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

    @Override
    public Cliente findById(int id) {
        try {
            return this.mClienteDAO.findbyid(id);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Cliente();
    }
    
}
