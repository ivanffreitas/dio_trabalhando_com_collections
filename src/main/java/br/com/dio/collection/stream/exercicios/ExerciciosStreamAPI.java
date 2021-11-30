package br.com.dio.collection.stream.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args){

        List<String> numerosAleatorios =
                Arrays.asList("1","0", "4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elemento dessa lista de String");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiro números e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);  //OBS: SET não aceita numeros repetido

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("Lista de números inteiro" + collectList);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i %2 == 0 && i >2))
                .collect(Collectors.toList());
        System.out.println("Números pares e maiores que 2: " + listaParesMaioresQue2);

        System.out.println("Mostre a média dos números");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        collectList.removeIf(i -> (i%2 !=0));
        System.out.println(collectList);
    }
}
