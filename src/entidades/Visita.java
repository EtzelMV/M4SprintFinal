package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Visita {
	private int idVisita ;
	private String horaAccidente;
    private	String lugarAccidente;
    private	String comentarios;
    private	ArrayList<Revision> revisiones = new ArrayList<>();
    private	String rutCliente;
    private	LocalDate fechaAccidente;
    
    public Visita() {}
    
	public Visita(int idVisita, String horaAccidente, String lugarAccidente, String comentarios,
			ArrayList<Revision> revisiones, String rutCliente, LocalDate fechaAccidente) {
		this.idVisita = idVisita;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.comentarios = comentarios;
		this.revisiones = revisiones;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public String getComentarios() {
		return comentarios;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	
	public ArrayList<Revision> getRevisiones() {
		return revisiones;
	}

	public void setRevisiones(ArrayList<Revision> revisiones) {
		this.revisiones = revisiones;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	@Override
	public String toString() {
		return "Visita [idVisita=" + idVisita + ", horaAccidente=" + horaAccidente + ", lugarAccidente="
				+ lugarAccidente + ", comentarios=" + comentarios + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + "]";
	}
}
