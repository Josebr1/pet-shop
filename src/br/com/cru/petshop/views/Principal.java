package br.com.cru.petshop.views;

import br.com.cru.petshop.controllers.UserController;
import br.com.cru.petshop.core.JFrameActivity;
import br.com.cru.petshop.database.DataBase;
import br.com.cru.petshop.utils.InternalFrameUtils;
import br.com.cru.petshop.views.internalframe.AnimaisIternFrame;
import br.com.cru.petshop.views.internalframe.AnimalInterFrame;
import br.com.cru.petshop.views.internalframe.AtendimentoIternFrame;
import br.com.cru.petshop.views.internalframe.ClientesIternFrame;
import br.com.cru.petshop.views.internalframe.ColaboradoresIternFrame;
import br.com.cru.petshop.views.internalframe.LoginInterFrame;
import br.com.cru.petshop.views.internalframe.SituacaoInterFrame;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * Janela menu da aplicação
 *
 * @author Juliano
 */
public class Principal extends JFrameActivity {

    static Logger log = Logger.getLogger(
                      Principal.class.getName());
    
    int codigoUsuario;

    private NovoClienteJFrame mNovoClienteJFrame;
    private NovoColaboradorJFrame mNovoColaboradorJFrame;
    private NovoAnimaisJFrame mNovoAnimalJFrame;
    private NovoAtendimentoJFrame mNovoAtendimentoJFrame;

    private ColaboradoresIternFrame mColaboradoresIternFrame;
    private ClientesIternFrame mClientesIternFrame;
    private AnimaisIternFrame mAnimaisIternFrame;
    private AtendimentoIternFrame mAtendimentoIternFrame;
    private AnimalInterFrame mAnimalInterFrame;
    private SituacaoInterFrame mSituacaoInterFrame;

    /*CONTROLLERS*/
    private UserController mUserController;
    
    public Principal() {
        initComponents();
    }

    public void recebe(int c) {
        codigoUsuario = c;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnAdicionarCliente = new javax.swing.JButton();
        btnAdicionarAnimais = new javax.swing.JButton();
        btnBuscarAtendimento = new javax.swing.JButton();
        btnAtendimento = new javax.swing.JButton();
        dkpContainer = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemClienteBuscarClientes = new javax.swing.JMenuItem();
        jMenuItemClienteIncluirCliente = new javax.swing.JMenuItem();
        jMenuAnimais = new javax.swing.JMenu();
        jMenuItemAnimaBuscarAnimais = new javax.swing.JMenuItem();
        jMenuItemAnimaIncluirAnimais = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenu();
        jMenuItemAtendimeBuscarAgendado = new javax.swing.JMenuItem();
        jMenuItemAtendimeCadastrarAtendimento = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemConfigColaboradores = new javax.swing.JMenuItem();
        jMenuItemConfigListaSituacao = new javax.swing.JMenuItem();
        jMenuItemConfigAnimal = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        menuItemManual = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetShop");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);

        toolBar.setFloatable(false);

        btnAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/man-32.png"))); // NOI18N
        btnAdicionarCliente.setText("Adicionar Cliente");
        btnAdicionarCliente.setToolTipText("Adicionar Cliente");
        btnAdicionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdicionarCliente.setFocusable(false);
        btnAdicionarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionarCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnAdicionarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btnAdicionarCliente);

        btnAdicionarAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/tracks-32.png"))); // NOI18N
        btnAdicionarAnimais.setText("Adicionar Animais");
        btnAdicionarAnimais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdicionarAnimais.setFocusable(false);
        btnAdicionarAnimais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionarAnimais.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnAdicionarAnimais.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdicionarAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAnimaismiSairActionPerformed(evt);
            }
        });
        toolBar.add(btnAdicionarAnimais);

        btnBuscarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/attendance-32.png"))); // NOI18N
        btnBuscarAtendimento.setText("Adicionar Atendimento");
        btnBuscarAtendimento.setToolTipText("Buscar Atendimento");
        btnBuscarAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarAtendimento.setFocusable(false);
        btnBuscarAtendimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarAtendimento.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnBuscarAtendimento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarAtendimento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAtendimentomiVendaActionPerformed(evt);
            }
        });
        toolBar.add(btnBuscarAtendimento);

        btnAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/checklist-32.png"))); // NOI18N
        btnAtendimento.setText("Buscar Atendimento");
        btnAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtendimento.setFocusable(false);
        btnAtendimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtendimento.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnAtendimento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtendimento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btnAtendimento);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        dkpContainer.setOpaque(false);
        getContentPane().add(dkpContainer, java.awt.BorderLayout.CENTER);

        jMenuClientes.setText("Clientes");

        jMenuItemClienteBuscarClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemClienteBuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/search-engine.png"))); // NOI18N
        jMenuItemClienteBuscarClientes.setText("Buscar clientes");
        jMenuItemClienteBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteBuscarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemClienteBuscarClientes);

        jMenuItemClienteIncluirCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemClienteIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemClienteIncluirCliente.setText("Incluir cliente");
        jMenuItemClienteIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteIncluirClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemClienteIncluirCliente);

        jMenuBar.add(jMenuClientes);

        jMenuAnimais.setText("Animais");

        jMenuItemAnimaBuscarAnimais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAnimaBuscarAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/search-engine.png"))); // NOI18N
        jMenuItemAnimaBuscarAnimais.setText("Buscar Animais");
        jMenuItemAnimaBuscarAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnimaBuscarAnimaisActionPerformed(evt);
            }
        });
        jMenuAnimais.add(jMenuItemAnimaBuscarAnimais);

        jMenuItemAnimaIncluirAnimais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAnimaIncluirAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemAnimaIncluirAnimais.setText("Incluir Animais");
        jMenuItemAnimaIncluirAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnimaIncluirAnimaisActionPerformed(evt);
            }
        });
        jMenuAnimais.add(jMenuItemAnimaIncluirAnimais);

        jMenuBar.add(jMenuAnimais);

        jMenuAtendimento.setText("Atendimento");

        jMenuItemAtendimeBuscarAgendado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAtendimeBuscarAgendado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/search-engine.png"))); // NOI18N
        jMenuItemAtendimeBuscarAgendado.setText("Buscar Atendimento Agendado");
        jMenuItemAtendimeBuscarAgendado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtendimeBuscarAgendadoActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAtendimeBuscarAgendado);

        jMenuItemAtendimeCadastrarAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAtendimeCadastrarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemAtendimeCadastrarAtendimento.setText("Cadastrar atendimento");
        jMenuItemAtendimeCadastrarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtendimeCadastrarAtendimentoActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAtendimeCadastrarAtendimento);

        jMenuBar.add(jMenuAtendimento);

        jMenuConfiguracoes.setText("Configurações");

        jMenuItemConfigColaboradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemConfigColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/teamwork.png"))); // NOI18N
        jMenuItemConfigColaboradores.setText("Colaboradores");
        jMenuItemConfigColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigColaboradoresActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigColaboradores);

        jMenuItemConfigListaSituacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigListaSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/checklist.png"))); // NOI18N
        jMenuItemConfigListaSituacao.setText("Lista de Situação");
        jMenuItemConfigListaSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigListaSituacaoActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigListaSituacao);

        jMenuItemConfigAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/dog.png"))); // NOI18N
        jMenuItemConfigAnimal.setText("Tipo Animal");
        jMenuItemConfigAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigAnimalActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigAnimal);

        jMenuBar.add(jMenuConfiguracoes);

        jMenuAjuda.setText("Ajuda");

        menuItemManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/question.png"))); // NOI18N
        menuItemManual.setText("Manual de ajuda");
        menuItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemManualActionPerformed(evt);
            }
        });
        jMenuAjuda.add(menuItemManual);

        jMenuBar.add(jMenuAjuda);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/exit.png"))); // NOI18N
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(menuItemSair);

        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(1000, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        mNovoClienteJFrame = new NovoClienteJFrame();
        mNovoClienteJFrame.setVisible(true);
        mNovoClienteJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        InternalFrameUtils.init(mAtendimentoIternFrame, dkpContainer);
    }//GEN-LAST:event_miVendaActionPerformed

    private void btnAdicionarAnimaismiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAnimaismiSairActionPerformed
        mNovoAnimalJFrame = new NovoAnimaisJFrame();
        mNovoAnimalJFrame.setVisible(true);
        mNovoAnimalJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnAdicionarAnimaismiSairActionPerformed

    private void btnBuscarAtendimentomiVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAtendimentomiVendaActionPerformed
        mNovoAtendimentoJFrame = new NovoAtendimentoJFrame();
        mNovoAtendimentoJFrame.setVisible(true);
        mNovoAtendimentoJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnBuscarAtendimentomiVendaActionPerformed

    private void jMenuItemClienteIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteIncluirClienteActionPerformed
        mNovoClienteJFrame = new NovoClienteJFrame();
        mNovoClienteJFrame.setVisible(true);
        mNovoClienteJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemClienteIncluirClienteActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemConfigColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigColaboradoresActionPerformed
        InternalFrameUtils.init(mColaboradoresIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigColaboradoresActionPerformed

    private void jMenuItemClienteBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteBuscarClientesActionPerformed
        InternalFrameUtils.init(mClientesIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemClienteBuscarClientesActionPerformed

    private void jMenuItemAnimaIncluirAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnimaIncluirAnimaisActionPerformed
        mNovoAnimalJFrame = new NovoAnimaisJFrame();
        mNovoAnimalJFrame.setVisible(true);
        mNovoAnimalJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemAnimaIncluirAnimaisActionPerformed

    private void jMenuItemAnimaBuscarAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnimaBuscarAnimaisActionPerformed
        InternalFrameUtils.init(mAnimaisIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemAnimaBuscarAnimaisActionPerformed

    private void jMenuItemAtendimeBuscarAgendadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtendimeBuscarAgendadoActionPerformed
        InternalFrameUtils.init(mAtendimentoIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemAtendimeBuscarAgendadoActionPerformed

    private void jMenuItemAtendimeCadastrarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtendimeCadastrarAtendimentoActionPerformed
        mNovoAtendimentoJFrame = new NovoAtendimentoJFrame();
        mNovoAtendimentoJFrame.setVisible(true);
        mNovoAtendimentoJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemAtendimeCadastrarAtendimentoActionPerformed

    private void jMenuItemConfigAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigAnimalActionPerformed
        InternalFrameUtils.init(mAnimalInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigAnimalActionPerformed

    private void jMenuItemConfigListaSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigListaSituacaoActionPerformed
        InternalFrameUtils.init(mSituacaoInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigListaSituacaoActionPerformed

    private void menuItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemManualActionPerformed
        try {
            Desktop dp = Desktop.getDesktop();
            dp.open(new File("src" 
                    + File.separator 
                    + "br"
                    + File.separator 
                    +"com"
                    + File.separator 
                    + "cru" 
                    + File.separator 
                    + "petshop" 
                    + File.separator 
                    + "pdfs"
                    + File.separator 
                    + "ajuda.pdf"));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemManualActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void display() throws IOException {
        this.setDefaultCloseOperation(Principal.EXIT_ON_CLOSE);
        //this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_HORIZ);
        this.setVisible(true);
        
        //Image i = new ImageIcon(ClassLoader.getSystemResource("src"+File.pathSeparator+"br"+File.pathSeparator+"com"+File.pathSeparator+"cru"+File.pathSeparator+"petshop"+File.pathSeparator+"imgs"+File.pathSeparator+"logotipo.jpg")).getImage();
        //Image i = new ImageIcon(ClassLoader.getSystemResource("/src/br/com/cru/petshop/imgs/logotipo.jpg")).getImage();        
        //Image i = new ImageIcon(getClass().getResource("/logotipo.jpg")).getImage();
//Image i = ImageIO.read(getClass().getResource("src"+File.pathSeparator+"br"+File.pathSeparator+"com"+File.pathSeparator+"cru"+File.pathSeparator+"petshop"+File.pathSeparator+"imgs"+File.pathSeparator+"logotipo.jpg"));
        //setIconImage(i);
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().display();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAnimais;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnAtendimento;
    private javax.swing.JButton btnBuscarAtendimento;
    private javax.swing.JDesktopPane dkpContainer;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuAnimais;
    private javax.swing.JMenu jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClientes;
    public static javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenuItem jMenuItemAnimaBuscarAnimais;
    private javax.swing.JMenuItem jMenuItemAnimaIncluirAnimais;
    private javax.swing.JMenuItem jMenuItemAtendimeBuscarAgendado;
    private javax.swing.JMenuItem jMenuItemAtendimeCadastrarAtendimento;
    private javax.swing.JMenuItem jMenuItemClienteBuscarClientes;
    private javax.swing.JMenuItem jMenuItemClienteIncluirCliente;
    private javax.swing.JMenuItem jMenuItemConfigAnimal;
    private javax.swing.JMenuItem jMenuItemConfigColaboradores;
    private javax.swing.JMenuItem jMenuItemConfigListaSituacao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem menuItemManual;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCreate(WindowEvent evt) {
        
    }

    @Override
    public void onResume(WindowEvent evt) {
        try {
            DataBase db = new DataBase();
            db.initialize();
            if(this.mUserController.primeiroAdm()){
                JOptionPane.showMessageDialog(rootPane, "Você precisa cadastrar um usuário administrador para conseguir acessar o sistema");
                NovoColaboradorJFrame colaboradorJFrame = new NovoColaboradorJFrame();
                colaboradorJFrame.setVisible(true);
                colaboradorJFrame.setLocationRelativeTo(this);
                colaboradorJFrame.addWindowListener(new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent e) {}
                    @Override
                    public void windowClosing(WindowEvent e) {}

                    @Override
                    public void windowClosed(WindowEvent e) {
                        if(mUserController.primeiroAdm()) {
                            log.info("Primeiro usuário administrador não cadastrado");
                            //System.exit(0);
                        }
                    }

                    @Override
                    public void windowIconified(WindowEvent e) {}
                    @Override
                    public void windowDeiconified(WindowEvent e) {}
                    @Override
                    public void windowActivated(WindowEvent e) {}
                    @Override
                    public void windowDeactivated(WindowEvent e) {}
                });
            } else {
                InternalFrameUtils.init(new LoginInterFrame(), dkpContainer);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void onClose(WindowEvent evt) {
    }

    @Override
    public void onCreateControllers() {
        this.mUserController = new UserController();
    }

    @Override
    public void onCreateViews() {

        this.mNovoClienteJFrame = new NovoClienteJFrame();
        this.mNovoColaboradorJFrame = new NovoColaboradorJFrame();
        this.mNovoAnimalJFrame = new NovoAnimaisJFrame();
        this.mNovoAtendimentoJFrame = new NovoAtendimentoJFrame();

        this.mClientesIternFrame = new ClientesIternFrame();
        this.mAnimaisIternFrame = new AnimaisIternFrame();
        this.mAtendimentoIternFrame = new AtendimentoIternFrame();
        this.mAnimalInterFrame = new AnimalInterFrame();
        this.mSituacaoInterFrame = new SituacaoInterFrame();
        this.mColaboradoresIternFrame = new ColaboradoresIternFrame();

    }
}
