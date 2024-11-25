package atividade_switchcase;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu de Op��es:");
            System.out.println("1 - Exibir 'Ol�, Mundo!'");
            System.out.println("2 - Exibir 'Bem-vindo ao C#'");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma op��o: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ol�, Mundo!");
                    break;
                case 2:
                    System.out.println("Bem-vindo ao C#!");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Op��o inv�lida! Por favor, escolha uma op��o v�lida.");
            }

            System.out.println(); 
        } while (opcao != 3);

        scanner.close();
    }
}
