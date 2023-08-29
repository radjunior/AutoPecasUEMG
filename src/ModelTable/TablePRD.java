package ModelTable;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablePRD extends AbstractTableModel {

    private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"ID","Descrição", "Preço de Venda", "Quantidade", "Unidade",};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getIdProduto();
            case 1:
                return dados.get(linha).getDescricao();
            case 2:
                return dados.get(linha).getPrecoVenda();
            case 3:
                return dados.get(linha).getQtde();
            case 4:
                return dados.get(linha).getUnidade();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setIdProduto((int) valor);
                break;
            case 1:
                dados.get(linha).setDescricao((String) valor);
                break;
            case 2:
                dados.get(linha).setPrecoVenda((Float) valor);
                break;
            case 3:
                dados.get(linha).setQtde((Float) valor);
                break;
            case 4:
                dados.get(linha).setUnidade((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void limpaTabela() {
        int size = getRowCount();
        this.dados.clear();
        fireTableRowsDeleted(0, size);
    }

    public void addRow(Produto prod) {
        this.dados.add(prod);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
