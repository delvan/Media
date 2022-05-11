package com.aula.com;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		int nota1, nota2, nota3, nota4, media;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a nota 1: ");
		nota1 = teclado.nextInt();
		
		System.out.println("Digite a nota 2: ");
		nota2 = teclado.nextInt();
				
		System.out.println("Digite a nota 3: ");
		nota3 = teclado.nextInt();
		
		System.out.println("Digite a nota 4: ");
		nota4 = teclado.nextInt();
		
		
		media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		System.out.println("Resultado");
		System.out.println("A media do aluno: "+ media);
		
		

	}

}
