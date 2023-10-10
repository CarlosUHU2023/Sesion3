package pkg;

public class Movimiento {

	
	private double importe;
	public enum signo{D,H};
	private String detalle;
	
	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Movimiento(double i, String detalle) {
		this.importe=i;
		this.detalle=detalle;
	}
	
}
