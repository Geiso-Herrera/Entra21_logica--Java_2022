package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre else if (ou seja renovando o if do else)");
		
		float altura=1.7f;
		double dinheiro=3000f;
		if(altura<1.5) {//é baixinho?
			System.out.println("é be, baixinho");
		}else if(altura<=1.9f) {//é alto
			System.out.println("é alto");
		}else {
		//mesmo que eu nao queira fazer nada aqui, é uma boa prática ter o else
		
		}
		//se ate 1200, ate 1800, ate 200, qualquer valor acima
		byte pontos;
		String mensagem;
		if (dinheiro <= 1200) {
			mensagem = "salario minimo";
			pontos = 5;
		} else if (dinheiro <= 1800) {
			mensagem = "ta ficando rico";
			pontos = 8;
		} else if (dinheiro <= 2000) {
			mensagem = "me empresta :) ";
			pontos = 12;
		} else {
			mensagem = " me contrata vai";
			pontos = 13;
		}

		System.out.println(mensagem);
		System.out.println("sua pontuação " + pontos);

		if (dinheiro <= 1200) {
			mensagem = "salario minimo";
			  
		}

		if (dinheiro <= 1800) {
			mensagem = "ta ficando rico";
		}
		
		 

	}

}