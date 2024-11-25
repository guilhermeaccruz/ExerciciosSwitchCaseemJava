package atividade_switchcase;

import java.util.Scanner; 

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�mero de 1 a 7 para saber o dia da semana correspondente:");
        int dia = scanner.nextInt();

        String nomeDoDia;

        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Ter�a-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "S�bado";
                break;
            default:
                nomeDoDia = "N�mero inv�lido! Por favor, insira um n�mero de 1 a 7.";
        }

        System.out.println("O dia da semana correspondente �: " + nomeDoDia);

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
