package atividade_switchcase;
import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a classifica��o et�ria do filme:");
        System.out.println("G (Livre)");
        System.out.println("PG (Maior de 10 anos)");
        System.out.println("PG-13 (Maior de 13 anos)");
        System.out.println("R (Maior de 18 anos)");
        System.out.print("Digite a classifica��o: ");
        
        String classificacao = scanner.nextLine();

        String faixaEtaria;

        switch (classificacao) {
            case "G":
                faixaEtaria = "Livre para todas as idades.";
                break;
            case "PG":
                faixaEtaria = "Permitido para maiores de 10 anos.";
                break;
            case "PG-13":
                faixaEtaria = "Permitido para maiores de 13 anos.";
                break;
            case "R":
                faixaEtaria = "Permitido para maiores de 18 anos.";
                break;
            default:
                faixaEtaria = "Classifica��o inv�lida! Por favor, insira uma classifica��o v�lida.";
                break;
        }

        System.out.println("A faixa et�ria permitida �: " + faixaEtaria);

        scanner.close();
    }
}
