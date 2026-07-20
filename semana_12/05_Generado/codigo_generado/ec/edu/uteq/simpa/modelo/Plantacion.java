package ec.edu.uteq.simpa.modelo;

import java.util.ArrayList;
import ec.edu.uteq.simpa.modelo.Lote;

public class Plantacion {
	private int _idPlantacion;
	private String _nombre;
	private String _ubicacion;
	public ArrayList<Lote> _lotes = new ArrayList<Lote>();

	/**
	 * Agrega un lote a la plantación.
	 */
	public void agregarLote(Lote aLote) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Busca un lote por su código dentro de la plantación.
	 */
	public Lote buscarLote(String aCodigo) {
		throw new UnsupportedOperationException();
	}

	public void setIdPlantacion(int aIdPlantacion) {
		this._idPlantacion = aIdPlantacion;
	}

	public int getIdPlantacion() {
		return this._idPlantacion;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setUbicacion(String aUbicacion) {
		this._ubicacion = aUbicacion;
	}

	public String getUbicacion() {
		return this._ubicacion;
	}
}