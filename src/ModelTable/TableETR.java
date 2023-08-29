package ModelTable;

import Model.Entrada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableETR extends AbstractTableModel {

    private List<Entrada> dados = new ArrayList<>();
    private String[] colunas = {"ID Nota", "Fornecedor", "Produto", "Preço Custo"};

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
                return dados.get(linha).getIdNota();
            case 1:
                return dados.get(linha).getNomeFornecedor();
            case 2:
                return dados.get(linha).getNomeProduto();
            case 3:
                return dados.get(linha).getPrecoCusto();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setIdNota((int) valor);
                break;
            case 1:
                dados.get(linha).setNomeFornecedor((String) valor);
                break;
            case 2:
                dados.get(linha).setNomeProduto((String) valor);
                break;
            case 3:
                dados.get(linha).setPrecoCusto((float) valor);
                break;

        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void limpaTabela() {
        int size = getRowCount();
        this.dados.clear();
        fireTableRowsDeleted(0, size);
    }

    public void addRow(Entrada etr) {
        this.dados.add(etr);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
