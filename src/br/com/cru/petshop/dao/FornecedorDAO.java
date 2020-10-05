package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IFornecedorDAO;
import br.com.cru.petshop.models.Endereco;
import br.com.cru.petshop.models.Fornecedor;
import br.com.cru.petshop.models.enums.TipoUsuario;
import br.com.cru.petshop.utils.DBUtils;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO implements IFornecedorDAO{

    private Connection mConnection = null;
    private final static Logger LOGGER = Logger.getLogger(FornecedorDAO.class);

    @Override
    public Fornecedor insert(Fornecedor f) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO fornecedor (nome, fone, email, documento, IERG, fk_endereco) VALUES (?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setObject(1, f.getNome());
            statement.setString(2, f.getCelular());
            statement.setString(3, "");
            statement.setString(4, f.getDocumento());
            statement.setString(5, f.getRg());
            statement.setInt(6, f.getEndereco().getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            ResultSet generetedKeys = statement.getGeneratedKeys();
            if(generetedKeys.next()) {
                f.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
            LOGGER.info(statement);

            return f;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Fornecedor update(Fornecedor f) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE fornecedor SET nome=?, fone=?, email=? WHERE id_fornecedor = ?";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setObject(1, f.getNome());
            statement.setString(2, f.getCelular());
            statement.setString(3, "");
            statement.setInt(4, f.getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            LOGGER.info(statement);
            return f;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public Fornecedor getById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        ResultSet rs;
        Fornecedor f;
        try {
            mConnection = DBUtils.getConnection();
            String sql = "SELECT * FROM fornecedor where id_fornecedor = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            rs = statement.executeQuery();

            f = new Fornecedor();
            while (rs.next()) {
                f.setId(rs.getInt("id_fornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCelular(rs.getString("fone"));
                f.setDocumento(rs.getString("documento"));
                f.setRg(rs.getString("IERG"));
                Endereco e = new Endereco();
                e.setId(rs.getInt("fk_endereco"));
                f.setEndereco(e);

                LOGGER.info(statement);
                LOGGER.info(rs);
                break;
            }
            return f;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public List<Fornecedor> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        ResultSet rs;
        List<Fornecedor> all = new ArrayList<>();

        try {
            mConnection = DBUtils.getConnection();
            String sql = "SELECT * FROM fornecedor;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            rs = statement.executeQuery();


            while (rs.next()) {
                Fornecedor f = new Fornecedor();
                f.setId(rs.getInt("id_fornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCelular(rs.getString("fone"));
                f.setDocumento(rs.getString("documento"));
                f.setRg(rs.getString("IERG"));
                Endereco e = new Endereco();
                e.setId(rs.getInt("fk_endereco"));
                f.setEndereco(e);

                LOGGER.info(statement);
                LOGGER.info(rs);
                all.add(f);
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
}
