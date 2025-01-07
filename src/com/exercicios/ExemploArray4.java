package com.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArray4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int[] valores = new int[7];
		
		for(int i = 0; i < valores.length; i++) {
		
			System.out.printf("Digite o n�mero da posi��o [%d]: ", i+1);
			valores[i] = leia.nextInt();
		}
		
		int somaElementos = 0;
		for(int x = 0; x < valores.length; x++) {
			somaElementos += valores[x];
			
		}
		
		System.out.printf("A soma dos elementos �: %d\n", somaElementos);
		
		for(int x = 0; x < valores.length; x++) {
			int produto = valores[x] * x;
			System.out.printf("A multiplica��o do �ndice pelo elemento %d * %d = %d\n", valores[x], x, produto);
		}
		
		double soma = somaElementos;
		double num = valores.length;
		double media = soma/num;
		System.out.printf("A m�ida aritmetica dos elementos �: %f\n", media);
		
		leia.close();
	}

}
