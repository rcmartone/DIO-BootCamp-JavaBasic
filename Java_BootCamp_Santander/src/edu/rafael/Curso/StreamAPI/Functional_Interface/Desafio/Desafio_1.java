package edu.rafael.Curso.StreamAPI.Functional_Interface.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio_1 {
    public static void main(String[] args) {
      
        /*Desafio 1 - Mostre a lista na ordem numérica:
    Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a 
    exiba no console.*/

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 1, 6, 7, 8, 11);

    numeros.stream().sorted().forEach(System.out::println);
    //                      Ou
    numeros.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);

   // Caso queira criar uma lista nova com os numeros ordenados para manipulação
   List<Integer> numerosOrdenados = numeros.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
 
    }
    
}
