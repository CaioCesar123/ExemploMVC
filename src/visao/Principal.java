package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControleCliente;

public class Principal {
	
	public void construirTela(ControleCliente controlador) {
		
		JFrame tela = new JFrame("Cadastro de Clientes");
		JPanel painel = new JPanel();
		
		JLabel labelNome = new JLabel("Nome:");
		JLabel labelCpf = new JLabel("CPF:");
		JLabel labelEmail = new JLabel("E-mail:");
		
		JTextField textNome = new JTextField(20);
		JTextField textCpf = new JTextField(11);
		JTextField textEmail = new JTextField(20);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		ActionListener listenerCadastrar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean status = controlador.criarCliente(textNome.getText(), 
						textEmail.getText(), textCpf.getText());
				
				if(status) {
					JOptionPane.showMessageDialog(tela, 
							"Cadastro realizado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, 
							"Problemas ao efetuar cadastro!");
				}
				
			}
		};
		botaoCadastrar.addActionListener(listenerCadastrar);
		
		JButton botaoSair = new JButton("Sair");
		ActionListener listenerSair = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//tela.dispose();
				System.exit(0);
				
			}
		};
		botaoSair.addActionListener(listenerSair);
		
		JButton botaoListar = new JButton("Listar Clientes");
		ActionListener listenerListar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.constroiTabela();
				
			}
		};
		botaoListar.addActionListener(listenerListar);
		
		painel.add(labelNome);
		painel.add(textNome);
		painel.add(labelCpf);
		painel.add(textCpf);
		painel.add(labelEmail);
		painel.add(textEmail);
		painel.add(botaoCadastrar);
		painel.add(botaoListar);
		painel.add(botaoSair);
		
		tela.add(painel);
		tela.pack();
		tela.setVisible(true);
		
	}

}



