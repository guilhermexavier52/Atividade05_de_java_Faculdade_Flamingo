package exercicios05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			// Solicitar o ano atual
	        System.out.print("Digite o ano atual: ");
	        int anoAtual = sc.nextInt();
	        
	        // Solicitar o ano de nascimento da pessoa
	        System.out.print("Digite o ano de nascimento: ");
	        int anoNascimento = sc.nextInt();
	        
	        // Calcular a idade da pessoa
	        int idade = anoAtual - anoNascimento;
	        
	        // Verificar se a pessoa pode votar
	        if (idade >= 16) {
	            System.out.println("Você pode votar este ano!");
	        } else {
	            System.out.println("Você não pode votar este ano.");
	        }
			
		} catch (Exception e) {
            System.out.println("Digite uma informação Valida.");
		}

		sc.close();
	}

}
