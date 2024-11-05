package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float base, altura, area;

        System.out.println("CÁLCULO DA ÁREA DO TRIÂNGULO\n");

        System.out.print("Digite a medida da base do triângulo: ");
        base = scanner.nextFloat();

        System.out.print("Digite a medida da altura: ");
        altura = scanner.nextFloat();
 
        area = (base * altura) / 2;

        System.out.printf("A área do triângulo é de: %.2f\n", area);

        scanner.close();
    }
}
