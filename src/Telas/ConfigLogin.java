package Telas;


import Classes.Usuario;
import DAO.UsuarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Janela de cadastro de produto
 *
 * @author Juliano
 */
public class ConfigLogin extends javax.swing.JInternalFrame {

    private Usuario u = null;
    private UsuarioDAO ud = new UsuarioDAO();
    int codU;
    menuGerente mg;

    public ConfigLogin() {
        initComponents();
    }
    
    public void recebeC(int c){
        codU = c;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnConteudo = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbPrecoCompra = new javax.swing.JLabel();
        lbPrecoCompra1 = new javax.swing.JLabel();
        lbPrecoCompra2 = new javax.swing.JLabel();
        senhaN2 = new javax.swing.JTextField();
        senhaN = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        senhaA = new javax.swing.JTextField();
        pnBarraFerramentas = new javax.swing.JPanel();
        barraFerramentas = new javax.swing.JToolBar();
        btSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuários");

        pnConteudo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnConteudo.setLayout(new java.awt.BorderLayout());

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);

        lbNome.setText("Login:");

        lbPrecoCompra.setText("Senha Antiga:");

        lbPrecoCompra1.setText("Nova Senha:");

        lbPrecoCompra2.setText("Confirmar Senha:");

        senhaN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaN2KeyTyped(evt);
            }
        });

        senhaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaNKeyTyped(evt);
            }
        });

        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginKeyTyped(evt);
            }
        });

        senhaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrecoCompra2)
                    .addComponent(lbPrecoCompra1)
                    .addComponent(lbPrecoCompra)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaN2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecoCompra)
                    .addComponent(senhaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecoCompra1)
                    .addComponent(senhaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecoCompra2)
                    .addComponent(senhaN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnConteudo.add(pnForm, java.awt.BorderLayout.PAGE_START);

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setOpaque(false);

        barraFerramentas.setFloatable(false);

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

        javax.swing.GroupLayout pnBarraFerramentasLayout = new javax.swing.GroupLayout(pnBarraFerramentas);
        pnBarraFerramentas.setLayout(pnBarraFerramentasLayout);
        pnBarraFerramentasLayout.setHorizontalGroup(
            pnBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBarraFerramentasLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        pnBarraFerramentasLayout.setVerticalGroup(
            pnBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBarraFerramentasLayout.createSequentialGroup()
                .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pnConteudo.add(pnBarraFerramentas, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(validaForm()){
            try {
                u = ud.pegaUsuario(codU);
                if(login.getText().equals(u.getLogin()) & senhaA.getText().equals(u.getSenha())){
                    if(senhaN.getText().equals(senhaN2.getText())){
                        u.setSenha(senhaN.getText());
                        ud.alterar2(u);
                        login.setText("");
                        senhaA.setText("");
                        senhaN.setText("");
                        senhaN2.setText("");
                        JOptionPane.showMessageDialog(null,"Senha Alterada com sucesso");
                        login.requestFocus();
                    }else JOptionPane.showMessageDialog(null,"Senhas Diferentes");
                }else JOptionPane.showMessageDialog(null,"Login e/ou Senha Inválidos");
            } catch (Exception ex) {
                Logger.getLogger(ConfigLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void loginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyTyped
        if(login.getText().length()>=20) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_loginKeyTyped

    private void senhaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaAKeyTyped
        if(senhaA.getText().length()>=20) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_senhaAKeyTyped

    private void senhaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaNKeyTyped
        if(senhaN.getText().length()>=20) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_senhaNKeyTyped

    private void senhaN2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaN2KeyTyped
        if(senhaN2.getText().length()>=20) {
            evt.setKeyChar((char)27);
        }
    }//GEN-LAST:event_senhaN2KeyTyped

    private boolean validaForm(){
        if(login.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Campo Login Vazio", "Alerta", JOptionPane.WARNING_MESSAGE);
            login.requestFocus();
            return false;
        }
        if(senhaA.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Campo Senha Vazio", "Alerta", JOptionPane.WARNING_MESSAGE);
            senhaA.requestFocus();
            return false;
        }
        if(senhaN.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Campo Nova Senha Vazio", "Alerta", JOptionPane.WARNING_MESSAGE);
            senhaN.requestFocus();
            return false;
        }
        if(senhaN2.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Campo Senha de Confirmação", "Alerta", JOptionPane.WARNING_MESSAGE);
            senhaN2.requestFocus();
            return false;
        }
        
        return true;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPrecoCompra;
    private javax.swing.JLabel lbPrecoCompra1;
    private javax.swing.JLabel lbPrecoCompra2;
    private javax.swing.JTextField login;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JTextField senhaA;
    private javax.swing.JTextField senhaN;
    private javax.swing.JTextField senhaN2;
    // End of variables declaration//GEN-END:variables
}
