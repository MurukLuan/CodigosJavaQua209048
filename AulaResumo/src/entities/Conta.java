package entities;

public class Conta {
	
	private int numeroConta;
	private int agencia;
	private double saldo;
	private Clientes titularDaConta;
	
	
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

	public Clientes getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(Clientes titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldo() {
		return saldo;
	}	
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}

	public boolean Sacar(double valor) throws ContaException {		
		if(valor <= this.saldo) {			
			this.saldo -= valor;
			return true;
		}else {
			throw new ContaException("Saldo indisponivel");
			//return false;
		}		
	}
	
	public boolean Transferir(double valor, Conta destino) throws ContaException {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
		throw new ContaException("Saldo indisponivel!");
		//return false;
	}
	
	

}
