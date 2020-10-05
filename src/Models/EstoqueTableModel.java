/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Classes.Estoque;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trabalhor
 */
public class EstoqueTableModel extends AbstractTableModel {
    
    private String colunas[] = {"Descrição", "Quantidade"};
    private List<Estoque> dados;
    
    
    public int getRowCount(){
        if(dados == null){
        return 0;
        }
        return dados.size();
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    
    public Object getValueAt(int l , int c){
        Estoque e = dados.get(l);
        switch(c){
            case 0 :
                return e.getNomeProduto();
            case 1:
                return e.getQuantidade();
                
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }
    
    public String getColumnName(int c) {
        return colunas[c];
    }

    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Estoque> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }
    
    public Estoque getRowValue(int l) {
        return dados.get(l);
    }

    
}
