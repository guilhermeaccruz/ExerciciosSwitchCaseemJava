package atividade_switchcase;

import java.util.Scanner; 

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para saber o dia da semana correspondente:");
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
                nomeDoDia = "Terça-feira";
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
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Número inválido! Por favor, insira um número de 1 a 7.";
        }

        System.out.println("O dia da semana correspondente é: " + nomeDoDia);

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
