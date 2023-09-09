package edu.rafael.Curso.conhecendo_Java.estruturas_repetição;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    /*Estrutura do controle de fluxo while

    while (expressão booleana de validação){
        // comando que será executado até que a 
        // expressão de validação torne-se falsa 
    }
*/
public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;//Apenas para não precisar ficar fazendo novas verificações e
                // não ocorrer valores negativos porem ele pode ser negativo para sair do while

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
    }
        //Método de busca de um valor aleatório
        private static double valorAleatorio() {
	    return ThreadLocalRandom.current().nextDouble(2, 8);//Gera um valor aleatorio
        //entre 2 e 8
        }
}
