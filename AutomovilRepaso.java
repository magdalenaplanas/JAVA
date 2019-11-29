package herenciaCocheRepaso;

public class AutomovilRepaso extends VehiculoRepaso{
	
	private String matricula;
	private int numRuedas;
	private String tipoMotor;
	private int potencia;
	// source> generate superclass
	
	public AutomovilRepaso(String matricula, String modelo, String marca, double velocidad, int numAsientos,
			double anguloDireccion,  int numRuedas, String tipoMotor, int potencia) {
		super(matricula, modelo, marca, velocidad, numAsientos, anguloDireccion);
		// TODO Auto-generated constructor stub
		this.matricula= matricula;
		this.numRuedas = numRuedas;
		this.tipoMotor = tipoMotor;
		this.potencia= potencia;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "automovilRepaso [matricula=" + matricula + ", numRuedas=" + numRuedas + ", tipoMotor=" + tipoMotor
				+ ", potencia=" + potencia + ", getMatricula()=" + getMatricula() + ", getNumRuedas()=" + getNumRuedas()
				+ ", getTipoMotor()=" + getTipoMotor() + ", getPotencia()=" + getPotencia() + ", getModelo()="
				+ getModelo() + ", getMarca()=" + getMarca() + ", getVelocidad()=" + getVelocidad()
				+ ", getNumAsientos()=" + getNumAsientos() + ", getAnguloDireccion()=" + getAnguloDireccion()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
