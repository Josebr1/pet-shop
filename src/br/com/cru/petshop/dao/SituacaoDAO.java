package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.ISituacaoDAO;
import br.com.cru.petshop.models.Situacao;
import br.com.cru.petshop.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SituacaoDAO implements ISituacaoDAO{

    private Connection mConnection = null;

    @Override
    public Situacao insert(Situacao situacao) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO SITUACAO (DESCRICAO) VALUES (?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, situacao.getDescricao());
            
            int affectedRows = statement.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("Creating situação failed, no rows affected.");
            }
            
            ResultSet generetedKeys = statement.getGeneratedKeys();
            if(generetedKeys.next()) {
                situacao.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating situação failed, no ID obtained.");
            }
            return situacao;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void update(Situacao categoria) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE SITUACAO SET DESCRICAO = ? WHERE ID_SITUACAO = ?;";

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
    public List<Situacao> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<Situacao> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM SITUACAO";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                all.add(new Situacao(resultSet.getInt("ID_SITUACAO"), resultSet.getString("DESCRICAO")));
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Situacao getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        mConnection = DBUtils.getConnection();
        Situacao categoria = new Situacao();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM SITUACAO WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            resultSet = statement.executeQuery();

            if(resultSet.next())
                categoria = new Situacao(resultSet.getInt("ID_SITUACAO"), resultSet.getString("DESCRICAO"));

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
            String sql = "DELETE FROM SITUACAO WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Situacao findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        Situacao categoria = new Situacao();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM SITUACAO WHERE ID_SITUACAO = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if(resultSet.next())
                categoria = new Situacao(resultSet.getInt("ID_SITUACAO"), resultSet.getString("DESCRICAO"));

            return categoria;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
}
