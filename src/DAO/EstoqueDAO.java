/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Conecta;
import Classes.Estoque;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author trabalhor
 */
public class EstoqueDAO {
    
    public ArrayList<Estoque> mostraEstoque() throws Exception{
        Conecta c = new Conecta();
        String sql = "SELECT * FROM TBPRODUTO";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList lista = new ArrayList();
        while(rs.next()){
            Estoque e = new Estoque();
            e.setCodProduto(rs.getInt("CODIGO"));
            e.setNomeProduto(rs.getString("NOME"));
            e.setQuantidade(rs.getInt("QUANTIDADEESTOQUE"));
            lista.add(e);
        }
        return lista;
    }
    
}
