/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.VendasProdutoZht;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u06614150154
 */
public class ControllerVendasProdutosZht extends AbstractTableModel {
    
    private List lista;
    
    public void setLista (List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public VendasProdutoZht getBean(int rowIndex){
        return (VendasProdutoZht) lista.get(rowIndex);
    }
     public void addBean(VendasProdutoZht vendasProdutoZht) {
        lista.add(vendasProdutoZht);
        this.fireTableDataChanged();
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
        
        VendasProdutoZht vendasProdutoZht  = (VendasProdutoZht) lista.get(rowIndex);
        
        if(columnIndex == 0) {
            return vendasProdutoZht.getIdVendaProdutoZht();
        }
        if (columnIndex == 1){
            return vendasProdutoZht.getQuantidadeZht();
        }
        if (columnIndex == 2){
            return vendasProdutoZht.getValorUnitarioZht();
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
        if (columnIndex == 2) {
            return "Valor unit";
        }   
        return "";
    }
}


