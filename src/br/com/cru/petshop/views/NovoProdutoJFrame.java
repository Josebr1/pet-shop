/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.views;

/**
 *
 * @author jose.antonio
 */
public class NovoProdutoJFrame extends javax.swing.JDialog {

    /**
     * Creates new form NovoProdutoJFrame
     */
    public NovoProdutoJFrame() {
        this.setModal(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMedidas = new javax.swing.ButtonGroup();
        paneInformacoesBasica = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblPrecoCusto = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        lblPrecoVenda = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        rdUN = new javax.swing.JRadioButton();
        rdKG = new javax.swing.JRadioButton();
        rdLT = new javax.swing.JRadioButton();
        lblMedida = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigoPesonalizado = new javax.swing.JLabel();
        txtCodigoPesonalizado = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        paneDetalhes = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        scrollDescricao = new javax.swing.JScrollPane();
        txtArDescricao = new javax.swing.JTextArea();
        paneImagem = new javax.swing.JPanel();
        btnSelecionar = new javax.swing.JButton();
        lblObs = new javax.swing.JLabel();
        paneFichaTecnica = new javax.swing.JPanel();
        scrollInsumos = new javax.swing.JScrollPane();
        tableInsumos = new javax.swing.JTable();
        lblInsumos = new javax.swing.JLabel();
        comboInsumos = new javax.swing.JComboBox<>();
        spinnerQuantidade = new javax.swing.JSpinner();
        lblQuantidade = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        paneEstoque = new javax.swing.JPanel();
        checkEstoqueControlado = new javax.swing.JCheckBox();
        lblEstoqueMinimo = new javax.swing.JLabel();
        txtEstoqueMinimo = new javax.swing.JTextField();
        lblEstoqueAtual = new javax.swing.JLabel();
        txtEstoqueAtual = new javax.swing.JTextField();
        paneTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        scrollEstoque = new javax.swing.JScrollPane();
        tableEstoque = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Produto");

        paneInformacoesBasica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNome.setText("Nome:");

        lblCategoria.setText("Categoria:");

        lblPrecoCusto.setText("Preço de Custo:");

        lblPrecoVenda.setText("Preço de Venda:");

        buttonGroupMedidas.add(rdUN);
        rdUN.setText("UN");

        buttonGroupMedidas.add(rdKG);
        rdKG.setText("KG");
        rdKG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdKGActionPerformed(evt);
            }
        });

        buttonGroupMedidas.add(rdLT);
        rdLT.setText("LT");

        lblMedida.setText("Medida:");

        lblCodigo.setText("Código:");

        lblCodigoPesonalizado.setText("Cód. Personalizado:");

        javax.swing.GroupLayout paneInformacoesBasicaLayout = new javax.swing.GroupLayout(paneInformacoesBasica);
        paneInformacoesBasica.setLayout(paneInformacoesBasicaLayout);
        paneInformacoesBasicaLayout.setHorizontalGroup(
            paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesBasicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecoCusto)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneInformacoesBasicaLayout.createSequentialGroup()
                        .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoVenda)))
                .addGap(30, 30, 30)
                .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInformacoesBasicaLayout.createSequentialGroup()
                        .addComponent(lblMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdUN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdKG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdLT))
                    .addGroup(paneInformacoesBasicaLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoPesonalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPesonalizado)))
                .addContainerGap())
        );
        paneInformacoesBasicaLayout.setVerticalGroup(
            paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesBasicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoPesonalizado)
                    .addComponent(txtCodigoPesonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdUN)
                        .addComponent(rdKG)
                        .addComponent(rdLT)
                        .addComponent(lblMedida))
                    .addGroup(paneInformacoesBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrecoCusto)
                        .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrecoVenda)
                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblDescricao.setText("Descrição:");

        txtArDescricao.setColumns(20);
        txtArDescricao.setRows(5);
        scrollDescricao.setViewportView(txtArDescricao);

        paneImagem.setBackground(new java.awt.Color(204, 204, 204));
        paneImagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem / Foto"));

        btnSelecionar.setText("Selecionar");

        lblObs.setText("Recomendado: 600 x 400 pixels");

        javax.swing.GroupLayout paneImagemLayout = new javax.swing.GroupLayout(paneImagem);
        paneImagem.setLayout(paneImagemLayout);
        paneImagemLayout.setHorizontalGroup(
            paneImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImagemLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lblObs)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneImagemLayout.setVerticalGroup(
            paneImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImagemLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(lblObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionar)
                .addContainerGap())
        );

        javax.swing.GroupLayout paneDetalhesLayout = new javax.swing.GroupLayout(paneDetalhes);
        paneDetalhes.setLayout(paneDetalhesLayout);
        paneDetalhesLayout.setHorizontalGroup(
            paneDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(paneImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneDetalhesLayout.setVerticalGroup(
            paneDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDetalhesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneDetalhesLayout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paneImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mais Detalhes", paneDetalhes);

        tableInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome do Produto", "Qtde.", "Medida", "Custo", "% do Custo", "Excluir"
            }
        ));
        scrollInsumos.setViewportView(tableInsumos);

        lblInsumos.setText("Insumos:");

        comboInsumos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblQuantidade.setText("Quantidade:");

        btnAdicionar.setText("Adicionar");

        btnRemover.setText("Remover");

        javax.swing.GroupLayout paneFichaTecnicaLayout = new javax.swing.GroupLayout(paneFichaTecnica);
        paneFichaTecnica.setLayout(paneFichaTecnicaLayout);
        paneFichaTecnicaLayout.setHorizontalGroup(
            paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addGroup(paneFichaTecnicaLayout.createSequentialGroup()
                        .addGroup(paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInsumos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        paneFichaTecnicaLayout.setVerticalGroup(
            paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsumos)
                    .addComponent(lblQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ficha Técnica", paneFichaTecnica);

        checkEstoqueControlado.setText("Estoque Controlado (marque esta opção se deseja controlar o estoque desde item)");

        lblEstoqueMinimo.setText("Estoque Mínimo:");

        txtEstoqueMinimo.setText("0,000");

        lblEstoqueAtual.setText("Estoque Atual:");

        txtEstoqueAtual.setText("0,000");

        paneTitulo.setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setText("Histórico de Movimentação");

        javax.swing.GroupLayout paneTituloLayout = new javax.swing.GroupLayout(paneTitulo);
        paneTitulo.setLayout(paneTituloLayout);
        paneTituloLayout.setHorizontalGroup(
            paneTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTituloLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(lblTitulo)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        paneTituloLayout.setVerticalGroup(
            paneTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Qtd", "Vl. Compra", "Data/Hora", "Usuário", "Obs."
            }
        ));
        scrollEstoque.setViewportView(tableEstoque);

        javax.swing.GroupLayout paneEstoqueLayout = new javax.swing.GroupLayout(paneEstoque);
        paneEstoque.setLayout(paneEstoqueLayout);
        paneEstoqueLayout.setHorizontalGroup(
            paneEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneEstoqueLayout.createSequentialGroup()
                .addGroup(paneEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneEstoqueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkEstoqueControlado))
                    .addGroup(paneEstoqueLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblEstoqueMinimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstoqueAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrollEstoque, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(paneTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneEstoqueLayout.setVerticalGroup(
            paneEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkEstoqueControlado)
                .addGap(18, 18, 18)
                .addGroup(paneEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstoqueMinimo)
                    .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoqueAtual)
                    .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(paneTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estoque", paneEstoque);

        btnSalvar.setText("Salvar");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paneInformacoesBasica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneInformacoesBasica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdKGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdKGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdKGActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProdutoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroupMedidas;
    private javax.swing.JCheckBox checkEstoqueControlado;
    private javax.swing.JComboBox<String> comboInsumos;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoPesonalizado;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueAtual;
    private javax.swing.JLabel lblEstoqueMinimo;
    private javax.swing.JLabel lblInsumos;
    private javax.swing.JLabel lblMedida;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paneDetalhes;
    private javax.swing.JPanel paneEstoque;
    private javax.swing.JPanel paneFichaTecnica;
    private javax.swing.JPanel paneImagem;
    private javax.swing.JPanel paneInformacoesBasica;
    private javax.swing.JPanel paneTitulo;
    private javax.swing.JRadioButton rdKG;
    private javax.swing.JRadioButton rdLT;
    private javax.swing.JRadioButton rdUN;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JScrollPane scrollEstoque;
    private javax.swing.JScrollPane scrollInsumos;
    private javax.swing.JSpinner spinnerQuantidade;
    private javax.swing.JTable tableEstoque;
    private javax.swing.JTable tableInsumos;
    private javax.swing.JTextArea txtArDescricao;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoPesonalizado;
    private javax.swing.JTextField txtEstoqueAtual;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables
}
