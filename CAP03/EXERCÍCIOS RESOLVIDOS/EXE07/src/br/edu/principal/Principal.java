package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		


		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Digite seu salario: ");
		        float sal = scanner.nextFloat();

		        
		        float imposto = sal * 0.1f;
		        float sFinal = sal - imposto + 50;

		        
		        System.out.printf("Salário a receber: %.2f reais\n", sFinal);

		        scanner.close();
		    }
		


	}


