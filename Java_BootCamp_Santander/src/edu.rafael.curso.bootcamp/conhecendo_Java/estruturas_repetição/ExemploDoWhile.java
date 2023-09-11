package edu.rafael.Curso.conhecendo_Java.estruturas_repetição;

import java.util.Random;

public class ExemploDoWhile {
    /*Estrutura do controle de fluxo do while
    do{
        // comando que será executado até que a 
     /  / expressão de validação torne-se falsa 
    }while (expressão booleana de validação);
     */
    public static void main(String[] args) {

    System.out.println("Discando...");    
    do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

    }while(tocando());//Enquanto a negação retornada for True, continua executando

        System.out.println("Alô !!!");
    }
    /*Metodo booleano que gera randomicamente um valor inteiro que caso seja > 1, é atribuido 
    como 1 ou seja, verdadeiro para tocando e caso seja 0, será falso, ou seja, não toca mais
    */
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;

    }

}