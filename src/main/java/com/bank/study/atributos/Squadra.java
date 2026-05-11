package com.bank.study.atributos;

public class Squadra {
    private String nome;
    private int atletas;
    private int totaltitulos;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAtletas(){
        return atletas;
    }

    public void setAtletas(int atletas) {
        this.atletas = atletas;
    }

    public int getTotaltitulos() {
        return totaltitulos;
    }

    public void setTotaltitulos(int totaltitulos) {
        this.totaltitulos = totaltitulos;
    }

}
