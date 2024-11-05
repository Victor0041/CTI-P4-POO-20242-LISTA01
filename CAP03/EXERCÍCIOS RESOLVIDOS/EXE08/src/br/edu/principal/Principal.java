package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
	
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Digite o valor de seu deposito: ");
		        float deposito = scanner.nextFloat();

		       
		        System.out.print("Digite o valor da taxa de juros (em %): ");
		        float juros = scanner.nextFloat();

		        
		        float rendimento = deposito * (juros / 100);

		        
		        float total = deposito + rendimento;

		        
		        System.out.printf("O rendimento será de: %.2f\n", rendimento);
		        System.out.printf("O valor total depois do rendimento será de: %.2f\n", total);

		        
		        scanner.close();
		    }
		


	}


