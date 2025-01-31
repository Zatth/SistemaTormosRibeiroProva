/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.VendasZht;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u06614150154
 */
public class ControllerVendasZht extends AbstractTableModel {
    
    private List lista;
    
    public void setLista (List lista) {
        this.lista = lista;
    }
    
    public VendasZht getBean(int rowIndex){
        return (VendasZht) lista.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lista != null ? lista.size() : 0;
    };

    @Override
    public int getColumnCount() {
        return 4;
    };

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        VendasZht compraIar  = (VendasZht) lista.get(rowIndex);
        
        if(columnIndex == 0) {
            return compraIar.getIdVendasZht();
        }
        if (columnIndex == 1){
            return compraIar.getClienteIar();
        }
        if (columnIndex == 2){
            return compraIar.getValorVendaZht();
        }
        if (columnIndex == 3){
            return compraIar.getQuantidadeVendaZht();
        }
    return "";
    }
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Cliente";
        }
        if (columnIndex == 2) {
            return "Valor Venda";
        }
        if (columnIndex == 3) {
            return "Qnt Venda";
        }
        return "";
    }
}


