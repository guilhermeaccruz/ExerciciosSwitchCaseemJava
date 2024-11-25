package atividade_switchcase;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inv�lida! Por favor, insira uma nota entre 0 e 10.");
        } else {
            String classificacao;

            switch (nota) {
                case 9:
                case 10:
                    classificacao = "A";
                    break;
                case 7:
                case 8:
                    classificacao = "B";
                    break;
                case 5:
                case 6:
                    classificacao = "C";
                    break;
                case 3:
                case 4:
                    classificacao = "D";
                    break;
                case 0:
                case 1:
                case 2:
                    classificacao = "F";
                    break;
                default:
                    classificacao = "Indefinida"; // N�o deve ser alcan�ada
            }

            System.out.println("A classifica��o para a nota " + nota + " �: " + classificacao);
        }

        scanner.close();
    }
}
