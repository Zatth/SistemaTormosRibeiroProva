package view;

import bean.UsuariosIar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u08439411111
 */
public class ControllerUsuariosIar extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public UsuariosIar getBean(int rowIndex){
    return (UsuariosIar) lista.get(rowIndex);
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
        UsuariosIar usuarios = (UsuariosIar) lista.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getIdUsuariosIar();
        }
        if (columnIndex == 1) {
            return usuarios.getNomeUsuarioIar();
        }
        if (columnIndex == 2) {
            return usuarios.getCpfIar();
        }
        if (columnIndex == 3) {
           return usuarios.getApelidoIar();
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
            return "CPF";
        }
        if (columnIndex == 3) {
            return "Apelido";
        }
        return "";
    }
}