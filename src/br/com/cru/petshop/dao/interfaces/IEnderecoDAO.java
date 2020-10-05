package br.com.cru.petshop.dao.interfaces;

import br.com.cru.petshop.models.Endereco;
import java.sql.SQLException;

public interface IEnderecoDAO {
    Endereco insert(Endereco endereco) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Endereco update(Endereco endereco) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Endereco getById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
