package entitites;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {	
	}
	
	public ContaPoupanca(int numeroConta, int agencia, double saldo, Cliente titular) {
		super(numeroConta, agencia, saldo, titular);
	}
	
	@Override
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor + 1.00;
			return true;
		}
		else {
			return false;
		}		
	}

}
