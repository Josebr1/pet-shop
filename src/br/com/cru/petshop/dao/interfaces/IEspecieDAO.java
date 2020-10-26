package br.com.cru.petshop.dao.interfaces;

import br.com.cru.petshop.models.Especie;
import java.sql.SQLException;

public interface IEspecieDAO extends IGenericDAO<Especie>{
    Especie getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
