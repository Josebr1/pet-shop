package Telas;

/**
 * Janela menu da aplicação
 *
 * @author Juliano
 */
public class menuEstoque extends javax.swing.JFrame {

    int codigoUsuario;
    
    public menuEstoque() {
        initComponents();
    }
    
    public void recebe(int c){
        codigoUsuario = c;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btProduto = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btEstoque = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoquista");
        setExtendedState(MAXIMIZED_BOTH);

        toolBar.setFloatable(false);

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProduto.setFocusable(false);
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutomiProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btProduto);

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFornecedor.setFocusable(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btFornecedor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btFornecedor);

        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compra.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque.png"))); // NOI18N
        btEstoque.setText("Estoque");
        btEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEstoque.setFocusable(false);
        btEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEstoque.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoquemiProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btEstoque);

        jButton1.setText("Conta");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        toolBar.add(jButton1);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_miSairActionPerformed

    private void btEstoquemiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoquemiProdutoActionPerformed
        mostraEstoque c = new mostraEstoque();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btEstoquemiProdutoActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        CadastroFornecedor v = new CadastroFornecedor();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        LancamentoCompra c = new LancamentoCompra();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void btProdutomiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutomiProdutoActionPerformed
        CadastroProduto v = new CadastroProduto();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_btProdutomiProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConfigLogin c = new ConfigLogin();
        desktopPane.add(c);
        c.setVisible(true);
        c.recebeC(codigoUsuario);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btEstoque;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
