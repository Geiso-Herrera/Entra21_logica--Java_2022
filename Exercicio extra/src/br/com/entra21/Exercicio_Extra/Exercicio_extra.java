package br.com.entra21.Exercicio_Extra;

import java.util.Scanner;

public class Exercicio_extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção");
		System.out.println("Brasil\nEUA\nChina");
		opcao = entrada.nextLine();
		
		opcao = opcao.toLowerCase();
		switch (opcao) {
		case "brasil":
			System.out.println("BRASILLL ZIL");
			break;

		case "eua":
			System.out.println("Pra gringo é mais caro");
			break;

		case "china":
			System.out.println("made in china");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		
		
	}

}
		
