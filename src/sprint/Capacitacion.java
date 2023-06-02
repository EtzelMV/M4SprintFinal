package sprint;

import java.time.LocalTime;

public class Capacitacion {
	private int idCapacitacion;
	private String rutCliente;
	private String dia;
	private LocalTime hora;
	private String lugar;
	private double duracion;
	private int cantAsistentes;
	
	public Capacitacion() {
}

	/**
	 * @param idCapacitacion
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantAsistentes
	 */
	public Capacitacion(int idCapacitacion, String rutCliente, String dia, LocalTime hora, String lugar,
			double duracion, int cantAsistentes) {
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}

	/**
	 * @return the idCapacitacion
	 */
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	/**
	 * @return the rutCliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}

	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @return the duracion
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * @return the cantAsistentes
	 */
	public int getCantAsistentes() {
		return cantAsistentes;
	}

	/**
	 * @param idCapacitacion the idCapacitacion to set
	 */
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	/**
	 * @param cantAsistentes the cantAsistentes to set
	 */
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes="
				+ cantAsistentes + "]";
	}
	
	public void mostrarDetalle() {
		System.out.println("\tLa capacitacion será en " + lugar + " a las " + hora + " del dia " + dia + ", y durara " + duracion*60 + " minutos.");
	}
}
