/*
 * Crear un menú principal con nueve opciones: 
 * ocho para las acciones indicadas en el listado
 * una opción para salir del programa. 
 * En caso de que se ingrese una opción incorrecta, se debe pedir nuevamente. 
 * El programa solo terminará una vez que ingrese la opción de salida.
 * 1. Crear Cliente: crear Cliente -> Contenedor.usuarios
 * 2. Crear Profesional: crear Profesional -> Contenedor.usuarios
 * 3. Crear Administrativo: crear Administrativo -> Contenedor.usuarios
 * 4. Crear Capacitacion: crear Capacitacion -> Contenedor.capacitaciones 
 * 5. Eliminar Usuario: eliminar entrada de Contenedor.usuarios.usuario segun RUN
 * 6. Listar Usuarios: show Contenedor.usuarios.analizarUsuario()
 * 7. Listar Usuario x tipo: show Contenedor.usuarios.analizarUsuario() según instancia? constructor?
 * 8. Listar Capacitaciones: show Contenedor.capacitaciones 
 * 9. SALIR
 */

package sprint;

public abstract class Menu {

	public static void drawMenu() {
		System.out.println();
		System.out.println("\t" + "\u001B[40m" + " ".repeat(55) + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    ****** SISTEMA DE GESTION DE INFORMACIÓN ******    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *                                             *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "1" + "\u001B[40m" + "]  CREAR CLIENTE                      *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "2" + "\u001B[40m" + "]  CREAR PROFESIONAL                  *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "3" + "\u001B[40m" + "]  CREAR ADMINISTRATIVO               *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "4" + "\u001B[40m" + "]  CREAR CAPACITACIÓN                 *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "5" + "\u001B[40m" + "]  ELIMINAR USUARIO                   *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "6" + "\u001B[40m" + "]  LISTAR USUARIOS                    *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "7" + "\u001B[40m" + "]  LISTAR USUARIOS POR CATEGORÍA      *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "8" + "\u001B[40m" + "]  LISTAR CAPACITACIONES              *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [" + "\u001B[44m" + "9" + "\u001B[40m" + "]  SALIR                              *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *                                             *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    ***********************************************    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + " ".repeat(55) + "\u001B[0m");
		System.out.println("\u001B[0m" + "\n");
	}
	public static void drawMenu(int a) {
		System.out.println();
		System.out.println("\t" + "\u001B[40m" + " ".repeat(55) + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    ****** SISTEMA DE GESTION DE INFORMACIÓN ******    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *                                             *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [1]  CREAR CLIENTE                      *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [2]  CREAR PROFESIONAL                  *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [3]  CREAR ADMINISTRATIVO               *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [4]  CREAR CAPACITACIÓN                 *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [5]  ELIMINAR USUARIO                   *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [6]  LISTAR USUARIOS                    *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [7]  LISTAR USUARIOS POR CATEGORÍA      *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [8]  LISTAR CAPACITACIONES              *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *     [9]  SALIR                              *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    *                                             *    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + "    ***********************************************    " + "\u001B[0m");
		System.out.println("\t" + "\u001B[40m" + " ".repeat(55) + "\u001B[0m");
		System.out.println("\u001B[0m" + "\n");
	}
}


