package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IClienteDAO;
import br.com.cru.petshop.dao.interfaces.IEnderecoDAO;
import br.com.cru.petshop.models.Cliente;
import br.com.cru.petshop.models.Endereco;
import br.com.cru.petshop.models.enums.Sexo;
import br.com.cru.petshop.utils.DBUtils;
import br.com.cru.petshop.utils.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{

    private Connection mConnection = null;
    
    private IEnderecoDAO mEnderecoDAO = null;
    
    @Override
    public void insert(Cliente model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        
        mConnection = DBUtils.getConnection();
        
        mEnderecoDAO = new EnderecoDAO();
        
        try {
            
            model.setEndereco(mEnderecoDAO.insert(model.getEndereco()));
            
            String sql = "INSERT INTO cliente (NOME, DOCUMENTO, EMAIL, DATA_NASCIEMENTO, SEXO, FONE, FK_ENDERECO) VALUES (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            
            statement.setString(1, model.getNome());
            statement.setString(2, model.getDocumento());
            statement.setString(3, model.getEmail());
            statement.setDate(4, DataUtils.convertDate(model.getDataNascimento()));
            statement.setString(5, Sexo.get(model.getSexo()));
            statement.setString(6, model.getFone());
            statement.setInt(7, model.getEndereco().getId());

            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
        
    }

    @Override
    public void update(Cliente model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<Cliente> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "select * from cliente inner join endereco on cliente.fk_endereco = endereco.id_endereco";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                all.add(new Cliente(
                        resultSet.getInt("ID_CLIENTE"),
                        resultSet.getString("NOME"),
                        resultSet.getString("DOCUMENTO"),
                        resultSet.getString("EMAIL"),
                        resultSet.getDate("DATA_NASCIEMENTO"),
                        Sexo.get(resultSet.getString("SEXO")),
                        resultSet.getString("FONE"),
                        new Endereco(
                                resultSet.getInt("ID_ENDERECO"),
                                resultSet.getString("CEP"),
                                resultSet.getString("ENDERECO"),
                                resultSet.getString("BAIRRO"),
                                resultSet.getString("CIDADE"),
                                resultSet.getString("REFERENCIA"),
                                resultSet.getString("NUMERO"),
                                resultSet.getString("COMPLEMENTO"),
                                resultSet.getString("UF")
                        )
                ));
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
}
