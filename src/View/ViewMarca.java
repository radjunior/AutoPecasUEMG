package View;

import DAO.ProdutoDAO;
import Model.Marca;
import ModelTable.TableMRC;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewMarca extends javax.swing.JFrame {
    
    ProdutoDAO prdDAO;
    TableMRC tabelaMRC;
    public ViewMarca() {
        initComponents();
        prdDAO = new ProdutoDAO();
        tabelaMRC = new TableMRC();
        jTableMarca.setModel(tabelaMRC);
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditarMarca = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMarca = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarMarca = new javax.swing.JTextField();
        btnExcluirMarca = new javax.swing.JButton();
        btnBuscarMarca = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnNovaMarca = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtNovaMarca = new javax.swing.JTextField();
        txtIdMarca = new javax.swing.JTextField();
        btnSalvarMarca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEditarMarca.setText("Editar");
        btnEditarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMarcaActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Marca"));

        jTableMarca.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarcaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMarca);

        jLabel23.setText("Buscar");

        btnExcluirMarca.setText("Excluir");
        btnExcluirMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMarcaActionPerformed(evt);
            }
        });

        btnBuscarMarca.setText("Buscar");
        btnBuscarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtBuscarMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirMarca)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirMarca)
                    .addComponent(btnBuscarMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );

        jLabel22.setText("Marca");

        btnNovaMarca.setText("Novo");
        btnNovaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaMarcaActionPerformed(evt);
            }
        });

        jLabel27.setText("ID");

        txtIdMarca.setEnabled(false);

        btnSalvarMarca.setText("Salvar");
        btnSalvarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNovaMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarMarca))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovaMarca)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovaMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarMarca)
                    .addComponent(btnEditarMarca)
                    .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMarcaActionPerformed
        tabelaMRC.limpaTabela();
        pesquisarTabelaMarca(txtBuscarMarca.getText());
    }//GEN-LAST:event_btnBuscarMarcaActionPerformed

    private void btnExcluirMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMarcaActionPerformed
        excluirMarca();
    }//GEN-LAST:event_btnExcluirMarcaActionPerformed

    private void jTableMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarcaMouseClicked
        if (jTableMarca.getSelectedRow() != -1) {
            Marca mrc = new Marca();
            mrc.setFkProduto((int) jTableMarca.getValueAt(jTableMarca.getSelectedRow(), 0));
            mrc.setNome((String) jTableMarca.getValueAt(jTableMarca.getSelectedRow(), 1));
            txtNovaMarca.setText(mrc.getNome());
            txtIdMarca.setText(Integer.toString(mrc.getFkProduto()));
        }
        btnSalvarMarca.setEnabled(false);
        btnEditarMarca.setEnabled(true);
        btnExcluirMarca.setEnabled(true);
        txtNovaMarca.setEnabled(true);
    }//GEN-LAST:event_jTableMarcaMouseClicked

    private void btnEditarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMarcaActionPerformed
        if (txtNovaMarca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            Marca mrc = new Marca();
            mrc.setFkProduto(Integer.parseInt(txtIdMarca.getText()));
            mrc.setNome(txtNovaMarca.getText());
            try {
                prdDAO.editarMarca(mrc);
                JOptionPane.showMessageDialog(null, "Marca Editada com sucesso");
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditarMarcaActionPerformed

    private void btnSalvarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMarcaActionPerformed
        if (txtNovaMarca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            Marca mrc = new Marca();
            mrc.setNome(txtNovaMarca.getText());
            try {
                prdDAO.salvarMarca(mrc);
                JOptionPane.showMessageDialog(null, "Marca Cadastrada com sucesso");
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarMarcaActionPerformed

    private void btnNovaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaMarcaActionPerformed
        txtNovaMarca.setEnabled(true);
        btnSalvarMarca.setEnabled(true);
        btnNovaMarca.setEnabled(false);
    }//GEN-LAST:event_btnNovaMarcaActionPerformed
    public void iniciarMarca() {
        txtNovaMarca.setEnabled(false);
        txtNovaMarca.setText("");
        txtIdMarca.setText("");
        btnSalvarMarca.setEnabled(false);
        btnEditarMarca.setEnabled(false);
        btnExcluirMarca.setEnabled(false);
    }

    private void excluirMarca() {
        Marca mrc = new Marca();
        if (jTableMarca.getSelectedRow() != -1) {
            mrc.setFkProduto((int) jTableMarca.getValueAt(jTableMarca.getSelectedRow(), 0));
            try {
                prdDAO.excluirMarca(mrc);
                iniciarMarca();
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaMRC.removeRow(jTableMarca.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void pesquisarTabelaMarca(String desc) {
        for (Marca mrc : prdDAO.pesquisarMarca(desc)) {
            tabelaMRC.addRow(mrc);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMarca;
    private javax.swing.JButton btnEditarMarca;
    private javax.swing.JButton btnExcluirMarca;
    private javax.swing.JButton btnNovaMarca;
    private javax.swing.JButton btnSalvarMarca;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMarca;
    private javax.swing.JTextField txtBuscarMarca;
    private javax.swing.JTextField txtIdMarca;
    private javax.swing.JTextField txtNovaMarca;
    // End of variables declaration//GEN-END:variables
}
