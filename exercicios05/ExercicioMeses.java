package exercicios05;

import java.util.Scanner;

public class ExercicioMeses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {

			while (resposta.equals("sim") || resposta.equals("Sim")) {

				System.out.println("Digite um numero de 1 a 12: ");
				int meses = sc.nextInt();

				if (meses == 1) {
					System.out.println("Janeiro");
				} else if (meses == 2) {
					System.out.println("Fevereiro");
				} else if (meses == 3) {
					System.out.println("Março");
				} else if (meses == 4) {
					System.out.println("Abril");
				} else if (meses == 5) {
					System.out.println("Maio");
				} else if (meses == 6) {
					System.out.println("Junho");
				} else if (meses == 7) {
					System.out.println("Julho");
				} else if (meses == 8) {
					System.out.println("Agosto");
				} else if (meses == 9) {
					System.out.println("Setembro");
				} else if (meses == 10) {
					System.out.println("Outubro");
				} else if (meses == 11) {
					System.out.println("Novembro");
				} else if (meses == 2) {
					System.out.println("Dezembro");
				} else {
					System.out.println("Digite o Numero valido.");
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
