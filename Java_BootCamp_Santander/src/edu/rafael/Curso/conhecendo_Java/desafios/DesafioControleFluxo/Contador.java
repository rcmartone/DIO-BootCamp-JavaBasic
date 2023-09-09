package edu.rafael.Curso.conhecendo_Java.desafios.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
            	contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException exception) { 
                System.out.println("O segundo parametro deve ser maior que o primeiro!");
            }
        }catch (Exception e){
            System.out.println("Valor procurado é do tipo inteiro, tente novamente!");
        }
		
    }
		
        
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if ( parametroUm > parametroDois)
            throw new ParametrosInvalidosException(); 
        //realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;
        System.out.println("Numero total de iterações de impressão é " + contagem);
        System.out.println("Exibindo as iterações em impressão");
        for (int x = parametroUm; x <= parametroDois; x++){
            System.out.println(x);
	    }
    }
}
