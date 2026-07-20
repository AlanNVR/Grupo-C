package ec.edu.uteq.simpa.modelo;

import java.time.LocalDate;

public class Labor {
	private int _idLabor;
	private String _tipo;
	private LocalDate _fecha;
	private String _descripcion;
	private String _estado;
	public Lote _lote;
	public Trabajador _responsable;

	/**
	 * Verifica que los datos obligatorios de la labor sean válidos.
	 */
	public boolean validarDatos() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Cambia el estado de la labor a completada.
	 */
	public void marcarCompletada() {
		throw new UnsupportedOperationException();
	}

	public void setIdLabor(int aIdLabor) {
		this._idLabor = aIdLabor;
	}

	public int getIdLabor() {
		return this._idLabor;
	}

	public void setTipo(String aTipo) {
		this._tipo = aTipo;
	}

	public String getTipo() {
		return this._tipo;
	}

	public void setFecha(LocalDate aFecha) {
		this._fecha = aFecha;
	}

	public LocalDate getFecha() {
		return this._fecha;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setEstado(String aEstado) {
		this._estado = aEstado;
	}

	public String getEstado() {
		return this._estado;
	}
}