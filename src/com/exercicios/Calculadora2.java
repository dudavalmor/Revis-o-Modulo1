package com.exercicios;

import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		int i = leia.nextInt();
		
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double num2 = leia.nextDouble();
		
		if(i == 1) {
			System.out.println("Soma: " + (num1 + num2));
		} else {
			if(i == 2) {
				System.out.println("Subtra��o: " + (num1 - num2));
			} else {
				if (i == 3) {
					System.out.println("Multiplica��o: " + (num1 * num2));
				} else {
					if(i == 4) {
						System.out.println("Divis�o: " + (num1 / num2));
					} else {
						System.out.println("Digite uma op��o v�lida.");
					}
				}
			}
		}
		
		leia.close();
	}
}
