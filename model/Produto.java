package br.com.fiap.vetores.model;

public class Produto {
	//Atributos	
	private int quantidade;
	private double preco;
	private double desconto;
	
	//Construtor
	public Produto(int quantidade, double preco, double desconto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	// Criar um metodo que calcula e retorna o preço final
	public double calcularPrecoFinal() {
		return quantidade * (preco - (preco*desconto/100));
	}
	
	
	
	//Getters e Setters
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}