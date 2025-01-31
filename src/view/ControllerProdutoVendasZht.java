/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.CompraIar;
import bean.ProdutoVendasZht;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u06614150154
 */
public class ControllerProdutoVendasZht extends AbstractTableModel {
    
    private List lista;
    
    public void setLista (List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public ProdutoVendasZht getBean(int rowIndex){
        return (ProdutoVendasZht) lista.get(rowIndex);
    }
    
    public void deleteBean(int index){
      lista.remove(index);
      this.fireTableDataChanged();
     }

    @Override
    public int getRowCount() {
        return lista != null ? lista.size() : 0;
    };

    @Override
    public int getColumnCount() {
        return 2;
    };

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        ProdutoVendasZht produtoVendasZht  = (ProdutoVendasZht) lista.get(rowIndex);
        
        if(columnIndex == 0) {
            return produtoVendasZht.getId();
        }
        if (columnIndex == 1){
            return produtoVendasZht.getQuantidadeZht();
        }
        
    return "";
    }
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Quantidade";
        }       
        return "";
    }
}


