package sprint;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
	private int idAccidente;
	private String rutCliente;
	private LocalDate fechaAccidente;
	private LocalTime horaAccidente;
	private String lugarAccidente;
	private String origenAccidente;
	private String consecuenciaAccidente;
	
	public Accidente() {}

	/**
	 * @param idAccidente
	 * @param rutCliente
	 * @param fechaAccidente
	 * @param horaAccidente
	 * @param lugarAccidente
	 * @param origenAccidente
	 * @param consecuenciaAccidente
	 */
	public Accidente(int idAccidente, String rutCliente, LocalDate fechaAccidente, LocalTime horaAccidente,
			String lugarAccidente, String origenAccidente, String consecuenciaAccidente) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciaAccidente = consecuenciaAccidente;
	}

	/**
	 * @return the idAccidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}

	/**
	 * @return the rutCliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}

	/**
	 * @return the fechaAccidente
	 */
	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	/**
	 * @return the horaAccidente
	 */
	public LocalTime getHoraAccidente() {
		return horaAccidente;
	}

	/**
	 * @return the lugarAccidente
	 */
	public String getLugarAccidente() {
		return lugarAccidente;
	}

	/**
	 * @return the origenAccidente
	 */
	public String getOrigenAccidente() {
		return origenAccidente;
	}

	/**
	 * @return the consecuenciaAccidente
	 */
	public String getConsecuenciaAccidente() {
		return consecuenciaAccidente;
	}

	/**
	 * @param idAccidente the idAccidente to set
	 */
	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * @param fechaAccidente the fechaAccidente to set
	 */
	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	/**
	 * @param horaAccidente the horaAccidente to set
	 */
	public void setHoraAccidente(LocalTime horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	/**
	 * @param lugarAccidente the lugarAccidente to set
	 */
	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	/**
	 * @param origenAccidente the origenAccidente to set
	 */
	public void setOrigenAccidente(String origenAccidente) {
		this.origenAccidente = origenAccidente;
	}

	/**
	 * @param consecuenciaAccidente the consecuenciaAccidente to set
	 */
	public void setConsecuenciaAccidente(String consecuenciaAccidente) {
		this.consecuenciaAccidente = consecuenciaAccidente;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente=" + lugarAccidente
				+ ", origenAccidente=" + origenAccidente + ", consecuenciaAccidente=" + consecuenciaAccidente + "]";
	}
}
