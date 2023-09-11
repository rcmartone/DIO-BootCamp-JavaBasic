package edu.rafael.Curso.conhecendo_Java.aprendendo_sintaxe_java.terminal_argumentos;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner e definindo ele como vazio.
        Scanner scanner = null;

        //Tratando a possibilidade de um erro caso o usuario não digite nada.
    try {
        scanner = new Scanner(System.in).useLocale(Locale.US);;
        // usar o Scanner
    } catch (Exception e) {
        // tratar os erros
    }
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}