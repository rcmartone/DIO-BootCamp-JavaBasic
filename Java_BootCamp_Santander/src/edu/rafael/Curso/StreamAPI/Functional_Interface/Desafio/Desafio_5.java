package edu.rafael.Curso.StreamAPI.Functional_Interface.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Desafio_5 {

    public static void main(String[] args) {
    /*Desafio 5 - Calcule a média dos números maiores que 5:
    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console. */

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 

    /*
    - maptoDouble é pra converter o Integer em Double em casa sessão da lista
    - DoubleStream é onde existem alguns métodos para reduzir a coleção, como max(), min(), sum() e também 
    o average().
    - Average é a media entre os valores da lista
    - O OptionalDouble é um objeto que irá ajudar a evitar escrever a condição caso não exista a média. 
     escrito como OptionalDouble optionalDouble = doubleStream.average();
     seguido de double media = optionalDouble.orElse(0.0);
    - Ao invés do if, podemos usar o método orElse().
    */
    
    System.out.println("A média numerica dos numeros acima de 5 é de " + 
    numeros.stream()
    //Filta os valores para n > 5
    .filter(n -> n > 5)
    //Converte os Integers em DoubleValues
    .mapToDouble(Integer::doubleValue)
    //Calcula a media dos novos valores filtrados
    .average()
    //Em caso de falta de media, exibe um valor de 0,0
    .orElse(0.0));


    }
   
}
