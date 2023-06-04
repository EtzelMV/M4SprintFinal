package entidades;

import java.time.LocalDate;

import sprint.Asesoria;

public class Administrativo extends Usuario implements Asesoria {
	private String area;
	private String expPrevia;
	
	public Administrativo() {}
	
	/**
	 * @param run
	 * @param nombres
	 * @param apellidos
	 * @param fechaNacimiento
	 */
	public Administrativo(String run, String nombres, String apellidos, LocalDate fechaNacimiento) {
		super(run, nombres, apellidos, fechaNacimiento);
	}

	/**
	 * @param run
	 * @param nombres
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String run, String nombres, String apellidos, LocalDate fechaNacimiento, String area,
			String expPrevia) {
		super(run, nombres, apellidos, fechaNacimiento);
		this.area = area;
		this.expPrevia = expPrevia;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @return the expPrevia
	 */
	public String getExpPrevia() {
		return expPrevia;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @param expPrevia the expPrevia to set
	 */
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [run=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", area=" + area + ", expPrevia=" + expPrevia + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("\tArea de trabajo: " + area + "\n\tExperiencia: " + expPrevia);
	}
}
