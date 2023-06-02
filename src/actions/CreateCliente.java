/*
 * Clase que se encarga de implementar el proceso de recibir y validar 
 * la entrada de datos asociados a la creación de instancias de la clase
 * entities.Cliente. Cuando el ciclo de validaciones de todos los campos
 * es correcto se instancia el constructor con los campos entregados por
 * el usuario ya validados. El principio es desacoplar la lógica que se 
 * enfrenta al usuario del diseño de la clase misma, para hacerla flexible
 * a cambios. Esta (la clase entities.Cliente) es agnóstica de la data 
 * que recibe, y espera que sea correcta porque solo se encarga de describir
 * la estructura de esta.
 */

package actions;

import java.time.LocalDate;
import java.util.Scanner;
import sprint.Valida;
import sprint.Show;

public class CreateCliente {
	
	/*
	 * Campos necesarios para validar data de entrada 
	 * para crear instancias de entities.Cliente
	 */
	private static Scanner sc = new Scanner(System.in);
	private static boolean isValid;							// flag de validaciones, default false
	private static String nombres;
	private static String apellidos;
	private static String run;
	private static LocalDate fechaNac;
	private static String telefono;
	private static String afp;
	private static byte sistSalud;
	private static String direccion;
	private static String comuna;
	private static int edad;

	public static void create() {
		// TODO La wea fea po! Pensar mejoras! 
		// 10 campos + capacitaciones + accidente + visita + revisión(es)
		Show.guide("createGeneral");
		
		// nombres
		Show.guide("createClienteNombres");
		do {
			nombres = sc.nextLine().trim();
			isValid = Valida.in(nombres, true, 5, 30);
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// apellidos
		Show.guide("createClienteApellidos");
		do {
			apellidos = sc.nextLine().trim();
			isValid = Valida.in(apellidos, true, 5, 30);
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// run
		Show.guide("createClienteRun");
		do {
			run = sc.nextLine().trim();
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// fechaNac
		Show.guide("createClienteFechaNac");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		----------------------------------------------------------------
		// TODO telefono
		Show.guide("createClienteTelefono");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// afp
		Show.guide("createClienteAfp");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// sistSalud
		Show.guide("createClienteSistSalud");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// direccion
		Show.guide("createClienteDireccion");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// comuna
		Show.guide("createClienteComuna");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// edad
		Show.guide("createClienteEdad");
		do {
			String fechaNacStr = sc.nextLine().trim();
			// validar formato y asignar campoFechaNac
			isValid = Valida.in(run, true, "rut");
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		isValid = !isValid;							// resetea flag validador
		
		// logica de creacion de accidente
		
		// logica de creacion de visita
		
		// logica de creacion de revision
		
		// crear instancias limpias
			
		
		// Cliente cliente = new Cliente(campos...);
		// Contenedor.agregarUsuario(cliente);
		// cerrar Scanner
		sc.close();
	}
}
