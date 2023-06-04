package entidades;

import java.time.LocalDate;

import sprint.Asesoria;

public class Profesional extends Usuario implements Asesoria {
	private String titulo;
	private LocalDate fechaIngreso;
	
	public Profesional() {}

	/**
	 * @param run
	 * @param nombres
	 * @param apellidos
	 * @param fechaNacimiento
	 */
	public Profesional(String run, String nombres, String apellidos, LocalDate fechaNacimiento) {
		super(run, nombres, apellidos, fechaNacimiento);
	}
	
	/**
	 * @param run
	 * @param nombres
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String run, String nombres, String apellidos, LocalDate fechaNacimiento, String titulo,
			LocalDate fechaIngreso) {
		super(run, nombres, apellidos, fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [run=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("\tTitulo: " + titulo + "\n\tFecha de ingreso: " + fechaIngreso);
	}
}
