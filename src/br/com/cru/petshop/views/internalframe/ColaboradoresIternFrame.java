package br.com.cru.petshop.views.internalframe;

import br.com.cru.petshop.controllers.UserController;
import br.com.cru.petshop.controllers.interfaces.IUserController;
import br.com.cru.petshop.core.JInternalFrameActivity;
import br.com.cru.petshop.models.Usuario;
import br.com.cru.petshop.models.enums.TipoUsuario;
import br.com.cru.petshop.views.NovoColaboradorJFrame;

import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowEvent;
import java.util.List;
import org.h2.util.StringUtils;

public class ColaboradoresIternFrame extends JInternalFrameActivity {

    private IUserController mUserController;
    private String UUID;

    public ColaboradoresIternFrame() {
        initComponents();
        initControllers();
    }

    private void initControllers() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneAcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        scrolPaneColaboradores = new javax.swing.JScrollPane();
        tableColaboradores = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Colaboradores");
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

        paneAcoes.setBackground(new java.awt.Color(204, 204, 204));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneAcoesLayout = new javax.swing.GroupLayout(paneAcoes);
        paneAcoes.setLayout(paneAcoesLayout);
        paneAcoesLayout.setHorizontalGroup(
            paneAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAcoesLayout.createSequentialGroup()
                .addContainerGap(481, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo)
                .addContainerGap())
        );
        paneAcoesLayout.setVerticalGroup(
            paneAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        tableColaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Login", "Ativo", "Tipo Usuário"
            }
        ));
        tableColaboradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableColaboradoresMouseClicked(evt);
            }
        });
        scrolPaneColaboradores.setViewportView(tableColaboradores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolPaneColaboradores, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(scrolPaneColaboradores, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        setBounds(0, 0, 631, 304);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovoColaboradorJFrame colaboradorJFrame = new NovoColaboradorJFrame();
        colaboradorJFrame.setVisible(true);
        colaboradorJFrame.setLocationRelativeTo(this);
        
        populatorTable();
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        this.populatorTable();

    }//GEN-LAST:event_formInternalFrameOpened

    private void populatorTable() {
        List<Usuario> all = this.mUserController.all();

        DefaultTableModel model = new DefaultTableModel(new String [] {
                "Nome", "Email", "Login", "Ativo", "Tipo Usuário"
        }, 0);


        for (Usuario u : all) {
            model.addRow(new Object[]{u.getNome(), u.getEmail(), u.getLogin(), u.isAtivo() ? "Sim" : "Não", TipoUsuario.get(u.getTipoUsuario())});
        }

        tableColaboradores.setModel(model);
    }

    private void tableColaboradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableColaboradoresMouseClicked
        
        btnEditar.setEnabled(true);
        
        DefaultTableModel model = (DefaultTableModel) tableColaboradores.getModel();
        
        int selectedRowIndex = tableColaboradores.getSelectedRow();
        this.UUID = model.getValueAt(selectedRowIndex, 1).toString();
        //JOptionPane.showMessageDialog(paneAcoes, model.getValueAt(selectedRowIndex, 1));
    }//GEN-LAST:event_tableColaboradoresMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!StringUtils.isNullOrEmpty(this.UUID)) {
            NovoColaboradorJFrame colaboradorJFrame = new NovoColaboradorJFrame(this.UUID);
            colaboradorJFrame.setVisible(true);
            colaboradorJFrame.setLocationRelativeTo(this);

            populatorTable();
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    @Override
    public void onCreate(WindowEvent evt) {
    }

    @Override
    public void onResume(WindowEvent evt) {
    }

    @Override
    public void onClose(WindowEvent evt) {
        populatorTable();
        btnEditar.setEnabled(false);
    }

    @Override
    public void onCreateControllers() {
        this.mUserController = new UserController();
    }

    @Override
    public void onCreateViews() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPanel paneAcoes;
    private javax.swing.JScrollPane scrolPaneColaboradores;
    private javax.swing.JTable tableColaboradores;
    // End of variables declaration//GEN-END:variables
}
