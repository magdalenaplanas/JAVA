package herenciaCocheRepaso;

public class MainAutomovilRepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// los numeros son velocidad, asientos,angulodireccion
		VehiculoRepaso  v = new VehiculoRepaso("aaaa", "ford", "rr", 55, 88,
				55); 
		System.out.println(v);
	
	    	CocheRepaso c = new CocheRepaso("123A", "AA", "BB", 222, 5, 0, 4, "diesel",	50, 5, 5);
	    	c.setMatricula ("4325345z");
	    	System.out.println(c);
	
	    	c.abrirPuerta();
	    	c.abrirCapo();
	    	double precios[]= {0.19, 0.23};
	    	
	    	//(String matricula, String modelo, String marca, double velocidad, int numAsientos,
	    	//		double anguloDireccion, int numRuedas, String tipoMotor, int potencia, int numeroPuertas,
	    	//		int numeroVentanas)
	    	TaxiRepaso t= new TaxiRepaso ("12314g","peogf","rr", 4, 5, 0, 6,"diesel", 44, 4, 4);
	    			
	    	System.out.println("precio del viaje "+ t.cobrar(20,18));
	    	
}
}
