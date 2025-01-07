package com.exercicios;

public class ExemploArray2 {
	public static void main(String[] args) {
		
		int[] array = {78, 20, 56, 90, 7};
		
		System.out.printf("%s%8s\n", "Indice", "Valores");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
	}
}
