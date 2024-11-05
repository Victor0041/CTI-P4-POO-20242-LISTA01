package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pi = 3.14f;

        float raio, area;

        System.out.println("CÁLCULO DA ÁREA DE UM CÍRCULO\n");

        System.out.print("Digite o valor do raio da circunferência: ");
        raio = scanner.nextFloat();

        area = pi * raio * raio;

        System.out.printf("A área do círculo é: %.2f\n", area);

        scanner.close();
    }
}
