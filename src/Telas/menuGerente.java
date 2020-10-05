package Telas;

/**
 * Janela menu da aplicação
 *
 * @author Juliano
 */
public class menuGerente extends javax.swing.JFrame {
    
    int codigoUsuario;
    
    
    public menuGerente() {
        initComponents();
    }

    public void recebe(int c){
        codigoUsuario = c;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btUsuario = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btEstoque = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerente");
        setExtendedState(MAXIMIZED_BOTH);

        toolBar.setFloatable(false);

        btUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        btUsuario.setText("Usuario");
        btUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUsuario.setFocusable(false);
        btUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUsuario.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariomiSairActionPerformed(evt);
            }
        });
        toolBar.add(btUsuario);

        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N
        btVenda.setText("Vendas");
        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVenda.setFocusable(false);
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btVenda);

        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compra.png"))); // NOI18N
        btCompra.setText("Compras");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompramiVendaActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFornecedor.setFocusable(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedormiProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btFornecedor);

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

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        mostraClientes c = new mostraClientes();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        mostraVendas v = new mostraVendas();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_miSairActionPerformed

    private void btEstoquemiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoquemiProdutoActionPerformed
        mostraEstoque c = new mostraEstoque();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btEstoquemiProdutoActionPerformed

    private void btUsuariomiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariomiSairActionPerformed
        CadastroUsuario c = new CadastroUsuario();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btUsuariomiSairActionPerformed

    private void btCompramiVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompramiVendaActionPerformed
        mostraCompras c = new mostraCompras();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btCompramiVendaActionPerformed

    private void btFornecedormiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedormiProdutoActionPerformed
        mostraFornecedores c = new mostraFornecedores();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btFornecedormiProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConfigLogin c = new ConfigLogin();
        desktopPane.add(c);
        c.setVisible(true);
        c.recebeC(codigoUsuario);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btEstoque;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton btVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
