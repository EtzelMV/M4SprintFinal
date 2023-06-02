/**
 * Clase que se encarga de implementar el proceso de recibir y validar 
 * la entrada de datos asociados a la creación de instancias de la clase
 * entities.Administrativo. Cuando el ciclo de validaciones de todos los 
 * campos es correcto se instancia el constructor con los campos entregados 
 * por el usuario ya validados. El principio es desacoplar la lógica que se 
 * enfrenta al usuario del diseño de la clase misma, para hacerla flexible
 * a cambios. Esta (la clase entities.Administrativo) es agnóstica de la data 
 * que recibe, y espera que sea correcta porque solo se encarga de describir
 * la estructura de esta.
 */

package actions;

import java.time.LocalDate;
import java.util.Scanner;
import sprint.Valida;
import sprint.Show;

/**
 * 
 * @author Carlos Pizarro
 *
 */
public class CreateAdministrativo {

	// 6 campos
	public static void create() {
//			guide("create", "administrativo");
		System.out.println("hola!");
		
	}
}
