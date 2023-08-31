package edu.rafael.tema.Operadores;

public class Operadores {
    public static void main(String[] args) {
        //Atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;

        //Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //O operador de adição (+), quando utilizado em variáveis do 
        //tipo texto, realizará a “concatenação de textos”.
        String nomeCompleto = "LINGUAGEM" + " JAVA";
		System.out.println(nomeCompleto);
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println(concatenacao);// ?

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);// 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);// 1111

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);// 1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);// 1111

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);// 13 = "texto" + (1+1+1)

        //Quando a IDE detecta um texto " ", ele não faz mais operações
        //Aritmeticas, apenas caso elas ocorram antes do texto ou que sejam
        //colocados em ( )
    }
}
