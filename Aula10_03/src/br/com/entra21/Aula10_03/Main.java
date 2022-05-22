package br.com.entra21.Aula10_03;

import java.util.Scanner;

public class Main {

	public static void sumAge() {
        int sumAge=0;
        byte age;
        Scanner input = new Scanner(System.in);
       
        for(byte count=1;count<=5;count++) {
            System.out.println("No momento a soma está em "+sumAge);
            System.out.println("Por favor, insira a idade: ");
            age = input.nextByte();
            sumAge = sumAge + age;
        }
        System.out.println("A soma total das idades foi "+sumAge);
    }
}