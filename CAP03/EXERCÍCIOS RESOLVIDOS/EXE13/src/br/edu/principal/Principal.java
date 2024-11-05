package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		


		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Digite um número em pés: ");
		        float num = scanner.nextFloat();

		        
		        float polegada = num * 12;    
		        float jarda = num / 3;         
		        float milha = num / 5280;      

		       
		        System.out.printf("O número %.0f convertido para polegadas é: %.2f\n", num, polegada);
		        System.out.printf("O número %.0f convertido para jardas é: %.2f\n", num, jarda);
		        System.out.printf("O número %.0f convertido para milhas é: %.6f\n", num, milha);

		       
		        scanner.close();
		    }
		


	}

