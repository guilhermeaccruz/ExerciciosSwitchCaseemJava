package atividade_switchcase;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a convers�o de temperatura:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Digite o n�mero da sua escolha: ");
        
        int escolha = scanner.nextInt();

        double temperaturaConvertida;

        switch (escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                temperaturaConvertida = (celsius * 9/5) + 32;
                System.out.println(celsius + "�C � igual a " + temperaturaConvertida + "�F.");
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                temperaturaConvertida = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + "�F � igual a " + temperaturaConvertida + "�C.");
                break;
            default:
                System.out.println("Op��o inv�lida! Por favor, escolha 1 ou 2.");
                break;
        }

        scanner.close();
    }
}
