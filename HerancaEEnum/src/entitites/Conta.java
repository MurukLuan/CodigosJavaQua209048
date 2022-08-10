package entitites;

public class Conta {
	
	private int numeroConta;
	private int agencia;
	protected double saldo;
	private Cliente titular;
	
	public Conta() {
	}
	
	public Conta(int numeroConta, int agencia, double saldo, Cliente titular) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
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
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor + 2.00;
			return true;
		}
		else {
			return false;
		}		
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "titular da conta: " + titular.getNome()
				+"\nCPF: " + titular.getCpf()
				+"\nAgencia: " + agencia
				+"\nNumero da conta: " + numeroConta
				+"\nSaldo: " + saldo;
	}

}
