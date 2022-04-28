package br.com.entra21.operadoresrelacionais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operadores relacionais");
		
		System.out.println("Menor < (dica voltando ou apagando <<<<<---");
		
		byte idadeA=50, idadeB=51;
		boolean resultado;
		
		resultado = idadeA < idadeB;//idadeA é menor que idadeB?;
		
		System.out.println("IdadeA (<) menor que a idade B? "+resultado);

		System.out.println("IdadeA (<) menor que a idade B? "+ (idadeA<idadeB));

		resultado = idadeA <= idadeB;
		System.out.println( idadeA+" é (<=) menor ou igual que idade que "+idadeB+" ? "+resultado);
		
		System.out.println("Maior > (dica é sempre em frente --->>>>)");
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA +" é maior (>) que "+idadeB+"?"+resultado);
	
		resultado = idadeA >= idadeB;
		
		System.out.println(IdadeA +" é maior ou igual (>) que"+idadeB "?"+resultado);

	}

}
