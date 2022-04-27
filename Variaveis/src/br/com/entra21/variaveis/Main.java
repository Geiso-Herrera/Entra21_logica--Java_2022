package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte idade;
		idade=33;
		
		byte outraIdade = 34;
		
		short ano=2022;
		
		short anoPassado;
		
		anoPassado=2021;
		
		System.out.println("minha idade é "+(idade+outraIdade));
		
		System.out.println("Estamos em "+ano+" e ano passado foi "+anoPassado+".");
				
		int habitantesBrasil=2120600;
		
		System.out.println("No Brasil em "+ano+" temos exatamente "+habitantesBrasil+" habitantes ");
		
		long habitantesTerra1500;
		habitantesTerra1500=790000000;
		
		double habitantesAtualmente =7900000000.00;
		
		float peso = 70.5f, altura= 2.5f;
		
		System.out.println("Meu peso é "+peso);
		System.out.println("Minha altura é "+altura);
		
		char letra='R';
		boolean intervaloAntesDasOito=false;
		boolean intervaloAgora=true;
		
		String nomeCompleto="";
		
		
		String nome;
		byte minhaIdade;
		float minhaAltura, salario;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Por favor qual é seu nome?");
		nome = entrada.nextLine();
		System.out.println("Informe sua idade:");
		minhaIdade = entrada.nextByte();
		
		System.out.println("Bem vindo "+nome+" agora consigo interagir com humanos");
		
		entrada = new Scanner(System.in);
		System.out.println("Qual seu salario?");
		salario = entrada.nextFloat();
		System.out.println("E agora informe sua altura.");
		altura = entrada.nextFloat();
		System.out.println("Ok muito obrigado");
		
		System.out.println("Bem vindo "+nome+" agora consigo interagir com humanos já sei que vc tem "+minhaIdade+" anos.");
				
		nome=JOptionPane.showInputDialog("Informe novamente seu nome completo"); //syso + Scanner ao mesmo tempo
			 JOptionPane.showConfirmDialog(null, "Show, agora aprendi seu nome" +nome);
		
			 minhaIdade = Byte.parseByte(
					 JOptionPane.showInputDialog( "Informe a sua idade")
					 );
			 salario = Byte.parseByte(
					 JOptionPane.showInputDialog( "Informe seu salario")
					 );
		
		
		
		
	}
	

}
