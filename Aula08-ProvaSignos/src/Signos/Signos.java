package Signos;

import java.util.Scanner;

public class Signos {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 //Crie um programa que informe o signo do usuário
		
		Scanner inf= new Scanner(System.in);
		
		byte dia, mes;
		String signo;					

		System.out.println("Informe a data de nascimento:");
		Scanner input = null;
		dia = (byte) input.nextInt();
		
		System.out.println("\nInforme o mes de nascimento:");
		mes = (byte) input.nextInt();
			
	 if (mes == 3 && dia >= 21 || mes == 4 && dia >= 20) {
		 signo = "Aries";
		}
			
			
		if (mes == 4 && dia >= 21 || mes == 5 && dia >= 20) {
			 signo = "Touro";
		}
		
	   if (mes == 5 && dia >= 21 || mes == 6 && dia >= 20) {
			 signo = "Gemeos";
	   }
    	if (mes == 6 && dia >= 21 && dia <= 30 || mes == 7 && dia <= 22 && dia <= 31) {
			signo = "Câncer";
		}
		if (mes == 7 && dia >= 23 && dia <= 31 || mes == 8 && dia <= 22 && dia <= 31 ) {
			signo = "Leão";
		}
		if (mes == 8 && dia >= 23 && dia <= 30 || mes == 9 && dia <= 22 && dia <= 30) {
			signo = "Virgem";
		}
		if (mes == 9 && dia >= 23 && dia <= 30 || mes == 10 && dia <= 22 && dia <= 31) {
			signo = "Libra";
		}
		if (mes == 10 && dia >= 23 && dia <= 31 || mes == 11 && dia <= 21 && dia <= 30) {
			signo = "Escorpião";
		}
		if (mes == 11 && dia >= 22  && dia <= 30|| mes == 12 && dia <= 21 && dia <= 31) {
			signo = "Sagitário";
		}
		if (mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia <= 19 && dia <= 31) {
			signo = "Capricórnio";
		}
		if (mes == 1 && dia >= 20 && dia <= 31 || mes == 2 && dia <= 18 && dia <= 28) {
			signo = "Aquário";
		}
		if (mes == 2 && dia >= 19 && dia <= 28 || mes == 3 && dia <= 20 && dia <= 31) {
			signo = "Peixes";
		}

	}
	}