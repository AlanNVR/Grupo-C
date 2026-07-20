package ec.edu.uteq.simpa.modelo;

public class Palma {
	private int _idPalma;
	private String _codigo;
	private String _estado;
	public Lote _lote;

	/**
	 * Actualiza el estado actual de la palma.
	 */
	public void actualizarEstado(String aNuevoEstado) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Indica si la palma se encuentra activa.
	 */
	public boolean estaActiva() {
		throw new UnsupportedOperationException();
	}

	public void setIdPalma(int aIdPalma) {
		this._idPalma = aIdPalma;
	}

	public int getIdPalma() {
		return this._idPalma;
	}

	public void setCodigo(String aCodigo) {
		this._codigo = aCodigo;
	}

	public String getCodigo() {
		return this._codigo;
	}

	public void setEstado(String aEstado) {
		this._estado = aEstado;
	}

	public String getEstado() {
		return this._estado;
	}
}