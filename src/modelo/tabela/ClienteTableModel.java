package modelo.tabela;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelo.Cliente;

public class ClienteTableModel extends AbstractTableModel {
	
	private List<Cliente> listaClientes;
	private String[] colunas = {"Nome", "CPF", "E-mail"};
	
	public ClienteTableModel(List<Cliente> clientes) {
		listaClientes = clientes;
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return listaClientes.size();
	}

	@Override
	public Object getValueAt(int indiceLinha, int indiceColuna) {

		switch(indiceColuna) {
		case 0:
			return listaClientes.get(indiceLinha).getNome();
		case 1:
			return listaClientes.get(indiceLinha).getCpf();
		case 2:
			return listaClientes.get(indiceLinha).getEmail();
		default:
			return null;
		}
		
	}
	
	@Override
	public String getColumnName(int indiceColuna) {
		return colunas[indiceColuna];
	}

}











