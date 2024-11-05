package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
	
		        Scanner scanner = new Scanner(System.in);
		        
		        
		        double salarioBase, gratificacao, imposto, salarioFinal;
		        
		        
		        System.out.print("Digite seu salário base: ");
		        salarioBase = scanner.nextDouble();
		        
		       
		        gratificacao = salarioBase * 0.05;
		        
		        
		        imposto = salarioBase * 0.07;
		        
		        
		        salarioFinal = salarioBase + gratificacao - imposto;
		        
		       
		        System.out.printf("\n\nDADOS ATUALIZADOS:\n\n");
		        System.out.printf("Você receberá %.2f reais de gratificação\n", gratificacao);
		        System.out.printf("Você pagará %.2f reais de impostos\n", imposto);
		        System.out.printf("Seu salário final será de %.2f reais\n", salarioFinal);
		        
		        
		        scanner.close();
		    }
		


	}


