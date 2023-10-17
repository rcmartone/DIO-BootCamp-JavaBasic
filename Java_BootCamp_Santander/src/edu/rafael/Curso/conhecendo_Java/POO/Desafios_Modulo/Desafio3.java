package edu.rafael.Curso.conhecendo_Java.POO.Desafios_Modulo;

import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio3{
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
        System.out.println("Digite a senha correta do cofre: ");
        CofreDigital senhaCofreDigital = new CofreDigital(scanner.nextInt());
        System.out.println("Digite a senha para entrar: ");
            if (senhaCofreDigital.validarSenha(scanner.nextInt()) == true){
                senhaCofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else{ 
                senhaCofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!"); 
            }
        }
        else{
            CofreFisico chaveCofreFisico = new CofreFisico();
            chaveCofreFisico.imprimirInformacoes();
        }
    }
}