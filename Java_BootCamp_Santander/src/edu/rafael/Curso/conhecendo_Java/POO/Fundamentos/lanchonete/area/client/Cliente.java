package edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete.area.client;

public class Cliente {
	private void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
		escolherLanche();
	}
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
}