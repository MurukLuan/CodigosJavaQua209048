package entities;

public class Carro {
	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private char cambio;
	private char tipoCombustivel;
	private double valor;
	private String estadoConservacao;
	private Cliente cliente;
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) throws Exception{
		if(ano >= 2019) {
			this.ano = ano;
		}else {
			
			throw new Exception("Não pode ser efetuado cadastro, carro com ano incompativel, so aceitamos carro com menos de 3 anos de uso");
		}
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public char getCambio() {
		return cambio;
	}
	public void setCambio(char cambio) {
		this.cambio = cambio;
	}
	public char getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(char tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public double getValor() {
		return valor;
	}
	
	public String getEstadoConservacao() {
		return estadoConservacao;
	}
	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
	
	public void ValorCompra(double valor) {
		this.valor += (valor + (valor * 0.40)); 
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + cliente.getNome()
		+"\nCPF: " + cliente.getCpf()
		+"\nTelefone: " + cliente.getTelefone()
		+"\nEndereço: " + cliente.getEndereco()
		+"\n\n"
		+"\nVeiculo: " + modelo
		+"\ncambio: " + cambio
		+"\nAno: " + ano
		+"\nCor: " + cor
		+"\ntipo: " + tipo
		+"\nCombustivel: " + tipoCombustivel
		+"\nVeiculo novo ou usado: " + estadoConservacao
		+"\nValor venda: " + valor;
	}

}
