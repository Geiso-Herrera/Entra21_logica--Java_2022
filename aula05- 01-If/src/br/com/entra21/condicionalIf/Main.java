package br.com.entra21.condicionalIf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre If");

		if (true) {
			System.out.println("Vai fazer isso quando der true");
		}

		System.out.println("aqui vai acontecer naturalmente pq o codigo segue sempre em frente");

		if (false) {
			// nunca passaria aqui pois apenas resulta em true para por esse bloco
		}

		byte idade = 19;

		if (idade >= 18)
			;
		{// � maior de idade?
		
			System.out.println("� maior de idade");
		}

		if( (idade>=13) && (idade>18) ){//� adolescente?
			System.out.println("� adolescentes");
	}
	}}
