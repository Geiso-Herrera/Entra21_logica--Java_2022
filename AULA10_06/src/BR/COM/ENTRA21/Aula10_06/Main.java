package BR.COM.ENTRA21.Aula10_06;

import java.util.Scanner;

public class Main {

	
		// TODO Auto-generated method stub
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

}
