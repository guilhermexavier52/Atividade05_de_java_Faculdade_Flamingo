package exercicios05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		while (resposta.equals("sim")) {
			try {
				System.out.print("Digite o número de maçãs compradas: ");
				int quantidadeMacas = sc.nextInt();

				// Verifica se a quantidade é válida
				if (quantidadeMacas >= 0) {
					// Calcula o custo total com base nas condições
					double custoTotal;
					if (quantidadeMacas < 12) {
						custoTotal = quantidadeMacas * 1.30;
					} else {
						custoTotal = quantidadeMacas * 1.00;
					}

					System.out.println("O custo total é: " + custoTotal);
				} else {
					System.out.println("Quantidade inválida! Por favor, insira um número positivo.");
				}

				System.out.println("Deseja Continuar? (sim/não)");
				resposta = sc.next().toLowerCase();
			} catch (Exception e) {
				System.out.println("Informação Inválida");
				// Limpar o buffer do scanner
				sc.next();
			}
		}
		sc.close();
	}
}