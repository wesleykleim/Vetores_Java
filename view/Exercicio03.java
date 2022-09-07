
package br.com.fiap.vetores.view;

import java.util.Scanner;

import br.com.fiap.vetores.model.Aluno;
public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitar a quantidade de alunos 
		System.out.println("Digite a quantidade de Alunos:  ");
		int qtd = sc.nextInt();
		
		//Vetor de Alunos com n posições
		Aluno[] alunos = new Aluno[qtd];
		
		//Laço de repetição para ler os alunos 
		for (int i=0; i < alunos.length; i++) {
			
			// Solicitar o nome do aluno 
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.next();
			double nota[] = new double[3];
			
			// Laço de repetição para ler as notas 
			for (int j=0; j < 3; j++) {
				//Solicitar as notas do alunos (1, 2 e 3)
				System.out.println("Digite a nota: ");
				
				nota[j] = sc.nextDouble();
				
				}
			
			double[] notas;
			// Criar o objeto Aluno com o nome e o vetor de notas 
			Aluno aluno = new Aluno (nome, nota);
			//Adicionar o aluno no vetor 
			alunos[i] = aluno;
		}
		
		
		// Verificar o aluno que possui a maior nota 
		// Variavel auxiliar do tipo Aluno 
		Aluno alunoComMaiorNota = alunos[0];
		//Laço de repetição para percorrer todos osa lunos
		for (int i = 1; i < alunos.length; i++) {
			//Validar se o aluno possui uma nota maior que a nota da variavel auxiliar
			if (alunos[i].maiorNota() > alunoComMaiorNota.maiorNota())
				//Se sim, troca o aluno
				alunoComMaiorNota = alunos[i];			
		}
		//Exibir o nome e a maior nota do aluno 
		System.out.println(alunoComMaiorNota.getNome() + " " + alunoComMaiorNota.maiorNota());
	    
				 
					//Se sim, troca aluno 
				// Exibir o nome e a maior nota do aluno
		
		sc.close();	
			
			
			   
				
			
			
			
		
			
		
	}

}
