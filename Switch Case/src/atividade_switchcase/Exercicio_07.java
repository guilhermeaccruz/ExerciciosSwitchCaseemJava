package atividade_switchcase;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: R$ ");
        double salario = scanner.nextDouble();

        double imposto;

        if (salario <= 1500.00) {
            imposto = salario * 0.05;  
        } else if (salario <= 3000.00) {
            imposto = salario * 0.10;  
        } else {
            imposto = salario * 0.15;  
        }

        System.out.println("O valor do imposto a ser pago é: R$ " + imposto);

        scanner.close();
    }
}
