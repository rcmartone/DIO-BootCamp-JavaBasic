package edu.rafael.tema.terminal_argumentos;

public class minhaClasseTeste {
    /**
     * @param args
     */
    public static void main (String[] args) {
        //os argumentos começam com indice 0
        String nome = "Rafael";
        String sobrenome = "Martone";
        nome = args [0];
        sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
    }
}
