package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		
		        
		        Scanner scanner = new Scanner(System.in);

		        
		        float n1, n2, n3, soma, media;

		        
		        System.out.print("Digite a primeira nota: ");
		        n1 = scanner.nextFloat();

		        System.out.print("Digite a segunda nota: ");
		        n2 = scanner.nextFloat();

		        System.out.print("Digite a terceira nota: ");
		        n3 = scanner.nextFloat();

		        
		        soma = n1 + n2 + n3;

		        
		        media = soma / 3;

		        
		        System.out.printf("A média das notas será: %.2f\n", media);

		        
		        scanner.close();
		    }
		


	}


