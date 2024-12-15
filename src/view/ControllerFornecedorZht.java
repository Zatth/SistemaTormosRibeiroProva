package view;

import bean.FornecedorZht;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u08439411111
 */
public class ControllerFornecedorZht extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public FornecedorZht getBean(int rowIndex){
    return (FornecedorZht) lista.get(rowIndex);
            }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4; // Alterei para 4 porque o método getValueAt tenta acessar 4 colunas
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FornecedorZht fornecedor = (FornecedorZht) lista.get(rowIndex);
        
        if (columnIndex == 0) {
            return fornecedor.getIdfornecedorZht();
        }
        if (columnIndex == 1) {
            return fornecedor.getNomeZht();
        }
        if (columnIndex == 2) {
            return fornecedor.getCnpjZht();
        }
       if (columnIndex == 3) {
            return fornecedor.getEmailZht();
        } 
        return "Sem dados"; // Retorno padrão caso o índice da coluna seja inválido
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "CNPJ";
        }
        if (columnIndex == 3) {
            return "Email";
        }
        return "";
    }
}