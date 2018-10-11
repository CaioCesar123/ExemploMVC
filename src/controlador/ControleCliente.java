package controlador;

import java.util.List;

import modelo.BdFake;
import modelo.Cliente;
import modelo.tabela.ClienteTableModel;
import visao.ExibeCliente;

public class ControleCliente {

	//Cliente cliente = new Cliente();
	BdFake banco = new BdFake();
	
	public boolean criarCliente(String nome, String email, String cpf) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		
		return banco.gravarCliente(cliente);
		
	}
	 
	public String obtemDadosCliente(int indice) {
		
		Cliente cliente = banco.obtemCliente(indice);
		
		String dados = cliente.getNome() + "\n" +
				cliente.getCpf() + "\n" +
				cliente.getEmail();
		
		return dados;
	}
	
	
	public List<Cliente> obtemClientes() {
		return banco.getClientes();
	}
	
	public void constroiTabela() {
		ClienteTableModel modeloTabela = 
				new ClienteTableModel(obtemClientes());
		
		ExibeCliente telaTabela = new ExibeCliente(modeloTabela);
		
		telaTabela.setVisible(true);
	}
}






