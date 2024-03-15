package exercicios05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";
		
		try {
			
			while(resposta.equals("sim")||resposta.equals("sim")) {
			
			
			System.out.println("Digite um valor: ");
			int numero = sc.nextInt();
			
			if(numero >= 0) {
				System.out.println("O numero é positivo.");
				
			}else {
				System.out.println("O nume é negativo.");
			}
			System.out.println("Deseja Continuar?");
			resposta = sc.next(); 
			
			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite uma Informação valida.");
		
		}
		
		
	}
}
