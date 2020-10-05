/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cru.petshop.views;

import br.com.cru.petshop.controllers.UserController;
import br.com.cru.petshop.controllers.interfaces.IUserController;
import br.com.cru.petshop.core.Dialog;
import br.com.cru.petshop.exceptions.RequiredFieldException;
import br.com.cru.petshop.models.Usuario;
import br.com.cru.petshop.models.enums.TipoUsuario;
import br.com.cru.petshop.utils.GroupButtonUtils;
import br.com.cru.petshop.validations.Validator;
import com.mysql.cj.util.StringUtils;

import java.awt.event.WindowEvent;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author jose.antonio
 */
public class NovoColaboradorJFrame extends Dialog {

    /* CONTROLLERS */
    private IUserController mUserController;
    private String mUUID = "";
    private Usuario mUsuario = new Usuario();
    
    /** Creates new form CadastroUsuarioJFrame */
    public NovoColaboradorJFrame() {
        init();
    }
    
    public NovoColaboradorJFrame(String uuid) {
        this.mUUID = uuid;
        init();
        CreateOrUpdate();
    }
    
    private void init() {
        this.setModal(true);
        initComponents();
        this.initControllers();
        this.getRootPane().setDefaultButton(btnSalvar);

        if(this.mUserController.primeiroAdm()) {
            checkPermitirAcesso.setEnabled(false);
            checkUsuarioAtivo.setEnabled(false);
            rdAdministrador.setEnabled(false);
            rdAtendente.setEnabled(false);
        }
    }
    
    
    
    private void initControllers() {
        this.mUserController = new UserController();
    }
    
