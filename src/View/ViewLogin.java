package View;

import DAO.CadastroDAO;
import Model.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewLogin extends javax.swing.JFrame {

    CadastroDAO cadDAO;
    String user = null;
    String cargo = null;
    String pass = null;
    String nome = null;
    int acess;

    public ViewLogin() {
        initComponents();
        cadDAO = new CadastroDAO();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblLoading = new javax.swing.JLabel();
        pbLogin = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 76, 298, -1));

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 101, 270, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, 298, -1));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Auto Peças | Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 298, 58));

        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 147, 272, -1));

        lblLoading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoading.setText("Loading...");
        jPanel1.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 20));
        jPanel1.add(pbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 250, 310, 290);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1020, 610);

        setSize(new java.awt.Dimension(1034, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (txtUser.getText().isEmpty() || txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            try {
                fazerLogin();
            } catch (InterruptedException ex) {
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        int cod = evt.getKeyCode();
        if (cod == 8 || cod == 127) {
            txtPass.setText("");
        } else if (cod == 10) {
            try {
                fazerLogin();
            } catch (InterruptedException ex) {
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        int cod = evt.getKeyCode();
        if (cod == 8 || cod == 127) {
            txtUser.setText("");
        } else if (cod == 10) {
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed
    private void fazerLogin() throws InterruptedException {
        for (Usuario usr : cadDAO.pesquisarUsuarioLogin(txtUser.getText())) {
            user = usr.getUsuario();
            pass = usr.getSenha();
            cargo = usr.getCargo();
            acess = usr.getAcesso();
            nome = usr.getNome();
        }
        if (txtUser.getText().equals(user) && txtPass.getText().equals(pass)) {
            txtPass.setEnabled(false);
            txtUser.setEditable(false);
            new Thread() {
                public void run() {
                    for (int i = 0; i <= 100; i++) {
                        try {
                            sleep(85);
                            pbLogin.setValue(i);
                            if (pbLogin.getValue() <= 25) {
                                lblLoading.setText("Carregando Interface");
                            } else if (pbLogin.getValue() <= 50) {
                                lblLoading.setText("Carregando Banco de Dados");
                            } else if (pbLogin.getValue() <= 75) {
                                lblLoading.setText("Carregando Sistema de Segurança");
                            } else if (pbLogin.getValue() <= 90) {
                                lblLoading.setText("Quase pronto");
                            } else if (pbLogin.getValue() <= 100) {
                                lblLoading.setText("Carregado com sucesso!");
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    ViewPrincipal vPri = new ViewPrincipal();
                    vPri.setarUsuario(nome, cargo);
                    vPri.setVisible(true);
                    dispose();
                }
            }.start();
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
            txtPass.setEnabled(true);
            txtUser.setEditable(true);
            txtPass.setText("");
            txtPass.requestFocus();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JProgressBar pbLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
