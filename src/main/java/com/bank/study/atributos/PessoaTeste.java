package com.bank.study.atributos;

public class PessoaTeste {
    private String nome;
    public static String sobrenome;// todas terao o mesmo valor , mas pode ser alterado
    public static final String TIME = "Sao Paulo"; // algo que é sempre o mesmo e nao muda
    private int idade;
    private String cidade;

    public String getNome (){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
}
//Encapsulamento

