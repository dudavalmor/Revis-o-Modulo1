package com.exercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num1, num2, soma, subtracao, mult, div;
		
		System.out.println("Insira um n�mero: ");
		num1 = leia.nextDouble();
		
		System.out.println("Insira outro n�mero: ");
		num2 = leia.nextDouble();
		
		soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("Subtra��o: " + subtracao);
		
		mult = num1 * num2;
		System.out.println("Multiplica��o: " + mult);
		
		div = num1/num2;
		System.out.println("Divis�o: " + div);
		
		leia.close();
	}
}
