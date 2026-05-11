package com.bank.study.atributos;

import java.util.Scanner;

public class MainPessoaTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); //leitura de entrada ---Estanciar "new Scanner"--
        PessoaTeste pessoa = new PessoaTeste();
        //PessoaTeste.TIME = "Sport" nao pode ser atribuido valor para atribudo final.pq ele ja nasce com o valor e nao pode ser alterado
        System.out.println("Digite o nome da cidade : ");
        String cidade = leia.next();
        pessoa.setCidade(cidade);
        System.out.println("Digite o seu nome : ");
        String nome = leia.next();
        pessoa.setNome(nome);
        System.out.println("Digite sua idade");
        int idade =leia.nextInt();
        pessoa.setIdade(idade);
        PessoaTeste.sobrenome = "Costa";
        System.out.println(PessoaTeste.sobrenome);

        System.out.println(" O nome dele é " + pessoa.getNome() + pessoa.getCidade() + "A idade é " + pessoa.getIdade() );

        PessoaTeste pessoa2 = new PessoaTeste();

        System.out.println("Digite seu nome");
        String nome2 = leia.next();
        pessoa2.setNome(nome);

        PessoaTeste.sobrenome = "Costa";
        System.out.println("Nome dele é " + pessoa2.getNome() + " e o seu sobrenome é :" + PessoaTeste.sobrenome);


    }
}
