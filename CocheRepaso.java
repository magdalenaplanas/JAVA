package herenciaCocheRepaso;

public class CocheRepaso extends AutomovilRepaso {

	private int numeroPuertas;
	private int numeroVentanas;
	
	public CocheRepaso(String matricula, String modelo, String marca, double velocidad, int numAsientos,
			double anguloDireccion, int numRuedas, String tipoMotor, int potencia, int numeroPuertas,
			int numeroVentanas) {
		super(matricula, modelo, marca, velocidad, numAsientos, anguloDireccion, numRuedas, tipoMotor, potencia);
		this.numeroPuertas = numeroPuertas;
		this.numeroVentanas = numeroVentanas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroVentanas() {
		return numeroVentanas;
	}

	public void setNumeroVentanas(int numeroVentanas) {
		this.numeroVentanas = numeroVentanas;
	}

	

@Override
	public String toString() {
		return "cocheRepaso [numeroPuertas=" + numeroPuertas + ",\n numeroVentanas=" + numeroVentanas
				+ ",\n getNumeroPuertas()=" + getNumeroPuertas() + ",\n getNumeroVentanas()=" + getNumeroVentanas()
				+ ",\n getMatricula()=" + getMatricula() + ",\n getNumRuedas()=" + getNumRuedas() + ", getTipoMotor()="
				+ getTipoMotor() + ", getPotencia()=" + getPotencia() + ",\n toString()=" + super.toString()
				+ ",\n getModelo()=" + getModelo() + ",\n getMarca()=" + getMarca() + ",\n getVelocidad()=" + getVelocidad()
				+ ",\n getNumAsientos()=" + getNumAsientos() + ",\n getAnguloDireccion()=" + getAnguloDireccion()
				+ ",\n getClass()=" + getClass() + ",\n hashCode()=" + hashCode() + "]";
	}

public void abrirPuerta() {
	System.out.println("Puerta abierta!!");
	
}
	public void abrirCapo() {
		System.out.println("Capó abierto");
	}

	}	
	
	
	
	

