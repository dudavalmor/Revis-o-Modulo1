package com.exercicios;

import java.util.Scanner;

public class EspacoTempo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final double velocidadeSom = 340.28;// m/s
		
		System.out.println("Digite os segundos: ");
		int tempo = leia.nextInt();
		
		System.out.println("A distância seria de " + tempo * velocidadeSom + " metros percorridos.");
		System.out.println("A distância seria de " + (tempo * velocidadeSom)/1000 + " km percorridos.");
		
		leia.close();
		
	}

}
