package view;

import bean.FuncionarioIar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u08439411111
 */
public class ControllerFuncionarioIar extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public FuncionarioIar getBean(int rowIndex){
    return (FuncionarioIar) lista.get(rowIndex);
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
        FuncionarioIar funcionario = (FuncionarioIar) lista.get(rowIndex);
        
        if (columnIndex == 0) {
            return funcionario.getIdFuncionarioIar();
        }
        if (columnIndex == 1) {
            return funcionario.getNomeFuncionarioIar();
        }
        if (columnIndex == 2) {
            return funcionario.getFuncaoFuncionarioIar();
        }
       if (columnIndex == 3) {
            return funcionario.getRuaFuncionarioIar();
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
            return "Funcao";
        }
        if (columnIndex == 3) {
            return "Rua";
        }
        return "";
    }
}