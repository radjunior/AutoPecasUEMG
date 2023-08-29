package View;

import DAO.CadastroDAO;
import DAO.ProdutoDAO;
import Model.Categoria;
import Model.Entrada;
import Model.Fornecedor;
import Model.Marca;
import Model.Produto;
import ModelTable.TableETR;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ViewEntrada extends javax.swing.JInternalFrame {

    CadastroDAO cadDAO;
    ProdutoDAO prdDAO;
    TableETR tabelaETR;

    public ViewEntrada() {
        initComponents();
        tabelaETR = new TableETR();
        jTableEntrada.setModel(tabelaETR);
        prdDAO = new ProdutoDAO();
        cadDAO = new CadastroDAO();
        this.setVisible(true);
        buscarTabelaEntrada();
        calcularValorTotal();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEntrada = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtEnderecoFornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCNPJFornecedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefoneFornecedor = new javax.swing.JTextField();
        txtRAtividade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdFornecedor = new javax.swing.JTextField();
        btnBuscarFornecedor = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        txtPrecoCusto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtQtdeTotal = new javax.swing.JTextField();
        txtIdNotaFiscal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnFinalizarEntrada = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtChaveReceita = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JTextField();
        txtDataEmissao = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        lblValorTotal = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Auto Peças | Entrada");

        jScrollPane2.setViewportView(jTableEntrada);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione Fornecedor"));

        txtEnderecoFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEnderecoFornecedor.setEnabled(false);

        jLabel6.setText("Endereço");

        jLabel7.setText("Telefone");

        txtCNPJFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCNPJFornecedor.setEnabled(false);

        jLabel8.setText("CNPJ");

        txtTelefoneFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefoneFornecedor.setEnabled(false);

        txtRAtividade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRAtividade.setEnabled(false);

        jLabel11.setText("Ramo de Atividade");

        txtIdFornecedor.setEnabled(false);

        btnBuscarFornecedor.setText("Buscar Fornecedor");
        btnBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFornecedorActionPerformed(evt);
            }
        });

        jLabel19.setText("Razão Social");

        txtRazaoSocial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRazaoSocial.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneFornecedor)
                            .addComponent(txtEnderecoFornecedor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRAtividade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRazaoSocial))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Produto"));

        jLabel3.setText("Marca");

        txtMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMarca.setEnabled(false);

        jLabel9.setText("Categoria");

        txtCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCategoria.setEnabled(false);

        jLabel10.setText("Preço Venda");

        txtPrecoVenda.setEnabled(false);

        txtPrecoCusto.setEnabled(false);

        jLabel12.setText("Preço Custo");

        jLabel13.setText("R$");

        jLabel14.setText("R$");

        txtIdProduto.setEnabled(false);

        btnBuscarProduto.setText("Buscar Produto");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        txtDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescricao.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(0, 148, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCategoria)
                                    .addComponent(txtMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDescricao))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Qtde Total");

        txtQtdeTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Número da Nota Fiscal");

        btnFinalizarEntrada.setText("Finalizar Entrada");

        btnLimparCampos.setText("Limpar Campos");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chave Receita");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Data Emissão");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Data do Cadastro");

        txtDataCadastro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataCadastro.setEnabled(false);

        try {
            txtDataEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEmissao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Total (R$)"));

        lblValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorTotal.setText("0,00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                        .addComponent(btnFinalizarEntrada))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdNotaFiscal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtChaveReceita, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDataEmissao, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtQtdeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addComponent(txtDataCadastro))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtChaveReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtdeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionar))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarEntrada)
                    .addComponent(btnLimparCampos))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        ViewProduto vPrd = new ViewProduto();
        vPrd.mostrarTela(this);
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFornecedorActionPerformed
        ViewFornecedor vFrn = new ViewFornecedor();
        vFrn.mostrarTela(this);
    }//GEN-LAST:event_btnBuscarFornecedorActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        tabelaETR.limpaTabela();
        CadastroDAO cadDAO = new CadastroDAO();
        if (txtIdProduto.getText().isEmpty() || txtIdFornecedor.getText().isEmpty() || txtChaveReceita.getText().isEmpty()
                || txtIdNotaFiscal.getText().isEmpty() || txtDataCadastro.getText().isEmpty() || txtDataEmissao.getText().isEmpty()
                || txtQtdeTotal.getText().isEmpty() || txtPrecoCusto.getText().isEmpty() || txtPrecoVenda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            Entrada etr = new Entrada();
            etr.setIdFornecedor(Integer.parseInt(txtIdFornecedor.getText()));
            etr.setIdProduto(Integer.parseInt(txtIdProduto.getText()));
            etr.setChaveReceita(txtChaveReceita.getText());
            etr.setIdNota(Integer.parseInt(txtIdNotaFiscal.getText()));
            etr.setDataEmissao(txtDataEmissao.getText());
            etr.setDataCadastro(txtDataCadastro.getText());
            etr.setQtdeTotal(Integer.parseInt(txtQtdeTotal.getText()));
            etr.setPrecoCusto(Float.parseFloat(txtPrecoCusto.getText()));
            etr.setPrecoVenda(Float.parseFloat(txtPrecoVenda.getText()));
            try {
                cadDAO.salvarEntrada(etr);
                buscarTabelaEntrada();
                calcularValorTotal();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro\n" + ex);
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    public void iniciarData(String data) {
        txtDataCadastro.setText(data);
    }

    public void setarProduto(Produto vPrd) {
        ProdutoDAO prdDAO = new ProdutoDAO();
        txtIdProduto.setText(Integer.toString(vPrd.getIdProduto()));
        txtDescricao.setText(vPrd.getDescricao());
        txtPrecoCusto.requestFocus();
        for (Produto prd : prdDAO.pesquisarIdProdutoMrcCat(vPrd.getIdProduto())) {
            txtPrecoCusto.setText(Float.toString(prd.getPrecoCusto()));
            txtPrecoVenda.setText(Float.toString(prd.getPrecoVenda()));
            for (Categoria cat : prdDAO.pesquisarCategoriaID(prd.getFkCategoria())) {
                txtCategoria.setText(cat.getNome());
            }
            for (Marca mrc : prdDAO.pesquisarMarcaID(prd.getFkMarca())) {
                txtMarca.setText(mrc.getNome());
            }
        }
        txtPrecoCusto.setEnabled(true);
        txtPrecoVenda.setEnabled(true);
    }

    public void limparCampos() {
        txtChaveReceita.setText("");
        txtDataCadastro.setText("");
        txtDataEmissao.setText("");
        txtIdNotaFiscal.setText("");
        txtQtdeTotal.setText("");
    }

    public void calcularValorTotal() {
        float somaTabela = 0;
        DecimalFormat df = new DecimalFormat("0.00##");
        
        for (int i = 0; i < jTableEntrada.getRowCount(); i++) {
            somaTabela += (Float)jTableEntrada.getValueAt(i, 3);
        }
        String res = df.format(somaTabela);
        lblValorTotal.setText(res);
    }

    private void buscarTabelaEntrada() {
        for (Entrada etr : cadDAO.pesquisarTabelaETR()) {
            tabelaETR.addRow(etr);
        }
    }

    public void setarFornecedor(int valor) {
        for (Fornecedor frn : cadDAO.pesquisarTabelaFRNId(valor)) {
            txtIdFornecedor.setText(Integer.toString(frn.getIdPessoa()));
            txtRazaoSocial.setText(frn.getNome());
            txtEnderecoFornecedor.setText(frn.getEndereco());
            txtCNPJFornecedor.setText(frn.getCnpj());
            txtRAtividade.setText(frn.getRamoAtividade());
            txtTelefoneFornecedor.setText(frn.getTelefone());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarFornecedor;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnFinalizarEntrada;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEntrada;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTextField txtCNPJFornecedor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtChaveReceita;
    private javax.swing.JTextField txtDataCadastro;
    private javax.swing.JFormattedTextField txtDataEmissao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEnderecoFornecedor;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtIdNotaFiscal;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQtdeTotal;
    private javax.swing.JTextField txtRAtividade;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables

}
