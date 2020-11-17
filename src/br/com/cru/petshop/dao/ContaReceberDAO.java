package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IContaReceberDAO;
import br.com.cru.petshop.models.ContaReceber;
import br.com.cru.petshop.models.FormasPagamento;
import br.com.cru.petshop.utils.DBUtils;
import br.com.cru.petshop.utils.DataUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaReceberDAO implements IContaReceberDAO {

    private Connection mConnection = null;

    @Override
    public ContaReceber insert(ContaReceber model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO conta_receber (tipo_conta, valor, data_credito, credito_realizado, observacao, fk_foma_pagamento) VALUES (?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getTipoConta());
            statement.setDouble(2, model.getValor());
            statement.setString(3, DataUtils.convertSql(model.getDataCredito()));
            statement.setBoolean(4, model.isCreditoRealizado());
            statement.setString(5, model.getObservacao());
            statement.setInt(6, model.getFormaPagamento().getIdFormaPagamento());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            ResultSet generetedKeys = statement.getGeneratedKeys();
            if (generetedKeys.next()) {
                model.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
            return model;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public void update(ContaReceber model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE conta_receber SET tipo_conta=?, valor=?, data_credito=?, credito_realizado=?, observacao=?, fk_foma_pagamento=? where id_conta_receber=?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getTipoConta());
            statement.setDouble(2, model.getValor());
            statement.setString(3, DataUtils.convertSql(model.getDataCredito()));
            statement.setBoolean(4, model.isCreditoRealizado());
            statement.setString(5, model.getObservacao());
            statement.setInt(6, model.getFormaPagamento().getIdFormaPagamento());
            statement.setInt(7, model.getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Update ContaReceber failed, no rows affected.");
            }
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public List<ContaReceber> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<ContaReceber> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM conta_receber "
                    + "INNER JOIN foma_pagamento ON conta_receber.FK_FOMA_PAGAMENTO = foma_pagamento.ID_FOMA_PAGAMENTO "
                    + "ORDER BY conta_receber.DATA_CREDITO DESC";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                all.add(new ContaReceber(
                        resultSet.getInt("ID_CONTA_RECEBER"),
                        resultSet.getString("TIPO_CONTA"),
                        resultSet.getDouble("VALOR"),
                        resultSet.getDate("DATA_CREDITO"),
                        resultSet.getBoolean("CREDITO_REALIZADO"),
                        resultSet.getString("OBSERVACAO"),
                        new FormasPagamento(resultSet.getInt("ID_FOMA_PAGAMENTO"), resultSet.getString("DESCRICAO")))
                );
            }
            return all;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public ContaReceber findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        ContaReceber contaReceber = new ContaReceber();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM conta_receber "
                    + "INNER JOIN foma_pagamento ON conta_receber.FK_FOMA_PAGAMENTO = foma_pagamento.ID_FOMA_PAGAMENTO "
                    + "WHERE conta_receber.ID_CONTA_RECEBER = ?";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                contaReceber = new ContaReceber(
                        resultSet.getInt("ID_CONTA_RECEBER"),
                        resultSet.getString("TIPO_CONTA"),
                        resultSet.getDouble("VALOR"),
                        resultSet.getDate("DATA_CREDITO"),
                        resultSet.getBoolean("CREDITO_REALIZADO"),
                        resultSet.getString("OBSERVACAO"),
                        new FormasPagamento(resultSet.getInt("ID_FOMA_PAGAMENTO"), resultSet.getString("DESCRICAO")));
            }
            return contaReceber;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }
}
