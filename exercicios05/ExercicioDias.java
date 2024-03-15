package exercicios05;

import java.util.Scanner;

public class ExercicioDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim")) {

				System.out.println("Digite um Numero 1 a 7: ");
				int diasDaSemana = sc.nextInt();

				if (diasDaSemana == 1) {
					System.out.println("Domingo");
				} else if (diasDaSemana == 2) {
					System.out.println("Segunda-Feira");
				} else if (diasDaSemana == 3) {
					System.out.println("Terça-Feira");
				} else if (diasDaSemana == 4) {
					System.out.println("Quarta-Feira");
				} else if (diasDaSemana == 5) {
					System.out.println("Quinta-Feira");
				} else if (diasDaSemana == 6) {
					System.out.println("Sexta-Feira");
				} else if (diasDaSemana == 7) {
					System.out.println("Sabado");
				} else {
					System.out.println("Numero Invalido");

			

				}
				System.out.println("Deseja Continuar ?");
				resposta = sc.next();

			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println("Informação Invalida");

		}

	}

}
