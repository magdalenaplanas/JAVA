import java.util.ArrayList;
import java.util.Scanner;

public class MainCocheArray {
	public static void main(String[] args) {
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		
		for(int i=1;i <= 3; i++) {
			System.out.println("Introduzca el coche " + i);
			String matricula = leerDato("la matricula");
			String marca = leerDato("la marca");
			String modelo = leerDato("el modelo");
			String esNuevo = leerDato(" si es nuevo(si/no)");
			boolean nuevo = false;
			if(esNuevo.equalsIgnoreCase("si")) {
				nuevo = true;
			}
			
			Coche coche = new Coche(matricula, marca, modelo,nuevo);
			listaCoches.add(coche);
			//coche.matricula = "3434";//son equivalente
			//listaCoches.get(1).matricula = "3434";//equvalentes
		}
		
		reccorrerArray(listaCoches);
		
		System.out.println("Hasta luego lucas!! te llamo trigo por no llamarte rodrigo! jarl");

	}
	
	public static String leerDato(String cadena) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca " + cadena);
		String dato = sc.nextLine();
		return dato;
	}
	
	public static void reccorrerArray(ArrayList<Coche> listaCoches) {
		System.out.println("Mostrando la lista de coches");
		int i = 1;
		for(Coche c : listaCoches) {
			mostrarCoche(c, i);
			i++;
		}
	}
	
	public static void mostrarCoche(Coche c, int i) {
		System.out.println("Mostrando coche " + i);
		System.out.println("Matricula: " + c.matricula);
		System.out.println("Marca: " + c.marca);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Es nuevo?" +c.esNuevo);
	}
}
















