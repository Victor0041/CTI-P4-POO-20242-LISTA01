package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DE COMPRIMENTO DA ESCADA\n");

        System.out.print("Digite a altura da parede em que a escada está apoiada: ");
        float altura = scanner.nextFloat();

        System.out.print("Digite o ângulo em que a escada está apoiada (em graus): ");
        float angulo = scanner.nextFloat();

        double radiano = Math.toRadians(angulo);

        double escada = altura / Math.sin(radiano);

        System.out.printf("O comprimento da escada é de %.2f metros.%n", escada);

        scanner.close();
    }
}
