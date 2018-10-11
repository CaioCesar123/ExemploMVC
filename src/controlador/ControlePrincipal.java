package controlador;

import visao.Principal;
import visao.Programa;

public class ControlePrincipal {

	public static void main(String[] args) {

		// Declaração da classe da view
		//Programa programa = new Programa();
		Principal principal = new Principal();
		
		// Declaração do controlador
		ControleCliente controleCliente = new ControleCliente();
		
		/*
		 *  Fazer a chamada ao método da view, injetando
		 *  o controlador 
		 */
		//programa.solicitaDadosCliente(controleCliente);	
		//programa.exibeDadosCliente(controleCliente);
		
		principal.construirTela(controleCliente);
	
	}

}
