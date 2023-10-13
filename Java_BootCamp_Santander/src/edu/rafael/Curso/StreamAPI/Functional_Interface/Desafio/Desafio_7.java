package edu.rafael.Curso.StreamAPI.Functional_Interface.Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_7 {
    public static void main(String[] args) {
    /*Desafio 7 - Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado 
    no console. */

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    
    System.out.println(numeros.stream()
    //Evita numeros repetidos
    .distinct()
    //Sorted colocando a lista em ordem decrescente 
    .sorted((a, b) -> Integer.compare(b, a))
    //Coleta os valores ordenados em uma nova lista
    .collect(Collectors.toList())
    //Pega o numero do indice 1, que é o segundo valor da lista decrescente, sendo o segundo maior da lista
    .get(1));


    }

}
