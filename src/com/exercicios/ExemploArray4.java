package com.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArray4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int[] valores = new int[7];
		
		for(int i = 0; i < valores.length; i++) {
		
			System.out.printf("Digite o número da posição [%d]: ", i+1);
			valores[i] = leia.nextInt();
		}
		
		int somaElementos = 0;
		for(int x = 0; x < valores.length; x++) {
			somaElementos += valores[x];
			
		}
		
		System.out.printf("A soma dos elementos é: %d\n", somaElementos);
		
		for(int x = 0; x < valores.length; x++) {
			int produto = valores[x] * x;
			System.out.printf("A multiplicação do índice pelo elemento %d * %d = %d\n", valores[x], x, produto);
		}
		
		double soma = somaElementos;
		double num = valores.length;
		double media = soma/num;
		System.out.printf("A méida aritmetica dos elementos é: %f\n", media);
		
		leia.close();
	}

}
