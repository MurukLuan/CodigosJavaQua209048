package entities;

public class Produto {
	public String nome;
	public double valor;
	public int quantidade;
	
	
	public void AdicionarEstoque(int qtd) {
		quantidade += qtd;
	}
	public void RemoverEstoque(int qtd) {
		quantidade -= qtd;
	}
	
	public double TotalEmEstoque() {
		return quantidade * valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome Produto: " + nome
				+"\nValor: " + valor
				+"\nQuantidade: " + quantidade
				+"\nValor total em estoque: " + String.format("%.2f", TotalEmEstoque());
	}
	
	
}
