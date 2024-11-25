package atividade_switchcase;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma bebida pelo número:");
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");
        System.out.print("Digite o número da sua escolha: ");
        
        int escolha = scanner.nextInt();

        String bebida;

        switch (escolha) {
            case 1:
                bebida = "Café";
                break;
            case 2:
                bebida = "Chá";
                break;
            case 3:
                bebida = "Suco";
                break;
            case 4:
                bebida = "Refrigerante";
                break;
            default:
                bebida = "Opção inválida! Por favor, escolha um número entre 1 e 4.";
        }

        System.out.println("Você escolheu: " + bebida);

        scanner.close();
    }
}
