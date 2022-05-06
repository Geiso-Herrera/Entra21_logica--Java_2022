package br.com.entra21.ExercicioAula07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
	
		
		System.out.println("Digite o primeiro numero:");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero:");
		numero2 = entrada.nextInt();
		
		System.out.println("Soma: "+(numero1+numero2));
		System.out.println("Subtração: "+(numero1-numero2));
		System.out.println("Multiplicação : "+(numero1*numero2));
		System.out.println("Divisão : "+(numero1/numero2));

	
	
	
	
	}
}