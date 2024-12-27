package com.exercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num1, num2, soma, subtracao, mult, div;
		
		System.out.println("Insira um número: ");
		num1 = leia.nextDouble();
		
		System.out.println("Insira outro número: ");
		num2 = leia.nextDouble();
		
		soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("Subtração: " + subtracao);
		
		mult = num1 * num2;
		System.out.println("Multiplicação: " + mult);
		
		div = num1/num2;
		System.out.println("Divisão: " + div);
		
		leia.close();
	}
}
