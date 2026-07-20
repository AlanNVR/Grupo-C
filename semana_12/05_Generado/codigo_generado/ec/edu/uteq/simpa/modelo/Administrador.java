package ec.edu.uteq.simpa.modelo;

public class Administrador extends Usuario {
	private String _nivelAcceso;

	/**
	 * Registra una plantación en el sistema.
	 */
	public void registrarPlantacion(Plantacion aPlantacion) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Registra un lote asociado a una plantación. 
	 */
	public void registrarLote(Plantacion aPlantacion, Lote aLote) {
		throw new UnsupportedOperationException();
	}

	public void setNivelAcceso(String aNivelAcceso) {
		this._nivelAcceso = aNivelAcceso;
	}

	public String getNivelAcceso() {
		return this._nivelAcceso;
	}
}