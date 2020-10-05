/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.views.internalframe;

import br.com.cru.petshop.controllers.ContaReceberController;
import br.com.cru.petshop.controllers.interfaces.IContaReceberController;
import br.com.cru.petshop.models.ContaReceber;
import br.com.cru.petshop.models.Usuario;
import br.com.cru.petshop.models.enums.TipoUsuario;
import br.com.cru.petshop.views.NovaContaReceberJFrame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose.antonio
 */
public class ContasReceberInterFrame extends javax.swing.JInternalFrame {

    private IContaReceberController mContaReceberController;
    
    /**
     * Creates new form ContasReceberInterFrame
     */
    public ContasReceberInterFrame() {
        initComponents();
        this.mContaReceberController = new ContaReceberController();
    }

    private void populatorTable() {
        List<ContaReceber> all = this.mContaReceberController.all();

        DefaultTableModel model = new DefaultTableModel(new String [] {
                "Tipo", "Valor Previsto", "%Tava", "Valor Líq.", "Forma Pagamento", "Pagamento", "Crédito", "% do Total do Pedido"
        }, 0);


        for (ContaReceber u : all) {
            model.addRow(new Object[]{u.getTipoConta(), u.getValor(), 0.0, 0.0, u.getFormaPagamento().getDescricao(), 0.0, u.getDataCredito(), 0.0});
        }

        tableContas.setModel(model);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneOpcoes = new javax.swing.JPanel();
        lblPesquisarContasReceber = new javax.swing.JLabel();
        lblSelecionarPeriodo = new javax.swing.JLabel();
        btnMes = new javax.swing.JButton();
        btnHoje = new javax.swing.JButton();
        btnMenos30Dias = new javax.swing.JButton();
        btnMais30Dias = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        datePickerDe = new org.jdesktop.swingx.JXDatePicker();
        datePickerA = new org.jdesktop.swingx.JXDatePicker();
        lblDe = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        paneHeader = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        scrollConta = new javax.swing.JScrollPane();
        tableContas = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Contas a Receber");
        setToolTipText("Contas a Receber");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        paneOpcoes.setBackground(new java.awt.Color(204, 204, 204));

        lblPesquisarContasReceber.setText("Pesquisar Contas a Receber");

        lblSelecionarPeriodo.setText("Selecione o Período:");

        btnMes.setText("Mês");

        btnHoje.setText("Hoje");

        btnMenos30Dias.setText("-30 Dias");

        btnMais30Dias.setText("+30 Dias");

        btnPesquisar.setText("Pesquisar");

        lblDe.setText("De");

        lblA.setText("à");

        javax.swing.GroupLayout paneOpcoesLayout = new javax.swing.GroupLayout(paneOpcoes);
        paneOpcoes.setLayout(paneOpcoesLayout);
        paneOpcoesLayout.setHorizontalGroup(
            paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneOpcoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneOpcoesLayout.createSequentialGroup()
                        .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMenos30Dias, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(btnMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMais30Dias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(paneOpcoesLayout.createSequentialGroup()
                        .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPesquisarContasReceber)
                            .addComponent(lblSelecionarPeriodo)
                            .addGroup(paneOpcoesLayout.createSequentialGroup()
                                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblA)
                                    .addComponent(lblDe))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datePickerA, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datePickerDe, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneOpcoesLayout.setVerticalGroup(
            paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisarContasReceber)
                .addGap(26, 26, 26)
                .addComponent(lblSelecionarPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMes)
                    .addComponent(btnHoje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenos30Dias)
                    .addComponent(btnMais30Dias))
                .addGap(18, 18, 18)
                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA))
                .addGap(191, 191, 191)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        paneHeader.setBackground(new java.awt.Color(153, 153, 153));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        javax.swing.GroupLayout paneHeaderLayout = new javax.swing.GroupLayout(paneHeader);
        paneHeader.setLayout(paneHeaderLayout);
        paneHeaderLayout.setHorizontalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo)
                .addContainerGap())
        );
        paneHeaderLayout.setVerticalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneHeaderLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        tableContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Valor Previsto", "%Taxa", "Valor Líq.", "Forma Pagamento", "Pagamento", "Crédito", "% do Total do Pedido"
            }
        ));
        scrollConta.setViewportView(tableContas);

        txtTotal.setText("0,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollConta, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollConta, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovaContaReceberJFrame contaReceberJFrame = new NovaContaReceberJFrame();
        contaReceberJFrame.setVisible(true);
        contaReceberJFrame.setLocationRelativeTo(null);
        contaReceberJFrame.addWindowListener(new CallbackUpdateTable());
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        populatorTable();
    }//GEN-LAST:event_formInternalFrameOpened


    private class CallbackUpdateTable implements WindowListener {
        @Override
        public void windowOpened(WindowEvent windowEvent) {

        }

        @Override
        public void windowClosing(WindowEvent windowEvent) {

        }

        @Override
        public void windowClosed(WindowEvent windowEvent) {
            populatorTable();
            btnEditar.setEnabled(false);
        }

        @Override
        public void windowIconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeiconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowActivated(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeactivated(WindowEvent windowEvent) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHoje;
    private javax.swing.JButton btnMais30Dias;
    private javax.swing.JButton btnMenos30Dias;
    private javax.swing.JButton btnMes;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private org.jdesktop.swingx.JXDatePicker datePickerA;
    private org.jdesktop.swingx.JXDatePicker datePickerDe;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblPesquisarContasReceber;
    private javax.swing.JLabel lblSelecionarPeriodo;
    private javax.swing.JPanel paneHeader;
    private javax.swing.JPanel paneOpcoes;
    private javax.swing.JScrollPane scrollConta;
    private javax.swing.JTable tableContas;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
