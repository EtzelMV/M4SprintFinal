package sprint;

public abstract class Show {
	
	// USER MESSAGES
	private static final String CREATE_GENERAL = "Estimado usuario: ingrese los datos siguiendo\n" 
													+ "la indicación correspondiente a cada campo.";
	private static final String CREATE_WRONG_FIELD = "Ingrese el dato siguiendo las indicaciones";
	private static final String CREATE_CLIENTE_NOMBRES = "NOMBRES: --obligatorio, entre 5 y 30 caracteres--";
	private static final String CREATE_CLIENTE_APELLIDOS = "APELLIDOS: --obligatorio, entre 5 y 30 caracteres--";
	private static final String CREATE_CLIENTE_RUN = "RUN: --obligatorio, formato 11111111-1--";
	private static final String CREATE_CLIENTE_FECHA_NAC = "FECHA DE NACIMIENTO: --obligatorio, formato DD/MM/AAAA)";
	private static final String CREATE_CLIENTE_TELEFONO = "";
	private static final String CREATE_CLIENTE_AFP = "";
		
	// MOSTRAR MENSAJES DE AYUDA AL USUARIO
	public static void guide(String kind) {
		switch (kind) {
		case "createGeneral":
			System.out.println(CREATE_GENERAL);
			break;
		case "createClienteNombres":
			System.out.println(CREATE_CLIENTE_NOMBRES);
			break;
		case "createClienteApellidos":
			System.out.println(CREATE_CLIENTE_APELLIDOS);
			break;
		case "createClienteRun":
			System.out.println(CREATE_CLIENTE_RUN);
			break;
		case "createClienteFechaNac":
			System.out.println(CREATE_CLIENTE_FECHA_NAC);
			break;
		case "createClienteTelefono":
			System.out.println(CREATE_CLIENTE_TELEFONO );
			break;
		case "createClienteAfp":
			System.out.println(CREATE_CLIENTE_AFP);
			break;
		case "createClienteSistSalud":
			System.out.println(CREATE_CLIENTE_NOMBRES);
			break;
		case "createClienteDireccion":
			System.out.println(CREATE_CLIENTE_NOMBRES);
			break;
		case "createWrongField":
			System.out.println(CREATE_WRONG_FIELD);
			break;
		default:
			System.out.println("Ups!");
			break;
		}										// ends switch msg
	}											// ends static void guide() 
}												// ends static class Utils
