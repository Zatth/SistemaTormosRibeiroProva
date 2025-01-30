/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.CompraIar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u06614150154
 */
public class ControllerCompraIar extends AbstractTableModel {
    
    private List lista;
    
    public void setLista (List lista) {
        this.lista = lista;
    }
    
    public CompraIar getBean(int rowIndex){
        return (CompraIar) lista.get(rowIndex);
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
        
        CompraIar compraIar  = (CompraIar) lista.get(rowIndex);
        
        if(columnIndex == 0) {
            return compraIar.getIdCompraIar();
        }
        if (columnIndex == 1){
            return compraIar.getFuncionarioIar();
        }
        if (columnIndex == 2){
            return compraIar.getDataIar();
        }
        if (columnIndex == 3){
            return compraIar.getValorIar();
        }
    return "";
    }
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Fornecedor";
        }
        if (columnIndex == 2) {
            return "Data";
        }
        if (columnIndex == 3) {
            return "Total";
        }
        return "";
    }
}

