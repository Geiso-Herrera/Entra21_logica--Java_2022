package br.com.entra21.exercicioAula06;

import java.util.Scanner;

public class Exercicio_05_Aula06 {

	public static void main(String[] args) {

		String qualSeuNome;
		byte mes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		qualSeuNome = entrada.nextLine();
		
		System.out.println("Que mes � seu anivers�rio?");
		System.out.println("Selecione as op��es: ");
		System.out.println("1 - Janeiro");
		System.out.println("2 - Fevereiro");
		System.out.println("3 - Mar�o");
		System.out.println("4 - Abril");
		System.out.println("5 - Maio");
		System.out.println("6 - Junho");
		System.out.println("7 - Julho");
		System.out.println("8 - Agosto");
		System.out.println("9 - Setembro");
		System.out.println("10 - Outubro");
		System.out.println("11 - Novembro");
		System.out.println("12 - Dezembro");
		
		mes = entrada.nextByte();
		
		switch (mes) {
		case 1:
			System.out.println("Voc� nasceu em Janeiro");
			break;
		case 2:
			System.out.println("Voc� nasceu em Fevereiro");
			break;
		case 3:
			System.out.println("Voc� nasceu em Mar�o");
			break;
		case 4:
			System.out.println("Voc� nasceu em Abril");
			break;
		case 5:
			System.out.println("Voc� nasceu em Maio");
			break;
		case 6:
			System.out.println("Voc� nasceu em Junho");
			break;
		case 7:
			System.out.println("Voc� nasceu em Julho");
			break;
		case 8:
			System.out.println("Voc� nasceu em Agosto");
			break;
		case 9:
			System.out.println("Voc� nasceu em Setembro");
			break;
		case 10:
			System.out.println("Voc� nasceu em Outubro");
			break;
		case 11:
			System.out.println("Voc� nasceu em Novembro");
			break;
		case 12:
			System.out.println("Voc� nasceu em Dezembro");
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
		}

	}

}