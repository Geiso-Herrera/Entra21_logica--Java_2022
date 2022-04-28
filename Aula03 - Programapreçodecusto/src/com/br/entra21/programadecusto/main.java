package com.br.entra21.programadecusto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Faça um programa que solicite o nome e preço de custo de um produto ");
	System.out.println("processe um aumento de 65%");
	System.out.println("informe qual será o preço de venda.");
	
		String nomeProduto;
		float precoCusto, precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Qual o valor de custo do produto"+nomeProduto+" ?");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto *10 /100);
		precoVenda = precoCusto*1.10f;
		System.out.println("O preço de venda é "+precoVenda);

		
		
		
	
	
	}
	

}
