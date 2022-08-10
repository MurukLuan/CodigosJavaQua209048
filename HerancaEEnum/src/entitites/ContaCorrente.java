package entitites;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {	
	}
	
	public ContaCorrente(int numeroConta, int agencia, double saldo, Cliente titular) {
		super(numeroConta, agencia, saldo, titular);
	}
	
	@Override
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor + 4.90;
			return true;
		}
		else {
			return false;
		}		
	}
}
