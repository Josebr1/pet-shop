package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IEspecieDAO;
import br.com.cru.petshop.models.Especie;
import br.com.cru.petshop.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class EspecieDAO implements IEspecieDAO{

    private Connection mConnection = null;
    private final static Logger LOGGER = Logger.getLogger(EnderecoDAO.class);
    
    @Override
    public Especie findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM ESPECIE WHERE ID_ESPECIE = ?";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            if(resultSet.next()){
                return new Especie(resultSet.getInt("ID_ESPECIE"), resultSet.getString("DESCRICAO"));
            }
            return new Especie();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Especie insert(Especie model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO ESPECIE (DESCRICAO) VALUES (?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getDescricao());
            
            int affectedRows = statement.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("Creating especie failed, no rows affected.");
            }
            
            ResultSet generetedKeys = statement.getGeneratedKeys();
            if(generetedKeys.next()) {
                model.setIdEspecie(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating especie failed, no ID obtained.");
            }
            return model;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void update(Especie model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE ESPECIE SET DESCRICAO = ? WHERE ID_ESPECIE = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getDescricao());
            statement.setInt(2, model.getIdEspecie());
            
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public List<Especie> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<Especie> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM ESPECIE";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                all.add(new Especie(resultSet.getInt("ID_ESPECIE"), resultSet.getString("DESCRICAO")));
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Especie getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM ESPECIE WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            resultSet = statement.executeQuery();

            if(resultSet.next())
                return new Especie(resultSet.getInt("ID_ESPECIE"), resultSet.getString("DESCRICAO"));

            return new Especie();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        try {
            String sql = "DELETE FROM ESPECIE WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
}
