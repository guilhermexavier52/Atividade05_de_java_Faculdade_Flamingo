package exercicios05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o primeiro valor:");
	        double primeiroValor = sc.nextDouble();
	        
	        System.out.println("Digite o segundo valor:");
	        double segundoValor = sc.nextDouble();
	        
	        // Verificar qual é o menor e qual é o maior valor
	        double menor, maior;
	        if (primeiroValor < segundoValor) {
	            menor = primeiroValor;
	            maior = segundoValor;
	        } else {
	            menor = segundoValor;
	            maior = primeiroValor;
	        }
	        
	        // Imprimir os valores em ordem crescente
	        System.out.println("Valores em ordem crescente:");
	        System.out.println(menor);
	        System.out.println(maior);
	        
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido");
		}
		
		sc.close();
	}
	
	
}
