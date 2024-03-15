package exercicios05;

import java.util.Scanner;

public class Exercicio08 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite a hora de início do jogo (inteiro entre 0 e 23):");
            int horaInicio = sc.nextInt();
            
            System.out.println("Digite a hora de fim do jogo (inteiro entre 0 e 23):");
            int horaFim = sc.nextInt();
            
            // Calcular a duração do jogo
            int duracao;
            if (horaFim >= horaInicio) {
                // O jogo termina no mesmo dia em que começou
                duracao = horaFim - horaInicio;
            } else {
                // O jogo termina no próximo dia
                duracao = 24 - horaInicio + horaFim;
            }
            
            // Imprimir a duração do jogo
            System.out.println("A duração do jogo é de " + duracao + " horas.");
            
			
		} catch (Exception e) {
			System.out.println("Entrada inválida. Por favor, digite um número inteiro entre 0 e 23.");
		}
		
		
		
		
		sc.close();
	}
}
