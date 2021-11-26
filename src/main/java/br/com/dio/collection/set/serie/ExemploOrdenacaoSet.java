package br.com.dio.collection.set.serie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args){

        System.out.println("--\tEXIBINDO AS SERIE EM ORDEM ALEATORIA\t--");
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEpisodio());
        }
        System.out.println("-----------------------------------");

        System.out.println("--\tEXIBINDO AS SERIE EM ORDEM DE INSERÇÃO\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEpisodio());
        }
        System.out.println("-----------------------------------");

        System.out.println("--\tORDEM NATURAL (TEMPO DE EPSODIO)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for (Serie serie: minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEpisodio());
        }
        System.out.println("-----------------------------------");

        System.out.println("--\tORDEM NOME/GÊNERO/TEMPO DE EPISODIO\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries1);
        for (Serie serie: minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEpisodio());
        }
        System.out.println("-----------------------------------");

    }
}
