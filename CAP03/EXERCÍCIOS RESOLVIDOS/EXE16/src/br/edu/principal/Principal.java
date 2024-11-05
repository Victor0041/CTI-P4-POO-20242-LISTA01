package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Digite o número de horas trabalhadas: ");
		        double horas = scanner.nextDouble();

		        System.out.print("Digite o valor do salário mínimo: R$ ");
		        double salMinimo = scanner.nextDouble();

		        
		        double valorHora = salMinimo / 2;           
		        double salarioBruto = horas * valorHora;     
		        double imposto = salarioBruto * 0.03;       
		        double salarioReceber = salarioBruto - imposto; 

		       
		        System.out.printf("\nO valor do salário a receber será: R$ %.2f\n", salarioReceber);

		        
		        scanner.close();
		    }
		


	}


