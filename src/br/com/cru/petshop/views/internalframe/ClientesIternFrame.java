/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.views.internalframe;

import java.awt.event.FocusEvent;

import br.com.cru.petshop.views.NovoClienteJFrame;

public class ClientesIternFrame extends javax.swing.JInternalFrame {

	public ClientesIternFrame() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">                          
	private void initComponents() {
		paneInformations = new javax.swing.JPanel();
		paneFooter = new javax.swing.JPanel();
		btnEditar = new javax.swing.JButton();
		btnNovo = new javax.swing.JButton();
		paneHeader = new javax.swing.JPanel();
		txtPesquisarCliente = new javax.swing.JTextField();
		scrollPaneClientes = new javax.swing.JScrollPane();
		tableClientes = new javax.swing.JTable();
		javax.swing.GroupLayout paneFooterLayout = new javax.swing.GroupLayout(paneFooter);

		setClosable(true);
		setMaximizable(true);

		paneFooter.setBackground(new java.awt.Color(102, 102, 102));

		paneFooter.setLayout(paneFooterLayout);
		paneFooterLayout
				.setHorizontalGroup(paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(paneFooterLayout.createSequentialGroup().addContainerGap()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		paneFooterLayout
				.setVerticalGroup(paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneFooterLayout.createSequentialGroup()
								.addContainerGap(26, Short.MAX_VALUE).addContainerGap()));

		txtPesquisarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (txtPesquisarCliente.getText().isEmpty()
						|| txtPesquisarCliente.getText().equalsIgnoreCase("Nome, telefone ou endereço..."))
					txtPesquisarCliente.setText("");
			}

			public void focusLost(FocusEvent e) {
				if (txtPesquisarCliente.getText().isEmpty())
					txtPesquisarCliente.setText("Nome, telefone ou endereço...");
			}
		});

		paneHeader.setBackground(new java.awt.Color(102, 102, 102));

		btnEditar.setText("Editar");
		btnEditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (tableClientes.isEnabled())
					tableClientes.setEnabled(false);
				else
					tableClientes.setEnabled(true);
			}
		});

		btnNovo.setText("Novo");
		btnNovo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNovoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout paneHeaderLayout = new javax.swing.GroupLayout(paneHeader);
		paneHeader.setLayout(paneHeaderLayout);
		paneHeaderLayout.setHorizontalGroup(paneHeaderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(paneHeaderLayout.createSequentialGroup().addContainerGap()
						.addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 307,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
						.addComponent(btnEditar).addGap(19, 19, 19).addComponent(btnNovo).addContainerGap()));
		paneHeaderLayout.setVerticalGroup(paneHeaderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(paneHeaderLayout.createSequentialGroup().addContainerGap()
						.addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
										Short.MAX_VALUE)
								.addComponent(btnEditar).addComponent(btnNovo))
						.addContainerGap()));

		tableClientes.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { },
				new String[] { "Nome", "E-Mail", "Fone Principal", "Celular", "Endereço", "Número", "Qtd. Pedidos" }));
		tableClientes.setEnabled(false);
		tableClientes.getTableHeader().setReorderingAllowed(false);
		scrollPaneClientes.setViewportView(tableClientes);

		javax.swing.GroupLayout paneInformationsLayout = new javax.swing.GroupLayout(paneInformations);
		paneInformations.setLayout(paneInformationsLayout);
		paneInformationsLayout.setHorizontalGroup(paneInformationsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(paneInformationsLayout.createSequentialGroup()
						.addGroup(paneInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(paneInformationsLayout.createSequentialGroup().addContainerGap()
										.addComponent(scrollPaneClientes))
								.addComponent(paneHeader, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(paneFooter, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		paneInformationsLayout.setVerticalGroup(
				paneInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						paneInformationsLayout.createSequentialGroup()
								.addComponent(paneHeader, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(scrollPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 380,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(paneFooter, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(paneInformations,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(paneInformations,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {
		NovoClienteJFrame novoClienteJFrame = new NovoClienteJFrame();
		novoClienteJFrame.setVisible(true);
		novoClienteJFrame.setLocationRelativeTo(this);
	}

	private javax.swing.JButton btnEditar;
	private javax.swing.JButton btnNovo;
	private javax.swing.JPanel paneFooter;
	private javax.swing.JPanel paneHeader;
	private javax.swing.JPanel paneInformations;
	private javax.swing.JScrollPane scrollPaneClientes;
	private javax.swing.JTable tableClientes;
	private javax.swing.JTextField txtPesquisarCliente;
}
