package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DA QUANTIDADE DE DEGRAUS DE UMA ESCADA \n");

        System.out.print("Digite a altura do degrau: ");
        float alturaDegrau = scanner.nextFloat();

        System.out.print("Digite a altura que deseja alcançar: ");
        float alturaUsuario = scanner.nextFloat();

        float quantidadeDegraus = alturaUsuario / alturaDegrau;

        System.out.printf("Aproximadamente você precisará de %.1f degraus.%n", quantidadeDegraus);

        scanner.close();
    }
}
