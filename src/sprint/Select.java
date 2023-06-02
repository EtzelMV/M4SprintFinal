package sprint;
import java.util.Scanner;

import actions.CreateAdministrativo;
import actions.CreateCapacitacion;
import actions.CreateCliente;
import actions.CreateProfesional;
import actions.DeleteUsuario;
import actions.Display;

public abstract class Select {
	
	private static boolean isValid = true; 
	private static String option;
	private static Integer optionNumber;
	
	public static void action() {
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Ingrese su opcion:");
				option = sc.next();								// recibe un token de tipo String
				optionNumber = Integer.parseInt(option);		// intenta parsear token a Integer
				
				if (optionNumber >= 1 && optionNumber <= 9) {	// si éxito, valida el rango 1-9
					isValid = !isValid;								// para salir del ciclo
				} else {
					throw new UnsupportedOperationException();	// sino, arroja un Exception al catch
				}
			} catch (Exception e) {								// captura las excepciones del parseo de
				System.out.println("Opción inválida");			// Integer y de la validación de rango
			}

		} while (isValid);
		
		switch (optionNumber) {									// Elije la acción e invoca el método asociado
			case 1:
				CreateCliente.create();
				break;
			case 2:
				CreateProfesional.create();
				break;
			case 3:
				CreateAdministrativo.create();
				break;
			case 4:
				CreateCapacitacion.create();
				break;
			case 5:
				DeleteUsuario.delete();
				break;
			case 6:
				Display.usuarios();
				break;
			case 7:
				Display.category();
				break;
			case 8:
				Display.capacitaciones();
				break;
			case 9:
				System.out.println("Ejecución finalizada por el usuario"); 
				System.exit(0);
				break;
			default:
				// Nunca entrará acá pero se deja por buena práctica.
				System.out.println("Ups... ¡Algo muy raro ha pasado!"); 
				System.exit(0);
				break;
		}														// ends switch option
	}															// ends static action()
}																// ends class Select