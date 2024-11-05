package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
	

	
		        Scanner scanner = new Scanner(System.in);
		        
		      
		        double salario, percentual, aumento, nSalario;
		        
		        
		        System.out.print("Digite seu atual salario: ");
		        salario = scanner.nextDouble();
		        
		     
		        System.out.print("Digite o percentual de aumento: ");
		        percentual = scanner.nextDouble();
		        
		       
		        percentual = percentual / 100; 
		        aumento = salario * percentual;
		        
		        
		        nSalario = salario + aumento;
		        
		        
		        System.out.printf("\nO seu salario teve um aumento de %.2f reais\n", aumento);
		        System.out.printf("Seu novo salario sera de %.2f reais\n", nSalario);
		        
		        
		        scanner.close();
		    }
		

		    }
		


	


