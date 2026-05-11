package com.bank.study.condicoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainCondicoes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String nome = leia.next();
        System.out.println("Digite sua idade : ");
        int idade = leia.nextInt();

        if(idade >= 21){
            System.out.println(" Tem responsabilidade sobre os outro");
        }else if(idade >=18 && idade < 21){ // se for OU é ||
            System.out.println("Voce é maior de idade");
        }else{
            System.out.println("Voce é menor de Idade");
        }

        System.out.println(idade >= 18?"Ele é maior de idade":"Ele é menor de idade");//if simplificado(ternario)

        switch (idade){
            case 18:
                System.out.println("Tem 18 anos");
                break;// se nao tiver o BREAK ele ai rodar esse case 18 e tbm o de baixo no caso case 21
            case 21:
                System.out.println("tem 21 anos");
                break;
            default://é como se fosse o ELSE
                System.out.println("nao tem idade");


        }

    }
}
