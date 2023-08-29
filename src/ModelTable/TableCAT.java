package ModelTable;

import Model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableCAT extends AbstractTableModel{
    
    private List<Categoria> dados = new ArrayList<>();
    private String[] colunas = {"ID","Descrição"};
    
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
        switch(coluna){
            case 0:
                return dados.get(linha).getFkProduto();
            case 1:
                return dados.get(linha).getNome();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setFkProduto((int) valor);
                break;
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    public void limpaTabela() {
	int size = getRowCount();
	this.dados.clear();
        fireTableRowsDeleted(0,size);
    }
    public void addRow(Categoria cat){
        this.dados.add(cat);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);    
    }
    
}