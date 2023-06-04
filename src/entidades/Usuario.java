package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import sprint.Asesoria;

abstract class Usuario implements Asesoria{
	protected String run;
	protected String nombres;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	
	public Usuario() {}

	/**
	 * @param run
	 * @param nombres
	 * @param apellidos
	 * @param fechaNacimiento
	 */
	public Usuario(String run, String nombres, String apellidos, LocalDate fechaNacimiento) {
		this.run = run;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param run the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Usuario [run=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("\n\tRun: " + run + "\n\tNombre: " + nombres + "\n\tApellido: " + apellidos);
	}
	
	public void mostrarEdad() {
		LocalDate hoy = LocalDate.now(); 
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
	    
	    Period periodo = Period.between(fechaNac, hoy);
	    System.out.printf("\n\tEdad: %s años", periodo.getYears());
	}
}
