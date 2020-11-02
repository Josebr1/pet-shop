package br.com.cru.petshop.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IGenericDAO<T> {
    T findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    T insert(T model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void update(T model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    List<T> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
