package ModelTable;

import Model.PessoaFisica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablePF extends AbstractTableModel {

    private List<PessoaFisica> dados = new ArrayList<>();
    private String[] colunas = {"Nome/RzSocial","CPF","Limite de Crédito"};

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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getCpf();
            case 2:
                return dados.get(linha).getCredito();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setNome((String) valor);
                break;
            case 1:
                dados.get(linha).setCpf((String) valor);
                break;
            case 2:
                dados.get(linha).setCredito((Float) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void limpaTabela() {
        int size = getRowCount();
        this.dados.clear();
        fireTableRowsDeleted(0, size);
    }

    public void addRow(PessoaFisica pf) {
        this.dados.add(pf);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
