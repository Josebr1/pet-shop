package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IContaPagarDAO;
import br.com.cru.petshop.models.ContaPagar;
import br.com.cru.petshop.models.Fornecedor;
import br.com.cru.petshop.utils.DBUtils;
import br.com.cru.petshop.utils.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaPagarDAO implements IContaPagarDAO {

    private Connection mConnection = null;

    @Override
    public ContaPagar findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        ContaPagar all = new ContaPagar();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM conta_pagar "
                    + "INNER JOIN fornecedor ON conta_pagar.fk_fornecedor_id_fornecedor = fornecedor.id_fornecedor "
                    + "WHERE id_conta_pagar = ?";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                return new ContaPagar(
                        resultSet.getInt("id_conta_pagar"),
                        resultSet.getString("descricao"),
                        resultSet.getDate("vencimento"),
                        resultSet.getDouble("valor"),
                        resultSet.getBoolean("conta_paga"),
                        resultSet.getDate("data_pagamento"),
                        resultSet.getDouble("valor_pago"),
                        new Fornecedor(resultSet.getInt("id_fornecedor"), resultSet.getString("documento"), resultSet.getString("nome"), resultSet.getString("fone"), resultSet.getString("IERG")));
            }
            return all;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public ContaPagar insert(ContaPagar model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO conta_pagar "
                    + "(descricao, vencimento, valor, conta_paga, data_pagamento, valor_pago, fk_fornecedor_id_fornecedor) VALUES (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getDescricao());
            statement.setString(2, DataUtils.convertSql(model.getVencimento()));
            statement.setDouble(3, model.getValor());
            statement.setBoolean(4, model.isContaPaga());
            statement.setString(5, DataUtils.convertSql(model.getDataPagamento()));
            statement.setDouble(6, model.getValorPago());
            statement.setInt(7, model.getFornecedor().getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating conta_pagar failed, no rows affected.");
            }

            ResultSet generetedKeys = statement.getGeneratedKeys();
            if (generetedKeys.next()) {
                model.setId(generetedKeys.getInt(1));
            } else {
                throw new SQLException("Creating conta_pagar failed, no ID obtained.");
            }
            return model;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public void update(ContaPagar model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "UPDATE conta_pagar SET "
                    + "descricao=?, vencimento=?, valor=?, conta_paga=?, data_pagamento=?, valor_pago=?, fk_fornecedor_id_fornecedor=?, where id_conta_pagar=?;";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getDescricao());
            statement.setString(2, DataUtils.convertSql(model.getVencimento()));
            statement.setDouble(3, model.getValor());
            statement.setBoolean(4, model.isContaPaga());
            statement.setString(5, DataUtils.convertSql(model.getDataPagamento()));
            statement.setDouble(6, model.getValorPago());
            statement.setInt(7, model.getFornecedor().getId());
            statement.setInt(8, model.getId());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating conta_pagar failed, no rows affected.");
            }
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

    @Override
    public List<ContaPagar> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<ContaPagar> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM conta_pagar "
                    + "INNER JOIN fornecedor ON conta_pagar.fk_fornecedor_id_fornecedor = fornecedor.id_fornecedor "
                    + "ORDER BY conta_pagar.DATA_CREDITO DESC";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                all.add(new ContaPagar(
                        resultSet.getInt("id_conta_pagar"),
                        resultSet.getString("descricao"),
                        resultSet.getDate("vencimento"),
                        resultSet.getDouble("valor"),
                        resultSet.getBoolean("conta_paga"),
                        resultSet.getDate("data_pagamento"),
                        resultSet.getDouble("valor_pago"),
                        new Fornecedor(resultSet.getInt("id_fornecedor"), resultSet.getString("documento"), resultSet.getString("nome"), resultSet.getString("fone"), resultSet.getString("IERG")))
                );
            }
            return all;
        } finally {
            if (mConnection != null) {
                mConnection.close();
            }
        }
    }

}
