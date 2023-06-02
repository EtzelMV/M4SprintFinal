package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario {
	private String telefono;
	private String afp;
	private int sistemaDeSalud;
	private String direccion;
	private String comuna;
	private int edad;
	private ArrayList<Visita> visitas;
	private ArrayList<Accidente> accidentes;
	private ArrayList<Capacitacion> capacitaciones;
	
	public Cliente() {}
	
	public Cliente(String run, String nombres, String apellidos, LocalDate fechaNacimiento) {
		super(run, nombres, apellidos, fechaNacimiento);
	}

	/**
	 * @param run
	 * @param nombres
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param telefono
	 * @param afp
	 * @param sistemaDeSalud
	 * @param direccion
	 * @param comuna
	 * @param edad
	 * @param visitas
	 * @param accidentes
	 * @param capacitaciones
	 */
	public Cliente(String run, String nombres, String apellidos, LocalDate fechaNacimiento, String telefono, String afp,
			int sistemaDeSalud, String direccion, String comuna, int edad, ArrayList<Visita> visitas,
			ArrayList<Accidente> accidentes, ArrayList<Capacitacion> capacitaciones) {
		super(run, nombres, apellidos, fechaNacimiento);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.visitas = visitas;
		this.accidentes = accidentes;
		this.capacitaciones = capacitaciones;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * @return the sistemaDeSalud
	 */
	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the visitas
	 */
	public ArrayList<Visita> getVisitas() {
		return visitas;
	}

	/**
	 * @return the accidentes
	 */
	public ArrayList<Accidente> getAccidentes() {
		return accidentes;
	}

	/**
	 * @return the capacitaciones
	 */
	public ArrayList<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @param sistemaDeSalud the sistemaDeSalud to set
	 */
	public void setSistemaDeSalud(int sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param visitas the visitas to set
	 */
	public void setVisitas(ArrayList<Visita> visitas) {
		this.visitas = visitas;
	}

	/**
	 * @param accidentes the accidentes to set
	 */
	public void setAccidentes(ArrayList<Accidente> accidentes) {
		this.accidentes = accidentes;
	}

	/**
	 * @param capacitaciones the capacitaciones to set
	 */
	public void setCapacitaciones(ArrayList<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	@Override
	public String toString() {
		return "Cliente [run=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", telefono=" + telefono + ", afp=" + afp + ", sistemaDeSalud=" + sistemaDeSalud
				+ ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + ", accidentes=" + accidentes
				+ ", capacitaciones=" + capacitaciones + "]";
	}
}
