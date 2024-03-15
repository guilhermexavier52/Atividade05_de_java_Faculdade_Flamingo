package exercicios05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   try {
		
		   System.out.println("Digite um valor:");
		   int valor = sc.nextInt();
		   
		   if(valor > 10) {
			   
			   System.out.println("O valor e maio que 10");
		   }else {
			System.out.println("O valor e menor que 10");   
		   }
		   sc.close();
		   
	} catch (Exception e) {
		System.out.println("Digite uma informação valida.");
	}
	   
	}
	
}
