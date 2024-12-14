package view;

import bean.ClienteIar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u08439411111
 */
public class ControllerClienteIar extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public ClienteIar getBean(int rowIndex){
    return (ClienteIar) lista.get(rowIndex);
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
        ClienteIar usuarios = (ClienteIar) lista.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getIdClienteIar();
        }
        if (columnIndex == 1) {
            return usuarios.getNomeClienteIar();
        }
        if (columnIndex == 2) {
            return usuarios.getCpfClienteIar();
        }
//        if (columnIndex == 3) {
//            return usuarios.getNivelClienteIar();
//        } 
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
            return "CPF";
        }
        if (columnIndex == 3) {
            return "Nível";
        }
        return "";
    }
}