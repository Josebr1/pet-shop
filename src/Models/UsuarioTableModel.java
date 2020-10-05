/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Classes.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trabalhor
 */
public class UsuarioTableModel extends AbstractTableModel {
    
    private String colunas[] = {"Nome", "Login", "Senha", "Acesso"};
    private List<Usuario> dados;
    
     @Override
    public int getRowCount() {
        if(dados == null){
            return 0;
        }
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int l, int c){
        Usuario u = dados.get(l);
        switch(c){
            case 0:
                return u.getNome();
            case 1:
                return u.getLogin();
            case 2:
                return u.getSenha();
            case 3:
                return u.getAcesso();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
        
    }
    
    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Usuario> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Usuario getRowValue(int l) {
        return dados.get(l);
    }
    
    
}
