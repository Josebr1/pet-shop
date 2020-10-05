package DAO;

import Classes.Cliente;
import Classes.Conecta;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Classe de acesso a dados do cliente
 *
 * @author Juliano
 */
public class ClienteDAO{

    
    public void inserir(Cliente cliente) throws Exception {
        Conecta c = new Conecta();
        String sql = "INSERT INTO TBCLIENTE (NOME, CPF, DATANASCIMENTO) VALUES (?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3,cliente.getDataNascimento());
        ps.execute();
        c.confirmar();
    }

    
    public void alterar(Cliente cliente) throws Exception {
        Conecta c = new Conecta();
        String sql = "UPDATE TBCLIENTE SET NOME=?, CPF=?, DATANASCIMENTO=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3,cliente.getDataNascimento());
        ps.setInt(4, cliente.getCodigo());
        ps.execute();
        c.confirmar();
    }

    
    public void excluir(Cliente cliente) throws Exception {
        Conecta c = new Conecta();
        String sql = "DELETE FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getCodigo());
        ps.execute();
        c.confirmar();
    }

    
    public ArrayList<Cliente> listarTodos() throws Exception {
        Conecta c = new Conecta();
        String sql = "SELECT * FROM TBCLIENTE ORDER BY NOME";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaClientes = new ArrayList();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setDataNascimento(rs.getString("DATANASCIMENTO"));
            listaClientes.add(cliente);
        }

        return listaClientes;
    }

    
    public Cliente recuperar(int codigo) throws Exception {
        Conecta c = new Conecta();
        String sql = "SELECT * FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        Cliente cliente = new Cliente();
        if (rs.next()) {
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setDataNascimento(rs.getString("DATANASCIMENTO"));
        }

        return cliente;
    }
}
