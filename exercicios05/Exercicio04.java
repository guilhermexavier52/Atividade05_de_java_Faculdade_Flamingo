package exercicios05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.print("Digite a primeira nota da avaliação: ");
	        double nota1 = obterNotaValida(sc);

	        System.out.print("Digite a segunda nota da avaliação: ");
	        double nota2 = obterNotaValida(sc);

	        // Calcular a média aritmética simples
	        double media = (nota1 + nota2) / 2;
	        
	        // Verificar se o aluno foi aprovado
	        if (media >= 6.0) {
	            System.out.println("Parabéns! Você foi aprovado.");
	        } else {
	            System.out.println("Infelizmente, você foi reprovado.");
	        }

	        // Exibir a média calculada
	        System.out.println("Média: " + media);
	        
	       
	    
			
		} catch (Exception e) {
			System.out.println("Digite uma Informação Valida.");
		}
		 sc.close();
	}
		 

	    // Método para obter uma nota válida dentro do intervalo de 0 a 10
	    private static double obterNotaValida(Scanner scanner) {
	        double nota;
	        do {
	            nota = scanner.nextDouble();
	            if (nota < 0 || nota > 10) {
	                System.out.println("Por favor, digite uma nota válida entre 0 e 10.");
	                System.out.print("Digite novamente: ");
	            }
	        } while (nota < 0 || nota > 10);
	        return nota;
	    }
	}