package br.com.dio.collection.stream.contato;


import java.util.*;
import java.util.function.Function;

public class ContatoOrdenacao {
    public static void main(String[] args) {


        //ADICIONANDO OS CONTATOS
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println("IMPRIMIDO OS CONTATOS ALEATORIOS: \n" + agenda + "\n");

        //Organizando os valores com CLASSE ANÔNIMA
        System.out.println("--\tORDEM NUMEROS DE TELEFONE\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });
        //LISTANDO OS CONTATOS
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
        System.out.println();

        // Usando o Functional Interface - Function
        System.out.println("--\tORDEM NUMEROS DE TELEFONE\t--");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
        //LISTANDO OS CONTATOS
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
        System.out.println();

        //utilizando o LAMBDA
        System.out.println("--\tORDEM NUMEROS DE TELEFONE\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        //LISTANDO OS CONTATOS
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
    }
}
