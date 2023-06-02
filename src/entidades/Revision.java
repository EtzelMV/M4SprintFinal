package entidades;

public class Revision {
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalle;
	private byte estado;
	
	public Revision() {}

	/**
	 * @param idRevision
	 * @param idVisita
	 * @param nombreRevision
	 * @param detalle
	 * @param estado
	 */
	public Revision(int idRevision, int idVisita, String nombreRevision, String detalle, byte estado) {
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	
	public int getIdRevision() {
		return idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public byte getEstado() {
		return estado;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}
}
