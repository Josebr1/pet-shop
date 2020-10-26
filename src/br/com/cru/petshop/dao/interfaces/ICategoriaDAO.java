package br.com.cru.petshop.dao.interfaces;

import br.com.cru.petshop.models.Categoria;

import java.sql.SQLException;

public interface ICategoriaDAO extends IGenericDAO<Categoria>{
    Categoria getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
