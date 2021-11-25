package br.com.dio.collection.set.notas;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args){

        System.out.println("CRIANDO UM CONJUNTO E ADICIONE AS NOTAS");
        Set<Double> notas1 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("NOTAS: " + notas1.toString());
        System.out.println("---------------------------------------------");

        System.out.println("A NOTA 5.0 ESTÁ NO CONJUNTO? " + notas1.contains(5d));
        System.out.println("---------------------------------------------");

        System.out.println("A MENOR NOTA É: " + Collections.min(notas1));
        System.out.println("---------------------------------------------");

        System.out.println("A MAIOR NOTA É: " + Collections.max(notas1));
        System.out.println("---------------------------------------------");

        Iterator<Double> iterator = notas1.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A SOMA DOS VALORES É: " + soma);
        System.out.println("---------------------------------------------");

        System.out.println("A MÉDIA DAS NOTAS É: " + (soma/ notas1.size()));
        System.out.println("---------------------------------------------");

        System.out.println("A NOTA 0 FOI REMOVIDA? " +notas1.remove(0d));
        System.out.println("---------------------------------------------");

        System.out.println("NOTAS: " + notas1.toString());
        System.out.println("---------------------------------------------");

        Iterator<Double> iterator1 = notas1.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println("AS NOTAS MENORES QUE 7 FORAM REMOVIDAS: " +notas1.toString());
        System.out.println("---------------------------------------------");

        System.out.println("EXIBINDO AS NOTAS NA ORDEM QUE FORAM INFORMADA:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("---------------------------------------------");

        System.out.println("EXIBINDO AS NOTAS NA ORDEM CRESCENTE:");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("---------------------------------------------");

        notas1.clear();
        System.out.println("APAGANDO O CONJUNTO DE NOTAS 1:" + notas1);
        System.out.println("---------------------------------------------");

        System.out.println("O CONJUNTO DE NOTAS 1 ESTÁ VAZIO: " + notas1.isEmpty());
        System.out.println("O CONJUNTO DE NOTAS 2 ESTÁ VAZIO: " + notas2.isEmpty());
        System.out.println("O CONJUNTO DE NOTAS 3 ESTÁ VAZIO: " + notas3.isEmpty());




    }
}
