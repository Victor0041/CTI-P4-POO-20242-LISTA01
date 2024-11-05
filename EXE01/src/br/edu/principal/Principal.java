package br.edu.principal;
import java.util.Scanner;
	public class Principal {

	public static void main(String[] args) {
		
		
		
		
		      
		        Scanner scanner = new Scanner(System.in);

		        
		        int num1, num2, num3, num4, soma;

		       
		        System.out.print("Digite o primeiro número: ");
		        num1 = scanner.nextInt();

		        System.out.print("Digite o segundo número: ");
		        num2 = scanner.nextInt();

		        System.out.print("Digite o terceiro número: ");
		        num3 = scanner.nextInt();

		        System.out.print("Digite o quarto número: ");
		        num4 = scanner.nextInt();

		        
		        soma = num1 + num2 + num3 + num4;

		        
		        System.out.println("A soma dos 4 números é: " + soma);

		        
		        scanner.close();
		    }
	



	}


