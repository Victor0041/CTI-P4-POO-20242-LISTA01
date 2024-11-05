package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR A QUANTIDADE DE CONVITES A SEREM VENDIDOS PARA COBRIR O CUSTO DE UMA PEÇA DE TEATRO\n");

        System.out.print("Digite o custo total de produção: ");
        float custo = scanner.nextFloat();

        System.out.print("Digite o valor do convite: ");
        float precoConvite = scanner.nextFloat();
        
        int quantidadeConvites = (int) Math.ceil(custo / precoConvite);

        System.out.printf("Será necessário vender no mínimo %d convites para cobrir o custo de produção do teatro.%n", quantidadeConvites);

        scanner.close();
    }
}

