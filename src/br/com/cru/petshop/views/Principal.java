package br.com.cru.petshop.views;

import br.com.cru.petshop.core.JFrameActivity;
import br.com.cru.petshop.utils.InternalFrameUtils;
import br.com.cru.petshop.views.internalframe.AnimaisIternFrame;
import br.com.cru.petshop.views.internalframe.AnimalInterFrame;
import br.com.cru.petshop.views.internalframe.AtendimentoIternFrame;
import br.com.cru.petshop.views.internalframe.CaixaInterFrame;
import br.com.cru.petshop.views.internalframe.ClientesIternFrame;
import br.com.cru.petshop.views.internalframe.ContasPagarInterFrame;
import br.com.cru.petshop.views.internalframe.ContasReceberInterFrame;
import br.com.cru.petshop.views.internalframe.FormasPagamentoInterFrame;
import br.com.cru.petshop.views.internalframe.FornecedoresInterFrame;
import br.com.cru.petshop.views.internalframe.ProdutosInterFrame;
import br.com.cru.petshop.views.internalframe.ServicosInterFrame;
import java.awt.event.WindowEvent;

/**
 * Janela menu da aplicação
 *
 * @author Juliano
 */
public class Principal extends JFrameActivity {

    int codigoUsuario;

    private NovoFornecedorJFrame mNovoFornecedorJFrame;
    private NovoClienteJFrame mNovoClienteJFrame;
    private NovoColaboradorJFrame mNovoColaboradorJFrame;
    private NovoProdutoJFrame mNovoProdutoJFrame;
    private NovoAnimaisJFrame mNovoAnimalJFrame;
    private NovoAtendimentoJFrame mNovoAtendimentoJFrame;
    private NovaContaJFrame mNovaContaJFrame;

