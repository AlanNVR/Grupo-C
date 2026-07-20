package ec.edu.uteq.simpa.modelo;

public abstract class Usuario {
	private int _idUsuario;
	private String _nombre;
	private String _cedula;
	private String _nombreUsuario;
	private String _claveHash;
	private boolean _estado;

	/**
	 * Verifica si la clave proporcionada corresponde al usuario.
	 */
	public boolean validarCredenciales(String aClave) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Finaliza la sesión activa del usuario.
	 */
	public void cerrarSesion() {
		throw new UnsupportedOperationException();
	}

	public void setIdUsuario(int aIdUsuario) {
		this._idUsuario = aIdUsuario;
	}

	public int getIdUsuario() {
		return this._idUsuario;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setCedula(String aCedula) {
		this._cedula = aCedula;
	}

	public String getCedula() {
		return this._cedula;
	}

	public void setNombreUsuario(String aNombreUsuario) {
		this._nombreUsuario = aNombreUsuario;
	}

	public String getNombreUsuario() {
		return this._nombreUsuario;
	}

	public void setClaveHash(String aClaveHash) {
		this._claveHash = aClaveHash;
	}

	public String getClaveHash() {
		return this._claveHash;
	}

	public void setEstado(boolean aEstado) {
		this._estado = aEstado;
	}

	public boolean isEstado() {
		return this._estado;
	}
}