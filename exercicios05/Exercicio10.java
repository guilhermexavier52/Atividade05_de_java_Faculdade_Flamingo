package exercicios05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite o salário fixo do vendedor: ");
	        double salarioFixo = sc.nextDouble();

	        // Ler o valor das vendas efetuadas pelo vendedor
	        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
	        double valorVendas = sc.nextDouble();

	        // Calcular a comissão
	        double comissao;
	        if (valorVendas <= 1500) {
	            comissao = valorVendas * 0.03;
	        } else {
	            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
	        }

	        // Calcular o salário total
	        double salarioTotal = salarioFixo + comissao;

	        // Exibir o resultado
	        System.out.println("O salário total do vendedor é: R$" + salarioTotal);

		} catch (Exception e) {
			System.out.println("Digite um valor valido.");
		}
		
		
		
		sc.close();
	}
	
}
