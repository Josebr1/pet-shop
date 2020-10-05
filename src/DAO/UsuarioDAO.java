/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Conecta;
import Classes.Usuario;
import Telas.menuGerente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author trabalhor
 */
public class UsuarioDAO {
    
    public void inserir(Usuario u) throws Exception{
        Conecta c = new Conecta();
        String sql = "INSERT INTO usuario(login, senha, acesso, nome) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        ps.setInt(3, u.getAcesso());
        ps.setString(4, u.getNome());
        ps.execute();
        c.confirmar();
    }
    
    public void alterar(Usuario u) throws Exception{
        Conecta c = new Conecta();
        
        String sql = "UPDATE usuario SET acesso=?, nome=? WHERE codigo=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, u.getAcesso());
        ps.setString(2, u.getNome());
        ps.setInt(3, u.getCodigo());
        ps.execute();
        c.confirmar();
    }
    
    public void excluir(Usuario u)throws Exception{
        Conecta c = new Conecta();
        
        String sql = "DELETE FROM usuario WHERE codigo=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, u.getCodigo());
        ps.execute();
        c.confirmar();
    }
    
    public boolean verLogin(String login, String senha) throws Exception{
        Conecta c = new Conecta();
        boolean check = false;
        String sql = "SELECT * FROM usuario WHERE login=? and senha=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            check=true;
        }
        return check;
    }
    
    public int pegaAcesso(String login, String senha)throws Exception{
        int ac = 0;
        Conecta c = new Conecta();
        String sql = "SELECT acesso FROM usuario WHERE login=? and senha=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            ac = rs.getInt("acesso");
        }
        return ac;
    }
    
    public int pegaCod(String login, String senha)throws Exception{
        int cod = -1;
        Conecta c = new Conecta();
        String sql = "SELECT codigo FROM usuario WHERE login=? and senha=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            cod = rs.getInt("codigo");
        }
        return cod;
    }
    
    public ArrayList<Usuario> listaTodos() throws Exception{
        Conecta c = new Conecta();
        String sql = "SELECT * FROM usuario";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList lista = new ArrayList();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setCodigo(rs.getInt("codigo"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setAcesso(rs.getInt("acesso"));
            u.setNome(rs.getString("nome"));
            lista.add(u);
        }
        
        return lista;
    }
    
    public Usuario pegaUsuario(int cod)throws Exception{
        Conecta c = new Conecta();
        String sql = "SELECT * FROM usuario WHERE codigo=? ";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, cod);
        ResultSet rs = ps.executeQuery();
        
        Usuario u = new Usuario();
        
        if(rs.next()){
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setNome(rs.getString("nome"));
            u.setCodigo(rs.getInt("codigo"));
        }
        
        return u;
    }
    
    public void alterar2(Usuario u) throws Exception{
        Conecta c = new Conecta();
        
        String sql = "UPDATE usuario SET senha=? WHERE codigo=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, u.getSenha());
        ps.setInt(2, u.getCodigo());
        ps.execute();
        c.confirmar();
    }
    
}
