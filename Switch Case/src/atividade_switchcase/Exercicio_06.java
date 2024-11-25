package atividade_switchcase;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma bebida pelo n�mero:");
        System.out.println("1 - Caf�");
        System.out.println("2 - Ch�");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");
        System.out.print("Digite o n�mero da sua escolha: ");
        
        int escolha = scanner.nextInt();

        String bebida;

        switch (escolha) {
            case 1:
                bebida = "Caf�";
                break;
            case 2:
                bebida = "Ch�";
                break;
            case 3:
                bebida = "Suco";
                break;
            case 4:
                bebida = "Refrigerante";
                break;
            default:
                bebida = "Op��o inv�lida! Por favor, escolha um n�mero entre 1 e 4.";
        }

        System.out.println("Voc� escolheu: " + bebida);

        scanner.close();
    }
}
