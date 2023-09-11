package edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("NOTIFICAÇÃO ALMOXARIFADO - CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("NOTIFICAÇÃO ALMOXARIFADO - CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() { // sem nada antes de void, fica como default desse pacote
		System.out.println("NOTIFICAÇÃO ALMOXARIFADO - ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("NOTIFICAÇÃO ALMOXARIFADO - ALMOXARIFE TROCANDO O GÁS");
	}
}