package com.exercicios;

public class mediaAritmeticaArray {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 9;
		nums[1] = 10;
		nums[2] = 5;
		nums[3] = 6;
		nums[4] = 7;
		
		int soma = 0;
		for(int i = 0; i < nums.length; i++) {
			soma += nums[i]; 
		}
		
		float media = (float)soma/nums.length;
		//transformei a variavel media no tipo float
		
		System.out.println("A média é: " + media);
		
	}

}
