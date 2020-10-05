package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IEnderecoDAO;
import br.com.cru.petshop.models.Endereco;
import br.com.cru.petshop.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class EnderecoDAO implements IEnderecoDAO {

    private Connection mConnection = null;
    private final static Logger LOGGER = Logger.getLogger(EnderecoDAO.class);
    
    @Override
    public Endereco insert(Endereco e) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO endereco (cep, endereco, bairro, cidade, referencia, numero, complemento, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, e.getCep());
            statement.setString(2, e.getLogradouro());
            statement.setString(3, e.getBairro());
            statement.setString(4, e.getCidade());
            statement.setString(5, e.getReferencia());
            statement.setString(6, e.getNumero());
            statement.setString(7, e.getComplemento());
            statement.setString(8, e.getUf());
            
            int affectedRows = statement.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            
            ResultSet generetedKeys = statement.getGeneratedKeys();
            if(generetedKeys.next()) {
                e.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
            LOGGER.info(statement);
            return e;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Endereco update(Endereco e) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE endereco SET cep=?, endereco=?, bairro=?, cidade=?, referencia=?, numero=?, complemento=?, uf=? WHERE id_endereco = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, e.getCep());
            statement.setString(2, e.getLogradouro());
            statement.setString(3, e.getBairro());
            statement.setString(4, e.getCidade());
            statement.setString(5, e.getReferencia());
            statement.setString(6, e.getNumero());
            statement.setString(7, e.getComplemento());
            statement.setString(8, e.getUf());
            statement.setInt(9, e.getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            LOGGER.info(statement);
            return e;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Endereco getById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        ResultSet rs;
        Endereco e;
        try {
            mConnection = DBUtils.getConnection();
            String sql = "SELECT * FROM endereco where id_endereco = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            rs = statement.executeQuery();

            e = new Endereco();
            while (rs.next()) {
                e.setId(rs.getInt("id_endereco"));
                e.setCep(rs.getString("cep"));
                e.setLogradouro(rs.getString("endereco"));
                e.setBairro(rs.getString("bairro"));
                e.setCidade(rs.getString("cidade"));
                e.setReferencia(rs.getString("referencia"));
                e.setNumero(rs.getString("numero"));
                e.setComplemento(rs.getString("complemento"));
                e.setUf(rs.getString("uf"));

                LOGGER.info(statement);
                LOGGER.info(rs);
                break;
            }
            return e;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
}
