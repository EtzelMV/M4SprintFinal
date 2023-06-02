package sprint;

import java.time.LocalDate;

public abstract class Valida {

	private static boolean isValid;
	
	public static boolean in(LocalDate fecha, boolean isRequired) {
		return true;
	}
	
	// Cliente.rut, Cliente.telefono,  
	public static boolean in(String campo, boolean isRequired, String tipo) {
		
		// filtrar por tipo y validar
		return true;
	}
	
	public static boolean in(byte opcion, boolean isRequired) {
		return true;
	}
	
	public static boolean in(int campo, boolean isRequired, int rango) {
		return true;
	}
	
	public static boolean in() {
		return true;
	}
	
	// Cliente.nombres, Cliente.apellidos, Cliente.
	public static boolean in(String campo, boolean isRequired, int min, int max) {
		int nombresLen = campo.length(); 
		
		if (nombresLen == 0 && isRequired) return false; 			// valida obligatorio y vacío
		if (nombresLen == 0 && !isRequired) return true;			// valida no obligatorio y vacío
		
		isValid = utilValidaLen(nombresLen, min, max);				// valida largo para obligatorios
		
		return isValid;
	}
	
	public static boolean utilValidaLen(int fieldLen, int min, int max) {
		if (fieldLen >= min && fieldLen <= max) {
			return true;
		}
		return false;
	}
}
