import com.bank.study.atributos.Squadra;

import java.util.Scanner;

public class MainSquadra {
    public static void main(String[] args) {
        Scanner relatorio = new Scanner(System.in);
        Squadra clube = new Squadra();

        System.out.println("------------------------");
        System.out.println("Digite o nome do Clube : ");
        String nome = relatorio.nextLine();// next Line le mais de uma palavra
        clube.setNome(nome);
        System.out.println("Digite a quantidaade de atleta que tem no elenco: ");
        int atletas = relatorio.nextInt();// next le somente 1 palavra
        clube.setAtletas(atletas);
        System.out.println("O NOME DO CLUBE INFORMADO é :" + clube.getNome());
        System.out.println("A QUANTIDADE DE ATLETAS é : " + clube.getAtletas());

        relatorio.close();
        System.out.println("--------------------------");
    }
}
