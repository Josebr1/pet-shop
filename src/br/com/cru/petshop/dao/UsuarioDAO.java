package br.com.cru.petshop.dao;

import br.com.cru.petshop.dao.interfaces.IUsuarioDAO;
import br.com.cru.petshop.models.Usuario;
import br.com.cru.petshop.models.enums.TipoUsuario;
import br.com.cru.petshop.utils.DBUtils;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UsuarioDAO implements IUsuarioDAO{

    private Connection mConnection = null;
    private final static Logger LOGGER = Logger.getLogger(UsuarioDAO.class);
    
    @Override
    public boolean isFirstUserCreate() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        ResultSet resultSet;
        
        try {
            mConnection = DBUtils.getConnection();
            String sql = "SELECT * FROM usuario WHERE usuario.fk_tipo_usuario = ?";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, TipoUsuario.ADMINISTRADOR.getValue());
            
            resultSet = statement.executeQuery();
            LOGGER.info(resultSet);
            return !resultSet.next();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
    @Override
    public Usuario getUserByEmail(String email) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        ResultSet rs;
        Usuario usuario;
        try {
            mConnection = DBUtils.getConnection();
            String sql = "select * from usuario where email = ?;";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, email);

            rs = statement.executeQuery();

            while (rs.next()) {
                   usuario = new Usuario();
                   usuario.setIdUsuario(UUID.fromString(rs.getString("id_usuario")));
                   usuario.setNome(rs.getString("nome"));
                   usuario.setEmail(rs.getString("email"));
                   usuario.setFone(rs.getString("fone"));
                   usuario.setTemAcessoAoSistema(rs.getBoolean("tem_acesso_programa"));
                   usuario.setLogin(rs.getString("login"));
                   usuario.setSenha(rs.getString("senha"));
                   usuario.setAtivo(rs.getBoolean("ativo"));
                   usuario.setTipoUsuario(TipoUsuario.get(rs.getInt("fk_tipo_usuario")));

                LOGGER.info(statement);
                LOGGER.info(rs);
              return usuario;
            }
            return null;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void insert(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        
        try {
            String sql = "INSERT INTO usuario(id_usuario, nome, email, fone, tem_acesso_programa, login, senha, ativo, fk_tipo_usuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setObject(1, UUID.randomUUID());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getEmail());
            statement.setString(4, usuario.getFone());
            statement.setBoolean(5, usuario.isTemAcessoAoSistema());
            statement.setString(6, usuario.getLogin());
            statement.setString(7, usuario.getSenha());
            statement.setBoolean(8, usuario.isAtivo());
            statement.setInt(9, usuario.getTipoUsuario().getValue());
            
            statement.execute();
            LOGGER.info(statement);
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
    @Override
    public void update(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        
        try {
            String sql = "UPDATE usuario SET nome = ?, fone = ?, tem_acesso_programa = ?, ativo = ?, fk_tipo_usuario = ? WHERE id_usuario = ?;";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getFone());
            statement.setBoolean(3, usuario.isTemAcessoAoSistema());
            statement.setBoolean(4, usuario.isAtivo());
            statement.setInt(5, usuario.getTipoUsuario().getValue());
            statement.setObject(6, usuario.getIdUsuario());
            
            statement.executeUpdate();
            LOGGER.info(statement);
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public List<Usuario> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        ResultSet resultSet;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            mConnection = DBUtils.getConnection();
            String sql = "select * from usuario as user inner join tipo_usuario tp on tp.id_tipo_usuario = user.fk_tipo_usuario;";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario(
                           resultSet.getString("nome"),
                           resultSet.getString("email"),
                           resultSet.getString("login"),
                           resultSet.getBoolean("ativo"),
                           TipoUsuario.get(resultSet.getInt("fk_tipo_usuario")));
                usuarios.add(usuario);
                LOGGER.info(usuario.toString());
            }
            return usuarios;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
}
