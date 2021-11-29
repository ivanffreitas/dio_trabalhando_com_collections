package br.com.dio.collection.map.carros;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args){

        System.out.println("CRIANDO UM DICION´RIO QUE RELACIONE OS MODELOS E SEUS RESPECTIVOS CONSUMOS:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 11.4);
            put("fox", 14.4);
            put("mobi", 13.0);
            put("punto", 12.2);
            put("elantra", 15.5);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("SUBSTITUINDO O CONSUMO DO GOL POR 15.2 KM/l");
        carrosPopulares.put("gol", 15.4);

        System.out.println("O MODELO TUCSON ESTÁ NO DICIONÁRIO? " + carrosPopulares.containsKey("tucson"));

        System.out.println("O CONSUMO DO FOX É: " + carrosPopulares.get("fox"));

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("OS MODELOS DOS CARROS SÃO: " + modelos);

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("OS CONSUMOS DOS CARROS SÃO: " + consumos);

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("MODELO MAIS EFICIENTE: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("MODELO MENOS EFICIENTE: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A SOMA DOS CONSUMOS É: " + soma);

        System.out.println("A MÉDIA DE CONSUMO DOS CARROS É: " + (soma/carrosPopulares.size()));

        System.out.println("REMOVENDO OS CARROS DE CONSUMO 13.0...");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(13.0)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("EXIBINDO TODOS OS CARROS NA ORDEM QUE FORAM INFORMADO:");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 11.4);
            put("fox", 14.4);
            put("mobi", 13.0);
            put("punto", 12.2);
            put("elantra", 15.5);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("EXIBINDO OS CARROS NA ORDEM ALFABETICA");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("APAGANDO O DICIONARIO DE CARROS...");
        carrosPopulares.clear();

        System.out.println("O DICIONÁRIO ESTÁ VAZIO? " + carrosPopulares.isEmpty());
    }
}
