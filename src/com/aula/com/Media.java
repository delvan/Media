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
		nota1 = teclado.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = teclado.nextDouble();
				
		System.out.println("Digite a nota 3: ");
		nota3 = teclado.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		nota4 = teclado.nextDouble();
		
		
		
		
		media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		if(media <5) {
			System.out.println("Aluno Reprovado ");
		}else if(media == 5){
			System.out.println("Aluno Recuperação");
		}
		else {
			System.out.println("Situação do aluno");
			System.out.println("Aluno Aprovado \n");
		}
		
		System.out.println("Resultado");
		System.out.println("Nota 1 "+ nota1);
		System.out.println("Nota 2 "+ nota2);
		System.out.println("Nota 3 "+ nota3);
		System.out.println("Nota 4 "+ nota4);
		System.out.println("Aluno: "+ nomeAluno +" Com media final: "+ media);
		
		

	}

}
