package ec.edu.uteq.simpa.demo;

import java.util.ArrayList;
import java.util.List;

import ec.edu.uteq.simpa.modelo.Lote;

/**
 * CRUD manual en memoria para demostrar el uso de la entidad Lote
 * generada desde el modelo UML de SIMPA.
 */
public class LoteCrud {

    private final List<Lote> lotes = new ArrayList<>();

    // CREATE: registra un lote nuevo.
    public boolean crear(Lote lote) {
        if (lote == null || buscarPorId(lote.getIdLote()) != null) {
            return false;
        }

        lotes.add(lote);
        return true;
    }

    // READ: busca un lote mediante su identificador.
    public Lote buscarPorId(int idLote) {
        for (Lote lote : lotes) {
            if (lote.getIdLote() == idLote) {
                return lote;
            }
        }

        return null;
    }

    // READ: devuelve todos los lotes registrados.
    public List<Lote> listar() {
        return new ArrayList<>(lotes);
    }

    // UPDATE: actualiza los datos principales de un lote.
    public boolean actualizar(int idLote, String codigo,
                              double areaHectareas, String etapaActual) {

        Lote lote = buscarPorId(idLote);

        if (lote == null) {
            return false;
        }

        lote.setCodigo(codigo);
        lote.setAreaHectareas(areaHectareas);
        lote.setEtapaActual(etapaActual);
        return true;
    }

    // DELETE: elimina un lote mediante su identificador.
    public boolean eliminar(int idLote) {
        Lote lote = buscarPorId(idLote);

        if (lote == null) {
            return false;
        }

        return lotes.remove(lote);
    }
}