package view;

import bean.PromocoesZht;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u08439411111
 */
public class ControllerPromocoesZht extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public PromocoesZht getBean(int rowIndex){
    return (PromocoesZht) lista.get(rowIndex);
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
        PromocoesZht promocoes = (PromocoesZht) lista.get(rowIndex);
        if (columnIndex == 0) {
            return promocoes.getIdpromocoesZht();
        }
        if (columnIndex == 1) {
            return promocoes.getDataInicioZht();
        }
        if (columnIndex == 2) {
            return promocoes.getTipoZht();
        }
        if (columnIndex == 3) {
           return promocoes.getDescontoZht();
       } 
        return "Sem dados"; // Retorno padrão caso o índice da coluna seja inválido
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Data";
        }
        if (columnIndex == 2) {
            return "Tipo";
        }
        if (columnIndex == 3) {
            return "Desconto";
        }
        return "";
    }
}