    private void CreateOrUpdate(){
        if (!StringUtils.isNullOrEmpty(mUUID)) {
            mUsuario = this.mUserController.getUserByEmail(mUUID);
            mUUID = mUsuario.getIdUsuario().toString();
            txtEmail.setText(mUsuario.getEmail());
            txtNome.setText(mUsuario.getNome());
            txtFonePrincipal.setText(mUsuario.getFone());
            checkPermitirAcesso.setSelected(mUsuario.isTemAcessoAoSistema());
            checkUsuarioAtivo.setSelected(mUsuario.isAtivo());
            TipoUsuario typeUser = mUsuario.getTipoUsuario();
            if (typeUser.getValue() == TipoUsuario.ADMINISTRADOR.getValue()) rdAdministrador.setSelected(true);
            else rdAtendente.setSelected(true);
            txtLogin.disable();
            txtSenha.disable();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoUsuario = new javax.swing.ButtonGroup();
        paneInformacoes = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblFonePrincipal = new javax.swing.JLabel();
        txtFonePrincipal = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            txtFonePrincipal = new javax.swing.JFormattedTextField(data);
        }catch (Exception e){

        }
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        checkPermitirAcesso = new javax.swing.JCheckBox();
        paneTipoUsuario = new javax.swing.JPanel();
        rdAdministrador = new javax.swing.JRadioButton();
        rdAtendente = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblDicaLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblDicaSenha = new javax.swing.JLabel();
        checkUsuarioAtivo = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Colaborador");

        paneInformacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNome.setText("<html><body><span>Nome<span style='color:red;'>*</span></span></body></html>");

        lblFonePrincipal.setText("<html><body><span>Fone Principal<span style='color:red;'>*</span></span></body></html>");

        txtFonePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFonePrincipalActionPerformed(evt);
            }
        });

        lblEmail.setText("E-Mail");

        checkPermitirAcesso.setSelected(true);
        checkPermitirAcesso.setText("Permitir que essa pessoa acesse o programa");

        paneTipoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroupTipoUsuario.add(rdAdministrador);
        rdAdministrador.setSelected(true);
        rdAdministrador.setText("Administrador (acesso total ao programa)");

        buttonGroupTipoUsuario.add(rdAtendente);
        rdAtendente.setText("Atendente (permissões personalizadas)");

        javax.swing.GroupLayout paneTipoUsuarioLayout = new javax.swing.GroupLayout(paneTipoUsuario);
        paneTipoUsuario.setLayout(paneTipoUsuarioLayout);
        paneTipoUsuarioLayout.setHorizontalGroup(
            paneTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTipoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdAdministrador)
                    .addComponent(rdAtendente))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        paneTipoUsuarioLayout.setVerticalGroup(
            paneTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTipoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdAtendente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTipo.setText("Tipo");

        lblLogin.setText("<html><body><span>Login<span style='color:red;'>*</span></span></body></html>:");

        lblDicaLogin.setText("(Até 20 dígitos)");

        lblSenha.setText("<html><body><span>Senha<span style='color:red;'>*</span></span></body></html>:");

        lblDicaSenha.setText("(Até 12 dígitos)");

        checkUsuarioAtivo.setSelected(true);
        checkUsuarioAtivo.setText("Usuário Ativo");

        javax.swing.GroupLayout paneInformacoesLayout = new javax.swing.GroupLayout(paneInformacoes);
        paneInformacoes.setLayout(paneInformacoesLayout);
        paneInformacoesLayout.setHorizontalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFonePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(checkPermitirAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneInformacoesLayout.createSequentialGroup()
                        .addComponent(txtFonePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(paneInformacoesLayout.createSequentialGroup()
                        .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkUsuarioAtivo)
                            .addComponent(lblDicaSenha)
                            .addGroup(paneInformacoesLayout.createSequentialGroup()
                                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDicaLogin)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneInformacoesLayout.setVerticalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFonePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFonePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(checkPermitirAcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(paneTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDicaLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDicaSenha)
                .addGap(18, 18, 18)
                .addComponent(checkUsuarioAtivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFonePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFonePrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFonePrincipalActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(!StringUtils.isNullOrEmpty(mUUID)) mUsuario.setIdUsuario(UUID.fromString(mUUID));
        mUsuario.setNome(txtNome.getText());
        mUsuario.setEmail(txtEmail.getText());
        mUsuario.setFone(txtFonePrincipal.getText());
        mUsuario.setTemAcessoAoSistema(checkPermitirAcesso.isSelected());
        if(rdAdministrador.isSelected()) mUsuario.setTipoUsuario(TipoUsuario.ADMINISTRADOR);
        if(rdAtendente.isSelected()) mUsuario.setTipoUsuario(TipoUsuario.ATENDENTE);
        if(!StringUtils.isNullOrEmpty(txtLogin.getText())) mUsuario.setLogin(txtLogin.getText());
        if(!StringUtils.isNullOrEmpty(txtSenha.getText())) mUsuario.setSenha(String.valueOf(txtSenha.getPassword()));
        mUsuario.setAtivo(checkUsuarioAtivo.isSelected());
        
        try {
            if(Validator.validateForNulls(mUsuario)) {
                this.mUserController.insertAndUpdate(mUsuario);
                JOptionPane.showMessageDialog(rootPane, "Usuário e senha criado com sucesso!");
                this.dispose();
            }
        } catch (RequiredFieldException ex) {
            Logger.getLogger(NovoColaboradorJFrame.class.getName()).log(Level.SEVERE, null, ex);
            ex.notifyUserWithToast();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NovoColaboradorJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(NovoColaboradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoColaboradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoColaboradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoColaboradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoColaboradorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroupTipoUsuario;
    private javax.swing.JCheckBox checkPermitirAcesso;
    private javax.swing.JCheckBox checkUsuarioAtivo;
    private javax.swing.JLabel lblDicaLogin;
    private javax.swing.JLabel lblDicaSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFonePrincipal;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel paneInformacoes;
    private javax.swing.JPanel paneTipoUsuario;
    private javax.swing.JRadioButton rdAdministrador;
    private javax.swing.JRadioButton rdAtendente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFonePrincipal;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;

    @Override
    public void onCreate(WindowEvent evt) {

    }

    @Override
    public void onResume(WindowEvent evt) {

    }

    @Override
    public void onClose(WindowEvent evt) {

    }

    @Override
    public void onCreateControllers() {

    }

    @Override
    public void onCreateViews() {

    }
    // End of variables declaration//GEN-END:variables

}