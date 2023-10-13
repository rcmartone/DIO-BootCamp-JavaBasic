package edu.rafael.Curso.StreamAPI.Functional_Interface.Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio_3 {

    public static void main(String[] args) {
      /*Desafio 3 - Verifique se todos os números da lista são positivos:
    Com a ajuda da Stream API, verifique se todos os números da lista são positivos e 
    exiba o resultado no console. */
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
    numeros.stream()
    //Filtra para valores positivos
    .filter(n -> n >= 0)
    //Classifica em ordem crescente
    .sorted((a, b) -> Integer.compare(a, b))
    //Imprime para cada valor classificado
    .forEach(System.out::println);
    
    }
    
}
