package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int notNullCount = 0;
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] != null) {
				notNullCount++;
			}
		}
		return notNullCount;
	}
	
	public String verificarIntegridad() {
		String validString = "Auto original";
		String invalidString = "Las piezas no son originales";
		
		if(registro != motor.registro) {
			return invalidString;
		}
		
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] != null && asientos[i].registro != registro)
				return invalidString;
		}
		
		return validString;
	}

}
