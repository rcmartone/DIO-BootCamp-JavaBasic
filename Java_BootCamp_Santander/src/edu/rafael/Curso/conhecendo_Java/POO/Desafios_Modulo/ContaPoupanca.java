package edu.rafael.Curso.conhecendo_Java.POO.Desafios_Modulo;

public class ContaPoupanca extends ContaBancaria {

private double taxaJuros;

  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    //TODO: Implementar adequadamente esta sobrecarga de construtores.
    super(numero, titular, saldo);
    this.taxaJuros = taxaJuros;
  }

  public void exibirInformacoes() {
    super.exibirInformacoes();
    //TODO: Complementar as informações com a taxa de juros.
    System.out.println("Taxa de juros: " + taxaJuros + "%");
  }
}