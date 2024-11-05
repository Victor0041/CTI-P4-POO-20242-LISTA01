package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da escada: ");
        float tamanhoEscada = scanner.nextFloat();

        System.out.print("Digite a altura do quadro: ");
        float alturaQuadro = scanner.nextFloat();

        if (tamanhoEscada <= alturaQuadro) {
            System.out.println("Erro: O tamanho da escada deve ser maior que a altura desejada para pregar o quadro.");
        } else {
            double distancia = Math.sqrt(Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2));
            System.out.printf("A distância da escada até a parede deve ser de aproximadamente %.2f metros.%n", distancia);
        }

        scanner.close();
    }
}
