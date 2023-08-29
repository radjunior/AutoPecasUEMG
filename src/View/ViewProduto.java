package View;

import DAO.CadastroDAO;
import DAO.ProdutoDAO;
import Model.Produto;
import ModelTable.TablePRD;
import javax.swing.JOptionPane;

public class ViewProduto extends javax.swing.JFrame {

    TablePRD tabelaPrd;
    private ViewEntrada vEtr;
    public ViewProduto() {
        initComponents();
        tabelaPrd = new TablePRD();
        jTableProduto.setModel(tabelaPrd);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Produto");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Produto");

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        tabelaPrd.limpaTabela();
        ProdutoDAO prdDAO = new ProdutoDAO();
        for (Produto prd : prdDAO.pesquisarProduto(txtBuscar.getText())) {
            tabelaPrd.addRow(prd);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        if (jTableProduto.getSelectedRow() != -1) {
            Produto prd = new Produto();
            prd.setDescricao((String) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1));
            prd.setIdProduto((int) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0));
            int op = JOptionPane.showConfirmDialog(null, "Selecionar Produto "+"'"+prd.getDescricao()+"'"+"?");
            
            if(op == 0){
                setarProduto(prd);
                this.dispose();
            }else if(op == 1){
                JOptionPane.showMessageDialog(null, op);
            }else{
                JOptionPane.showMessageDialog(null, op);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
    }//GEN-LAST:event_jTableProdutoMouseClicked

    public void mostrarTela(ViewEntrada vEntrada){
        this.vEtr = vEntrada;
        this.setVisible(true);
    }
    private void setarProduto(Produto vProduto){
        vEtr.setarProduto(vProduto);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
