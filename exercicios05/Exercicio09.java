package exercicios05;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			
			 // Pedir ao usuário para inserir o número de horas trabalhadas em um mês e o salário por hora
            System.out.println("Digite o número de horas trabalhadas em um mês:");
            double horasTrabalhadas = sc.nextDouble();

            System.out.println("Digite o salário por hora:");
            double salarioPorHora = sc.nextDouble();

            // Calcular o salário total
            double salarioTotal;
            if (horasTrabalhadas <= 40) {
                salarioTotal = horasTrabalhadas * salarioPorHora;
            } else {
                // Calcular horas extras e adicionar ao salário total
                double horasExtras = horasTrabalhadas - 40;
                double salarioHoraExtra = salarioPorHora * 1.5; // Acréscimo de 50%
                salarioTotal = (40 * salarioPorHora) + (horasExtras * salarioHoraExtra);
            }

            // Imprimir o salário total do funcionário
            System.out.println("O salário total do funcionário é: R$" + salarioTotal);

		} catch (Exception e) {
			System.out.println("Entrada invalido.");
		}
		
		
		
		
		sc.close();
	}

}
