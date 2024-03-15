package exercicios05;

import java.util.Scanner;

public class ExercicioDiasdaSemanaifTernario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Digite um numero: ");
			int dia = sc.nextInt(); 

	        String nomeDoDia = (dia == 1) ? "Domingo" :
	                           (dia == 2) ? "Segunda-feira" :
	                           (dia == 3) ? "Terça-feira" :
	                           (dia == 4) ? "Quarta-feira" :
	                           (dia == 5) ? "Quinta-feira" :
	                           (dia == 6) ? "Sexta-feira" :
	                           (dia == 7) ? "Sábado" : "Dia inválido";

	        System.out.println("O dia " + dia + " é " + nomeDoDia + ".");
	        
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}
		
        sc.close();
	}

}
