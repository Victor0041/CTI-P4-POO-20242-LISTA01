package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TRANSFORMAÇÃO DE HORAS EM MINUTOS\n");

        System.out.print("Digite as horas (no formato hora.min): ");
        double hora = scanner.nextDouble();

        int horasInteiras = (int) hora; 
        double minutosDecimais = (hora - horasInteiras) * 100; 

        int minutosTotais = (horasInteiras * 60) + (int) minutosDecimais;

        System.out.printf("Conversão para minutos: %d minutos%n", minutosTotais);

        scanner.close();
    }
}

