package br.com.dio.collection.map.livraria;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args){

        System.out.println("--\t IMPRIMINDO AUTOR E NOME DO LIVROS NA ORDEM ALEATÓRIA\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Hidtória do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 366));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()) ;
        }

        System.out.println("--\t IMPRIMINDO OS LIVROS NA ORDEM DE INSERÇÃO \t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Hidtória do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 366));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()) ;
        }

        System.out.println("--\t IMPRIMINDO OS LIVROS NA ORDEM ALFABÉTICA DOS AUTORES \t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Hidtória do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 366));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()) ;
        }

        System.out.println("--\t IMPRIMINDO OS LIVROS NA ORDEM ALFABÉTICA DO NOME DOS LIVROS \t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()) ;
        }

    }
}
