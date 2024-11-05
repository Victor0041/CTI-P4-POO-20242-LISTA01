package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1, n2;
        double potencia;

        System.out.print("Digite um número maior que zero: ");
        n1 = scanner.nextInt();
        System.out.print("Digite outro número maior que zero: ");
        n2 = scanner.nextInt();

        if (n1 > 0 && n2 > 0) {
            potencia = Math.pow(n1, n2);

            System.out.printf("O resultado de %d elevado a %d é: %.0f\n", n1, n2, potencia);
        } else {
            System.out.println("Ambos os números devem ser maiores que zero.");
        }

        scanner.close();
    }
}
