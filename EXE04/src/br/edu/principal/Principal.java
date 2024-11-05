package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		


		        Scanner scanner = new Scanner(System.in);
		        
		        
		        double salario, nSalario;
		        
		        
		        System.out.println("PROGRAMA PARA CALCULAR O NOVO SALÁRIO DE UM FUNCIONÁRIO.");
		        System.out.print("Digite seu salário: ");
		        salario = scanner.nextDouble();
		        
		        
		        nSalario = salario * 1.25;
		        
		        
		        System.out.printf("Seu novo salário é de: %.2f\n", nSalario);
		        
		       
		        scanner.close();
		    }
		}

		


	


