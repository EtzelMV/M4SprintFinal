// TODO: implementar sobrecargas en Valida.in()
// TODO: implementar procesos de creación actions.*
// TODO: interfaces.Asesoria
// TODO: implementar métodos custom en entities ?
// TODO: implementar Contenedor y métodos ?
// TODO: crear README.md
// TODO: revisar y comentar código.
/*
 * Balance Cohesion/Acoplamiento: Yeah!
 * 
 * [S]inle Responsibility: Yup!
 * [O]pen/Closed: Yup!
 * [L]iskov Substitution: Mmm. Don't know...
 * [I]interface Seggregation: Not applicable (Una sola interfaz)
 * [D]ependency Inversion: Yep! Uso de IAsesoria
 * 
 * KISS: yep. (Creemos)
 * Least Surprise Principle: Sipi.
 */

package sprint;

/**
 * @author Etzel Mencias
 * @author Mangel Tort
 * @author Diego Paredes
 * @author Ricardo Silva
 * @author Carlos Pizarro
 */
public class Main {

	public static void main(String[] args) {
		
//		Contenedor listas = new Contenedor();	// Crea instancia que almacena instancias
		Menu.drawMenu(3);						// pinta Menu
		Select.action(); 						// recibe & valida opcion -> invoca método asociado
	}
}