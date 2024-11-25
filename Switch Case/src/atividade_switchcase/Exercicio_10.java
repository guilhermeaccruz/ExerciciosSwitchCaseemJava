package atividade_switchcase;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        switch (numero) {
            case 0:
                fatorial = 1;
                break;
            default:
                if (numero < 0) {
                    System.out.println("Não é possível calcular o fatorial de um número negativo.");
                    return;
                }
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                break;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
