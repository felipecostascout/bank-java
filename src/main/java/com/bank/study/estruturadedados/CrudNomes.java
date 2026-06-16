package com.bank.study.estruturadedados;

import java.util.Scanner;

public class CrudNomes {
    public static void main(String[] args) {
        String[] produtos = new String[10];
        Scanner leia = new Scanner(System.in);
        int contador = 0;
        while (true) {
            System.out.println("Digite 1 para inserir um produto");
            System.out.println("Digite 2 para pesquisar um produto");
            System.out.println("Digite 3 para atualizar um produto");
            System.out.println("Digite 4 para excluir um produto");
            System.out.println("Digite 5 para mostrar todos os produtos");
            System.out.println("Digite 0 para finalizar um programa ");

            int menu = leia.nextInt();
            if (menu == 0) {
                System.out.println("Programa Encerrado");
                break;
            } else if (menu == 1) {
                System.out.println("Digite um produto");
                String produto = leia.next();
                produtos[contador] = produto;
                contador++;

            } else if (menu == 5) {// == comparaçao de Int
                for (int i = 0; i < contador; i++) {
                    String produto = produtos[i];

                    System.out.println(produto);

                }
            } else if (menu == 2) {
                System.out.println("Digite o produto que deseja : ");
                String produtoPesquisar = leia.next();
                boolean encontrou = false;
                for (int i = 0; i < contador; i++) {
                    String produto = produtos[i];
                    if (produtoPesquisar.equals(produto)) {// equals comparacao de Strings
                        System.out.println("Produto existe na base de Dados");
                        encontrou = true;

                        break;
                    }

                }
                if (!encontrou) {
                    System.out.println("produto nao Existe");
                }

            } else if (menu == 3) {
                System.out.println("Digite o Produto que deseja atualizar");
                String produtoAtualizar = leia.next();
                boolean encontrou = false;
                System.out.println("Digite o novo nome do Produto");
                String novoProduto = leia.next();

                for (int i = 0; i < produtos.length; i++) {
                    String produto = produtos[i];
                    if (produtoAtualizar.equals(produto)) {
                        produtos[i] = novoProduto;
                        System.out.println("Produto Atualizado");
                        encontrou = true;
                        break;

                    }
                }
                if (!encontrou) {
                    System.out.println(" Produto Atualizado ");
                }
            } else if (menu == 4) {
                System.out.println("Qual produto deseja excluir : ");
                String produtoExcluir = leia.next();
                boolean encontrou = true;
                for (int i = 0; i < produtos.length; i++) {
                    String produto = produtos[i];
                    if (produtoExcluir.equals(produto)) {
                        produtos[i] = produtos[contador - 1];
                        produtos[contador - 1] = null;
                        contador--;
                        break;
                    }
                    if (!encontrou) {
                        System.out.println(" Produto Excluido ");
                    }

                }
            }
        }


    }


}

