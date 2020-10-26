package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IFormasPagamentoDAO;
import br.com.cru.petshop.models.Categoria;
import br.com.cru.petshop.models.FormasPagamento;
import br.com.cru.petshop.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FormasPagamentoDAO implements IFormasPagamentoDAO {

    private Connection mConnection = null;

    @Override
    public void insert(FormasPagamento formasPagamento) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO foma_pagamento (DESCRICAO) VALUES (?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, formasPagamento.getDescricao());
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void update(FormasPagamento formasPagamento) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE foma_pagamento SET DESCRICAO = ? WHERE id_foma_pagamento = ?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, formasPagamento.getDescricao());
            statement.setInt(2, formasPagamento.getIdFormaPagamento());
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public List<FormasPagamento> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<FormasPagamento> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM foma_pagamento";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                all.add(new FormasPagamento(resultSet.getInt("id_foma_pagamento"), resultSet.getString("descricao")));
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        try {
            String sql = "DELETE FROM foma_pagamento WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public FormasPagamento getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        FormasPagamento formasPagamento = new FormasPagamento();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM foma_pagamento WHERE UPPER(DESCRICAO) = UPPER(?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, s);
            resultSet = statement.executeQuery();

            if(resultSet.next())
                formasPagamento = new FormasPagamento(resultSet.getInt("id_foma_pagamento"), resultSet.getString("descricao"));

            return formasPagamento;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public FormasPagamento findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
