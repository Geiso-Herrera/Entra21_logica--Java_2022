package br.com.entra21.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Capturar 2 números e informar qual é o maior\n");
		
		Scanner entrada = new Scanner(System.in);
		
		byte numeroA;
		byte numeroB;
		
		System.out.println("Informe o valor do numero A:");
		numeroA= entrada.nextByte();
		
		System.out.println("\nInforme o valor do numero B:\n");
		numeroB= entrada.nextByte();
		
		if(numeroA>numeroB) {
			System.out.println("NumeroA é maior");
		} else if(numeroA==numeroB) {
			System.out.println("NumeroA e NumeroB são iguais");
			
		}	
		else {
			System.out.println("NumeroB é maior");
		}
		
		System.out.println("\n==========================================\n");
		
		System.out.println("Capturar ano de nascimento e informar se já pode votar");
		
		short anoNascimento, calculo;
		
		System.out.println("Ano de nascimento?:");
		anoNascimento= entrada.nextShort();
		
		calculo = (short) (2022-anoNascimento);
		
		System.out.println();
		if(calculo>=16) {
			System.out.println("já pode votar");
		} else {
			System.out.println("Ainda não pode votar");
			
		}
		
		System.out.println("=============================================\n");
		
		System.out.println("Capturar 3 notas do aluno para calcular a media de aprovação");
		
		float nota1, nota2, nota3,media,media2;
						
		
		
		System.out.println("Informe a primeira nota:");
		nota1= entrada.nextFloat();
		
		System.out.println("Informe a segunda nota:");
		nota2 = entrada.nextFloat();
		
		System.out.println("Informe a terceira nota:");
		nota3 = entrada.nextFloat();
		
		media = nota1+nota2+nota3;
		media2 = media/3;
		
		System.out.println(media2>=7? "Aprovado": "Reprovado");
		
		System.out.println("=============================================\n");
		
		System.out.println("Capturar peso e altura para calcular o IMC e saber se esta no peso ideal");
		
		float peso, altura, imc;
				
		System.out.println("Informe sua altura:");
		altura = entrada.nextFloat();
		
		System.out.println("Informe o peso:");
		peso = entrada.nextFloat();
		
		
		imc = peso/(altura*altura);
		
		System.out.println(imc);
		
		if(imc<=18.5) {
			System.out.println("Abaixo do peso");
		} else if(imc>=18.5 && imc<=24.9) {
			System.out.println("Peso normal");
		} else if(imc>=25 && imc<=29.9) {
			System.out.println("Pré-obesidade");
		} else if(imc>=30 && imc<=34.9) {
			System.out.println("Obesidade Grau 1");
		} else if(imc>=35 && imc<=39.9) {
			System.out.println("Obesidade Grau 2");
		} else{
			System.out.println("Obesidade Grau 3");
		}
		
				
	
	}


}


 		
 

 		
 		
 		
	
 		
		