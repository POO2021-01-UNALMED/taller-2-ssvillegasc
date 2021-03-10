package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;

	public void cambiarColor(String color) {
		String[] validColors = {"rojo", "verde", "amarillo", "negro", "blanco"};
		
		boolean isValidColor = false;
		for(int i = 0; i < validColors.length; i++) {
			if(validColors[i].equals(color)) {
				isValidColor = true;
				break;
			}
		}
		
		if(isValidColor) {
			this.color = color;
		}
	}
	
	
}
