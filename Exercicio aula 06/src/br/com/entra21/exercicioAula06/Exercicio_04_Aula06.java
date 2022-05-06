		package br.com.entra21.exercicioAula06;

		import java.util.Scanner;

		public class Exercicio_04_Aula06 {

			public static void main(String[] args) {
				

				final byte totalDeNotas=3;
				String nomeAluno;
				float nota1,nota2,nota3,media;
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite o nome do aluno");
				nomeAluno = entrada.nextLine();
				
				System.out.println("Digite a primeira nota: ");
				nota1 = entrada.nextFloat();
				
				System.out.println("Digite a segunda nota: ");
				nota2 = entrada.nextFloat();
				
				System.out.println("Digite a terceira nota: ");
				nota3 = entrada.nextFloat();
				
				media = (nota1 + nota2 + nota3) /3;
				
				if(media<3) {
					System.out.println("O aluno reprovou!");
				} else if (media<7) {
					System.out.println("O aluno está de recuperação!");			
				} else if (media<10) {
					System.out.println("O aluno passou, mas essa foi por pouco!");			
				} else if (media==10) {
					System.out.println("O aluno passou direto, Parabéns!");			
				} else {
					System.out.println("Há algo de errado com sua média!");		
				}

				
			}

		}