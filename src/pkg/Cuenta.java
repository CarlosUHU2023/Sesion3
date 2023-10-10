package pkg;

import java.util.ArrayList;


public class Cuenta {
	
	private double Saldo;
	private String numero;
	private String titular;
	private ArrayList<Movimiento> listaMovimientosRealizados;
	private ArrayList<Movimiento> listaMovimientosNoRealizados;
	 
	public Cuenta(String numero, String titular,double saldo) {
		this.Saldo = saldo;
		this.numero=numero;
		this.titular=titular;
		this.listaMovimientosRealizados=new ArrayList<Movimiento>() ;
		this.listaMovimientosNoRealizados=new ArrayList<Movimiento>() ;
		listaMovimientosRealizados.add(new Movimiento(saldo, "Saldo inicial "));
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void ingresar(double i) {
		Saldo=Saldo+i;
		listaMovimientosRealizados.add(new Movimiento(i,"Ingreso"));	}

	public void retirar(int i) {
		if(i<=(Saldo+500)){
			Saldo=Saldo-i;
			listaMovimientosRealizados.add(new Movimiento(i,"Reintegro"));
		}else
			listaMovimientosNoRealizados.add(new Movimiento(i,"Fondos (Saldo"+Saldo+") en la cuenta "+titular+" para el Reintegro"));

	}
	
	
	public void mostrarMovimientos() {
		System.out.println("\nCuenta" + titular+":\n");
		for(int i=0;i<listaMovimientosRealizados.size();i++){
			System.out.println((i+1)+". " +listaMovimientosRealizados.get(i).getDetalle()+" de "+listaMovimientosRealizados.get(i).getImporte());
		}
		System.out.println("Saldo final:"+Saldo );
	}

	public void mostrarMovimientosFallidos() {
		System.out.println("\nErrores registrados:\n");
		for(int i=0;i<listaMovimientosNoRealizados.size();i++){
			System.out.println((i+1)+". "+listaMovimientosNoRealizados.get(i).getDetalle()+" de "+listaMovimientosNoRealizados.get(i).getImporte());
		}
		
	}

	public Movimiento getMovimietno(int i) {
		return listaMovimientosRealizados.get(i);
	}


}
