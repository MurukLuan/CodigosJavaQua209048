package entities;

public class Veiculo {
	
	private int qtdPneus;
	private String motor;
	private int qtdPassageiros;
	private String tipoCombustivel;
	private String tipo;
	private String modelo;
	
	public Veiculo() {

	}

	public Veiculo(int qtdPneus, String motor, int qtdPassageiros, String tipoCombustivel, String tipo, String modelo) {
		super();
		this.qtdPneus = qtdPneus;
		this.motor = motor;
		this.qtdPassageiros = qtdPassageiros;
		this.tipoCombustivel = tipoCombustivel;
		this.tipo = tipo;
		this.modelo = modelo;
	}

	public int getQtdPneus() {
		return qtdPneus;
	}
	public void setQtdPneus(int qtdPneus) {
		this.qtdPneus = qtdPneus;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
		
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "qtdPneus= " + qtdPneus 
				+ "\nmotor= " + motor 
				+ "\nqtdPassageiros= " + qtdPassageiros
				+ "\ntipoCombustivel= " + tipoCombustivel 
				+ "\ntipo= " + tipo 
				+ "\nmodelo= " + modelo ;
	}

}
