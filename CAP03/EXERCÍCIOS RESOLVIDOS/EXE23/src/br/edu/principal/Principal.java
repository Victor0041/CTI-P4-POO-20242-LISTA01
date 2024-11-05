package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        int parteInteira = (int) numero;

        double parteFracionaria = numero - parteInteira;

        long arredondamento = Math.round(numero);

        System.out.printf("Parte Inteira: %d%n", parteInteira);
        System.out.printf("Parte Fracionária: %.2f%n", parteFracionaria);
        System.out.printf("Arredondamento: %d%n", arredondamento);

        scanner.close();
    }
}

