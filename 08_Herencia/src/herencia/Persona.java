package herencia;

//todas las clases heredan de object lo digais o no
public class Persona extends Object{
	private String dni;
	private int edad;
	private double peso;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//estamos realmente cambiado el comportamiento del metodo toString de la clase
	//objetxt
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	
}
