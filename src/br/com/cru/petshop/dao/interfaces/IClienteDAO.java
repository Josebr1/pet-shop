package br.com.cru.petshop.dao.interfaces;

import br.com.cru.petshop.models.Cliente;
import java.sql.SQLException;

public interface IClienteDAO extends IGenericDAO<Cliente>{
    Cliente findbyid(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
