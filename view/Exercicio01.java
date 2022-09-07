package br.com.fiap.vetores.view;

import java.util.Scanner;

import br.com.fiap.vetores.model.Produto;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Declarar um vetor de produto com a quantidade informada
		Scanner leitor = new Scanner(System.in);
		
		//Ler a quantidade de produtos
		System.out.println("Digite a quantidade de produtos:");
		int qtd = leitor.nextInt();
		
		//Declarar um vetor de produtos com a quantidade informada
		Produto[] produtos = new Produto[qtd];
		
		
		
		//Laço de repetição para ler o preço, quantidade e desconto
		for (int i = 0; i < produtos.length; i++) {
			//ler o pre�o, quantidade e desconto
			System.out.println("Digite o pre�o do produto " + (i+ 1));
			double preco = leitor.nextDouble();
			System.out.println("Digite a quantidade do produto " + (i+1));
			int quantidade = leitor.nextInt();
			System.out.println("Digite o desconto (%) do produto " + (i+1));
			double desconto = leitor.nextDouble();
			
			
			//Instanciar um produto com os valores lidos
			Produto produto = new Produto(quantidade,preco,desconto);
			//Produtos[i] = new Produtos(quantidade,preco, desconto);
			
			
		
			//Inserir o produto no vetor de produtos
			produtos[i] = produto;
		}
		
		//Declarar uma vari�vel para armazenar o preco total
		double valorTotal = 0;
		
		//Calcular o valor total a ser pago
		for (int i = 0; i < produtos.length; i++) {
			//calcular o pre�o do produto com desconto
			//double precoComDesconto = produtos[i].getPreco() - (produtos[i].getPreco() * produtos[i].getDesconto()/100);
			
			//calcular o pre�o final do produto : pre�o * quantidade
			//double precoProdutoFinal = precoComDesconto * produtos[i].getQuantidade();
			
			
			
			//Adicionar o pre�o final do produto
			//valorTotal += precoProdutoFinal;
			
			
			valorTotal += produtos[i].calcularPrecoFinal();
			
		}
		
		//Exibir o preco total a ser pago 
		System.out.println("O valor total da compra � "+ valorTotal);
		
		//Fechar o leitor
		leitor.close();
	
	}//main
}//class