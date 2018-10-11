package modelo;

import java.util.ArrayList;
import java.util.List;

public class BdFake {
	
	// Generics <>
	List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	public boolean gravarCliente(Cliente c) {
		return listaClientes.add(c);
		//return true;
	}
	
	public Cliente obtemCliente(int indice) {
		return listaClientes.get(indice);
	}
	
	public List<Cliente> getClientes() {
		return listaClientes;
	}

}







