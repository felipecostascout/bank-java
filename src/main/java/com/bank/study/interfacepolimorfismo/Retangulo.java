package com.bank.study.interfacepolimorfismo;

public class Retangulo implements Calculo {
    private final double base;
    private final double altura;
    //Construtor

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}
