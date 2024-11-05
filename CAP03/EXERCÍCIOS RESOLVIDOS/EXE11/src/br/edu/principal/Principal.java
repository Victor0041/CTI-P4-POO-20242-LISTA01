package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        double quadrado, cubo, raizQuad, raizCub;

        System.out.println("                              CÁLCULOS BÁSICOS                              \n");

        System.out.print("Digite um número positivo e maior que zero: ");
        numero = scanner.nextInt();

        if (numero > 0) {
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            raizQuad = Math.sqrt(numero);
            raizCub = Math.cbrt(numero);

            System.out.println("\nCALCULOS:");
            System.out.printf("O quadrado de %d é: %.0f\n", numero, quadrado);
            System.out.printf("O cubo de %d é: %.0f\n", numero, cubo);
            System.out.printf("A raiz quadrada de %d é: %.2f\n", numero, raizQuad);
            System.out.printf("A raiz cúbica de %d é: %.2f\n", numero, raizCub);
        } else {
            System.out.println("Por favor, digite um número positivo e maior que zero.");
        }

        scanner.close();
    }
}
