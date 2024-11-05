package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        float sal = scanner.nextFloat();

        float cpmf = (sal * 0.38f / 100) * 2;
        float saldo = sal - cpmf;

        System.out.printf("Seu saldo atual será de %.2f reais\n", saldo);

        scanner.close();
    }
}

