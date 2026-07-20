package ec.edu.uteq.simpa.modelo;

import java.time.LocalDate;

public class RegistroClimatico {
	private int _idRegistro;
	private LocalDate _fecha;
	private double _milimetrosLluvia;
	private double _horasLuz;
	public Lote _lote;

	/**
	 * Verifica que los valores del registro climático sean válidos.
	 */
	public boolean validarLectura() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Determina si la lluvia registrada supera el umbral indicado.
	 */
	public boolean esLluviaAlta(double aUmbral) {
		throw new UnsupportedOperationException();
	}

	public void setIdRegistro(int aIdRegistro) {
		this._idRegistro = aIdRegistro;
	}

	public int getIdRegistro() {
		return this._idRegistro;
	}

	public void setFecha(LocalDate aFecha) {
		this._fecha = aFecha;
	}

	public LocalDate getFecha() {
		return this._fecha;
	}

	public void setMilimetrosLluvia(double aMilimetrosLluvia) {
		this._milimetrosLluvia = aMilimetrosLluvia;
	}

	public double getMilimetrosLluvia() {
		return this._milimetrosLluvia;
	}

	public void setHorasLuz(double aHorasLuz) {
		this._horasLuz = aHorasLuz;
	}

	public double getHorasLuz() {
		return this._horasLuz;
	}
}