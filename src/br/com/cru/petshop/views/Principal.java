package br.com.cru.petshop.views;

import br.com.cru.petshop.controllers.UserController;
import br.com.cru.petshop.core.JFrameActivity;
import br.com.cru.petshop.database.DataBase;
import br.com.cru.petshop.utils.InternalFrameUtils;
import br.com.cru.petshop.views.internalframe.AnimaisIternFrame;
import br.com.cru.petshop.views.internalframe.AnimalInterFrame;
import br.com.cru.petshop.views.internalframe.AtendimentoIternFrame;
import br.com.cru.petshop.views.internalframe.CategoriasInterFrame;
import br.com.cru.petshop.views.internalframe.ClientesIternFrame;
import br.com.cru.petshop.views.internalframe.ColaboradoresIternFrame;
import br.com.cru.petshop.views.internalframe.FormasPagamentoInterFrame;
import br.com.cru.petshop.views.internalframe.FornecedoresInterFrame;
import br.com.cru.petshop.views.internalframe.LoginInterFrame;
import br.com.cru.petshop.views.internalframe.ServicosInterFrame;
import br.com.cru.petshop.views.internalframe.SituacaoInterFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.logging.Level;
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

    private NovoFornecedorJFrame mNovoFornecedorJFrame;
    private NovoClienteJFrame mNovoClienteJFrame;
    private NovoColaboradorJFrame mNovoColaboradorJFrame;
    private NovoAnimaisJFrame mNovoAnimalJFrame;
    private NovoAtendimentoJFrame mNovoAtendimentoJFrame;

    private ColaboradoresIternFrame mColaboradoresIternFrame;
    private ClientesIternFrame mClientesIternFrame;
    private FornecedoresInterFrame mFornecedoresInterFrame;
    private FormasPagamentoInterFrame mFormasPagamentoInterFrame;
    private AnimaisIternFrame mAnimaisIternFrame;
    private AtendimentoIternFrame mAtendimentoIternFrame;
    private ServicosInterFrame mServicosInterFrame;
    private AnimalInterFrame mAnimalInterFrame;
    private SituacaoInterFrame mSituacaoInterFrame;
    private CategoriasInterFrame mCategoriasInterFrame;

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
        btnServicos = new javax.swing.JButton();
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
        jMenuFornecedores = new javax.swing.JMenu();
        jMenuItemForneListarFornecedores = new javax.swing.JMenuItem();
        jMenuItemForneIncluirFornecedor = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemConfigColaboradores = new javax.swing.JMenuItem();
        jMenuItemConfigDadosEmpresa = new javax.swing.JMenuItem();
        jMenuItemConfigCategorias = new javax.swing.JMenuItem();
        jMenuItemConfigListaSituacao = new javax.swing.JMenuItem();
        jMenuItemConfigFormPagamento = new javax.swing.JMenuItem();
        jMenuItemConfigAnimal = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

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

        btnServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque.png"))); // NOI18N
        btnServicos.setText("Serviços");
        btnServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnServicos.setFocusable(false);
        btnServicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServicos.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnServicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosmiProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btnServicos);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        dkpContainer.setOpaque(false);
        dkpContainer.setLayout(null);
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

        jMenuFornecedores.setText("Fornecedores");

        jMenuItemForneListarFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemForneListarFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/checklist.png"))); // NOI18N
        jMenuItemForneListarFornecedores.setText("Listar Fornecedores");
        jMenuItemForneListarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemForneListarFornecedoresActionPerformed(evt);
            }
        });
        jMenuFornecedores.add(jMenuItemForneListarFornecedores);

        jMenuItemForneIncluirFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemForneIncluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemForneIncluirFornecedor.setText("Incluir um Fornecedor");
        jMenuItemForneIncluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemForneIncluirFornecedorActionPerformed(evt);
            }
        });
        jMenuFornecedores.add(jMenuItemForneIncluirFornecedor);

        jMenuBar.add(jMenuFornecedores);

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

        jMenuItemConfigDadosEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigDadosEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/building.png"))); // NOI18N
        jMenuItemConfigDadosEmpresa.setText("Dados Empresa");
        jMenuConfiguracoes.add(jMenuItemConfigDadosEmpresa);

        jMenuItemConfigCategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/list.png"))); // NOI18N
        jMenuItemConfigCategorias.setText("Categorias");
        jMenuItemConfigCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigCategoriasActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigCategorias);

        jMenuItemConfigListaSituacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigListaSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/checklist.png"))); // NOI18N
        jMenuItemConfigListaSituacao.setText("Lista de Situação");
        jMenuItemConfigListaSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigListaSituacaoActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigListaSituacao);

        jMenuItemConfigFormPagamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigFormPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/credit-card.png"))); // NOI18N
        jMenuItemConfigFormPagamento.setText("Forma de Pagamento");
        jMenuItemConfigFormPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigFormPagamentoActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigFormPagamento);

        jMenuItemConfigAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/dog.png"))); // NOI18N
        jMenuItemConfigAnimal.setText("Animal");
        jMenuItemConfigAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigAnimalActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConfigAnimal);

        jMenuBar.add(jMenuConfiguracoes);

        jMenuAjuda.setText("Ajuda");
        jMenuBar.add(jMenuAjuda);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/exit.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
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

    private void btnServicosmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosmiProdutoActionPerformed
        InternalFrameUtils.init(mServicosInterFrame, dkpContainer);
    }//GEN-LAST:event_btnServicosmiProdutoActionPerformed

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

    private void jMenuItemForneIncluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemForneIncluirFornecedorActionPerformed
        mNovoFornecedorJFrame = new NovoFornecedorJFrame();
        mNovoFornecedorJFrame.setVisible(true);
        mNovoFornecedorJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemForneIncluirFornecedorActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemConfigColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigColaboradoresActionPerformed
        InternalFrameUtils.init(mColaboradoresIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigColaboradoresActionPerformed

    private void jMenuItemClienteBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteBuscarClientesActionPerformed
        InternalFrameUtils.init(mClientesIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemClienteBuscarClientesActionPerformed

    private void jMenuItemForneListarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemForneListarFornecedoresActionPerformed
        InternalFrameUtils.init(mFornecedoresInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemForneListarFornecedoresActionPerformed

    private void jMenuItemConfigFormPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigFormPagamentoActionPerformed
        InternalFrameUtils.init(mFormasPagamentoInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigFormPagamentoActionPerformed

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

    private void jMenuItemConfigCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigCategoriasActionPerformed
        InternalFrameUtils.init(mCategoriasInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigCategoriasActionPerformed

    private void display() {
        this.setDefaultCloseOperation(Principal.EXIT_ON_CLOSE);
        //this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_HORIZ);
        this.setVisible(true);
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
                new Principal().display();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAnimais;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnAtendimento;
    private javax.swing.JButton btnBuscarAtendimento;
    private javax.swing.JButton btnServicos;
    private javax.swing.JDesktopPane dkpContainer;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuAnimais;
    private javax.swing.JMenu jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuFornecedores;
    private javax.swing.JMenuItem jMenuItemAnimaBuscarAnimais;
    private javax.swing.JMenuItem jMenuItemAnimaIncluirAnimais;
    private javax.swing.JMenuItem jMenuItemAtendimeBuscarAgendado;
    private javax.swing.JMenuItem jMenuItemAtendimeCadastrarAtendimento;
    private javax.swing.JMenuItem jMenuItemClienteBuscarClientes;
    private javax.swing.JMenuItem jMenuItemClienteIncluirCliente;
    private javax.swing.JMenuItem jMenuItemConfigAnimal;
    private javax.swing.JMenuItem jMenuItemConfigCategorias;
    private javax.swing.JMenuItem jMenuItemConfigColaboradores;
    private javax.swing.JMenuItem jMenuItemConfigDadosEmpresa;
    private javax.swing.JMenuItem jMenuItemConfigFormPagamento;
    private javax.swing.JMenuItem jMenuItemConfigListaSituacao;
    private javax.swing.JMenuItem jMenuItemForneIncluirFornecedor;
    private javax.swing.JMenuItem jMenuItemForneListarFornecedores;
    private javax.swing.JMenu jMenuSair;
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onCreateControllers() {
        this.mUserController = new UserController();
    }

    @Override
    public void onCreateViews() {

        this.mNovoFornecedorJFrame = new NovoFornecedorJFrame();
        this.mNovoClienteJFrame = new NovoClienteJFrame();
        this.mNovoColaboradorJFrame = new NovoColaboradorJFrame();
        this.mNovoAnimalJFrame = new NovoAnimaisJFrame();
        this.mNovoAtendimentoJFrame = new NovoAtendimentoJFrame();

        this.mClientesIternFrame = new ClientesIternFrame();
        this.mFornecedoresInterFrame = new FornecedoresInterFrame();
        this.mFormasPagamentoInterFrame = new FormasPagamentoInterFrame();
        this.mAnimaisIternFrame = new AnimaisIternFrame();
        this.mAtendimentoIternFrame = new AtendimentoIternFrame();
        this.mServicosInterFrame = new ServicosInterFrame();
        this.mAnimalInterFrame = new AnimalInterFrame();
        this.mSituacaoInterFrame = new SituacaoInterFrame();
        this.mCategoriasInterFrame = new CategoriasInterFrame();                   
        this.mColaboradoresIternFrame = new ColaboradoresIternFrame();

    }
}
