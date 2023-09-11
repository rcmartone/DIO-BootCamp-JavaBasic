package edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.lanchonete.atendimento.cozinha;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("NOTIFICAÇÃO DA COZINHA - ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("NOTIFICAÇÃO DA COZINHA - ADICIONANDO SUCO NO BALCÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("NOTIFICAÇÃO DA COZINHA - PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}
	private void prepararVitamina() {
		System.out.println("NOTIFICAÇÃO DA COZINHA - PREPARANDO SUCO");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
