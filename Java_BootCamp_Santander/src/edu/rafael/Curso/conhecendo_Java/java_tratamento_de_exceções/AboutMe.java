package edu.rafael.Curso.conhecendo_Java.java_tratamento_de_exceções;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        /* Escrevendo "quinze (15)", teremos a exceção java.util.InputMismatchException
         * que significa: O programa esperava o valor do tipo numérico inteiro.
        */
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        /* Escrevendo "1,65", teremos a exceção java.util.InputMismatchException
         * que significa: O programa esperava o valor do tipo numérico decimal no 
         * formato americano, exemplo: 1.65
        */
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close(); 
        
        /*Conhecendo algumas exceções já mapeadas
         * java.lang.NullPointerException: Quando tentamos obter alguma informação de uma 
         variável nula.
         * java.lang.ArithmeticException: Quando tentamos dividir um valor por zero.
         * java.sql.SQLException: Quando existe algum erro, relacionado a interação com banco 
         de dados.
         * java.io.FileNotFoundException: Quando tentamos ler ou escrever, em um arquivo que não 
         existe.
        */

        /* Estrutura Try-Cath
        try {
            bloco de código conforme esperado
        }catch(Exception e) {
            precisamos saber qual exceção bloco de código que captura as exceções que podem 
            acontecer em caso de um fluxo não previsto
        }

        */
    }
}