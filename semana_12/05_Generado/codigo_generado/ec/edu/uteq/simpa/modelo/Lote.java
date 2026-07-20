package ec.edu.uteq.simpa.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import ec.edu.uteq.simpa.modelo.Palma;
import ec.edu.uteq.simpa.modelo.Labor;
import ec.edu.uteq.simpa.modelo.RegistroClimatico;

public class Lote {
	private int _idLote;
	private String _codigo;
	private double _areaHectareas;
	private LocalDate _fechaSiembra;
	private String _etapaActual;
	public Plantacion _plantacion;
	public ArrayList<Palma> _palmas = new ArrayList<Palma>();
	public ArrayList<Labor> _labores = new ArrayList<Labor>();
	public ArrayList<RegistroClimatico> _registrosClimaticos = new ArrayList<RegistroClimatico>();

	/**
	 * Agrega una palma al lote.
	 */
	public void agregarPalma(Palma aPalma) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Registra una labor agrícola asociada al lote.
	 */
	public void registrarLabor(Labor aLabor) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Registra información climática correspondiente al lote.
	 */
	public void registrarClima(RegistroClimatico aRegistro) {
		throw new UnsupportedOperationException();
	}

	public void setIdLote(int aIdLote) {
		this._idLote = aIdLote;
	}

	public int getIdLote() {
		return this._idLote;
	}

	public void setCodigo(String aCodigo) {
		this._codigo = aCodigo;
	}

	public String getCodigo() {
		return this._codigo;
	}

	public void setAreaHectareas(double aAreaHectareas) {
		this._areaHectareas = aAreaHectareas;
	}

	public double getAreaHectareas() {
		return this._areaHectareas;
	}

	public void setFechaSiembra(LocalDate aFechaSiembra) {
		this._fechaSiembra = aFechaSiembra;
	}

	public LocalDate getFechaSiembra() {
		return this._fechaSiembra;
	}

	public void setEtapaActual(String aEtapaActual) {
		this._etapaActual = aEtapaActual;
	}

	public String getEtapaActual() {
		return this._etapaActual;
	}
}