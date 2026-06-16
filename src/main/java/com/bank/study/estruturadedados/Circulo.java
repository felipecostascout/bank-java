package com.bank.study.estruturadedados;

import com.bank.study.interfacepolimorfismo.Calculo;

public class Circulo implements Calculo {
    private final double raio;
    private final double pi = 3.14;

    public Circulo(double raio, double pi){
        this.raio = raio;

    }

    public double getRaio(){
        return raio;

    }

    public double getPi() {
        return pi;
    }

    @Override
    public double calcularArea() {
        return raio*pi;
    }
}
