package com.exercicios;

import java.util.Scanner;

public class ImprimirValores {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int j = 0;
		
		System.out.println("Digite o �ltimo n�mero do intervalo: ");
		int i = leia.nextInt();
		
		while(j <= i) {
			System.out.println(j);
			j = j+1;
		}
		
		leia.close();
	}

}
