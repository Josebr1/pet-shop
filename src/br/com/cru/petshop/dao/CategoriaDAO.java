package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.ICategoriaDAO;
import br.com.cru.petshop.models.Categoria;
import br.com.cru.petshop.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO implements ICategoriaDAO {

    private Connection mConnection = null;

    @Override
    public Categoria insert(Categoria categoria) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO CATEGORIA (DESCRICAO) VALUES (?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, categoria.getDescricao());
            
            int affectedRows = statement.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            
            ResultSet generetedKeys = statement.getGeneratedKeys();
            if(generetedKeys.next()) {
                categoria.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
            return categoria;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void update(Categoria categoria) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE CATEGORIA SET DESCRICAO = ? WHERE ID_CATEGORIA = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, categoria.getDescricao());
            statement.setInt(2, categoria.getId());
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public List<Categoria> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<Categoria> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM CATEGORIA";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                all.add(new Categoria(resultSet.getInt("ID_CATEGORIA"), resultSet.getString("DESCRICAO")));
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Categoria getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        mConnection = DBUtils.getConnection();
        Categoria categoria = new Categoria();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM CATEGORIA WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            resultSet = statement.executeQuery();

            if(resultSet.next())
                categoria = new Categoria(resultSet.getInt("ID_CATEGORIA"), resultSet.getString("DESCRICAO"));

            return categoria;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        try {
            String sql = "DELETE FROM CATEGORIA WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Categoria findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
