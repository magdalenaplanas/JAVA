package herenciaCocheRepaso;

public class VehiculoRepaso {
	private String matricula;
	private String modelo;
	private String marca;
	private double velocidad;
	private int numAsientos;
	private double anguloDireccion;

// source> generate constructor 
	public VehiculoRepaso(String matricula, String modelo, String marca, double velocidad, int numAsientos,
			double anguloDireccion) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.velocidad = velocidad;
		this.numAsientos = numAsientos;
		this.anguloDireccion = anguloDireccion;
	}
// source> get and set

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public double getAnguloDireccion() {
		return anguloDireccion;
	}

	public void setAnguloDireccion(double anguloDireccion) {
		this.anguloDireccion = anguloDireccion;
	}
	

	@Override
	public String toString() {
		return "vehiculoRepaso [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", velocidad="
				+ velocidad + ", numAsientos=" + numAsientos + ", anguloDireccion=" + anguloDireccion
				+ ", getMatricula()=" + getMatricula() + ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca()
				+ ", getVelocidad()=" + getVelocidad() + ", getNumAsientos()=" + getNumAsientos()
				+ ", getAnguloDireccion()=" + getAnguloDireccion() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
