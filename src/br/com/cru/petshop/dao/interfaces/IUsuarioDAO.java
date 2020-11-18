package br.com.cru.petshop.dao.interfaces;

import br.com.cru.petshop.models.Usuario;
import java.sql.SQLException;
import java.util.List;

public interface IUsuarioDAO extends IGenericDAO<Usuario>{
    boolean isFirstUserCreate() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    boolean login(Usuario u) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    List<Usuario> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Usuario getUserByEmail(String email) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    int updateByEmail(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    String getTypeUserByLogin(Usuario u) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
