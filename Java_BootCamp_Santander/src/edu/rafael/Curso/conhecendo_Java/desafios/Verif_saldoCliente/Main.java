package edu.rafael.Curso.conhecendo_Java.desafios.Verif_saldoCliente;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        if (saldoTotal >= valorSaque){
            saldoTotal = saldoTotal - valorSaque;
            System.out.printf("Saque realizado com sucesso. Novo saldo: %d", saldoTotal);
        }else{ 
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }  
  }
}