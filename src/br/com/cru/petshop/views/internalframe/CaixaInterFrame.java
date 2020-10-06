/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.views.internalframe;

/**
 *
 * @author jose.antonio
 */
public class CaixaInterFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CaixaInterFrame
     */
    public CaixaInterFrame() {
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

        paneOpcoes = new javax.swing.JPanel();
        paneStatusCaixa = new javax.swing.JPanel();
        lblStatusCaixa = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        scrollObservacao = new javax.swing.JScrollPane();
        txtArObservacao = new javax.swing.JTextArea();
        lblObservacao = new javax.swing.JLabel();
        lblSaldoInicial = new javax.swing.JLabel();
        btnAbrirCaixa = new javax.swing.JButton();
        scrollPaneItemPedido = new javax.swing.JScrollPane();
        tableItemPedido = new javax.swing.JTable();
        btnExcluirLancamento = new javax.swing.JButton();
        paneInformacoes = new javax.swing.JPanel();
        lblSaldoInicialStatus = new javax.swing.JLabel();
        lblEntradaCaixaStatus = new javax.swing.JLabel();
        lblSaidaCaixaStatus = new javax.swing.JLabel();
        lblSaldoFinalStatus = new javax.swing.JLabel();
        lblTudo = new javax.swing.JLabel();
        lblSaldoFinalResult = new javax.swing.JLabel();
        lblEntradaCaixaResult = new javax.swing.JLabel();
        lblSaldoInicialResult = new javax.swing.JLabel();
        btnFecharCaixa = new javax.swing.JButton();
        btnAdicionarEntradaSaida = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gerenciamento de Caixa");
        setToolTipText("Gerenciamento de Caixa");

        paneOpcoes.setBackground(new java.awt.Color(102, 102, 102));

        paneStatusCaixa.setBackground(new java.awt.Color(255, 51, 0));

        lblStatusCaixa.setBackground(new java.awt.Color(255, 255, 255));
        lblStatusCaixa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblStatusCaixa.setForeground(new java.awt.Color(255, 255, 255));
        lblStatusCaixa.setText("Caixa Fechado");

        javax.swing.GroupLayout paneStatusCaixaLayout = new javax.swing.GroupLayout(paneStatusCaixa);
        paneStatusCaixa.setLayout(paneStatusCaixaLayout);
        paneStatusCaixaLayout.setHorizontalGroup(
            paneStatusCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStatusCaixaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblStatusCaixa)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        paneStatusCaixaLayout.setVerticalGroup(
            paneStatusCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStatusCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatusCaixa)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtSaldoInicial.setText("0,0");

        txtArObservacao.setColumns(20);
        txtArObservacao.setRows(5);
        scrollObservacao.setViewportView(txtArObservacao);

        lblObservacao.setForeground(new java.awt.Color(255, 255, 255));
        lblObservacao.setText("Observação:");

        lblSaldoInicial.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoInicial.setText("Saldo inicial (dinheiro):");

        btnAbrirCaixa.setText("Abrir Caixa");

        javax.swing.GroupLayout paneOpcoesLayout = new javax.swing.GroupLayout(paneOpcoes);
        paneOpcoes.setLayout(paneOpcoesLayout);
        paneOpcoesLayout.setHorizontalGroup(
            paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(paneStatusCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneOpcoesLayout.createSequentialGroup()
                        .addComponent(scrollObservacao)
                        .addContainerGap())
                    .addGroup(paneOpcoesLayout.createSequentialGroup()
                        .addGroup(paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservacao)
                            .addComponent(lblSaldoInicial))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        paneOpcoesLayout.setVerticalGroup(
            paneOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOpcoesLayout.createSequentialGroup()
                .addComponent(paneStatusCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblSaldoInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tableItemPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data / Hora", "Descrição", "Entrada", "Saida", "Forma Pagto."
            }
        ));
        scrollPaneItemPedido.setViewportView(tableItemPedido);

        btnExcluirLancamento.setText("Excluir Lançamento");

        paneInformacoes.setBackground(new java.awt.Color(255, 255, 204));

        lblSaldoInicialStatus.setText("( + ) SALDO INICIAL:");

        lblEntradaCaixaStatus.setText("( + ) ENTRADA NO CAIXA:");

        lblSaidaCaixaStatus.setText("( - ) SAÍDAS DO CAIXA");

        lblSaldoFinalStatus.setText("( = ) SALDO FINAL");

        lblTudo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTudo.setText("TUDO:");

        lblSaldoFinalResult.setText("0,00");

        lblEntradaCaixaResult.setText("0,00");

        lblSaldoInicialResult.setText("0,00");

        javax.swing.GroupLayout paneInformacoesLayout = new javax.swing.GroupLayout(paneInformacoes);
        paneInformacoes.setLayout(paneInformacoesLayout);
        paneInformacoesLayout.setHorizontalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInformacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneInformacoesLayout.createSequentialGroup()
                                .addComponent(lblEntradaCaixaStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(lblEntradaCaixaResult))
                            .addGroup(paneInformacoesLayout.createSequentialGroup()
                                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSaidaCaixaStatus)
                                    .addComponent(lblSaldoFinalStatus))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(paneInformacoesLayout.createSequentialGroup()
                                .addComponent(lblSaldoInicialStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSaldoInicialResult))))
                    .addGroup(paneInformacoesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblTudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSaldoFinalResult)))
                .addContainerGap())
        );
        paneInformacoesLayout.setVerticalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoInicialStatus)
                    .addComponent(lblSaldoInicialResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntradaCaixaStatus)
                    .addComponent(lblEntradaCaixaResult))
                .addGap(64, 64, 64)
                .addComponent(lblSaidaCaixaStatus)
                .addGap(110, 110, 110)
                .addComponent(lblSaldoFinalStatus)
                .addGap(26, 26, 26)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTudo)
                    .addComponent(lblSaldoFinalResult))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFecharCaixa.setText("Fechar Caixa");

        btnAdicionarEntradaSaida.setText("Adicionar Entrada / Saída");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluirLancamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFecharCaixa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollPaneItemPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarEntradaSaida)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionarEntradaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneItemPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCaixa;
    private javax.swing.JButton btnAdicionarEntradaSaida;
    private javax.swing.JButton btnExcluirLancamento;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JLabel lblEntradaCaixaResult;
    private javax.swing.JLabel lblEntradaCaixaStatus;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblSaidaCaixaStatus;
    private javax.swing.JLabel lblSaldoFinalResult;
    private javax.swing.JLabel lblSaldoFinalStatus;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JLabel lblSaldoInicialResult;
    private javax.swing.JLabel lblSaldoInicialStatus;
    private javax.swing.JLabel lblStatusCaixa;
    private javax.swing.JLabel lblTudo;
    private javax.swing.JPanel paneInformacoes;
    private javax.swing.JPanel paneOpcoes;
    private javax.swing.JPanel paneStatusCaixa;
    private javax.swing.JScrollPane scrollObservacao;
    private javax.swing.JScrollPane scrollPaneItemPedido;
    private javax.swing.JTable tableItemPedido;
    private javax.swing.JTextArea txtArObservacao;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}
