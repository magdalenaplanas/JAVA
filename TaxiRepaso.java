package herenciaCocheRepaso;

import java.util.Arrays;

public class TaxiRepaso extends CocheRepaso {
	
	private boolean ocupado;
	private String licencia;
	private double precio []; // Tarifa de dia (0) y de noche (1)/ ESTO ES  UN ARRAY STATICO
	
	
	
	
	



	public TaxiRepaso(String matricula, String modelo, String marca, double velocidad, int numAsientos,
			double anguloDireccion, int numRuedas, String tipoMotor, int potencia, int numeroPuertas,
			int numeroVentanas) {
		super(matricula, modelo, marca, velocidad, numAsientos, anguloDireccion, numRuedas, tipoMotor, potencia, numeroPuertas,
				numeroVentanas);
		this.ocupado= ocupado;
		this.licencia = licencia;
		this.precio = precio;
	}



	public boolean isOcupado() {
		return ocupado;
	}



	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}



	public String getLicencia() {
		return licencia;
	}



	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}



	public double[] getPrecio() {
		return precio;
	}



	public void setPrecio(double[] precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "taxiRepaso [ocupado=" + ocupado + ", licencia=" + licencia + ", precio=" + Arrays.toString(precio)
				+ "]";
	}
	public double cobrar(int tiempoViaje, int hora) {
		if (hora> 20 || hora <6) {
			return tiempoViaje*precio[1]; // Tarifa nocturna
			
		} else {
			return tiempoViaje*precio[0]; // Tarifa diurna
			
		}
		
	}
	
	

}
