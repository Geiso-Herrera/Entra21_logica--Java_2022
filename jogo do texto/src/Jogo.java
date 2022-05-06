import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		System.out.println("voce esta em uma casa no meio da floresta...");
		System.out.println("Escolha uma direção (w, d, s, a):");
		
		Scanner scan = new Scanner(System.in);
		
		String op;
			do {
			op = scan.nextLine();
	
		
		
		if(op.equals("1")) {
			System.out.println("Verde!");
		}else if(op.equals("d")) {
			System.out.println("Lobos selvagens! Voce foi devorado");
		}else if(op.equals("s")) {
			System.out.println("Cuidadeo, monstro! Voce foi esmagado");
		}else if(op.equals("a")) {
			System.out.println("Voce encontrou a saida! Parabens!!");
		}
		
		//comandos
		}while(!op.equals("a")); // enquando o op não é igual a "a"
		}
	

	}

