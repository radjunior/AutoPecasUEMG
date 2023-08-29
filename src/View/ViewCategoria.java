package View;

import DAO.ProdutoDAO;
import Model.Categoria;
import ModelTable.TableCAT;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewCategoria extends javax.swing.JFrame {
    ProdutoDAO prdDAO;
    TableCAT tabelaCAT;
    public ViewCategoria() {
        initComponents();
        prdDAO = new ProdutoDAO();
        tabelaCAT = new TableCAT();
        jTableCategoria.setModel(tabelaCAT);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        btnNovaCategoria = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtNovaCategoria = new javax.swing.JTextField();
        txtIdCategoria = new javax.swing.JTextField();
        btnSalvarCategoria = new javax.swing.JButton();
        btnEditarCategoria = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        txtBuscarCategoria = new javax.swing.JTextField();
        btnExcluirCategoria = new javax.swing.JButton();
        btnBuscarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel24.setText("Categoria");

        btnNovaCategoria.setText("Novo");
        btnNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCategoriaActionPerformed(evt);
            }
        });

        jLabel26.setText("ID");

        txtIdCategoria.setEnabled(false);

        btnSalvarCategoria.setText("Salvar");
        btnSalvarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCategoriaActionPerformed(evt);
            }
        });

        btnEditarCategoria.setText("Editar");
        btnEditarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCategoriaActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Categoria"));

        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableCategoria);

        jLabel25.setText("Buscar");

        btnExcluirCategoria.setText("Excluir");
        btnExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCategoriaActionPerformed(evt);
            }
        });

        btnBuscarCategoria.setText("Buscar");
        btnBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtBuscarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCategoria))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCategoria)
                    .addComponent(btnBuscarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNovaCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarCategoria)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovaCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCategoria)
                    .addComponent(btnEditarCategoria)
                    .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCategoriaActionPerformed
        txtNovaCategoria.setEnabled(true);
        btnSalvarCategoria.setEnabled(true);
        btnNovaCategoria.setEnabled(false);
    }//GEN-LAST:event_btnNovaCategoriaActionPerformed

    private void btnSalvarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCategoriaActionPerformed
        if (txtNovaCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            Categoria cat = new Categoria();
            cat.setNome(txtNovaCategoria.getText());
            try {
                prdDAO.salvarCategoria(cat);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                btnNovaCategoria.setEnabled(true);
                iniciarCategoria();
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarCategoriaActionPerformed

    private void btnEditarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCategoriaActionPerformed
        editarCategoria();
    }//GEN-LAST:event_btnEditarCategoriaActionPerformed

    private void jTableCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriaMouseClicked
        if (jTableCategoria.getSelectedRow() != -1) {
            Categoria cat = new Categoria();
            cat.setFkProduto((int) jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 0));
            cat.setNome((String) jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 1));
            txtNovaCategoria.setText(cat.getNome());
            txtIdCategoria.setText(Integer.toString(cat.getFkProduto()));
        }
        btnSalvarCategoria.setEnabled(false);
        btnEditarCategoria.setEnabled(true);
        btnExcluirCategoria.setEnabled(true);
        txtNovaCategoria.setEnabled(true);
    }//GEN-LAST:event_jTableCategoriaMouseClicked

    private void btnExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCategoriaActionPerformed
        excluirCategoria();
    }//GEN-LAST:event_btnExcluirCategoriaActionPerformed

    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
        tabelaCAT.limpaTabela();
        pesquisarTabelaCategoria(txtBuscarCategoria.getText());
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed
    public void iniciarCategoria() {
        txtNovaCategoria.setEnabled(false);
        txtNovaCategoria.setText("");
        txtIdCategoria.setText("");
        btnSalvarCategoria.setEnabled(false);
        btnEditarCategoria.setEnabled(false);
        btnExcluirCategoria.setEnabled(false);
    }

    private void excluirCategoria() {
        Categoria cat = new Categoria();
        if (jTableCategoria.getSelectedRow() != -1) {
            cat.setFkProduto((int) jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 0));
            cat.setNome(txtNovaCategoria.getText());
            //JOptionPane.showMessageDialog(null, "ID: "+cat.getFkProduto()+"\nNome: "+cat.getNome());
            try {
                prdDAO.excluirCategoria(cat);
                iniciarCategoria();
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaCAT.removeRow(jTableCategoria.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void editarCategoria() {
        if (txtNovaCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            Categoria cat = new Categoria();
            cat.setFkProduto(Integer.parseInt(txtIdCategoria.getText()));
            cat.setNome(txtNovaCategoria.getText());
            try {
                prdDAO.editarCategoria(cat);
                iniciarCategoria();
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar no banco\n" + ex);
            }
        }

    }

    private void pesquisarTabelaCategoria(String desc) {
        for (Categoria cat : prdDAO.pesquisarCategoria(desc)) {
            tabelaCAT.addRow(cat);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCategoria;
    private javax.swing.JButton btnEditarCategoria;
    private javax.swing.JButton btnExcluirCategoria;
    private javax.swing.JButton btnNovaCategoria;
    private javax.swing.JButton btnSalvarCategoria;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCategoria;
    private javax.swing.JTextField txtBuscarCategoria;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNovaCategoria;
    // End of variables declaration//GEN-END:variables
}
