package br.com.dio.collection.list.notas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args){
        //CRIE UMA LISTA E ADCIONE SETE NOTAS
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(3.5);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.0);
        notas.add(10.0);
        System.out.println("Notas: " + notas);
        System.out.println("----------------------------------");

        //EXIBA A POSIÇÃO DA NOTA 9.0
        System.out.println("Posição da nota 9.0: " + notas.indexOf(9.0));
        System.out.println("----------------------------------");

        //ADICIONE NA LISTA A NOTA 5.0 NA POSIÇÃO 4
        System.out.println("Adicione na lista a nota 5.0 na posição 4: ");
        notas.add(4,5.0);
        System.out.println("Notas: " + notas);
        System.out.println("----------------------------------");

        //SUBSTITUA A NOTA 9.0 PELA NOTA 2
        System.out.println("Substitua a nota 9.0 pela nota 2: ");
        System.out.println("Notas: " + notas);
        notas.set(notas.indexOf(9.0), 2.0);
        System.out.println("Notas: " + notas);
        System.out.println("----------------------------------");

        //CONFIRA SE A NOTA 10 ESTÁ NA LISTA
        System.out.println(notas.contains(10.0));
        System.out.println("----------------------------------");

        //EXIBA TODAS AS NOTAS NA ORDEM EM QUE FORAM INFORMADAS
        for (Double nota: notas) System.out.println(nota);
        System.out.println("----------------------------------");

        //EXIBA A TERCEIRA NOTA ADICIONADA
        System.out.println("A terceira nota adicionada foi: " + notas.get(2));
        System.out.println("----------------------------------");

        //EXIBA A MENOR NOTA
        System.out.println("A MENOR NOTA É: " + Collections.min(notas));
        System.out.println("----------------------------------");

        //EXIBA A MAIOR NOTA
        System.out.println("A MAIOR NOTA É: " + Collections.max(notas));
        System.out.println("----------------------------------");

        //EXIBA A SOMA DOS VALORES
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A SOMA DAS NOTAS É: " + soma);
        System.out.println("----------------------------------");

        //EXIBA A MÉDIA DAS NOTAS
        System.out.println("A MÉDIA DAS NOTAS É: " + (soma/notas.size()));
        System.out.println("----------------------------------");

        //REMOVA A NOTA 3.5
        System.out.println("Notas: " + notas);
        notas.remove(3.5);
        System.out.println("REMOVENDO A NOTA 3.5");
        System.out.println("Notas: " + notas);
        System.out.println("----------------------------------");

        //REMOVA A NOTA NA POSIÇÃO 0
        notas.remove(0);
        System.out.println("Notas: " + notas);
        System.out.println("REMOVENDO A NOTA DA POSIÇÃO 0");
        System.out.println("----------------------------------");

        //REMOVA AS NOTAS MENORES QUE 7 E EXIBA A LISTA
        System.out.println("Notas: " + notas);
        System.out.println("REMOVENDO AS NOTAS MENORES QUE 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7 ){
                iterator1.remove();
            }
        }
        System.out.println("Notas: " + notas);
        System.out.println("----------------------------------");

        //APAGUE TODA A LISTA
        System.out.println("APAGANDO A LISTA...");
        notas.clear();
        System.out.println("Notas: " + notas);
        System.out.println("----------------------------------");

        //CONFIRA SE A LISTA ESTÁ VAZIA: true e false
        System.out.println("Notas: " + notas.isEmpty());
    }
}
