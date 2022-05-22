package br.com.entra21.aula10while;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {

		String option;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"\nDigite qual programa deseja utilizar: \n 0- Sair \n 1- Calculadora a Soma \n 2- Repetir 20 vezes quebrando linha \n"
							+ " 3- Entre 20 pessoas exibir a soma das idades \n 4- Entre 20 pessoas quantos s�o maiores de idade \n"
							+ " 5- Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova \n"
							+ " 8 - Capture N numeros acumule a soma e s� para quando for informado um numero negativo\n 9- Escreva um algoritmo que leia 20 n�meros do usu�rio e exiba quantos n�meros s�o pares");
			option = input.nextLine();

			switch (option.toLowerCase()) {
			case "0", "sair":
				break;
			case "1", "calculadora a soma", "calculadora":
				calculator();
				break;
			case "2", "repetir":
				repetidor20();
				break;
			case "3":
				sumAge();
				break;
			case "4":
				maiorDeIdade();
				break;
			case "5":
				exibirMaisNovo();
				break;
			case "9":
				mediaAlunos();
				break;
			case "8":
				exerciseOito();

			default:
				System.out.println("Digite uma op��o valida");
				break;
			}

		} while (option.equals("0") == false); // ou colocar ! antes do option = !option....
		System.out.println("Obripado por usar o programa Lista de Exercicios!");
	}

	private static void calculator() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);
		}

	}

	private static void repetidor20() {

		for (byte i = 1; i < 20; i++) {
			System.out.print("Eu gosto de algoritomos " + (i % 5 == 0 ? "\n" : ""));
//			if (i % 5 == 0) {
//				System.out.println("\n");
//			}
		}

	}

	private static void maiorDeIdade() {

		System.out.println("Exibir apenas os maiors de idade");
		byte maiores = 0;
		byte idade, i;
		for (i = 1; i <= 20; i++) {
			Scanner input = new Scanner(System.in);

			System.out.println("informe a idade da pessoa " + i);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A �ltima pessoa informada era de maior");
			}
		}
		System.out.println("Entre " + (i - 1) + " pessoas, apenas " + maiores + " s�o maiores de idade");
	}

	private static void sumAge() {
		Scanner input = new Scanner(System.in);
		int sumAge = 0;
		byte age;

		for (byte i = 0; i <= 20; i++) {
			System.out.println("No momento a soma est� em: " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;

		}
		System.out.println("A soma total das idades foi " + sumAge);
	}

	// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro la�o sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo la�o j� tenho como comparar com "ageMinimal"
				System.out.println("Estou no la�o " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova � " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Ap�s isso tudo o mais novo �: " + youngerName + " " + ageMinimal);

	}

	private static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;
		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}

			soma = soma + nota;
		} while (contador <= qtd);
		System.out.println("Soma =" + soma);
	}

	public static void exerciseOito() {

		// Escreva um algoritmo que leia uma sequ�ncia de n�meros do usu�rio e realize a
		// soma desses n�meros. Encerre a execu��o quando um n�mero negativo for
		// digitado.

		Scanner inPut = new Scanner(System.in);
		int number, sum = 0; // se n�o inicializa um valor na v�riavel ela fica com lixo da mem�ria.

		do {

			System.out.println("What number do you want?");
			number = inPut.nextInt();
			if (number >= 0) {
				sum = sum + number;
			} // somente n�meros positivos ser�o somados, ou n�meros naturais.

		} while (number >= 0); // enquanto o n�mero for maior que zero repita

		System.out.println("Your sum is: " + sum);

	}
}

