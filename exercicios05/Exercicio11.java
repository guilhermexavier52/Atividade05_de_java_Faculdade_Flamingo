package exercicios05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite o número da conta do cliente: ");
	        int numeroConta = sc.nextInt();

	        // Ler saldo
	        System.out.print("Digite o saldo: ");
	        double saldo = sc.nextDouble();

	        // Ler débito
	        System.out.print("Digite o débito: ");
	        double debito = sc.nextDouble();

	        // Ler crédito
	        System.out.print("Digite o crédito: ");
	        double credito = sc.nextDouble();

	        // Calcular saldo atual
	        double saldoAtual = saldo - debito + credito;

	        // Verificar se o saldo atual é positivo ou negativo
	        if (saldoAtual >= 0) {
	            System.out.println("Saldo Positivo");
	        } else {
	            System.out.println("Saldo Negativo");
	        }

	        // Escrever o saldo atual
	        System.out.println("Saldo atual: " + saldoAtual);
			
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido");
		}
		
		sc.close();
	}
	
}
