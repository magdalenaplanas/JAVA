
public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Bartolo";
		p1.edad = 29;
		p1.peso = 58.5;
		
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.peso);
		System.out.println(p1);
		
		Persona p2 = new Persona();
		p2.nombre = "Bud Spencer";
		p2.edad = 78;
		p2.peso = 119;
		
		System.out.println(p2.nombre);
		System.out.println(p2.edad);
		System.out.println(p2.peso);
		System.out.println(p2);
		
		Persona p3 = p2;
		p3.edad = 55;//
		System.out.println(p3.edad);
		System.out.println(p2.edad);
		p1 = p2;
		p1.edad = 77;
		System.out.println(p3.edad);
		System.out.println(p2.edad);
		System.out.println(p1.edad);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
