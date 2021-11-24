package br.com.dio.collection.list;

//Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene
//esta lista exibindo: (nome - idade - cor);

//Gato 1 = nome: Jon, idade: 18, cor: preto
//Gato 2 = nome: Simba, idade: 6, cor: tigrado
//Gato 3 = nome: Jon, idade: 12, cor: amarelo

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args){

        List<Gato> meusGtos = new ArrayList<>(){{
            add(new Gato("Jon",18, "preto"));
            add(new Gato("Simba",6, "tigrado"));
            add(new Gato("Jon",12, "amarelo"));
        }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGtos);
        System.out.println("-----------------------------------");

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(meusGtos);
        System.out.println(meusGtos);
        System.out.println("-----------------------------------");

        System.out.println("--\tOrdem Natural (NOME)\t--");
        Collections.sort(meusGtos);
        System.out.println(meusGtos);
        System.out.println("-----------------------------------");

        System.out.println("--\tOrdem (IDADE)\t--");
        Collections.sort(meusGtos, new ComparatorIdade());
        // meusGtos.sort( new ComparatorIdade());  <---- mesma função da linha acima
        System.out.println(meusGtos);
        System.out.println("-----------------------------------");

    }

}

