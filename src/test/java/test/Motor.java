package test;

public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		String[] validType = {"electrico", "gasolina"};
		
		boolean isValidType = false;
		for(int i = 0; i < validType.length; i++) {
			if(validType[i].equals(tipo)) {
				isValidType = true;
				break;
			}
		}
		
		if(isValidType) {
			this.tipo = tipo;
		}
	}
}
