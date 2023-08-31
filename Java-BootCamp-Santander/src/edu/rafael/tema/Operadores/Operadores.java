package edu.rafael.tema.Operadores;

public class Operadores {
    public static void main(String[] args) {
        //Ternário
        int a, b;
        a = 5;
        b = 6;
        String resultado;
        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if (a==b){resultado = "verdadeiro";}
        else {resultado = "falso";}
        System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        resultado = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);
        
        resultado = (a != b) ? "Verdadeiro":"Falso";//!= é diferente
        System.out.println(resultado);
    }
}
