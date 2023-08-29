package View;

import DAO.CadastroDAO;
import DAO.ProdutoDAO;
import Model.Categoria;
import Model.Fornecedor;
import Model.Marca;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Produto;
import Model.Usuario;
import ModelTable.TableFRN;
import ModelTable.TablePF;
import ModelTable.TablePJ;
import ModelTable.TablePRD;
import ModelTable.TableUSER;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ViewCadastro extends javax.swing.JInternalFrame {

    CadastroDAO cadDAO;
    ProdutoDAO prdDAO;
    TablePJ tabelaPJ;
    TablePF tabelaPF;
    TableFRN tabelaFRN;
    TablePRD tabelaPRD;
    TableUSER tabelaUSER;

    public ViewCadastro() {
        initComponents();
        this.setVisible(true);
        cadDAO = new CadastroDAO();
        prdDAO = new ProdutoDAO();
        tabelaPJ = new TablePJ();
        tabelaPF = new TablePF();
        tabelaFRN = new TableFRN();
        tabelaPRD = new TablePRD();
        tabelaUSER = new TableUSER();
        jTableProduto.setModel(tabelaPRD);
        txtCreditoPessoaJuridica.setText("0.0");
        txtCreditoPessoaFisica.setText("0.0");
        iniciador();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoCadastro = new javax.swing.ButtonGroup();
        guiGeral = new javax.swing.JTabbedPane();
        jTpPrincipal = new javax.swing.JPanel();
        jPnPessoa = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomePessoa = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEnderecoPessoa = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefonePessoa = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmailPessoa = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelularPessoa = new javax.swing.JFormattedTextField();
        lblCep = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtCidadePessoa = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairroPessoa = new javax.swing.JTextField();
        txtCepPessoa = new javax.swing.JFormattedTextField();
        jPnInfoFisica = new javax.swing.JPanel();
        lblCpf2 = new javax.swing.JLabel();
        txtCPFPessoaFisica = new javax.swing.JFormattedTextField();
        lblRg1 = new javax.swing.JLabel();
        txtRgPessoaFisica = new javax.swing.JTextField();
        lblLimiteCredito2 = new javax.swing.JLabel();
        txtCreditoPessoaFisica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdPessoaFisica = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPnInfoJuridica = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        txtCnpjPessoaJuridica = new javax.swing.JFormattedTextField();
        lblIncricaoSocial = new javax.swing.JLabel();
        txtInscricaoSocialPessoaJuridica = new javax.swing.JTextField();
        lblLimiteCredito = new javax.swing.JLabel();
        txtCreditoPessoaJuridica = new javax.swing.JTextField();
        txtIdPessoaJuridica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalvarPessoa = new javax.swing.JButton();
        btnLimparPessoa = new javax.swing.JButton();
        btnEditarPessoa = new javax.swing.JButton();
        btnCancelarPessoa = new javax.swing.JButton();
        btnNovoPessoa = new javax.swing.JButton();
        rbFisica = new javax.swing.JRadioButton();
        rbJuridica = new javax.swing.JRadioButton();
        txtBuscarPessoa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarPessoa = new javax.swing.JButton();
        btnExcluirPessoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoa = new javax.swing.JTable();
        jTpFornecedor = new javax.swing.JPanel();
        jPnInfoFornecedor = new javax.swing.JPanel();
        txtIdFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCnpjFornecedor = new javax.swing.JFormattedTextField();
        lblCpf3 = new javax.swing.JLabel();
        txtInscricaoSocialFornecedor = new javax.swing.JTextField();
        lblIncricaoSocial1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRamoAtividadeFornecedor = new javax.swing.JTextField();
        jPnFornecedor = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtEnderecoFornecedor = new javax.swing.JTextField();
        lblTelefone1 = new javax.swing.JLabel();
        txtTelefoneFornecedor = new javax.swing.JFormattedTextField();
        lblEmail1 = new javax.swing.JLabel();
        txtEmailFornecedor = new javax.swing.JTextField();
        lblCelular1 = new javax.swing.JLabel();
        txtCelularFornecedor = new javax.swing.JFormattedTextField();
        lblCep1 = new javax.swing.JLabel();
        lblCidade1 = new javax.swing.JLabel();
        txtCidadeFornecedor = new javax.swing.JTextField();
        lblBairro1 = new javax.swing.JLabel();
        txtBairroFornecedor = new javax.swing.JTextField();
        txtCepFornecedor = new javax.swing.JFormattedTextField();
        txtIdInfoFornecedor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        btnSalvarFornecedor = new javax.swing.JButton();
        btnLimparFornecedor = new javax.swing.JButton();
        btnEditarFornecedor = new javax.swing.JButton();
        btnCancelarFornecedor = new javax.swing.JButton();
        txtBuscarFornecedor = new javax.swing.JTextField();
        btnBuscarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnNovoFornecedor = new javax.swing.JButton();
        jTpProduto = new javax.swing.JPanel();
        jPnCategoria = new javax.swing.JPanel();
        cbCategoria = new javax.swing.JComboBox<>();
        txtFkCategoria = new javax.swing.JTextField();
        btnNovaCategoria = new javax.swing.JButton();
        jPnMarca = new javax.swing.JPanel();
        cbMarca = new javax.swing.JComboBox<>();
        txtFkMarca = new javax.swing.JTextField();
        btnNovaMarca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtBuscarProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jPnProduto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigoBarrasProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUnidadeProduto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrecoCustoProduto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecoVendaProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtQtdeProduto = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblValorMargem = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnNovoCadastroProduto = new javax.swing.JButton();
        jTpUsuario = new javax.swing.JPanel();
        jPnInfoUsuario = new javax.swing.JPanel();
        lblNome2 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lblEndereco2 = new javax.swing.JLabel();
        txtEnderecoUsuario = new javax.swing.JTextField();
        lblTelefone2 = new javax.swing.JLabel();
        txtTelefoneUsuario = new javax.swing.JFormattedTextField();
        lblEmail2 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        lblCelular2 = new javax.swing.JLabel();
        txtCelularUsuario = new javax.swing.JFormattedTextField();
        lblCep2 = new javax.swing.JLabel();
        lblCidade2 = new javax.swing.JLabel();
        txtCidadeUsuario = new javax.swing.JTextField();
        lblBairro2 = new javax.swing.JLabel();
        txtBairroUsuario = new javax.swing.JTextField();
        txtCepUsuario = new javax.swing.JFormattedTextField();
        txtIdInfoUsuario = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPnUsuario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtSenhaConfirm = new javax.swing.JPasswordField();
        cbCargo = new javax.swing.JComboBox<>();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnSalvarUsuario = new javax.swing.JButton();
        btnLimarUsuario = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnBuscarUsuario = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtBuscarUsuario = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        btnExcluirUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastros");
        setToolTipText("");

        guiGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiGeralMouseClicked(evt);
            }
        });
        guiGeral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guiGeralKeyPressed(evt);
            }
        });

        jPnPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lblNome.setText("Nome Completo / Razão Social");

        lblEndereco.setText("Endereço");

        txtEnderecoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoPessoaActionPerformed(evt);
            }
        });

        lblTelefone.setText("Telefone");

        try {
            txtTelefonePessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonePessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonePessoaFocusLost(evt);
            }
        });

        lblEmail.setText("E-mail");

        lblCelular.setText("Celular");

        try {
            txtCelularPessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularPessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularPessoaFocusLost(evt);
            }
        });

        lblCep.setText("CEP");

        lblCidade.setText("Cidade");

        lblBairro.setText("Bairro");

        try {
            txtCepPessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepPessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepPessoaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPnPessoaLayout = new javax.swing.GroupLayout(jPnPessoa);
        jPnPessoa.setLayout(jPnPessoaLayout);
        jPnPessoaLayout.setHorizontalGroup(
            jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnPessoaLayout.createSequentialGroup()
                        .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular)
                            .addComponent(txtCelularPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonePessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addGroup(jPnPessoaLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtEmailPessoa)
                    .addComponent(txtNomePessoa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnPessoaLayout.createSequentialGroup()
                        .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep)
                            .addComponent(txtCepPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnPessoaLayout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidadePessoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro)
                            .addComponent(txtBairroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEnderecoPessoa)
                    .addGroup(jPnPessoaLayout.createSequentialGroup()
                        .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnPessoaLayout.setVerticalGroup(
            jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnPessoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnPessoaLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnPessoaLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPnInfoFisica.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Pessoa Fisica"));

        lblCpf2.setText("CPF");

        try {
            txtCPFPessoaFisica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFPessoaFisica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFPessoaFisicaFocusLost(evt);
            }
        });

        lblRg1.setText("RG");

        lblLimiteCredito2.setText("Limite Crédito");

        jLabel6.setText("ID");

        txtIdPessoaFisica.setEnabled(false);

        jLabel9.setText("R$");

        javax.swing.GroupLayout jPnInfoFisicaLayout = new javax.swing.GroupLayout(jPnInfoFisica);
        jPnInfoFisica.setLayout(jPnInfoFisicaLayout);
        jPnInfoFisicaLayout.setHorizontalGroup(
            jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnInfoFisicaLayout.createSequentialGroup()
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                                .addComponent(txtRgPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(lblRg1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                                .addComponent(lblLimiteCredito2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                                .addComponent(txtCreditoPessoaFisica)
                                .addContainerGap())))
                    .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPFPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf2))
                        .addContainerGap())))
        );
        jPnInfoFisicaLayout.setVerticalGroup(
            jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCreditoPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnInfoFisicaLayout.createSequentialGroup()
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpf2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPFPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRg1)
                            .addComponent(lblLimiteCredito2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRgPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnInfoJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Pessoa Juridica"));

        lblCpf.setText("CNPJ");

        try {
            txtCnpjPessoaJuridica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjPessoaJuridica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCnpjPessoaJuridicaFocusLost(evt);
            }
        });

        lblIncricaoSocial.setText("Inscrição Social");

        lblLimiteCredito.setText("Limite Crédito");

        txtCreditoPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditoPessoaJuridicaActionPerformed(evt);
            }
        });

        txtIdPessoaJuridica.setEnabled(false);

        jLabel2.setText("ID");

        jLabel4.setText("R$");

        javax.swing.GroupLayout jPnInfoJuridicaLayout = new javax.swing.GroupLayout(jPnInfoJuridica);
        jPnInfoJuridica.setLayout(jPnInfoJuridicaLayout);
        jPnInfoJuridicaLayout.setHorizontalGroup(
            jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                        .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                                .addComponent(txtInscricaoSocialPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(lblIncricaoSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                                .addComponent(lblLimiteCredito)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCreditoPessoaJuridica))
                        .addContainerGap())
                    .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                        .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(8, 8, 8)
                        .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                                .addComponent(txtCnpjPessoaJuridica)
                                .addContainerGap())))))
        );
        jPnInfoJuridicaLayout.setVerticalGroup(
            jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpjPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnInfoJuridicaLayout.createSequentialGroup()
                        .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncricaoSocial)
                            .addComponent(lblLimiteCredito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInscricaoSocialPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnInfoJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCreditoPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvarPessoa.setText("Salvar");
        btnSalvarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPessoaActionPerformed(evt);
            }
        });

        btnLimparPessoa.setText("Limpar");
        btnLimparPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPessoaActionPerformed(evt);
            }
        });

        btnEditarPessoa.setText("Editar");
        btnEditarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPessoaActionPerformed(evt);
            }
        });

        btnCancelarPessoa.setText("Cancelar");
        btnCancelarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPessoaActionPerformed(evt);
            }
        });

        btnNovoPessoa.setText("Novo");
        btnNovoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPessoaActionPerformed(evt);
            }
        });

        TipoCadastro.add(rbFisica);
        rbFisica.setSelected(true);
        rbFisica.setText("Fisica");
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        TipoCadastro.add(rbJuridica);
        rbJuridica.setText("Juridica");
        rbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome / Razão Social");

        btnBuscarPessoa.setText("Buscar");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        btnExcluirPessoa.setText("Excluir");
        btnExcluirPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPessoaActionPerformed(evt);
            }
        });

        jTablePessoa.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTablePessoaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTablePessoaFocusLost(evt);
            }
        });
        jTablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoa);

        javax.swing.GroupLayout jTpPrincipalLayout = new javax.swing.GroupLayout(jTpPrincipal);
        jTpPrincipal.setLayout(jTpPrincipalLayout);
        jTpPrincipalLayout.setHorizontalGroup(
            jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jTpPrincipalLayout.createSequentialGroup()
                                .addComponent(btnNovoPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbJuridica)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTpPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCancelarPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarPessoa))
                            .addComponent(jPnInfoJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPnInfoFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addComponent(txtBuscarPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPessoa))
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jTpPrincipalLayout.setVerticalGroup(
            jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addComponent(jPnInfoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnInfoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFisica)
                            .addComponent(rbJuridica)
                            .addComponent(btnNovoPessoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPessoa)
                    .addComponent(btnExcluirPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        guiGeral.addTab("Pessoa", jTpPrincipal);

        jPnInfoFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Fornecedor"));

        txtIdFornecedor.setEnabled(false);

        jLabel3.setText("ID");

        try {
            txtCnpjFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCnpjFornecedorFocusLost(evt);
            }
        });

        lblCpf3.setText("CNPJ");

        lblIncricaoSocial1.setText("Inscrição Social");

        jLabel10.setText("Ramo de Atividade");

        javax.swing.GroupLayout jPnInfoFornecedorLayout = new javax.swing.GroupLayout(jPnInfoFornecedor);
        jPnInfoFornecedor.setLayout(jPnInfoFornecedorLayout);
        jPnInfoFornecedorLayout.setHorizontalGroup(
            jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                .addGroup(jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                                .addComponent(lblCpf3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCnpjFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                    .addComponent(txtInscricaoSocialFornecedor)
                    .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncricaoSocial1)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRamoAtividadeFornecedor))
                .addContainerGap())
        );
        jPnInfoFornecedorLayout.setVerticalGroup(
            jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                .addGroup(jPnInfoFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                        .addComponent(lblCpf3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCnpjFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnInfoFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIncricaoSocial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInscricaoSocialFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRamoAtividadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPnFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lblNome1.setText("Nome Completo / Razão Social");

        lblEndereco1.setText("Endereço");

        txtEnderecoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoFornecedorActionPerformed(evt);
            }
        });

        lblTelefone1.setText("Telefone");

        try {
            txtTelefoneFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFornecedorFocusLost(evt);
            }
        });

        lblEmail1.setText("E-mail");

        lblCelular1.setText("Celular");

        try {
            txtCelularFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFornecedorFocusLost(evt);
            }
        });

        lblCep1.setText("CEP");

        lblCidade1.setText("Cidade");

        lblBairro1.setText("Bairro");

        try {
            txtCepFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFornecedorFocusLost(evt);
            }
        });

        txtIdInfoFornecedor.setEnabled(false);

        jLabel25.setText("ID");

        javax.swing.GroupLayout jPnFornecedorLayout = new javax.swing.GroupLayout(jPnFornecedor);
        jPnFornecedor.setLayout(jPnFornecedorLayout);
        jPnFornecedorLayout.setHorizontalGroup(
            jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular1)
                            .addComponent(txtCelularFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addGroup(jPnFornecedorLayout.createSequentialGroup()
                                .addComponent(lblTelefone1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep1)
                            .addComponent(txtCepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnFornecedorLayout.createSequentialGroup()
                                .addComponent(lblCidade1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidadeFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro1)
                            .addComponent(txtBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEnderecoFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail1)
                            .addComponent(lblEndereco1))
                        .addGap(0, 461, Short.MAX_VALUE))
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdInfoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeFornecedor)
                            .addGroup(jPnFornecedorLayout.createSequentialGroup()
                                .addComponent(lblNome1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPnFornecedorLayout.setVerticalGroup(
            jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdInfoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep1)
                    .addComponent(lblCidade1)
                    .addComponent(lblBairro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addComponent(lblEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addComponent(lblTelefone1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFornecedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableFornecedor);

        btnSalvarFornecedor.setText("Salvar");
        btnSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFornecedorActionPerformed(evt);
            }
        });

        btnLimparFornecedor.setText("Limpar");
        btnLimparFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFornecedorActionPerformed(evt);
            }
        });

        btnEditarFornecedor.setText("Editar");
        btnEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFornecedorActionPerformed(evt);
            }
        });

        btnCancelarFornecedor.setText("Cancelar");

        btnBuscarFornecedor.setText("Buscar");
        btnBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFornecedorActionPerformed(evt);
            }
        });

        btnExcluirFornecedor.setText("Excluir");

        jLabel5.setText("Descrição");

        btnNovoFornecedor.setText("Novo");
        btnNovoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTpFornecedorLayout = new javax.swing.GroupLayout(jTpFornecedor);
        jTpFornecedor.setLayout(jTpFornecedorLayout);
        jTpFornecedorLayout.setHorizontalGroup(
            jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jTpFornecedorLayout.createSequentialGroup()
                        .addGroup(jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jTpFornecedorLayout.createSequentialGroup()
                                .addComponent(btnNovoFornecedor)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnInfoFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jTpFornecedorLayout.createSequentialGroup()
                                .addComponent(btnCancelarFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarFornecedor))))
                    .addGroup(jTpFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jTpFornecedorLayout.createSequentialGroup()
                        .addComponent(txtBuscarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarFornecedor)))
                .addContainerGap())
        );
        jTpFornecedorLayout.setVerticalGroup(
            jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jTpFornecedorLayout.createSequentialGroup()
                        .addComponent(jPnInfoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarFornecedor)
                            .addComponent(btnSalvarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarFornecedor)))
                    .addComponent(jPnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFornecedor)
                    .addComponent(btnExcluirFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        guiGeral.addTab("Fornecedor", jTpFornecedor);

        jPnCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione Categoria"));

        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });

        txtFkCategoria.setEnabled(false);

        btnNovaCategoria.setText("+");
        btnNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnCategoriaLayout = new javax.swing.GroupLayout(jPnCategoria);
        jPnCategoria.setLayout(jPnCategoriaLayout);
        jPnCategoriaLayout.setHorizontalGroup(
            jPnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFkCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovaCategoria)
                .addContainerGap())
        );
        jPnCategoriaLayout.setVerticalGroup(
            jPnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFkCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaCategoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione Marca"));

        cbMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMarcaItemStateChanged(evt);
            }
        });

        txtFkMarca.setEnabled(false);

        btnNovaMarca.setText("+");
        btnNovaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnMarcaLayout = new javax.swing.GroupLayout(jPnMarca);
        jPnMarca.setLayout(jPnMarcaLayout);
        jPnMarcaLayout.setHorizontalGroup(
            jPnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFkMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovaMarca)
                .addContainerGap())
        );
        jPnMarcaLayout.setVerticalGroup(
            jPnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFkMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaMarca))
                .addContainerGap(17, Short.MAX_VALUE))
        );

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
        jTableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableProdutoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProduto);

        jLabel20.setText("Consulta");

        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jPnProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));

        jLabel12.setText("Código de Barras");

        jLabel13.setText("Descricao");

        jLabel14.setText("Unidade");

        txtUnidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeProdutoActionPerformed(evt);
            }
        });

        jLabel15.setText("Preço de Custo");

        txtPrecoCustoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoCustoProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoCustoProdutoFocusLost(evt);
            }
        });

        jLabel16.setText("Preço de Venda");

        txtPrecoVendaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoVendaProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaProdutoFocusLost(evt);
            }
        });

        jLabel17.setText("Qtde");

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setText("Editar");

        jLabel18.setText("R$");

        jLabel19.setText("R$");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Margem de Lucro (%)"));

        lblValorMargem.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblValorMargem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorMargem.setText("0.0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorMargem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        jLabel21.setText("UN");

        javax.swing.GroupLayout jPnProdutoLayout = new javax.swing.GroupLayout(jPnProduto);
        jPnProduto.setLayout(jPnProdutoLayout);
        jPnProdutoLayout.setHorizontalGroup(
            jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                        .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtUnidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)))
                    .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnProdutoLayout.createSequentialGroup()
                            .addComponent(btnEditarProduto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimparProduto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalvarProduto))
                        .addComponent(txtCodigoBarrasProduto, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        jPnProdutoLayout.setVerticalGroup(
            jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                        .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPnProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUnidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPnProdutoLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtQtdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21)))))
                            .addGroup(jPnProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(46, 46, 46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarProduto)
                            .addComponent(btnLimparProduto)
                            .addComponent(btnSalvarProduto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnProdutoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnNovoCadastroProduto.setText("Novo");
        btnNovoCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTpProdutoLayout = new javax.swing.GroupLayout(jTpProduto);
        jTpProduto.setLayout(jTpProdutoLayout);
        jTpProdutoLayout.setHorizontalGroup(
            jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jTpProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(385, 844, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTpProdutoLayout.createSequentialGroup()
                        .addGroup(jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jTpProdutoLayout.createSequentialGroup()
                                .addComponent(txtBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProduto))
                            .addComponent(jPnProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jTpProdutoLayout.createSequentialGroup()
                                .addComponent(btnNovoCadastroProduto)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPnMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPnCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jTpProdutoLayout.setVerticalGroup(
            jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoCadastroProduto)
                .addGap(8, 8, 8)
                .addGroup(jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jTpProdutoLayout.createSequentialGroup()
                        .addComponent(jPnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTpProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProduto)
                    .addComponent(btnBuscarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        guiGeral.addTab("Produto", jTpProduto);

        jPnInfoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lblNome2.setText("Nome Completo / Razão Social");

        lblEndereco2.setText("Endereço");

        txtEnderecoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoUsuarioActionPerformed(evt);
            }
        });

        lblTelefone2.setText("Telefone");

        try {
            txtTelefoneUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneUsuarioFocusLost(evt);
            }
        });

        lblEmail2.setText("E-mail");

        lblCelular2.setText("Celular");

        try {
            txtCelularUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularUsuarioFocusLost(evt);
            }
        });

        lblCep2.setText("CEP");

        lblCidade2.setText("Cidade");

        lblBairro2.setText("Bairro");

        try {
            txtCepUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepUsuarioFocusLost(evt);
            }
        });

        txtIdInfoUsuario.setEnabled(false);

        jLabel24.setText("ID");

        javax.swing.GroupLayout jPnInfoUsuarioLayout = new javax.swing.GroupLayout(jPnInfoUsuario);
        jPnInfoUsuario.setLayout(jPnInfoUsuarioLayout);
        jPnInfoUsuarioLayout.setHorizontalGroup(
            jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnInfoUsuarioLayout.createSequentialGroup()
                        .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular2)
                            .addComponent(txtCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneUsuario)
                            .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                                .addComponent(lblTelefone2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtEmailUsuario)
                    .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                        .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep2)
                            .addComponent(txtCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                                .addComponent(lblCidade2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidadeUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro2)
                            .addComponent(txtBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEnderecoUsuario)
                    .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                        .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail2)
                            .addComponent(lblEndereco2)
                            .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(txtIdInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnInfoUsuarioLayout.setVerticalGroup(
            jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnInfoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome2)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep2)
                    .addComponent(lblCidade2)
                    .addComponent(lblBairro2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                        .addComponent(lblEmail2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnInfoUsuarioLayout.createSequentialGroup()
                        .addComponent(lblTelefone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(221, 221, 221))
        );

        jPnUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel7.setText("Usuário");

        jLabel8.setText("Senha");

        jLabel11.setText("Confirme a Senha");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Cargo", "Analista de RH - Jr", "Analista de RH - Pl", "Analista de RH - Sr", "Analista Financeiro - Jr", "Analista Financeiro - Pl", "Analista Financeiro - Sr", "Administrador" }));

        txtIdUsuario.setEnabled(false);

        jLabel23.setText("ID");

        javax.swing.GroupLayout jPnUsuarioLayout = new javax.swing.GroupLayout(jPnUsuario);
        jPnUsuario.setLayout(jPnUsuarioLayout);
        jPnUsuarioLayout.setHorizontalGroup(
            jPnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenhaConfirm)
                    .addComponent(txtSenha)
                    .addComponent(cbCargo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 322, Short.MAX_VALUE)
                    .addGroup(jPnUsuarioLayout.createSequentialGroup()
                        .addComponent(txtUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnUsuarioLayout.createSequentialGroup()
                        .addGroup(jPnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPnUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        jPnUsuarioLayout.setVerticalGroup(
            jPnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnLimarUsuario.setText("Limpar");
        btnLimarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimarUsuarioActionPerformed(evt);
            }
        });

        btnNovoUsuario.setText("Novo");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        jLabel22.setText("Descrição");

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableUsuario);

        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtBuscarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirUsuario)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnBuscarUsuario)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario)
                    .addComponent(btnExcluirUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        jLabel26.setText("Usuário:");

        lblNomeUsuario.setText("[Nome]");

        jLabel29.setText("Cargo");

        lblCargo.setText("[Cargo]");

        javax.swing.GroupLayout jTpUsuarioLayout = new javax.swing.GroupLayout(jTpUsuario);
        jTpUsuario.setLayout(jTpUsuarioLayout);
        jTpUsuarioLayout.setHorizontalGroup(
            jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTpUsuarioLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jTpUsuarioLayout.createSequentialGroup()
                        .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnInfoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jTpUsuarioLayout.createSequentialGroup()
                                .addComponent(btnNovoUsuario)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTpUsuarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(btnEditarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvarUsuario)
                                .addGap(42, 42, 42))
                            .addGroup(jTpUsuarioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jTpUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNomeUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCargo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jPnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
        );
        jTpUsuarioLayout.setVerticalGroup(
            jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovoUsuario)
                    .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(lblNomeUsuario)
                        .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(lblCargo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTpUsuarioLayout.createSequentialGroup()
                        .addComponent(jPnInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 287, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jTpUsuarioLayout.createSequentialGroup()
                        .addComponent(jPnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarUsuario)
                            .addComponent(btnLimarUsuario)
                            .addComponent(btnSalvarUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );

        guiGeral.addTab("Usuário", jTpUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guiGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guiGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guiGeralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guiGeralKeyPressed

    }//GEN-LAST:event_guiGeralKeyPressed

    private void guiGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiGeralMouseClicked

    }//GEN-LAST:event_guiGeralMouseClicked

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        excluirUsuario();
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        limparTextUsuario();
        desbloquearUsuario();
        desbloquearInfoUsuario();
        exibirUsuario();
        btnEditarUsuario.setEnabled(true);
        btnSalvarUsuario.setEnabled(false);
        //Se não for usuário nivel 7 não será possível Editar a Senha
        if("Analista de RH - Jr".equals(lblCargo.getText())){
            //código
        }else if("Analista de RH - Pl".equals(lblCargo.getText())){
            //código
        }else if("Analista de RH - Sr".equals(lblCargo.getText())){
            //código
        }else if("Analista Financeiro - Jr".equals(lblCargo.getText())){
            //código
        }else if("Analista Financeiro - Pl".equals(lblCargo.getText())){
            //código
        }else if("Analista Financeiro - Sr".equals(lblCargo.getText())){
            //código
        }else if("Analista de RH - Pl".equals(lblCargo.getText())){
            //código
        }else if("Administrador".equals(lblCargo.getText())){
            //código
        }else{
            //código
        }
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        tabelaUSER.limpaTabela();
        pesquisarTabelaUsuario(txtBuscarUsuario.getText());
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        desbloquearUsuario();
        desbloquearInfoUsuario();
        btnEditarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnLimarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimarUsuarioActionPerformed
        limparTextUsuario();
    }//GEN-LAST:event_btnLimarUsuarioActionPerformed

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        if (txtNomeUsuario.getText().isEmpty() || txtEnderecoUsuario.getText().isEmpty() || txtCidadeUsuario.getText().isEmpty()
                || txtBairroUsuario.getText().isEmpty() || txtEmailUsuario.getText().isEmpty() || txtCepUsuario.getText().equals("     -   ")
                || txtTelefoneUsuario.getText().equals("(  )     -    ") && txtCelularUsuario.getText().equals("(  )      -    ")
                || txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty() || txtSenhaConfirm.getText().isEmpty() || cbCargo.getSelectedItem().equals("Selecione um Cargo")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtSenha.getText().equals(txtSenhaConfirm.getText())) {
                if (txtSenha.getText().length() < 8) {
                    JOptionPane.showMessageDialog(null, "Senha deve conter 8 ou mais caracteres");
                } else {
                    Pessoa pes = new Pessoa();
                    pes.setNome(txtNomeUsuario.getText());
                    pes.setEndereco(txtEnderecoUsuario.getText());
                    pes.setCidade(txtCidadeUsuario.getText());
                    pes.setBairro(txtBairroUsuario.getText());
                    pes.setEmail(txtEmailUsuario.getText());
                    pes.setCep(txtCepUsuario.getText());
                    pes.setTelefone(txtTelefoneUsuario.getText());
                    pes.setCelular(txtCelularUsuario.getText());
                    Usuario usr = new Usuario();
                    usr.setUsuario(txtUsuario.getText());
                    usr.setSenha(txtSenha.getText());
                    usr.setCargo((String) cbCargo.getSelectedItem());
                    usr.setAcesso(cbCargo.getSelectedIndex());
                    try {
                        cadDAO.salvarPessoa(pes);
                        cadDAO.salvarUsr(usr);
                        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao salvar Usuário" + ex);
                    }
                    limparTextUsuario();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha não coincidem");
            }
        }
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void txtCepUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepUsuarioFocusLost

    private void txtCelularUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularUsuarioFocusLost

    private void txtTelefoneUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneUsuarioFocusLost

    private void txtEnderecoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoUsuarioActionPerformed

    private void btnNovoCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroProdutoActionPerformed
        desbloquearProduto();
        desbloquearCategoria();
        desbloquearMarca();
    }//GEN-LAST:event_btnNovoCadastroProdutoActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
        limparCamposProduto();
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        if (txtDescricaoProduto.getText().isEmpty() || txtCodigoBarrasProduto.getText().isEmpty() || txtUnidadeProduto.getText().isEmpty() || txtPrecoCustoProduto.getText().isEmpty() || txtPrecoVendaProduto.getText().isEmpty() || txtQtdeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            Produto prd = new Produto();
            prd.setCodBarras(Integer.parseInt(txtCodigoBarrasProduto.getText()));
            prd.setDescricao(txtDescricaoProduto.getText());
            prd.setUnidade(txtUnidadeProduto.getText());
            prd.setPrecoCusto(Float.parseFloat(txtPrecoCustoProduto.getText()));
            prd.setPrecoVenda(Float.parseFloat(txtPrecoVendaProduto.getText()));
            prd.setQtde(Integer.parseInt(txtQtdeProduto.getText()));
            prd.setFkCategoria(Integer.parseInt(txtFkCategoria.getText()));
            prd.setFkMarca(Integer.parseInt(txtFkMarca.getText()));
            try {
                prdDAO.salvarProduto(prd);
                limparCamposProduto();
                bloquearProduto();
                bloquearCategoria();
                bloquearMarca();
                btnNovoCadastroProduto.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar produto\n" + ex);
            }
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void txtPrecoVendaProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoFocusLost
        calcularMargem();
    }//GEN-LAST:event_txtPrecoVendaProdutoFocusLost

    private void txtPrecoVendaProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoFocusGained
        calcularMargem();
    }//GEN-LAST:event_txtPrecoVendaProdutoFocusGained

    private void txtPrecoCustoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoProdutoFocusLost
        calcularMargem();
    }//GEN-LAST:event_txtPrecoCustoProdutoFocusLost

    private void txtPrecoCustoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoProdutoFocusGained
        calcularMargem();
    }//GEN-LAST:event_txtPrecoCustoProdutoFocusGained

    private void txtUnidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeProdutoActionPerformed

    }//GEN-LAST:event_txtUnidadeProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        tabelaPRD.limpaTabela();
        pesquisarTabelaProduto(txtBuscarProduto.getText());
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void jTableProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutoKeyPressed

    }//GEN-LAST:event_jTableProdutoKeyPressed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        limparCamposProduto();
        if (jTableProduto.getSelectedRow() != -1) {

            Produto prd = new Produto();
            prd.setIdProduto((int) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0));
            prd.setDescricao((String) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1));
            prd.setPrecoVenda((Float) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 2));
            prd.setQtde((Float) (jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 3)));
            prd.setUnidade((String) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 4));

            txtDescricaoProduto.setText(prd.getDescricao());
            txtPrecoVendaProduto.setText(Float.toString(prd.getPrecoVenda()));
            txtQtdeProduto.setText(Float.toString(prd.getQtde()));
            txtUnidadeProduto.setText(prd.getUnidade());

            for (Produto prd2 : prdDAO.pesquisarProdutoID(prd.getIdProduto())) {
                txtCodigoBarrasProduto.setText(Integer.toString(prd2.getCodBarras()));
                txtPrecoCustoProduto.setText(Float.toString(prd2.getPrecoCusto()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        desbloquearProduto();
        desbloquearMarca();
        desbloquearCategoria();
        btnExcluirProduto.setEnabled(true);
        btnEditarProduto.setEnabled(true);
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void btnNovaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaMarcaActionPerformed
        ViewMarca vMrc = new ViewMarca();
        vMrc.setVisible(true);
    }//GEN-LAST:event_btnNovaMarcaActionPerformed

    private void cbMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMarcaItemStateChanged
        eventoCBMarca(evt);
    }//GEN-LAST:event_cbMarcaItemStateChanged

    private void btnNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCategoriaActionPerformed
        ViewCategoria vCat = new ViewCategoria();
        vCat.setVisible(true);
    }//GEN-LAST:event_btnNovaCategoriaActionPerformed

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        eventoCBCategoria(evt);
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void btnNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFornecedorActionPerformed
        desbloquearFornecedor();
        desbloquearInfoFornecedor();
        btnEditarFornecedor.setEnabled(false);
        btnExcluirFornecedor.setEnabled(false);
    }//GEN-LAST:event_btnNovoFornecedorActionPerformed

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void btnBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFornecedorActionPerformed
        tabelaFRN.limpaTabela();
        pesquisarTabelaFornecedor(txtBuscarFornecedor.getText());
    }//GEN-LAST:event_btnBuscarFornecedorActionPerformed

    private void btnEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarFornecedorActionPerformed

    private void btnSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFornecedorActionPerformed
        salvarFornecedor();
    }//GEN-LAST:event_btnSalvarFornecedorActionPerformed

    private void txtCepFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFornecedorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepFornecedorFocusLost

    private void txtCelularFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFornecedorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularFornecedorFocusLost

    private void txtTelefoneFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFornecedorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFornecedorFocusLost

    private void txtEnderecoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoFornecedorActionPerformed

    private void txtCnpjFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCnpjFornecedorFocusLost

    }//GEN-LAST:event_txtCnpjFornecedorFocusLost

    private void rbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicaActionPerformed
        verificarTipoCadastro();
    }//GEN-LAST:event_rbJuridicaActionPerformed

    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        verificarTipoCadastro();
    }//GEN-LAST:event_rbFisicaActionPerformed

    private void btnNovoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPessoaActionPerformed
        if (rbFisica.isSelected()) {
            tabelaPF.limpaTabela();
        } else if (rbJuridica.isSelected()) {
            tabelaPJ.limpaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
        limparTextFieldsPessoa();
        bloquearCadastro();
        txtCnpjPessoaJuridica.requestFocus();
    }//GEN-LAST:event_btnNovoPessoaActionPerformed

    private void btnEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPessoaActionPerformed
        if (rbFisica.isSelected()) {
            editarPessoaFisica();
        } else if (rbJuridica.isSelected()) {
            editarPessoaJuridica();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnEditarPessoaActionPerformed

    private void btnLimparPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPessoaActionPerformed
        limparTextFieldsPessoa();
    }//GEN-LAST:event_btnLimparPessoaActionPerformed

    private void btnSalvarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPessoaActionPerformed
        if (rbFisica.isSelected()) {
            salvarPessoaFisica();
        } else if (rbJuridica.isSelected()) {
            salvarPessoaJuridica();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnSalvarPessoaActionPerformed

    private void txtCreditoPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditoPessoaJuridicaActionPerformed

    }//GEN-LAST:event_txtCreditoPessoaJuridicaActionPerformed

    private void txtCnpjPessoaJuridicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCnpjPessoaJuridicaFocusLost
        txtCnpjPessoaJuridica.setFocusLostBehavior(JFormattedTextField.COMMIT);
        String cnpjDB;
        cnpjDB = cadDAO.verificarCNPJClientePJ(txtCnpjPessoaJuridica.getText());
        if (txtCnpjPessoaJuridica.getText().equals(cnpjDB)) {
            JOptionPane.showMessageDialog(null, "Cadastro Existente");
            txtCnpjPessoaJuridica.requestFocus();
        }
    }//GEN-LAST:event_txtCnpjPessoaJuridicaFocusLost

    private void txtCPFPessoaFisicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFPessoaFisicaFocusLost
        txtCPFPessoaFisica.setFocusLostBehavior(JFormattedTextField.COMMIT);
        String cpfDB;
        cpfDB = cadDAO.verificarCPFClientePF(txtCPFPessoaFisica.getText());
        if (txtCPFPessoaFisica.getText().equals(cpfDB)) {
            JOptionPane.showMessageDialog(null, "Cadastro Existente");
            txtCPFPessoaFisica.requestFocus();
        }
    }//GEN-LAST:event_txtCPFPessoaFisicaFocusLost

    private void btnExcluirPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPessoaActionPerformed
        if (rbFisica.isSelected()) {
            excluirPessoaFisica();
        } else if (rbJuridica.isSelected()) {
            excluirPessoaJuridica();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnExcluirPessoaActionPerformed

    private void btnBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPessoaActionPerformed
        jTablePessoa.requestFocus();
        if (rbFisica.isSelected()) {
            tabelaPF.limpaTabela();
            pesquisarTabelaPessoaFisica(txtBuscarPessoa.getText());
            btnExcluirPessoa.setEnabled(true);

        } else if (rbJuridica.isSelected()) {
            tabelaPJ.limpaTabela();
            pesquisarTabelaPessoaJuridica(txtBuscarPessoa.getText());
            btnExcluirPessoa.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnBuscarPessoaActionPerformed

    private void jTablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoaMouseClicked
        limparTextFieldsPessoa();
        if (rbFisica.isSelected()) {
            exibirPessoaFisica();

        } else if (rbJuridica.isSelected()) {
            exibirPessoaJuridica();

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
        btnCancelarPessoa.setEnabled(true);
        btnEditarPessoa.setEnabled(true);
        btnLimparPessoa.setEnabled(false);
        btnSalvarPessoa.setEnabled(false);
    }//GEN-LAST:event_jTablePessoaMouseClicked

    private void jTablePessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablePessoaFocusLost
        if (rbFisica.isSelected()) {
            tabelaPF.limpaTabela();
        } else if (rbJuridica.isSelected()) {
            tabelaPJ.limpaTabela();
        }
    }//GEN-LAST:event_jTablePessoaFocusLost

    private void jTablePessoaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablePessoaFocusGained

    }//GEN-LAST:event_jTablePessoaFocusGained

    private void txtCepPessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepPessoaFocusLost
        txtCepPessoa.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtCepPessoaFocusLost

    private void txtCelularPessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularPessoaFocusLost
        txtCelularPessoa.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtCelularPessoaFocusLost

    private void txtTelefonePessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonePessoaFocusLost
        txtTelefonePessoa.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtTelefonePessoaFocusLost

    private void txtEnderecoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoPessoaActionPerformed

    private void btnCancelarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarPessoaActionPerformed

    private void btnLimparFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFornecedorActionPerformed
        limparTextFieldsFornecedor();
    }//GEN-LAST:event_btnLimparFornecedorActionPerformed

    private void jTableFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFornecedorMouseClicked
        exibirFornecedor();
        desbloquearInfoFornecedor();
        desbloquearFornecedor();
    }//GEN-LAST:event_jTableFornecedorMouseClicked

    private void iniciador() {
        inicializadorTabelas();
        DesativarCampos();
        verificarTipoCadastro();
        preencherComboBoxMarca();
        preencherComboBoxCategoria();
        bloquearProduto();
        bloquearCadastro();
        bloquearPessoa();
        bloquearInfoFornecedor();
        bloquearCategoria();
        bloquearMarca();
        bloquearFornecedor();
        bloquearUsuario();
        bloquearInfoUsuario();
    }

    private void excluirProduto() {
        Produto prd = new Produto();
        if (jTableProduto.getSelectedRow() != -1) {
            prd.setIdProduto((int) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0));
            try {
                prdDAO.excluirProduto(prd);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPRD.removeRow(jTableProduto.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void bloquearProduto() {
        for (Component a : jPnProduto.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void desbloquearProduto() {
        for (Component a : jPnProduto.getComponents()) {
            a.setEnabled(true);
        }
    }

    private void limparCamposProduto() {
        txtCodigoBarrasProduto.setText("");
        txtDescricaoProduto.setText("");
        txtUnidadeProduto.setText("");
        txtPrecoCustoProduto.setText("");
        txtPrecoVendaProduto.setText("");
        txtQtdeProduto.setText("");
        cbCategoria.setSelectedIndex(0);
        cbMarca.setSelectedIndex(0);
    }

    private void eventoCBCategoria(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) cbCategoria.getSelectedItem();
            for (Categoria cat : cadDAO.eventoCBCategoria(item)) {
                txtFkCategoria.setText(Integer.toString(cat.getFkProduto()));
            }
        }
    }

    private void eventoCBMarca(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) cbMarca.getSelectedItem();
            for (Marca mrc : cadDAO.eventoCBMarca(item)) {
                txtFkMarca.setText(Integer.toString(mrc.getFkProduto()));
            }
        }
    }

    private void calcularMargem() {
        String padrao = "##.##";
        DecimalFormat df = new DecimalFormat(padrao);
        float custo = Float.parseFloat(txtPrecoCustoProduto.getText());
        float venda = Float.parseFloat(txtPrecoVendaProduto.getText());
        //float lucro = venda - custo;
        float margem = 100 - ((custo / venda) * 100);
        String res = String.valueOf(df.format(margem));
        lblValorMargem.setText(res + "%");
    }

    private void exibirFornecedor() {
        if (jTableFornecedor.getSelectedRow() != -1) {
            txtIdFornecedor.setText(Integer.toString((int) jTableFornecedor.getValueAt(jTableFornecedor.getSelectedRow(), 0)));
            txtNomeFornecedor.setText((String) jTableFornecedor.getValueAt(jTableFornecedor.getSelectedRow(), 1));
            txtCnpjFornecedor.setText((String) jTableFornecedor.getValueAt(jTableFornecedor.getSelectedRow(), 2));
            txtRamoAtividadeFornecedor.setText((String) jTableFornecedor.getValueAt(jTableFornecedor.getSelectedRow(), 3));
            for (Fornecedor frn : cadDAO.pesquisarTabelaFRN(txtNomeFornecedor.getText())) {
                txtIdInfoFornecedor.setText(Integer.toString(frn.getFkPessoa()));
                txtEnderecoFornecedor.setText(frn.getEndereco());
                txtCidadeFornecedor.setText(frn.getCidade());
                txtInscricaoSocialFornecedor.setText(frn.getInscricaoSocial());
                txtCepFornecedor.setText(frn.getCep());
                txtTelefoneFornecedor.setText(frn.getTelefone());
                txtCelularFornecedor.setText(frn.getCelular());
                txtEmailFornecedor.setText(frn.getEmail());
                txtBairroFornecedor.setText(frn.getBairro());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Registro");
        }
        txtCnpjFornecedor.setEnabled(false);
        txtNomeFornecedor.requestFocus();
        btnEditarFornecedor.setEnabled(true);
        btnSalvarFornecedor.setEnabled(false);
    }

    private void pesquisarTabelaFornecedor(String desc) {
        for (Fornecedor frn : cadDAO.pesquisarTabelaFRN(desc)) {
            tabelaFRN.addRow(frn);
        }
    }

    private void excluirFornecedor() {
        Fornecedor frn = new Fornecedor();
        Pessoa pes = new Pessoa();
        if (jTablePessoa.getSelectedRow() != -1) {
            frn.setFkPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirFornecedor(frn);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPJ.removeRow(jTablePessoa.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            DesativarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void editarFornecedor() {
        if (txtCnpjFornecedor.getText().isEmpty() || txtInscricaoSocialFornecedor.getText().isEmpty() || txtRamoAtividadeFornecedor.getText().isEmpty() || txtNomePessoa.getText().isEmpty() || txtEnderecoPessoa.getText().isEmpty()
                || txtCepPessoa.getText().isEmpty() || txtCidadePessoa.getText().isEmpty() || txtTelefonePessoa.getText().isEmpty() || txtBairroPessoa.getText().isEmpty() || txtCelularPessoa.getText().isEmpty() || txtEmailPessoa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelularPessoa.getText().equals("(  )      -    ") && txtTelefonePessoa.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                Fornecedor frn = new Fornecedor();
                frn.setCnpj(txtCnpjFornecedor.getText());
                frn.setInscricaoSocial(txtInscricaoSocialFornecedor.getText());
                frn.setRamoAtividade(txtRamoAtividadeFornecedor.getText());
                frn.setFkPessoa(Integer.parseInt(txtIdFornecedor.getText()));

                Pessoa pes = new Pessoa();
                pes.setIdPessoa(Integer.parseInt(txtIdFornecedor.getText()));
                pes.setNome(txtNomePessoa.getText());
                pes.setEndereco(txtEnderecoPessoa.getText());
                pes.setCep(txtCepPessoa.getText());
                pes.setCidade(txtCidadePessoa.getText());
                pes.setTelefone(txtTelefonePessoa.getText());
                pes.setBairro(txtBairroPessoa.getText());
                pes.setCelular(txtCelularPessoa.getText());
                pes.setEmail(txtEmailPessoa.getText());
                try {
                    cadDAO.alterarPessoa(pes);
                    cadDAO.alterarFornecedor(frn);
                    DesativarCampos();
                    JOptionPane.showMessageDialog(null, "Cadastro Editado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void salvarFornecedor() {
        if (txtCnpjFornecedor.getText().isEmpty() || txtInscricaoSocialFornecedor.getText().isEmpty() || txtRamoAtividadeFornecedor.getText().isEmpty() || txtNomeFornecedor.getText().isEmpty() || txtEnderecoFornecedor.getText().isEmpty() || txtCepFornecedor.getText().isEmpty() || txtCidadeFornecedor.getText().isEmpty() || txtTelefoneFornecedor.getText().isEmpty() || txtBairroFornecedor.getText().isEmpty() || txtCelularFornecedor.getText().isEmpty() || txtEmailFornecedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelularFornecedor.getText().equals("(  )      -    ") && txtTelefoneFornecedor.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                Fornecedor frn = new Fornecedor();
                frn.setCnpj(txtCnpjFornecedor.getText());
                frn.setInscricaoSocial(txtInscricaoSocialFornecedor.getText());
                frn.setRamoAtividade(txtRamoAtividadeFornecedor.getText());
                Pessoa pes = new Pessoa();
                pes.setNome(txtNomeFornecedor.getText());
                pes.setEndereco(txtEnderecoFornecedor.getText());
                pes.setCep(txtCepFornecedor.getText());
                pes.setCidade(txtCidadeFornecedor.getText());
                pes.setTelefone(txtTelefoneFornecedor.getText());
                pes.setBairro(txtBairroFornecedor.getText());
                pes.setCelular(txtCelularFornecedor.getText());
                pes.setEmail(txtEmailFornecedor.getText());
                try {
                    cadDAO.salvarPessoa(pes);
                    cadDAO.salvarForn(frn);
                    DesativarCampos();
                    limparTextFieldsFornecedor();
                    btnNovoFornecedor.setEnabled(true);
                    btnLimparFornecedor.setEnabled(false);
                    btnSalvarFornecedor.setEnabled(false);
                    bloquearInfoFornecedor();
                    bloquearFornecedor();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco FRN\n" + ex);
                }
            }
        }
    }

    private void exibirPessoaJuridica() {
        if (jTablePessoa.getSelectedRow() != -1) {
            txtNomePessoa.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 0));
            txtCnpjPessoaJuridica.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 1));
            txtCreditoPessoaJuridica.setText(String.valueOf(jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 2)));
            for (PessoaJuridica pj : cadDAO.pesquisarTabelaPJ(txtNomePessoa.getText())) {
                txtIdPessoaJuridica.setText(Integer.toString(pj.getFkPessoa()));
                txtEnderecoPessoa.setText(pj.getEndereco());
                txtCidadePessoa.setText(pj.getCidade());
                txtInscricaoSocialPessoaJuridica.setText(pj.getInscricaoSocial());
                txtCepPessoa.setText(pj.getCep());
                txtTelefonePessoa.setText(pj.getTelefone());
                txtCelularPessoa.setText(pj.getCelular());
                txtEmailPessoa.setText(pj.getEmail());
                txtBairroPessoa.setText(pj.getBairro());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        bloquearCadastro();
        txtCnpjPessoaJuridica.setEnabled(false);
        txtNomePessoa.requestFocus();
        btnEditarPessoa.setEnabled(true);
        btnSalvarPessoa.setEnabled(false);
    }

    private void excluirPessoaJuridica() {
        PessoaJuridica pj = new PessoaJuridica();
        Pessoa pes = new Pessoa();
        if (txtIdPessoaJuridica.getText() != "") {
            pj.setFkPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirPessoaJuridica(pj);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPJ.removeRow(jTablePessoa.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            DesativarCampos();
            limparTextFieldsPessoa();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void editarPessoaJuridica() {
        if (txtCnpjPessoaJuridica.getText().isEmpty() || txtInscricaoSocialPessoaJuridica.getText().isEmpty() || txtCreditoPessoaJuridica.getText().isEmpty() || txtNomePessoa.getText().isEmpty() || txtEnderecoPessoa.getText().isEmpty()
                || txtCepPessoa.getText().isEmpty() || txtCidadePessoa.getText().isEmpty() || txtTelefonePessoa.getText().isEmpty() || txtBairroPessoa.getText().isEmpty() || txtCelularPessoa.getText().isEmpty() || txtEmailPessoa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelularPessoa.getText().equals("(  )      -    ") && txtTelefonePessoa.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                PessoaJuridica pj = new PessoaJuridica();
                pj.setCnpj(txtCnpjPessoaJuridica.getText());
                pj.setInscricaoSocial(txtInscricaoSocialPessoaJuridica.getText());
                pj.setCredito(Float.parseFloat(txtCreditoPessoaJuridica.getText()));
                pj.setFkPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));

                Pessoa pes = new Pessoa();
                pes.setIdPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
                pes.setNome(txtNomePessoa.getText());
                pes.setEndereco(txtEnderecoPessoa.getText());
                pes.setCep(txtCepPessoa.getText());
                pes.setCidade(txtCidadePessoa.getText());
                pes.setTelefone(txtTelefonePessoa.getText());
                pes.setBairro(txtBairroPessoa.getText());
                pes.setCelular(txtCelularPessoa.getText());
                pes.setEmail(txtEmailPessoa.getText());
                try {
                    cadDAO.alterarPessoa(pes);
                    cadDAO.alterarPessoaJuridica(pj);
                    DesativarCampos();
                    limparTextFieldsPessoa();
                    JOptionPane.showMessageDialog(null, "Cadastro Editado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void salvarPessoaJuridica() {
        if (txtCnpjPessoaJuridica.getText().isEmpty() || txtInscricaoSocialPessoaJuridica.getText().isEmpty() || txtCreditoPessoaJuridica.getText().isEmpty() || txtNomePessoa.getText().isEmpty() || txtEnderecoPessoa.getText().isEmpty()
                || txtCepPessoa.getText().isEmpty() || txtCidadePessoa.getText().isEmpty() || txtTelefonePessoa.getText().isEmpty() || txtBairroPessoa.getText().isEmpty() || txtCelularPessoa.getText().isEmpty() || txtEmailPessoa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelularPessoa.getText().equals("(  )      -    ") && txtTelefonePessoa.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                PessoaJuridica pj = new PessoaJuridica();
                pj.setCnpj(txtCnpjPessoaJuridica.getText());
                pj.setInscricaoSocial(txtInscricaoSocialPessoaJuridica.getText());
                pj.setCredito(Float.parseFloat(txtCreditoPessoaJuridica.getText()));
                Pessoa pes = new Pessoa();
                pes.setNome(txtNomePessoa.getText());
                pes.setEndereco(txtEnderecoPessoa.getText());
                pes.setCep(txtCepPessoa.getText());
                pes.setCidade(txtCidadePessoa.getText());
                pes.setTelefone(txtTelefonePessoa.getText());
                pes.setBairro(txtBairroPessoa.getText());
                pes.setCelular(txtCelularPessoa.getText());
                pes.setEmail(txtEmailPessoa.getText());
                try {
                    cadDAO.salvarPessoa(pes);
                    cadDAO.salvarPJ(pj);
                    DesativarCampos();
                    limparTextFieldsPessoa();
                    btnNovoPessoa.setEnabled(true);
                    rbFisica.setEnabled(true);
                    rbJuridica.setEnabled(true);

                    btnLimparPessoa.setEnabled(false);
                    btnSalvarPessoa.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void desbloquearFornecedor() {
        for (Component a : jPnFornecedor.getComponents()) {
            a.setEnabled(true);
        }
        txtIdFornecedor.setEnabled(false);
    }

    private void desbloquearInfoFornecedor() {
        for (Component a : jPnInfoFornecedor.getComponents()) {
            a.setEnabled(true);
        }
        txtIdInfoFornecedor.setEnabled(false);
    }

    private void desbloquearInfoUsuario() {
        for (Component a : jPnInfoUsuario.getComponents()) {
            a.setEnabled(true);
        }
        txtIdInfoUsuario.setEnabled(false);
    }

    private void desbloquearUsuario() {
        for (Component a : jPnUsuario.getComponents()) {
            a.setEnabled(true);
        }
        txtIdUsuario.setEnabled(false);
    }

    private void desbloquearMarca() {
        for (Component a : jPnMarca.getComponents()) {
            a.setEnabled(true);
        }
    }

    private void desbloquearCategoria() {
        for (Component a : jPnCategoria.getComponents()) {
            a.setEnabled(true);
        }
    }

    private void desbloquearPessoa() {
        for (Component a : jPnPessoa.getComponents()) {
            a.setEnabled(true);
        }
    }

    private void desbloquearJuridica() {
        for (Component a : jPnInfoJuridica.getComponents()) {
            a.setEnabled(true);
        }
        txtIdPessoaJuridica.setEnabled(false);
    }

    private void bloquearInfoFornecedor() {
        for (Component a : jPnInfoFornecedor.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearInfoJuridica() {
        for (Component a : jPnInfoJuridica.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearPessoa() {
        for (Component a : jPnPessoa.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearFornecedor() {
        for (Component a : jPnFornecedor.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearCategoria() {
        for (Component a : jPnCategoria.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearMarca() {
        for (Component a : jPnMarca.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearInfoUsuario() {
        for (Component a : jPnUsuario.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearUsuario() {
        for (Component a : jPnInfoUsuario.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void pesquisarTabelaPessoaJuridica(String desc) {
        for (PessoaJuridica pj : cadDAO.pesquisarTabelaPJ(desc)) {
            tabelaPJ.addRow(pj);
        }
    }

    private void exibirPessoaFisica() {
        if (jTablePessoa.getSelectedRow() != -1) {
            txtNomePessoa.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 0));
            txtCPFPessoaFisica.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 1));
            txtCreditoPessoaFisica.setText(String.valueOf(jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 2)));
            for (PessoaFisica pf : cadDAO.pesquisarTabelaPF(txtNomePessoa.getText())) {
                txtIdPessoaFisica.setText(Integer.toString(pf.getFkPessoa()));
                txtRgPessoaFisica.setText(pf.getRg());
                txtEnderecoPessoa.setText(pf.getEndereco());
                txtCidadePessoa.setText(pf.getCidade());
                txtCepPessoa.setText(pf.getCep());
                txtTelefonePessoa.setText(pf.getTelefone());
                txtCelularPessoa.setText(pf.getCelular());
                txtEmailPessoa.setText(pf.getEmail());
                txtBairroPessoa.setText(pf.getBairro());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        bloquearCadastro();
        txtCPFPessoaFisica.setEnabled(false);
        txtNomePessoa.requestFocus();
    }

    private void excluirPessoaFisica() {
        PessoaFisica pf = new PessoaFisica();
        Pessoa pes = new Pessoa();
        if (txtIdPessoaFisica.getText() != "") {
            pf.setFkPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirPessoaFisica(pf);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPF.removeRow(jTablePessoa.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            DesativarCampos();
            limparTextFieldsPessoa();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void editarPessoaFisica() {
        if (txtBairroPessoa.getText().isEmpty() || txtCPFPessoaFisica.getText().isEmpty() || txtCepPessoa.getText().isEmpty() || txtCidadePessoa.getText().isEmpty() || txtEmailPessoa.getText().isEmpty() || txtEnderecoPessoa.getText().isEmpty() || txtNomePessoa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelularPessoa.getText().equals("(  )      -    ") && txtTelefonePessoa.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                PessoaFisica pf = new PessoaFisica();
                pf.setCpf(txtCPFPessoaFisica.getText());
                pf.setRg(txtRgPessoaFisica.getText());
                pf.setCredito(Float.parseFloat(txtCreditoPessoaFisica.getText()));
                pf.setFkPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));

                Pessoa pes = new Pessoa();
                pes.setIdPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));
                pes.setNome(txtNomePessoa.getText());
                pes.setEndereco(txtEnderecoPessoa.getText());
                pes.setCep(txtCepPessoa.getText());
                pes.setCidade(txtCidadePessoa.getText());
                pes.setTelefone(txtTelefonePessoa.getText());
                pes.setBairro(txtBairroPessoa.getText());
                pes.setCelular(txtCelularPessoa.getText());
                pes.setEmail(txtEmailPessoa.getText());
                try {
                    cadDAO.alterarPessoa(pes);
                    cadDAO.alterarPessoaFisica(pf);
                    DesativarCampos();
                    limparTextFieldsPessoa();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PF\n" + ex);
                }
            }
        }
    }

    private void salvarPessoaFisica() {
        if (txtCPFPessoaFisica.getText().isEmpty() || txtRgPessoaFisica.getText().isEmpty() || txtCreditoPessoaFisica.getText().isEmpty() || txtNomePessoa.getText().isEmpty() || txtEnderecoPessoa.getText().isEmpty()
                || txtCepPessoa.getText().isEmpty() || txtCidadePessoa.getText().isEmpty() || txtTelefonePessoa.getText().isEmpty() || txtBairroPessoa.getText().isEmpty() || txtCelularPessoa.getText().isEmpty() || txtEmailPessoa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelularPessoa.getText().equals("(  )      -    ") && txtTelefonePessoa.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {

                PessoaFisica pf = new PessoaFisica();
                pf.setCpf(txtCPFPessoaFisica.getText());
                pf.setRg(txtRgPessoaFisica.getText());
                pf.setCredito(Float.parseFloat(txtCreditoPessoaFisica.getText()));

                Pessoa pes = new Pessoa();
                pes.setNome(txtNomePessoa.getText());
                pes.setEndereco(txtEnderecoPessoa.getText());
                pes.setCep(txtCepPessoa.getText());
                pes.setCidade(txtCidadePessoa.getText());
                pes.setTelefone(txtTelefonePessoa.getText());
                pes.setBairro(txtBairroPessoa.getText());
                pes.setCelular(txtCelularPessoa.getText());
                pes.setEmail(txtEmailPessoa.getText());

                try {
                    cadDAO.salvarPessoa(pes);
                    cadDAO.salvarPF(pf);
                    DesativarCampos();
                    limparTextFieldsPessoa();
                    btnNovoPessoa.setEnabled(true);
                    rbFisica.setEnabled(true);
                    rbJuridica.setEnabled(true);

                    btnLimparPessoa.setEnabled(false);
                    btnSalvarPessoa.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PF\n" + ex);
                }
            }
        }
    }

    private void verificarTipoCadastro() {
        if (rbFisica.isSelected()) {
            jTablePessoa.setModel(tabelaPF);
            bloquearInfoJuridica();
            desbloquearFisica();
            txtCnpjPessoaJuridica.setText("");
            txtInscricaoSocialPessoaJuridica.setText("");
            txtIdPessoaJuridica.setText("");
            txtCreditoPessoaJuridica.setText("");
        } else {
            jTablePessoa.setModel(tabelaPJ);
            bloquearFisica();
            desbloquearJuridica();
            txtCPFPessoaFisica.setText("");
            txtRgPessoaFisica.setText("");
            txtCreditoPessoaFisica.setText("");
            txtIdPessoaFisica.setText("");
        }
    }

    private void bloquearFisica() {
        for (Component a : jPnInfoFisica.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void desbloquearFisica() {
        for (Component a : jPnInfoFisica.getComponents()) {
            a.setEnabled(true);
        }
        txtIdPessoaFisica.setEnabled(false);
    }

    private void pesquisarTabelaPessoaFisica(String desc) {
        for (PessoaFisica pf : cadDAO.pesquisarTabelaPF(desc)) {
            tabelaPF.addRow(pf);
        }
    }

    private void pesquisarTabelaUsuario(String desc) {
        for (Usuario Usr : cadDAO.pesquisarTabelaUser(desc)) {
            tabelaUSER.addRow(Usr);
        }
    }

    private void preencherComboBoxMarca() {
        for (Marca mrc : prdDAO.preenchendoCBMarca()) {
            cbMarca.addItem(mrc.getNome());
            txtFkMarca.setText(Integer.toString(mrc.getFkProduto()));
        }
    }

    private void preencherComboBoxCategoria() {
        for (Categoria cat : prdDAO.preenchendoCBCategoria()) {
            cbCategoria.addItem(cat.getNome());
            txtFkCategoria.setText(Integer.toString(cat.getFkProduto()));
        }
    }

    private void pesquisarTabelaProduto(String desc) {
        for (Produto prd : prdDAO.pesquisarProduto(desc)) {
            tabelaPRD.addRow(prd);
        }
    }

    private void limparTextFieldsPessoa() {
        txtNomePessoa.setText("");
        txtEnderecoPessoa.setText("");
        txtCidadePessoa.setText("");
        txtCepPessoa.setText("");
        txtTelefonePessoa.setText("");
        txtCelularPessoa.setText("");
        txtEmailPessoa.setText("");
        txtBairroPessoa.setText("");
        txtCPFPessoaFisica.setText("");
        txtRgPessoaFisica.setText("");
        txtCreditoPessoaFisica.setText("0.0");
        txtCnpjPessoaJuridica.setText("");
        txtIdPessoaJuridica.setText("");
        txtIdPessoaFisica.setText("");
        txtInscricaoSocialPessoaJuridica.setText("");
        txtCreditoPessoaJuridica.setText("0.0");
        txtCnpjFornecedor.setText("");
        txtInscricaoSocialFornecedor.setText("");
        txtRamoAtividadeFornecedor.setText("");
    }

    private void DesativarCampos() {
        txtNomePessoa.setEnabled(false);
        txtEnderecoPessoa.setEnabled(false);
        txtCidadePessoa.setEnabled(false);
        txtCepPessoa.setEnabled(false);
        txtTelefonePessoa.setEnabled(false);
        txtCelularPessoa.setEnabled(false);
        txtEmailPessoa.setEnabled(false);
        txtBairroPessoa.setEnabled(false);
        btnEditarPessoa.setEnabled(false);
        btnExcluirPessoa.setEnabled(false);
        btnLimparPessoa.setEnabled(false);
        btnSalvarPessoa.setEnabled(false);
        btnCancelarPessoa.setEnabled(false);
    }

    private void bloquearCadastro() {
        desbloquearPessoa();
        btnEditarPessoa.setEnabled(false);
        btnSalvarPessoa.setEnabled(true);
        btnCancelarPessoa.setEnabled(true);
        btnLimparPessoa.setEnabled(true);

    }

    private void inicializadorTabelas() {
        jTableUsuario.setModel(tabelaUSER);
        jTableFornecedor.setModel(tabelaFRN);
    }

    void setarCategoria(Categoria vCat) {
        cbCategoria.addItem(vCat.getNome());
    }

    private void iniciarCadastroUsuario() {

        txtNomeUsuario.setEnabled(true);
        txtEnderecoUsuario.setEnabled(true);
        txtCepUsuario.setEnabled(true);
        txtCidadeUsuario.setEnabled(true);
        txtBairroUsuario.setEnabled(true);
        txtEmailUsuario.setEnabled(true);
        txtCelularUsuario.setEnabled(true);
        txtTelefoneUsuario.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtSenhaConfirm.setEnabled(true);
        cbCargo.setEnabled(true);

    }

    private void exibirUsuario() {
        if (jTableUsuario.getSelectedRow() != -1) {
            txtNomeUsuario.setText((String) jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1));
            txtUsuario.setText((String) jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 2));

            for (Usuario usr : cadDAO.pesquisarTabelaUser(txtNomeUsuario.getText())) {
                txtNomeUsuario.setText(usr.getNome());
                txtIdInfoUsuario.setText(Integer.toString(usr.getIdPessoa()));
                txtIdUsuario.setText(Integer.toString(usr.getFkPessoa()));
                txtEnderecoUsuario.setText(usr.getEndereco());
                txtCidadeUsuario.setText(usr.getCidade());
                txtCepUsuario.setText(usr.getCep());
                txtTelefoneUsuario.setText(usr.getTelefone());
                txtCelularUsuario.setText(usr.getCelular());
                txtEmailUsuario.setText(usr.getEmail());
                txtBairroUsuario.setText(usr.getBairro());
                txtUsuario.setText(usr.getUsuario());
                txtSenha.setText(usr.getSenha());
                txtSenhaConfirm.setText(usr.getSenha());
                cbCargo.setSelectedIndex(usr.getAcesso());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Usuário");
        }
        bloquearUsuario();
        txtNomeUsuario.requestFocus();
        btnEditarUsuario.setEnabled(true);
        btnSalvarUsuario.setEnabled(false);
    }

    private void excluirUsuario() {
        Usuario usr = new Usuario();
        Pessoa pes = new Pessoa();
        if (jTableUsuario.getSelectedRow() != -1) {
            usr.setFkPessoa(Integer.parseInt(txtIdUsuario.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdInfoUsuario.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirUsuario(usr);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaUSER.removeRow(jTableUsuario.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            bloquearUsuario();
            limparTextUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void limparTextUsuario() {
        txtNomeUsuario.setText("");
        txtIdInfoUsuario.setText("");
        txtEnderecoUsuario.setText("");
        txtCepUsuario.setText("");
        txtCidadeUsuario.setText("");
        txtBairroUsuario.setText("");
        txtEmailUsuario.setText("");
        txtCelularUsuario.setText("");
        txtTelefoneUsuario.setText("");
        //separação
        txtIdUsuario.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtSenhaConfirm.setText("");
        cbCargo.setSelectedIndex(0);
    }

    private void limparTextFieldsFornecedor() {
        txtNomeFornecedor.setText("");
        txtIdInfoFornecedor.setText("");
        txtEnderecoFornecedor.setText("");
        txtCepFornecedor.setText("");
        txtCidadeFornecedor.setText("");
        txtBairroFornecedor.setText("");
        txtEmailFornecedor.setText("");
        txtCelularFornecedor.setText("");
        txtTelefoneFornecedor.setText("");
        //separação info\fornecedor
        txtIdFornecedor.setText("");
        txtCnpjFornecedor.setText("");
        txtInscricaoSocialFornecedor.setText("");
        txtRamoAtividadeFornecedor.setText("");
    }
    public void setarUsuario(String user, String cargo){
        lblNomeUsuario.setText(user);
        lblCargo.setText(cargo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoCadastro;
    private javax.swing.JButton btnBuscarFornecedor;
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnCancelarFornecedor;
    private javax.swing.JButton btnCancelarPessoa;
    private javax.swing.JButton btnEditarFornecedor;
    private javax.swing.JButton btnEditarPessoa;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnExcluirPessoa;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnLimarUsuario;
    private javax.swing.JButton btnLimparFornecedor;
    private javax.swing.JButton btnLimparPessoa;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnNovaCategoria;
    private javax.swing.JButton btnNovaMarca;
    private javax.swing.JButton btnNovoCadastroProduto;
    private javax.swing.JButton btnNovoFornecedor;
    private javax.swing.JButton btnNovoPessoa;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnSalvarFornecedor;
    private javax.swing.JButton btnSalvarPessoa;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JComboBox<Object> cbCategoria;
    private javax.swing.JComboBox<Object> cbMarca;
    private javax.swing.JTabbedPane guiGeral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPnCategoria;
    private javax.swing.JPanel jPnFornecedor;
    private javax.swing.JPanel jPnInfoFisica;
    private javax.swing.JPanel jPnInfoFornecedor;
    private javax.swing.JPanel jPnInfoJuridica;
    private javax.swing.JPanel jPnInfoUsuario;
    private javax.swing.JPanel jPnMarca;
    private javax.swing.JPanel jPnPessoa;
    private javax.swing.JPanel jPnProduto;
    private javax.swing.JPanel jPnUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTable jTablePessoa;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JPanel jTpFornecedor;
    private javax.swing.JPanel jTpPrincipal;
    private javax.swing.JPanel jTpProduto;
    private javax.swing.JPanel jTpUsuario;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairro1;
    private javax.swing.JLabel lblBairro2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblCelular2;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCep1;
    private javax.swing.JLabel lblCep2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCidade2;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblCpf3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEndereco2;
    private javax.swing.JLabel lblIncricaoSocial;
    private javax.swing.JLabel lblIncricaoSocial1;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblLimiteCredito2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblRg1;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTelefone2;
    private javax.swing.JLabel lblValorMargem;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    private javax.swing.JTextField txtBairroFornecedor;
    private javax.swing.JTextField txtBairroPessoa;
    private javax.swing.JTextField txtBairroUsuario;
    private javax.swing.JTextField txtBuscarFornecedor;
    private javax.swing.JTextField txtBuscarPessoa;
    private javax.swing.JTextField txtBuscarProduto;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JFormattedTextField txtCPFPessoaFisica;
    private javax.swing.JFormattedTextField txtCelularFornecedor;
    private javax.swing.JFormattedTextField txtCelularPessoa;
    private javax.swing.JFormattedTextField txtCelularUsuario;
    private javax.swing.JFormattedTextField txtCepFornecedor;
    private javax.swing.JFormattedTextField txtCepPessoa;
    private javax.swing.JFormattedTextField txtCepUsuario;
    private javax.swing.JTextField txtCidadeFornecedor;
    private javax.swing.JTextField txtCidadePessoa;
    private javax.swing.JTextField txtCidadeUsuario;
    private javax.swing.JFormattedTextField txtCnpjFornecedor;
    private javax.swing.JFormattedTextField txtCnpjPessoaJuridica;
    private javax.swing.JTextField txtCodigoBarrasProduto;
    private javax.swing.JTextField txtCreditoPessoaFisica;
    private javax.swing.JTextField txtCreditoPessoaJuridica;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtEmailFornecedor;
    private javax.swing.JTextField txtEmailPessoa;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtEnderecoFornecedor;
    private javax.swing.JTextField txtEnderecoPessoa;
    private javax.swing.JTextField txtEnderecoUsuario;
    private javax.swing.JTextField txtFkCategoria;
    private javax.swing.JTextField txtFkMarca;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtIdInfoFornecedor;
    private javax.swing.JTextField txtIdInfoUsuario;
    private javax.swing.JTextField txtIdPessoaFisica;
    private javax.swing.JTextField txtIdPessoaJuridica;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtInscricaoSocialFornecedor;
    private javax.swing.JTextField txtInscricaoSocialPessoaJuridica;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtNomePessoa;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtPrecoCustoProduto;
    private javax.swing.JTextField txtPrecoVendaProduto;
    private javax.swing.JTextField txtQtdeProduto;
    private javax.swing.JTextField txtRamoAtividadeFornecedor;
    private javax.swing.JTextField txtRgPessoaFisica;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaConfirm;
    private javax.swing.JFormattedTextField txtTelefoneFornecedor;
    private javax.swing.JFormattedTextField txtTelefonePessoa;
    private javax.swing.JFormattedTextField txtTelefoneUsuario;
    private javax.swing.JTextField txtUnidadeProduto;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
