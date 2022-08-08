package entities;

public class Conta {
	
	private int numeroConta;
	private int agencia;
	private double saldo = 50.00;
	private String titularDaConta;
		
	public Conta() {
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldo() {
		return saldo;
	}	
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean Sacar(double valor) {		
		if(valor > this.saldo) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}		
	}

}
