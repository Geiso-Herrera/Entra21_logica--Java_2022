package br.com.entra21.exercicioAula06;

import java.util.Scanner;

public class Exercicio_03_Aula06 {

	public static void main(String[] args) {
		
		final float alturaMinima=1.5f;
		String nomeUsuario;
		float alturaUsuario;
		byte idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual seu nome:");
		nomeUsuario = entrada.nextLine();
		
		System.out.println("Digite sua altura: ");
		alturaUsuario = entrada.nextFloat();
		
		if (alturaUsuario<alturaMinima) {
			System.out.println("Desculpe "+nomeUsuario+", você não possui altura para brincar no brinquedo.");
			System.out.println("Você tem "+alturaUsuario+" metros, porém voce é menor que "+alturaMinima+" metros.");
		} else if (alturaUsuario>=alturaMinima) {
			System.out.println("Ok "+nomeUsuario+", você vai poder se divertir no brinquedo.");
			System.out.println("Você tem "+alturaUsuario+" metros,a exigencia é "+alturaMinima+" metros.");
		} else {
			
		}
		
	}

}