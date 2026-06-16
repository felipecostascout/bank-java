package com.bank.study.estruturadedados;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("Felipe");
        nomes.add("Antonio");
        nomes.add("Felipe");
        nomes.add("Angelica");
        nomes.add("Hadassa");

        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            System.out.println(nome);
        }
        Set<String> nomeSet = new HashSet<>();
        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            nomeSet.add(nome);
        }
        //for  each
        System.out.println("-------------------");
        for (String nome: nomeSet){
            System.out.println(nome);
        }
        nomeSet.forEach(nome ->{
            System.out.println(nome);
        });
    }
}
