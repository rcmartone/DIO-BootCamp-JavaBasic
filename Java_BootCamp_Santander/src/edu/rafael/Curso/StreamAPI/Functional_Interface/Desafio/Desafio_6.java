package edu.rafael.Curso.StreamAPI.Functional_Interface.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_6 {
    public static void main(String[] args){
    /*Desafio 6 - Verificar se a lista contém algum número maior que 10:
    Utilize a Stream API para verificar se a lista contém algum número maior que 10 
    e exiba o resultado no console. */

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    numeros.stream()
    //Filtra os valores maiores que 10
    .filter(n -> n > 10)
    //Caso existam, coloca eles em uma nova lista
    .collect(Collectors.toList())
    //Exibe esse valores um por um
    .forEach(System.out::println);
    }  
}
