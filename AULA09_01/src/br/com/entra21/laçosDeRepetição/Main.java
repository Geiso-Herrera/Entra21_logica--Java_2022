package br.com.entra21.laçosDeRepetição;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre for");
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sobre o for escolha uma opção para aprender mais");
		System.out.println("1 - for simples\n2 - for dentro de for");
		opcao = entrada.nextLine();
		
		switch(opcao.toLowerCase()){
		
		case "1","for simples":
			//função aula for simples
			aulaForSimples();//função do tipo procedimento nao tem argumento nem retorno
			break;
		case "2":
			//olha veio por numero
		case "for dentro de for":
			//função aula complexa
			break;
		
		
		}
		for (int contador = 1; contador < 10; contador = contador + 1) {

			System.out.println("Repetindo" + contador);
			System.out.println("----------------------");
		}

		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo" + contador);
			{
				// System.out.println(contador1);
				// Não é possivel udar a variavel contador1 pois ela só existe no outro escopo
				// do for
			}

			for (int contador3 = 4; contador3 <= 10; contador3 += 2)
				;
			{

				// System.out.println("Repetindo="+contador3);
			}
		}
		for (int contador3 = 4; contador3 > 1; contador3 = contador3 - 1) {

		}

		int numero =3;
		int contador;

		for (contador = 1 ; contador <= 10 ; contador ++ ) {
			System.out.println("Tabuada" + contador + " x " + numero + "=" + (contador * numero));
		}
		System.out.println("Olha como o contador ficou" + contador);
	}



	public static void aulaForSimples() {
		
	}}
