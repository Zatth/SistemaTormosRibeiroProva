package view;

import bean.ProdutoZht;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u08439411111
 */
public class ControllerProdutoZht extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public ProdutoZht getBean(int rowIndex){
    return (ProdutoZht) lista.get(rowIndex);
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
        ProdutoZht produto = (ProdutoZht) lista.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getIdProdutoZht();
        }
        if (columnIndex == 1) {
            return produto.getNomeProdutoZht();
        }
        if (columnIndex == 2) {
            return produto.getPrecoProdutoZht();
        }
        if (columnIndex == 3) {
           return produto.getQtdEstoqueProdutoZht();
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
            return "Preco";
        }
        if (columnIndex == 3) {
            return "Qntd no Estoque";
        }
        return "";
    }
}