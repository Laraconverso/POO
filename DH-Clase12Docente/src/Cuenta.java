
public abstract class Cuenta {
	
	private double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double monto){};
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double informarSaldo() {
		return saldo;
	}

	public abstract void extraer(double monto);

}
