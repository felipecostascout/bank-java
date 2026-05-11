package com.bank.study.loops;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ;i++){ // declarar variavel , diz a condicao , incrementa ++
            System.out.println(i);

        }
        List<String> times = new ArrayList<>();
        times.add("Sport");
        times.add("Londrina");
        times.add("Sao Paulo");

        for(int i = 0; i < times.size();i++){
            String time = times.get(i);
            System.out.println(time);
        }
        for(String time:times){
            System.out.println(time);

        }
        times.forEach(time->{//forEach com LAMBDA
            System.out.println(time);
        });

        //WHILE
        int contador = 10;
        while(contador < 10){
            System.out.println(contador);
            contador++;
        }
        int contadordo = 10;
        do{
            System.out.println("do while : "+ contadordo);
            contadordo++;
        }while(contadordo < 10);

    }

}
