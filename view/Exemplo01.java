package br.com.fiap.vetores.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		// Declarar um vetor de 5 nomes
		String nomes[] = new String[5];

		// Adicionar os nomes no vetor (usuário digita)
		for (int j = 0; j < nomes.length; j++) {
			nomes[j] = JOptionPane.showInputDialog("Digite o nome " + (j + 1));
		}
		
		System.out.println("FOR");
		// Criar um laço de repetição e exibir os nomes do vetor
		for (int j = 0; j < nomes.length; j++) {
			System.out.println(nomes[j]);
		}
		
		System.out.println("FOREACH");
		// Criar um laço de repetição e exibir os nomes do vetor
		for (String churros : nomes) {
			System.out.println(churros);
		}
		
	}// main
}// class