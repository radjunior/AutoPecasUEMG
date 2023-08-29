package View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setarUsuario("Teste", "teste");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnpPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        pbPrincipal = new javax.swing.JProgressBar();
        jBrPrincipal = new javax.swing.JMenuBar();
        JmArquivos = new javax.swing.JMenu();
        jMCadastro = new javax.swing.JMenuItem();
        jMEntrada = new javax.swing.JMenuItem();
        jMVenda = new javax.swing.JMenuItem();
        JmSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Peças");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnpPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnpPrincipal.setToolTipText("Auto Peças Master");

        javax.swing.GroupLayout pnpPrincipalLayout = new javax.swing.GroupLayout(pnpPrincipal);
        pnpPrincipal.setLayout(pnpPrincipalLayout);
        pnpPrincipalLayout.setHorizontalGroup(
            pnpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnpPrincipalLayout.setVerticalGroup(
            pnpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seja bem-vindo"));

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/venda.png"))); // NOI18N
        btnVenda.setText("Venda");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/entrada.png"))); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cadastro.png"))); // NOI18N
        btnCadastro.setText("Cadastros");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        lblNome.setText("[lblNome]");

        jLabel2.setText("Usuário:");

        lblCargo.setText("[lblCargo]");

        jLabel3.setText("Cargo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCargo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(jLabel3)))
            .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel1.setText("Data/Hora:");

        lblData.setText("[Data]");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 778, Short.MAX_VALUE)
                .addComponent(pbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblData)))
                    .addComponent(pbPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        JmArquivos.setText("Arquivos");

        jMCadastro.setText("Cadastros");
        jMCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastroActionPerformed(evt);
            }
        });
        JmArquivos.add(jMCadastro);

        jMEntrada.setText("Entrada");
        jMEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEntradaActionPerformed(evt);
            }
        });
        JmArquivos.add(jMEntrada);

        jMVenda.setText("Venda");
        JmArquivos.add(jMVenda);

        JmSair.setText("Trocar Usuário");
        JmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmSairActionPerformed(evt);
            }
        });
        JmArquivos.add(JmSair);

        jBrPrincipal.add(JmArquivos);

        setJMenuBar(jBrPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastroActionPerformed
        ViewCadastro vwCad = new ViewCadastro();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(vwCad);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_jMCadastroActionPerformed

    private void jMEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEntradaActionPerformed
        ViewEntrada vwEntrada = new ViewEntrada();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(vwEntrada);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_jMEntradaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        ViewCadastro vwCad = new ViewCadastro();
        vwCad.setarUsuario(lblNome.getText(), lblCargo.getText());
        pnpPrincipal.removeAll();
        pnpPrincipal.add(vwCad);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        ViewVenda vVnd = new ViewVenda();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(vVnd);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        ViewEntrada vEtr = new ViewEntrada();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(vEtr);
        vEtr.iniciarData(lblData.getText());
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void JmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmSairActionPerformed
        ViewLogin vLg = new ViewLogin();
        vLg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JmSairActionPerformed
    public void setarUsuario(String nome, String cargo) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lblData.setText(dtf.format(LocalDateTime.now()));
        lblNome.setText(nome);
        lblCargo.setText(cargo);
    }
    public void setarAcesso(int nivel){
        if(nivel == 1){
            btnCadastro.setEnabled(true);
            btnVenda.setEnabled(false);
            btnEntrada.setEnabled(false);
        }else if(nivel == 2){
            btnCadastro.setEnabled(true);
            btnVenda.setEnabled(false);
            btnEntrada.setEnabled(false);
        }else if(nivel == 3){
            btnCadastro.setEnabled(true);
            btnVenda.setEnabled(false);
            btnEntrada.setEnabled(false);
        }else if(nivel == 4){
            btnCadastro.setEnabled(false);
            btnVenda.setEnabled(true);
            btnEntrada.setEnabled(true);
        }else if(nivel == 5){
            btnCadastro.setEnabled(false);
            btnVenda.setEnabled(true);
            btnEntrada.setEnabled(true);
        }else if(nivel == 6){
            btnCadastro.setEnabled(false);
            btnVenda.setEnabled(true);
            btnEntrada.setEnabled(true);
        }else if(nivel == 7){
            btnCadastro.setEnabled(true);
            btnVenda.setEnabled(true);
            btnEntrada.setEnabled(true);
        }
        jMCadastro.setEnabled(true);
        jMEntrada.setEnabled(true);
        jMVenda.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmArquivos;
    private javax.swing.JMenuItem JmSair;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnVenda;
    private javax.swing.JMenuBar jBrPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMCadastro;
    private javax.swing.JMenuItem jMEntrada;
    private javax.swing.JMenuItem jMVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JProgressBar pbPrincipal;
    private javax.swing.JPanel pnpPrincipal;
    // End of variables declaration//GEN-END:variables
}
