package DAO;

import Classes.Conecta;
import Classes.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Classe de acesso a dados do fornecedor
 *
 * @author Juliano
 */
public class FornecedorDAO{

    
    public void inserir(Fornecedor fornecedor) throws Exception {
        Conecta c = new Conecta();
        String sql = "INSERT INTO TBFORNECEDOR (NOME, CNPJ, email, telefone1, telefone2, endereco, complemento, cep, bairro ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, fornecedor.getNome());
        ps.setString(2, fornecedor.getCnpj());
        ps.setString(3, fornecedor.getEmail());
        ps.setString(4, fornecedor.getTelefone1());
        ps.setString(5, fornecedor.getTelefone2());
        ps.setString(6, fornecedor.getEndereco());
        ps.setString(7, fornecedor.getComplemento());
        ps.setString(8, fornecedor.getCep());
        ps.setString(9, fornecedor.getBairro());
        ps.execute();
        c.confirmar();
    }

    
    public void alterar(Fornecedor fornecedor) throws Exception {
        Conecta c = new Conecta();
        String sql = "UPDATE TBFORNECEDOR SET NOME=?, CNPJ=?, email=?, telefone1=?, telefone2=?, endereco=?, complemento=?, cep=?, bairro=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, fornecedor.getNome());
        ps.setString(2, fornecedor.getCnpj());
        ps.setString(3, fornecedor.getEmail());
        ps.setString(4, fornecedor.getTelefone1());
        ps.setString(5, fornecedor.getTelefone2());
        ps.setString(6, fornecedor.getEndereco());
        ps.setString(7, fornecedor.getComplemento());
        ps.setString(8, fornecedor.getCep());
        ps.setString(9, fornecedor.getBairro());
        ps.setInt(10, fornecedor.getCodigo());
        ps.execute();
        c.confirmar();
    }

    
    public void excluir(Fornecedor fornecedor) throws Exception {
        Conecta c = new Conecta();
        String sql = "DELETE FROM TBFORNECEDOR WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, fornecedor.getCodigo());
        ps.execute();
        c.confirmar();
    }

   
    public ArrayList<Fornecedor> listarTodos() throws Exception {
        Conecta c = new Conecta();
        String sql = "SELECT * FROM TBFORNECEDOR ORDER BY NOME";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaFornecedors = new ArrayList();
        while (rs.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setCodigo(rs.getInt("CODIGO"));
            fornecedor.setNome(rs.getString("NOME"));
            fornecedor.setCnpj(rs.getString("CNPJ"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedor.setTelefone1(rs.getString("telefone1"));
            fornecedor.setTelefone2(rs.getString("telefone2"));
            fornecedor.setEndereco(rs.getString("endereco"));
            fornecedor.setComplemento(rs.getString("complemento"));
            fornecedor.setCep(rs.getString("cep"));
            fornecedor.setBairro(rs.getString("bairro"));
            listaFornecedors.add(fornecedor);
        }

        return listaFornecedors;
    }

    
    public Fornecedor recuperar(int codigo) throws Exception {
        Conecta c = new Conecta();
        String sql = "SELECT * FROM TBFORNECEDOR WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        Fornecedor fornecedor = new Fornecedor();
        if (rs.next()) {
            fornecedor.setCodigo(rs.getInt("CODIGO"));
            fornecedor.setNome(rs.getString("NOME"));
            fornecedor.setCnpj(rs.getString("CNPJ"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedor.setTelefone1(rs.getString("telefone1"));
            fornecedor.setTelefone2(rs.getString("telefone2"));
            fornecedor.setEndereco(rs.getString("endereco"));
            fornecedor.setComplemento(rs.getString("complemento"));
            fornecedor.setCep(rs.getString("cep"));
            fornecedor.setBairro(rs.getString("bairro"));
        }

        return fornecedor;
    }
}
