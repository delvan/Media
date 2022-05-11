package com.aula.com;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		String nomeAluno;
		double nota1, nota2, nota3, nota4, media;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a nome aluno: ");
		nomeAluno = teclado.next();
		
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
		System.out.println("Nota 1 "+ nota1);
		System.out.println("Nota 2 "+ nota2);
		System.out.println("Nota 3 "+ nota3);
		System.out.println("Nota 4 "+ nota4);
		System.out.println("Aluno: "+ nomeAluno +" Com media final: "+ media);
		
		

	}

}
