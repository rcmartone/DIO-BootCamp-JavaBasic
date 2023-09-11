package edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete;

import edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete.area.client.Cliente;
import edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete.atendimento.Atendente;
import edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//ações que estabelecimento precisa ter ciência - public
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
        atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.fazerPedido();
		cliente.pagarConta();	
	}
}