package herencia;

import java.util.ArrayList;

//con la 
public class Milenial extends Persona{
	//private ArrayList<Persona> familia;
	private int pereza;
	private boolean llevaGorra;
	
	public int getPereza() {
		return pereza;
	}
	public void setPereza(int pereza) {
		this.pereza = pereza;
	}
	public boolean isLlevaGorra() {
		return llevaGorra;
	}
	public void setLlevaGorra(boolean llevaGorra) {
		this.llevaGorra = llevaGorra;
	}
	
	@Override
	public String toString() {
		return "Milenial [pereza=" + pereza + ", llevaGorra=" + llevaGorra + ", getDni()=" + getDni() + ", getEdad()="
				+ getEdad() + ", getPeso()=" + getPeso() + "]";
	}
	
	
	
}
