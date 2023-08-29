package ModelTable;

import Model.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableFRN extends AbstractTableModel{
    
    private List<Fornecedor> dados = new ArrayList<>();
    private String[] colunas = {"ID","Nome/RzSocial","CNPJ","Ramo de Atividade"};
    
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
                return dados.get(linha).getIdPessoa();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getCnpj();
            case 3:
                return dados.get(linha).getRamoAtividade();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setIdPessoa((int) valor);
                break;
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            case 2:
                dados.get(linha).setCnpj((String) valor);
                break;
            case 3:
                dados.get(linha).setRamoAtividade((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    public void limpaTabela() {
	int size = getRowCount();
	this.dados.clear();
        fireTableRowsDeleted(0,size);
    }
    public void addRow(Fornecedor frn){
        this.dados.add(frn);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);    
    }
    
}