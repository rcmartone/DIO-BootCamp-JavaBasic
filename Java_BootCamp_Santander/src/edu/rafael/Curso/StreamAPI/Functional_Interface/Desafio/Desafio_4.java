package edu.rafael.Curso.StreamAPI.Functional_Interface.Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio_4 {

    public static void main(String[] args) {
    /*Desafio 4 - Remova todos os valores ímpares:
    Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante 
    no console. */

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    numeros.stream()
    //Filtra para achar os pares
    .filter(n -> n%2 == 0)
    //Classifica em ordem Natural (Crescente)
    .sorted((a, b) -> Integer.compare(a, b))
    //Imprime para cada valor organizado
    .forEach(System.out::println);
    }

}
