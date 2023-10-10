package pkg;

public class Cuenta {
	
	private double Saldo;
	private String numero;
	private String titular;
	
	public Cuenta(String numero, String titular,double saldo) {
		this.Saldo = saldo;
		this.numero=numero;
		this.titular=titular;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	public void ingresar(int i) {
		Saldo=Saldo+i;
	}

	public void retirar(int i) {
		
		Saldo=Saldo-i;
	}

}
