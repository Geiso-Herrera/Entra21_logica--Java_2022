package br.com.entra21.operadorTernario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aprendendo sobre operador ternario");
		String nome;
		boolean condicao=true;
		
		nome=(true)?"Nome":"Sobrenome";
		
		System.out.println("Ent�o vc � "+(condicao?"de maior":"de menor"));
		
		byte idade = 30;
		
		if(idade>17) {
		System.out.println("Vc � de maior");
		} else {
		System.out.println("Vc � de menor");
		
		System.out.println("Vc � de "+ (idade>17?" de maior":" de menor" ));
		
	}
	
	}
}
