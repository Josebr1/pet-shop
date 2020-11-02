/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.views.internalframe;

import br.com.cru.petshop.controllers.AtendimentoController;
import br.com.cru.petshop.controllers.interfaces.IAtendimentoController;
import br.com.cru.petshop.core.JInternalFrameActivity;
import br.com.cru.petshop.models.Atendimento;
import br.com.cru.petshop.views.NovoClienteJFrame;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author joses
 */
public class AtendimentoIternFrame extends JInternalFrameActivity {

    private IAtendimentoController mAtendimentoController;

    private TableRowSorter<TableModel> mRowSorter;

    private int mIdAtendimento;
    
    /**
     * Creates new form ClientesIternFrame
     */
    public AtendimentoIternFrame() {
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

        paneFooter = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        scrollPaneClientes = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        paneHeader = new javax.swing.JPanel();
        txtPesquisarCliente = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Atendimento");

        paneFooter.setBackground(new java.awt.Color(102, 102, 102));

        btnImprimir.setText("Imprimir");

        javax.swing.GroupLayout paneFooterLayout = new javax.swing.GroupLayout(paneFooter);
        paneFooter.setLayout(paneFooterLayout);
        paneFooterLayout.setHorizontalGroup(
            paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneFooterLayout.setVerticalGroup(
            paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneFooterLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addContainerGap())
        );

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Animal", "Cliente", "Documento", "Data Entrada", "Retorno", "Situação"
            }
        ));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        scrollPaneClientes.setViewportView(tableClientes);

        paneHeader.setBackground(new java.awt.Color(102, 102, 102));

        txtPesquisarCliente.setText("Nome, telefone ou endereço....");
        txtPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteKeyPressed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneHeaderLayout = new javax.swing.GroupLayout(paneHeader);
        paneHeader.setLayout(paneHeaderLayout);
        paneHeaderLayout.setHorizontalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(19, 19, 19)
                .addComponent(btnNovo)
                .addContainerGap())
        );
        paneHeaderLayout.setVerticalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnEditar)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPaneClientes))
                    .addComponent(paneHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paneHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovoClienteJFrame novoClienteJFrame = new NovoClienteJFrame();
        novoClienteJFrame.setVisible(true);
	novoClienteJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        btnEditar.setEnabled(true);

        DefaultTableModel model = (DefaultTableModel) tableClientes.getModel();

        int selectedRowIndex = tableClientes.getSelectedRow();
        this.mIdAtendimento = (Integer)model.getValueAt(selectedRowIndex, 0);
    }//GEN-LAST:event_tableClientesMouseClicked

    private void txtPesquisarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyPressed
        if (txtPesquisarCliente.getText().trim().length() == 0) {
            mRowSorter.setRowFilter(null);
        } else {
            mRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtPesquisarCliente.getText()));
        }
    }//GEN-LAST:event_txtPesquisarClienteKeyPressed

    
    private void populatorTable() {
        List<Atendimento> all = this.mAtendimentoController.all();

        DefaultTableModel model = new DefaultTableModel(new String[]{
            "Codigo", "Animal", "Cliente", "Documento", "Data Entrada", "Retorno", "Situação"
        }, 0);

        for (Atendimento c : all) {
            model.addRow(new Object[]{c.getId(), c.getAnimal().getApelido(), c.getCliente().getNome(), c.getCliente().getDocumento(), c.getDataEntrega(), c.isRetorno() ? "Sim" : "Não", c.getSituacao().getDescricao()});
        }

        tableClientes.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPanel paneFooter;
    private javax.swing.JPanel paneHeader;
    private javax.swing.JScrollPane scrollPaneClientes;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtPesquisarCliente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCreate(InternalFrameEvent evt) {
        this.populatorTable();
        btnEditar.setEnabled(false);

        mRowSorter = new TableRowSorter<>(tableClientes.getModel());
        tableClientes.setRowSorter(mRowSorter);

        txtPesquisarCliente.getDocument().addDocumentListener(listenerPesquisar);

    }
    
    DocumentListener listenerPesquisar = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            String text = txtPesquisarCliente.getText();

            if (text.trim().length() == 0) {
                mRowSorter.setRowFilter(null);
            } else {
                mRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = txtPesquisarCliente.getText();

            if (text.trim().length() == 0) {
                mRowSorter.setRowFilter(null);
            } else {
                mRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    };

    @Override
    public void onResume(InternalFrameEvent evt) {
        this.populatorTable();
    }

    @Override
    public void onClose(InternalFrameEvent evt) {
        btnEditar.setEnabled(false);
    }

    @Override
    public void onCreateControllers() {
        this.mAtendimentoController = new AtendimentoController();
    }

    @Override
    public void onCreateViews() {
    }
}
