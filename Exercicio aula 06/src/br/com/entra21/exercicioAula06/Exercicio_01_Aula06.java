package br.com.entra21.exercicioAula06;

import java.util.Scanner;

public class Exercicio_01_Aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		System.out.println("Escolha qual sua estação do ano favorita");
		opcao = entrada.nextByte();
		
		switch (opcao) {
		case 1:
			System.out.println("Florecer das plantas");
			break;
		case 2: 
			System.out.println("Periodo que as folhas caem");
			break;
		case 3:
			System.out.println("Inverno sao dias muito frio");
			break;
		case 4: 
			System.out.println("Verao são de dias muito quente");
			break;
		}
	}
}

		
		






