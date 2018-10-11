package visao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import modelo.tabela.ClienteTableModel;

public class ExibeCliente extends JFrame{
	
	public ExibeCliente(ClienteTableModel modeloTabela) {
		
		setBounds(15, 15, 1024, 768);
		
		setTitle("Lista de Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel contentPanel = new JPanel();
		JPanel painel = new JPanel();
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 100, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(new BorderLayout(5, 5));
		
		contentPanel.add(painel, BorderLayout.CENTER);
		painel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 800, 600);
		contentPanel.add(scrollPane);
		
		JTable tabelaClientes = new JTable();
		tabelaClientes.setModel(modeloTabela);
		
		scrollPane.setViewportView(tabelaClientes);
		
		JButton botaoVoltar = new JButton("Voltar");
		ActionListener listenerVoltar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();
				
			}
		};
		botaoVoltar.addActionListener(listenerVoltar);
		
		contentPanel.add(botaoVoltar, BorderLayout.AFTER_LAST_LINE);
		
	}

}






