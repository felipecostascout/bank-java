package com.bank.study.interfacepolimorfismo;

public class Quadrado implements Calculo  {
    private final double lado;
    // Construtor
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
