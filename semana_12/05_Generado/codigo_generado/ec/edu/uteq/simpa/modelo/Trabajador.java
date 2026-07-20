package ec.edu.uteq.simpa.modelo;

import java.util.ArrayList;
import ec.edu.uteq.simpa.modelo.Labor;

public class Trabajador extends Usuario {
	private String _equipo;
	public ArrayList<Labor> _laboresRealizadas = new ArrayList<Labor>();

	/**
	 * Asigna una labor agrícola al trabajador.
	 */
	public void asignarLabor(Labor aLabor) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Marca como completada una labor realizada por el trabajador.
	 */
	public void completarLabor(Labor aLabor) {
		throw new UnsupportedOperationException();
	}

	public void setEquipo(String aEquipo) {
		this._equipo = aEquipo;
	}

	public String getEquipo() {
		return this._equipo;
	}
}