package com.bank.study.estruturadedados;

public class Vetores {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        nomes[0] = "Antonio";
        nomes[1] = "Felipe";
        nomes[2] = "Rebecca";

        for (int i = 0; i < nomes.length; i++){
            String nome = nomes[i];
            if (nome != null){
                System.out.println(nome);
            }
        }

        nomes[0] = "Angelica"; // alterar (sobreescrever)
        nomes[1] = null;
        System.out.println("------------------------");
        for (int i = 0; i < nomes.length ; i++) {
            String nome = nomes[i];
            if (nome != null){
                System.out.println(nome);
            }

        }
    }
}
