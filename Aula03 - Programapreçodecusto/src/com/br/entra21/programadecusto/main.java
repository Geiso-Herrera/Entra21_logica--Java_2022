package com.br.entra21.programadecusto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto ");
	System.out.println("processe um aumento de 65%");
	System.out.println("informe qual ser� o pre�o de venda.");
	
		String nomeProduto;
		float precoCusto, precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Qual o valor de custo do produto"+nomeProduto+" ?");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto *10 /100);
		precoVenda = precoCusto*1.10f;
		System.out.println("O pre�o de venda � "+precoVenda);

		
		
		
	
	
	}
	

}
