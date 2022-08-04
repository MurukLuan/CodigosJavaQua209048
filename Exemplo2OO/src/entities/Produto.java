package entities;



public class Produto {
	
	
	public String nomeProduto;
	public int quantidade;
	public double valor;
	
	/*public Produto() {		
	}*/
	
	public Produto(String nomeProduto, int quantidade, double valor) {
		// atributo da classe     parametro recebido no construtor
		this.nomeProduto =        nomeProduto;
		this.quantidade = quantidade;
		this.valor = valor;		
	}
	
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
	}
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}
		
	@Override
	public String toString() {
		
		return "Nome produto: " + nomeProduto
				+"\nQuantidade: " + quantidade
				+"\nValor unitario: " + String.format("%.2f", valor)
				+"\nValor total em estoque: " + String.format("%.2f", ValorTotalEmEstoque());
	}
	
}