    private ClientesIternFrame mClientesIternFrame;
    private ContasReceberInterFrame mContasReceberInterFrame;
    private ContasPagarInterFrame mContasPagarInterFrame;
    private FornecedoresInterFrame mFornecedoresInterFrame;
    private FormasPagamentoInterFrame mFormasPagamentoInterFrame;
    private AnimaisIternFrame mAnimaisIternFrame;
    private AtendimentoIternFrame mAtendimentoIternFrame;
    private ServicosInterFrame mServicosInterFrame;
    private ProdutosInterFrame mProdutosInterFrame;
    private CaixaInterFrame mCaixaInterFrame;
    private AnimalInterFrame mAnimalInterFrame;

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
        btnProdutos = new javax.swing.JButton();
        btnServicos = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
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
        jMenuProdutosServicos = new javax.swing.JMenu();
        jMenuItemProdServListarEstoque = new javax.swing.JMenuItem();
        jMenuItemProdServIncluirProdutos = new javax.swing.JMenuItem();
        jMenuItemProdServTabelaServicos = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemFinancContasReceber = new javax.swing.JMenuItem();
        jMenuItemFinancContasPagar = new javax.swing.JMenuItem();
        jMenuItemFinancIncluirConta = new javax.swing.JMenuItem();
        jMenuItemFinancCaixa = new javax.swing.JMenuItem();
        jMenuFornecedores = new javax.swing.JMenu();
        jMenuItemForneListarFornecedores = new javax.swing.JMenuItem();
        jMenuItemForneIncluirFornecedor = new javax.swing.JMenuItem();
        jMenuItemFornePedidos = new javax.swing.JMenuItem();
        jMenuItemForneIncluirPedido = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemReContas = new javax.swing.JMenuItem();
        jMenuItemReVendas = new javax.swing.JMenuItem();
        jMenuItemReEstoque = new javax.swing.JMenuItem();
        jMenuItemReDespesas = new javax.swing.JMenuItem();
        jMenuItemReUsoSistema = new javax.swing.JMenuItem();
        jMenuItemReProdutos = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemConfigColaboradores = new javax.swing.JMenuItem();
        jMenuItemConfigDadosEmpresa = new javax.swing.JMenuItem();
        jMenuItemConfigCategorias = new javax.swing.JMenuItem();
        jMenuItemConfigListaSituacao = new javax.swing.JMenuItem();
        jMenuItemConfigContas = new javax.swing.JMenuItem();
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

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/shipping-32.png"))); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProdutos.setFocusable(false);
        btnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProdutos.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosmiProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btnProdutos);

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

        btnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/caixa-registradora-32.png"))); // NOI18N
        btnCaixa.setText("Caixa");
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCaixa.setFocusable(false);
        btnCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaixa.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btnCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixamiProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btnCaixa);

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

        jMenuProdutosServicos.setText("Produtos e Serviços");

        jMenuItemProdServListarEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProdServListarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/checklist.png"))); // NOI18N
        jMenuItemProdServListarEstoque.setText("Listar Estoque");
        jMenuItemProdServListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdServListarEstoqueActionPerformed(evt);
            }
        });
        jMenuProdutosServicos.add(jMenuItemProdServListarEstoque);

        jMenuItemProdServIncluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProdServIncluirProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemProdServIncluirProdutos.setText("Incluir Produtos");
        jMenuItemProdServIncluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdServIncluirProdutosActionPerformed(evt);
            }
        });
        jMenuProdutosServicos.add(jMenuItemProdServIncluirProdutos);

        jMenuItemProdServTabelaServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProdServTabelaServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/tablet.png"))); // NOI18N
        jMenuItemProdServTabelaServicos.setText("Tabela de Serviços");
        jMenuItemProdServTabelaServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdServTabelaServicosActionPerformed(evt);
            }
        });
        jMenuProdutosServicos.add(jMenuItemProdServTabelaServicos);

        jMenuBar.add(jMenuProdutosServicos);

        jMenuFinanceiro.setText("Financeiro");

        jMenuItemFinancContasReceber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFinancContasReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/finance.png"))); // NOI18N
        jMenuItemFinancContasReceber.setText("Contas a Receber");
        jMenuItemFinancContasReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinancContasReceberActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemFinancContasReceber);

        jMenuItemFinancContasPagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFinancContasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/finance.png"))); // NOI18N
        jMenuItemFinancContasPagar.setText("Contas a Pagar");
        jMenuItemFinancContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinancContasPagarActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemFinancContasPagar);

        jMenuItemFinancIncluirConta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFinancIncluirConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemFinancIncluirConta.setText("Incluir Conta");
        jMenuItemFinancIncluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinancIncluirContaActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemFinancIncluirConta);

        jMenuItemFinancCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFinancCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/accounting.png"))); // NOI18N
        jMenuItemFinancCaixa.setText("Caixa");
        jMenuItemFinancCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinancCaixaActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemFinancCaixa);

        jMenuBar.add(jMenuFinanceiro);

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

        jMenuItemFornePedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFornePedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/box.png"))); // NOI18N
        jMenuItemFornePedidos.setText("Pedidos");
        jMenuFornecedores.add(jMenuItemFornePedidos);

        jMenuItemForneIncluirPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemForneIncluirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/add-button.png"))); // NOI18N
        jMenuItemForneIncluirPedido.setText("Incluir Pedido");
        jMenuFornecedores.add(jMenuItemForneIncluirPedido);

        jMenuBar.add(jMenuFornecedores);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemReContas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/bank.png"))); // NOI18N
        jMenuItemReContas.setText("Contas");
        jMenuRelatorios.add(jMenuItemReContas);

        jMenuItemReVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/tag.png"))); // NOI18N
        jMenuItemReVendas.setText("Vendas");
        jMenuRelatorios.add(jMenuItemReVendas);

        jMenuItemReEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/warehouse.png"))); // NOI18N
        jMenuItemReEstoque.setText("Estoque");
        jMenuRelatorios.add(jMenuItemReEstoque);

        jMenuItemReDespesas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/expenses.png"))); // NOI18N
        jMenuItemReDespesas.setText("Despesas");
        jMenuRelatorios.add(jMenuItemReDespesas);

        jMenuItemReUsoSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReUsoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/system.png"))); // NOI18N
        jMenuItemReUsoSistema.setText("Uso do Sistema");
        jMenuRelatorios.add(jMenuItemReUsoSistema);

        jMenuItemReProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/received.png"))); // NOI18N
        jMenuItemReProdutos.setText("Produtos");
        jMenuRelatorios.add(jMenuItemReProdutos);

        jMenuBar.add(jMenuRelatorios);

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
        jMenuConfiguracoes.add(jMenuItemConfigCategorias);

        jMenuItemConfigListaSituacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigListaSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/checklist.png"))); // NOI18N
        jMenuItemConfigListaSituacao.setText("Lista de Situação");
        jMenuConfiguracoes.add(jMenuItemConfigListaSituacao);

        jMenuItemConfigContas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfigContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cru/petshop/imgs/bank.png"))); // NOI18N
        jMenuItemConfigContas.setText("Contas");
        jMenuConfiguracoes.add(jMenuItemConfigContas);

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

        pack();
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

    private void btnProdutosmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosmiProdutoActionPerformed

    }//GEN-LAST:event_btnProdutosmiProdutoActionPerformed

    private void jMenuItemClienteIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteIncluirClienteActionPerformed
        mNovoClienteJFrame = new NovoClienteJFrame();
        mNovoClienteJFrame.setVisible(true);
        mNovoClienteJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemClienteIncluirClienteActionPerformed

    private void jMenuItemFinancCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancCaixaActionPerformed
        InternalFrameUtils.init(mCaixaInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemFinancCaixaActionPerformed

    private void jMenuItemForneIncluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemForneIncluirFornecedorActionPerformed
        mNovoFornecedorJFrame = new NovoFornecedorJFrame();
        mNovoFornecedorJFrame.setVisible(true);
        mNovoFornecedorJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemForneIncluirFornecedorActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemConfigColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigColaboradoresActionPerformed
        mNovoColaboradorJFrame = new NovoColaboradorJFrame();
        mNovoColaboradorJFrame.setVisible(true);
        mNovoColaboradorJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemConfigColaboradoresActionPerformed

    private void jMenuItemClienteBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteBuscarClientesActionPerformed
        InternalFrameUtils.init(mClientesIternFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemClienteBuscarClientesActionPerformed

    private void jMenuItemProdServIncluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdServIncluirProdutosActionPerformed
        mNovoProdutoJFrame = new NovoProdutoJFrame();
        mNovoProdutoJFrame.setVisible(true);
        mNovoProdutoJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemProdServIncluirProdutosActionPerformed

    private void jMenuItemFinancContasReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancContasReceberActionPerformed
        InternalFrameUtils.init(mContasReceberInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemFinancContasReceberActionPerformed

    private void jMenuItemFinancContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancContasPagarActionPerformed
        InternalFrameUtils.init(mContasPagarInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemFinancContasPagarActionPerformed

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

    private void jMenuItemProdServTabelaServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdServTabelaServicosActionPerformed
        InternalFrameUtils.init(mServicosInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemProdServTabelaServicosActionPerformed

    private void jMenuItemProdServListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdServListarEstoqueActionPerformed
        InternalFrameUtils.init(mProdutosInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemProdServListarEstoqueActionPerformed

    private void jMenuItemFinancIncluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancIncluirContaActionPerformed
        mNovaContaJFrame = new NovaContaJFrame();
        mNovaContaJFrame.setVisible(true);
        mNovaContaJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItemFinancIncluirContaActionPerformed

    private void btnCaixamiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixamiProdutoActionPerformed
        InternalFrameUtils.init(mCaixaInterFrame, dkpContainer);
    }//GEN-LAST:event_btnCaixamiProdutoActionPerformed

    private void jMenuItemConfigAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigAnimalActionPerformed
        InternalFrameUtils.init(mAnimalInterFrame, dkpContainer);
    }//GEN-LAST:event_jMenuItemConfigAnimalActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAnimais;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnAtendimento;
    private javax.swing.JButton btnBuscarAtendimento;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnServicos;
    private javax.swing.JDesktopPane dkpContainer;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuAnimais;
    private javax.swing.JMenu jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuFinanceiro;
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
    private javax.swing.JMenuItem jMenuItemConfigContas;
    private javax.swing.JMenuItem jMenuItemConfigDadosEmpresa;
    private javax.swing.JMenuItem jMenuItemConfigFormPagamento;
    private javax.swing.JMenuItem jMenuItemConfigListaSituacao;
    private javax.swing.JMenuItem jMenuItemFinancCaixa;
    private javax.swing.JMenuItem jMenuItemFinancContasPagar;
    private javax.swing.JMenuItem jMenuItemFinancContasReceber;
    private javax.swing.JMenuItem jMenuItemFinancIncluirConta;
    private javax.swing.JMenuItem jMenuItemForneIncluirFornecedor;
    private javax.swing.JMenuItem jMenuItemForneIncluirPedido;
    private javax.swing.JMenuItem jMenuItemForneListarFornecedores;
    private javax.swing.JMenuItem jMenuItemFornePedidos;
    private javax.swing.JMenuItem jMenuItemProdServIncluirProdutos;
    private javax.swing.JMenuItem jMenuItemProdServListarEstoque;
    private javax.swing.JMenuItem jMenuItemProdServTabelaServicos;
    private javax.swing.JMenuItem jMenuItemReContas;
    private javax.swing.JMenuItem jMenuItemReDespesas;
    private javax.swing.JMenuItem jMenuItemReEstoque;
    private javax.swing.JMenuItem jMenuItemReProdutos;
    private javax.swing.JMenuItem jMenuItemReUsoSistema;
    private javax.swing.JMenuItem jMenuItemReVendas;
    private javax.swing.JMenu jMenuProdutosServicos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCreate(WindowEvent evt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onResume(WindowEvent evt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onClose(WindowEvent evt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onCreateControllers() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onCreateViews() {

        this.mNovoFornecedorJFrame = new NovoFornecedorJFrame();
        this.mNovoClienteJFrame = new NovoClienteJFrame();
        this.mNovoColaboradorJFrame = new NovoColaboradorJFrame();
        this.mNovoProdutoJFrame = new NovoProdutoJFrame();
        this.mNovoAnimalJFrame = new NovoAnimaisJFrame();
        this.mNovoAtendimentoJFrame = new NovoAtendimentoJFrame();
        this.mNovaContaJFrame = new NovaContaJFrame();

        this.mClientesIternFrame = new ClientesIternFrame();
        this.mContasReceberInterFrame = new ContasReceberInterFrame();
        this.mContasPagarInterFrame = new ContasPagarInterFrame();
        this.mFornecedoresInterFrame = new FornecedoresInterFrame();
        this.mFormasPagamentoInterFrame = new FormasPagamentoInterFrame();
        this.mAnimaisIternFrame = new AnimaisIternFrame();
        this.mAtendimentoIternFrame = new AtendimentoIternFrame();
        this.mServicosInterFrame = new ServicosInterFrame();
        this.mProdutosInterFrame = new ProdutosInterFrame();
        this.mCaixaInterFrame = new CaixaInterFrame();
        this.mAnimalInterFrame = new AnimalInterFrame();

    }
}
