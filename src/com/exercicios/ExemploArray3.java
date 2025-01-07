package com.exercicios;

public class ExemploArray3 {

	public static void main(String[] args) {
		
		int[] arrayInt = new int[10];
		arrayInt[0] = 10;
		arrayInt[1] = 20;
		arrayInt[2] = 30;
		arrayInt[3] = 40;
		arrayInt[4] = 5;
		arrayInt[5] = 3;
		arrayInt[6] = 14;
		arrayInt[7] = 8;
		arrayInt[8] = 16;
		arrayInt[9] = 300;
		
		int soma = arrayInt[0] + arrayInt[1] + arrayInt[2];
		
		System.out.println("A soma dos 3 primeiros valores é: " + soma);
		
		int soma2 = 0;
		for(int i = 0; i < arrayInt.length; i++) {
			soma2 = soma2 + arrayInt[i];
		}
		
		System.out.println("A soma de todos os elementos do vetor é: " + soma2);
	}

}
