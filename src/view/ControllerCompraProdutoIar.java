/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.CompraIar;
import bean.CompraProdutoIar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u06614150154
 */
public class ControllerCompraProdutoIar extends AbstractTableModel {
    
    private List lista;
    
    public void setLista (List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public CompraProdutoIar getBean(int rowIndex){
        return (CompraProdutoIar) lista.get(rowIndex);
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
        return 3;
    };

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        CompraProdutoIar compraProdutoIar  = (CompraProdutoIar) lista.get(rowIndex);
        
        if(columnIndex == 0) {
            return compraProdutoIar.getCompraIar();
        }
        if (columnIndex == 1){
            return compraProdutoIar.getProdutoZht();
        }
        if (columnIndex == 2){
            return compraProdutoIar.getQuantidadeIar();
        }
        
    return "";
    }
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Produto";
        }
        if (columnIndex == 2) {
            return "Quant.";
        }
       
        return "";
    }
}


