package com.exercicios;

import java.util.Scanner;

public class mediaAluno {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			System.out.println("O aluno foi aprovado com a média " + media);
		} else if (media >= 5 ) {
			System.out.println("A média do aluno foi " + media + " e ele está de PF");
		} else {
			System.out.println("O aluno foi reprovado");
		}
		
		leia.close();
		
	}

}
