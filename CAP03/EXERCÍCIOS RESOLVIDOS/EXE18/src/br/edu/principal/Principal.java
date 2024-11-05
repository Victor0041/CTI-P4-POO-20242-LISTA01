package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULO DE RACAO \n");

        System.out.print("Digite o peso do saco de racao em Kg: ");
        float saco = scanner.nextFloat();

        System.out.print("Digite a quantidade de racao fornecida por dia para cada gato (em gramas): ");
        float qRacao = scanner.nextFloat();

        saco = saco * 1000;

        float quantidadeTotal = (qRacao * 2) * 5;
        float resto = saco - quantidadeTotal;

        System.out.printf("Apos 5 dias sobrara %.2f kg de racao\n", resto / 1000);

        scanner.close();
    }
}
