package Telas;

import Classes.validaCnpj;
import Classes.Fornecedor;
import DAO.FornecedorDAO;
import Models.FornecedorTableModel;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 * Janela de cadastro de fornecedor
 *
 * @author Juliano
 */
public class CadastroFornecedor extends javax.swing.JInternalFrame {

    private Fornecedor fornecedor = null;
    private FornecedorDAO fornecedorDAO = new FornecedorDAO();
    String iBairro;
    String iEndereco;

    public CadastroFornecedor() {
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
        lbCnpj = new javax.swing.JLabel();
        ftfNome = new javax.swing.JFormattedTextField();
        ftfCnpj = new javax.swing.JTextField();
        tfFiltro = new javax.swing.JTextField();
        btFiltro = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        telefone1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        telefone2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        complemento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Fornecedores");

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

        lbCnpj.setText("CNPJ:");

        ftfNome.setColumns(25);
        ftfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfNomeKeyTyped(evt);
            }
        });

        ftfCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfCnpjKeyTyped(evt);
            }
        });

        tfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltroActionPerformed(evt);
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

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        jLabel1.setText("Email: ");

        try {
            telefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone: ");

        jLabel3.setText("Telefone (opc): ");

        try {
            telefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Endereço:");

        endereco.setEditable(false);
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        jLabel5.setText("Complemento:");

        complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoActionPerformed(evt);
            }
        });
        complemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                complementoKeyTyped(evt);
            }
        });

        jLabel6.setText("Bairro:");

        bairro.setEditable(false);
        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });

        jLabel7.setText("CEP: ");

        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });
        cep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnFormLayout.createSequentialGroup()
                                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 130, Short.MAX_VALUE))
                                    .addGroup(pnFormLayout.createSequentialGroup()
                                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(complemento))))
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnFormLayout.createSequentialGroup()
                                        .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbCnpj))
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCnpj)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnConteudo.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new FornecedorTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        pnConteudo.add(spGrade, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 660, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        fornecedor = new Fornecedor();
        habilitarFormulario(true);
        btExcluir.setEnabled(false);
        tfFiltro.setEnabled(false);
        tbGrade.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validarFormulario()) {
            if(validaCnpj.isCnpj(ftfCnpj.getText()) == true){
            
                fornecedor.setNome(ftfNome.getText().trim());
                fornecedor.setCnpj( ftfCnpj.getText());
                fornecedor.setEmail(email.getText());
                fornecedor.setTelefone1(telefone1.getText());
                fornecedor.setTelefone2(telefone2.getText());
                fornecedor.setEndereco(endereco.getText());
                fornecedor.setComplemento(complemento.getText());
                fornecedor.setBairro(bairro.getText());
                fornecedor.setCep(cep.getText());

            if (fornecedor.getCodigo() == 0) {
                try {
                    fornecedorDAO.inserir(fornecedor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o fornecedor.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    fornecedorDAO.alterar(fornecedor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o fornecedor.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
        else JOptionPane.showMessageDialog(null, " CNPJ INVÁLIDO ");
            
            
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o fornecedor " + fornecedor + "?");
        if (opcao == 0) {
            try {
                fornecedorDAO.excluir(fornecedor);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o fornecedor.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            FornecedorTableModel tm = (FornecedorTableModel) tbGrade.getModel();
            fornecedor = tm.getRowValue(tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow()));

            ftfNome.setValue(fornecedor.getNome());
            ftfCnpj.setText(fornecedor.getCnpj());
            email.setText(fornecedor.getEmail());
            telefone1.setText(fornecedor.getTelefone1());
            telefone2.setText(fornecedor.getTelefone2());
            endereco.setText(fornecedor.getEndereco());
            complemento.setText(fornecedor.getComplemento());
            bairro.setText(fornecedor.getBairro());
            cep.setText(fornecedor.getCep());

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
        btNovo.setEnabled(false);
        btCancelar.setEnabled(true);
    }//GEN-LAST:event_btFiltroActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoActionPerformed

    private void cepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepKeyReleased
        endereco.setText("Aguarde...");
        bairro.setText("Aguarde...");
        if(cep.getText().length() == 8){
            buscarCep(cep.getText());
        }
    }//GEN-LAST:event_cepKeyReleased

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void telefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1ActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroActionPerformed

    private void tfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFiltroActionPerformed

    private void ftfCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfCnpjKeyTyped
        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9' || ftfCnpj.getText().length()>=14) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_ftfCnpjKeyTyped

    private void ftfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfNomeKeyTyped
        if(ftfNome.getText().length()>=30) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_ftfNomeKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        if(email.getText().length()>=30) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_emailKeyTyped

    private void cepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepKeyTyped
        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9' ||cep.getText().length()>=8) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_cepKeyTyped

    private void complementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_complementoKeyTyped
        if(complemento.getText().length()>=30) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_complementoKeyTyped

    private void habilitarFormulario(boolean ativo) {
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        ftfNome.setEnabled(ativo);
        ftfCnpj.setEnabled(ativo);
        email.setEnabled(ativo);
        telefone1.setEnabled(ativo);
        telefone2.setEnabled(ativo);
        endereco.setEnabled(ativo);
        complemento.setEnabled(ativo);
        bairro.setEnabled(ativo);
        cep.setEnabled(ativo);
        tbGrade.setEnabled(!ativo);
        tfFiltro.setEnabled(ativo);
        btFiltro.setEnabled(!ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        fornecedor = null;
        ftfNome.setValue("");
        ftfCnpj.setText("");
        email.setText("");
        telefone1.setText("");
        telefone2.setText("");;
        endereco.setText("");
        complemento.setText("");
        bairro.setText("");
        cep.setText("");
    }
    
    public void buscarCep(String cep) {
        String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            // JOptionPane.showMessageDialog(null, json);
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            // JOptionPane.showMessageDialog(null, array);
                             
            iEndereco = array[7];            
            iBairro = array[15];
            
            endereco.setText(iEndereco);
            bairro.setText(iBairro);
            /*
            jTxtLogradouro.setText(logradouro);
            jTxtBairro.setText(bairro);
            jTxtCidade.setText(cidade);
            jTxtEstado.setText(uf);*/
            //JOptionPane.showMessageDialog(null, logradouro + " " + bairro + " " + cidade + " " + uf);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean validarEmail(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }


    private boolean validarFormulario() {
        
        if(ftfNome.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Insira o Nome");
            return false;
        }
        if(ftfCnpj.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Insira o CNPJ");
            return false;
        }
        if(email.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Insira o E-mail");
            return false;
        }
        if(validarEmail(email.getText()) == false){
            JOptionPane.showMessageDialog(null, "E-mail Inválido");
            return false;
        } 
        if(cep.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Insira o CEP");
            return false;
        }
        if(complemento.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Insira o Complemento");
            return false;
        }
        
        return true;
    }

    private void carregarGrade() {
        FornecedorTableModel tm = (FornecedorTableModel) tbGrade.getModel();
        try {
            tm.setDados(fornecedorDAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFiltro;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField ftfCnpj;
    private javax.swing.JFormattedTextField ftfNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JFormattedTextField telefone1;
    private javax.swing.JFormattedTextField telefone2;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
