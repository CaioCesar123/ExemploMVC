package visao;

import javax.swing.JOptionPane;

import controlador.ControleCliente;

public class Programa {
	
	/*
	 * Injeção de Dependência (relação com Inversão
	 * de Controle)
	 */
	
	public void solicitaDadosCliente(ControleCliente controlador) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
		String email = JOptionPane.showInputDialog("Digite seu e-mail");
		
		//Cliente cliente = new Cliente();
		//ControleCliente controlador = new ControleCliente();
		boolean status = controlador.criarCliente(nome, email, cpf);
		
		if(status) {
			JOptionPane.showMessageDialog(null, 
					"Cliente gravado com sucesso", 
					"Confirmação", 
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, 
					"Erro ao gravar cliente!", 
					"Confirmação", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	public void exibeDadosCliente(ControleCliente controlador) {
		JOptionPane.showMessageDialog(null,
				controlador.obtemDadosCliente(0));
	}

}








