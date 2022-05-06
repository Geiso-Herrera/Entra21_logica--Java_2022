package br.com.entra21.exercicioAula06;

import java.util.Scanner;

public class Exercicio_02_Aula06 {

	public static void main(String[] args) {
		System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. ");
		
		String opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Qual é a sua cor favorita? ");
		System.out.println("Digite a cor que voce mais gosta: ");
		System.out.println("verde");
		System.out.println("azul");
		System.out.println("amarelo");
		System.out.println("vermelho");
		
		opcoes = entrada.nextLine();
		
		switch(opcoes) {
		case "verde":
			System.out.println("Cor das matas");
			break;
		case "azul":
			System.out.println("cor do mar");
			break;
		case "amarelo":
			System.out.println("Cor do girassol");
			break;
		case "vermelho":
			System.out.println("A cor da Rosa");
			break;
		default:
			System.out.println("Escolha uma opção valida.");
			break;
		}

	}

}


		
	
	
	

	