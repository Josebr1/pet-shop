package br.com.cru.petshop.dao.interfaces;

import br.com.cru.petshop.models.Situacao;
import java.sql.SQLException;

public interface ISituacaoDAO extends IGenericDAO<Situacao>{
    void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Situacao getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
