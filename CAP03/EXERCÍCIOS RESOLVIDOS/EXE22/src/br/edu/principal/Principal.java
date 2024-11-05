package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DE KW/h\n");

        System.out.print("Digite o valor do salário mínimo: ");
        float salarioMinimo = scanner.nextFloat();

        System.out.print("Digite o consumo de KW/h de sua residência: ");
        float consumoKw = scanner.nextFloat();

        float valorKw = salarioMinimo / 5;
        float valorTotal = consumoKw * valorKw;
        float desconto = valorTotal * 0.15f;
        float totalComDesconto = valorTotal - desconto;

        System.out.println("\nDADOS A PAGAR\n");
        System.out.printf("O valor de cada KW/h será de %.2f reais\n", valorKw);
        System.out.printf("O valor a ser pago será de %.2f reais\n", valorTotal);
        System.out.printf("O valor a ser pago com desconto de 15%% será de %.2f reais\n", totalComDesconto);

        scanner.close();
    }
}

