package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		


		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Digite o valor de fábrica do veículo: R$ ");
		        double pFabrica = scanner.nextDouble();

		        System.out.print("Digite o percentual de lucro do distribuidor: ");
		        double perLucro = scanner.nextDouble();

		        System.out.print("Digite o percentual de impostos: ");
		        double perImpostos = scanner.nextDouble();

		        
		        double lucro = pFabrica * (perLucro / 100);   
		        double precoFinal = pFabrica + lucro + perImpostos;  

		        
		        System.out.printf("\nO valor correspondente ao lucro do distribuidor é: R$ %.2f\n", lucro);
		        System.out.printf("O valor correspondente aos impostos é: R$ %.2f\n", perImpostos);
		        System.out.printf("O preço final do veículo será: R$ %.2f\n", precoFinal);

		        
		        scanner.close();
		    }
		


	}


