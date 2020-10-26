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
    public void insert(ContaReceber model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO conta_receber (tipo_conta, valor, data_credito, observacao, fk_foma_pagamento) VALUES (?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getTipoConta());
            statement.setDouble(2, model.getValor());
            statement.setString(3, DataUtils.convertSql(model.getDataCredito()));
            statement.setString(4, model.getObservacao());
            statement.setInt(5, model.getFormaPagamento().getIdFormaPagamento());

            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void update(ContaReceber model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

    }

    @Override
    public List<ContaReceber> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<ContaReceber> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM conta_receber INNER JOIN foma_pagamento ON conta_receber.FK_FOMA_PAGAMENTO = foma_pagamento.ID_FOMA_PAGAMENTO";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                all.add(new ContaReceber(
                        resultSet.getInt("ID_CONTA_RECEBER"),
                        resultSet.getString("TIPO_CONTA"),
                        resultSet.getDouble("VALOR"),
                        resultSet.getDate("DATA_CREDITO"),
                        resultSet.getString("OBSERVACAO"),
                        new FormasPagamento(resultSet.getInt("ID_FOMA_PAGAMENTO"), resultSet.getString("DESCRICAO")))
                );
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public ContaReceber findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
