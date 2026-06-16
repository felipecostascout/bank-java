package com.bank.study.interfacepolimorfismo;

import com.bank.study.estruturadedados.Circulo;

public class Main {
    public static void main(String[] args) {
        Calculo [] formas = new Calculo[4];

        formas[0] = new Quadrado(10);
        formas[1] = new Retangulo(10,7);
        formas[2] = new Triangulo(7,8);
        formas[3] = new Circulo(2,3.14);


        for (int i = 0; i < formas.length; i++) {
            Calculo forma = formas[i];
            System.out.println(forma.calcularArea());
        }
    }
}
