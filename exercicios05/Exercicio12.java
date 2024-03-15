package exercicios05;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		
			// Ler quantidade atual em estoque
            System.out.print("Digite a quantidade atual em estoque: ");
            int quantidadeAtual = sc.nextInt();

            // Ler quantidade máxima em estoque
            System.out.print("Digite a quantidade máxima em estoque: ");
            int quantidadeMaxima = sc.nextInt();

            // Ler quantidade mínima em estoque
            System.out.print("Digite a quantidade mínima em estoque: ");
            int quantidadeMinima = sc.nextInt();

            // Calcular quantidade média
            int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

            // Verificar se a quantidade em estoque é maior ou igual à quantidade média
            if (quantidadeAtual >= quantidadeMedia) {
                System.out.println("Não efetuar compra");
            } else {
                System.out.println("Efetuar compra");
            }
			
			
		} catch (Exception e) {
			System.out.println("Digite um valor Valido");
		}
		
		
		
		sc.close();
	}
	
}
