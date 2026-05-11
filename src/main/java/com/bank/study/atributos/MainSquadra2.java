package com.bank.study.atributos;

import java.util.Scanner;

public class MainSquadra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Squadra [] clubes = new Squadra [3];

        for (int i = 0; i < clubes.length ; i++) {
            clubes [i] = new Squadra();

            System.out.println("Clube" + (i + 1));

            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            clubes[i].setNome(nome);

        }
    }
}
