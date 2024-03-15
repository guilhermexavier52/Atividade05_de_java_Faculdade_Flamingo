package exercicios05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o primeiro valor: ");
			double primeiroValor = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			double segundoValor = sc.nextDouble();	
			
			if (primeiroValor > segundoValor) {
				System.out.println("O valor maior é: " + primeiroValor);
			}else {
				System.out.println("O valor maior é: " + segundoValor);
				
			}
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido ");
		}
		
		
		
		sc.close();
	}
	
}
