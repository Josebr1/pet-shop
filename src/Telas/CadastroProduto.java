package Telas;

import Classes.Produto;
import Models.ProdutoTableModel;
import DAO.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 * Janela de cadastro de produto
 *
 * @author Juliano
 */
public class CadastroProduto extends javax.swing.JInternalFrame {

    private Produto produto = null;
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public CadastroProduto() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBarraFerramentas = new javax.swing.JPanel();
        barraFerramentas = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnConteudo = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbPrecoCompra = new javax.swing.JLabel();
        lbPrecoVenda = new javax.swing.JLabel();
        ftfPrecoCompra = new javax.swing.JFormattedTextField();
        ftfPrecoVenda = new javax.swing.JFormattedTextField();
        tfFiltro = new javax.swing.JTextField();
        btFiltro = new javax.swing.JButton();
        ftfNome = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produtos");

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setOpaque(false);
        pnBarraFerramentas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraFerramentas.setFloatable(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btSalvar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        barraFerramentas.add(btExcluir);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btCancelar);

        pnBarraFerramentas.add(barraFerramentas);

        getContentPane().add(pnBarraFerramentas, java.awt.BorderLayout.PAGE_START);

        pnConteudo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnConteudo.setLayout(new java.awt.BorderLayout());

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);

        lbNome.setText("Nome:");

        lbPrecoCompra.setText("Preço de compra:");

        lbPrecoVenda.setText("Preço de venda:");

        ftfPrecoCompra.setColumns(10);
        ftfPrecoCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftfPrecoCompra.setValue(new Double(0));
        ftfPrecoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfPrecoCompraKeyTyped(evt);
            }
        });

        ftfPrecoVenda.setColumns(10);
        ftfPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftfPrecoVenda.setValue(new Double(0));
        ftfPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfPrecoVendaKeyTyped(evt);
            }
        });

        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });

        btFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btFiltro.setToolTipText("Localizar cliente");
        btFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFiltro.setPreferredSize(new java.awt.Dimension(21, 21));
        btFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltroActionPerformed(evt);
            }
        });

        ftfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbPrecoCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbPrecoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecoCompra)
                    .addComponent(ftfPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecoVenda)
                    .addComponent(ftfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnConteudo.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new ProdutoTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        pnConteudo.add(spGrade, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 413, 427);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        produto = new Produto();
        habilitarFormulario(true);
        btExcluir.setEnabled(false);
        tfFiltro.setEnabled(false);
        tbGrade.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validarFormulario()) {
            produto.setNome(ftfNome.getText());
            produto.setPrecoCompra( Float.parseFloat(ftfPrecoCompra.getText()));
            produto.setPrecoVenda(Float.parseFloat(ftfPrecoVenda.getText()));

            if (produto.getCodigo() == 0) {
                try {
                    produtoDAO.inserir(produto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    produtoDAO.alterar(produto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o produto " + produto + "?");
        if (opcao == 0) {
            try {
                produtoDAO.excluir(produto);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {
            ProdutoTableModel tm = (ProdutoTableModel) tbGrade.getModel();
            produto = tm.getRowValue(tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow()));

            ftfNome.setText(produto.getNome());
            ftfPrecoCompra.setValue(produto.getPrecoCompra());
            ftfPrecoCompra.setValue(produto.getPrecoVenda());

            habilitarFormulario(true);
            tfFiltro.setEnabled(false);
            tfFiltro.setText("");
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyReleased
        TableRowSorter rs = (TableRowSorter) tbGrade.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfFiltro.getText(), 0, 1));
        
        
    }//GEN-LAST:event_tfFiltroKeyReleased

    private void btFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltroActionPerformed
        tfFiltro.setEnabled(true);
        btCancelar.setEnabled(true);
        btNovo.setEnabled(false);
    }//GEN-LAST:event_btFiltroActionPerformed

    private void ftfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfNomeKeyTyped
        if(ftfNome.getText().length()>=30) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_ftfNomeKeyTyped

    private void ftfPrecoVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfPrecoVendaKeyTyped
        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9' ||ftfPrecoVenda.getText().length()>=12) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_ftfPrecoVendaKeyTyped

    private void ftfPrecoCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfPrecoCompraKeyTyped
        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9' ||ftfPrecoCompra.getText().length()>=12) {
            evt.setKeyChar((char)27);
        }

    }//GEN-LAST:event_ftfPrecoCompraKeyTyped

    private void habilitarFormulario(boolean ativo) {
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        ftfNome.setEnabled(ativo);
        ftfPrecoCompra.setEnabled(ativo);
        ftfPrecoVenda.setEnabled(ativo);
        tfFiltro.setEnabled(ativo);
        btFiltro.setEnabled(!ativo);
        tbGrade.setEnabled(!ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        produto = null;
        ftfNome.setText("");
        ftfPrecoCompra.setText("");
        ftfPrecoVenda.setText("");
    }

    private boolean validarFormulario() {
        float pc = Float.parseFloat(ftfPrecoCompra.getText());
        float pv = Float.parseFloat(ftfPrecoVenda.getText());
        
        if (ftfNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nome inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        
        if(ftfPrecoCompra.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Preço de Compra Inválido", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        
        if(ftfPrecoVenda.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Preço de Venda Inválido", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        
        if(pc>pv){
            JOptionPane.showMessageDialog(this, "Preço de Compra Maior que o Preço de Venda", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        
        return true;
    }

    private void carregarGrade() {
        ProdutoTableModel tm = (ProdutoTableModel) tbGrade.getModel();
        try {
            tm.setDados(produtoDAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFiltro;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField ftfNome;
    private javax.swing.JFormattedTextField ftfPrecoCompra;
    private javax.swing.JFormattedTextField ftfPrecoVenda;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPrecoCompra;
    private javax.swing.JLabel lbPrecoVenda;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
