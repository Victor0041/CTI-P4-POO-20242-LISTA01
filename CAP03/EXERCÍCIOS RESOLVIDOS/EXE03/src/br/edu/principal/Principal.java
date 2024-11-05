package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		


		        Scanner scanner = new Scanner(System.in);

		        
		        float n1, n2, n3, p1, p2, p3, media;

		        
		        System.out.print("Digite a primeira nota: ");
		        n1 = scanner.nextFloat();
		        System.out.print("Digite o peso da primeira nota: ");
		        p1 = scanner.nextFloat();

		        System.out.print("Digite a segunda nota: ");
		        n2 = scanner.nextFloat();
		        System.out.print("Digite o peso da segunda nota: ");
		        p2 = scanner.nextFloat();

		        System.out.print("Digite a terceira nota: ");
		        n3 = scanner.nextFloat();
		        System.out.print("Digite o peso da terceira nota: ");
		        p3 = scanner.nextFloat();

		        
		        media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

		        
		        System.out.printf("A média ponderada das notas é: %.2f\n", media);

		        
		        scanner.close();
		    }
		


	}


