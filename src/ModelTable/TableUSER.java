package ModelTable;

import Model.Produto;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableUSER extends AbstractTableModel {

    private List<Usuario> dados = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Login", "Cargo"};

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
                return dados.get(linha).getFkPessoa();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getUsuario();
            case 3:
                return dados.get(linha).getCargo();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setFkPessoa((int) valor);
                break;
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            case 2:
                dados.get(linha).setUsuario((String) valor);
                break;
            case 3:
                dados.get(linha).setCargo((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void limpaTabela() {
        int size = getRowCount();
        this.dados.clear();
        fireTableRowsDeleted(0, size);
    }

    public void addRow(Usuario usr) {
        this.dados.add(usr);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
