package com.bank.study.estruturadedados;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
    public static void main(String[] args) {
        Map<String,String> nomes = new HashMap<>();

        nomes.put("000.332.256-58","Felipe Costa");
        nomes.put("001.123.456-58","Joao Ferreira");
        nomes.put("123.458.784-78","Hadassa Costa");

        for (String key:nomes.keySet()){
            System.out.println(key);
            System.out.println(nomes.get(key));


        }
        System.out.println("\n");
        for (String nome:nomes.values()){

            System.out.println(nome);

        }
        // Imprimir toda a Lista
        for (Map.Entry<String,String> entry: nomes.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
        nomes.put("000.332.256-58","Angelica Silva");// Atualizar Lista
        System.out.println("\n");
        nomes.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });
    }
}
