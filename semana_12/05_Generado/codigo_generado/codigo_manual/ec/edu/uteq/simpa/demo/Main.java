package ec.edu.uteq.simpa.demo;

import java.time.LocalDate;

import ec.edu.uteq.simpa.modelo.Administrador;
import ec.edu.uteq.simpa.modelo.Labor;
import ec.edu.uteq.simpa.modelo.Lote;
import ec.edu.uteq.simpa.modelo.Palma;
import ec.edu.uteq.simpa.modelo.Plantacion;
import ec.edu.uteq.simpa.modelo.RegistroClimatico;
import ec.edu.uteq.simpa.modelo.Trabajador;

public class Main {

    public static void main(String[] args) {

        // Usuario administrador: demuestra la herencia desde Usuario.
        Administrador administrador = new Administrador();
        administrador.setIdUsuario(1);
        administrador.setNombre("Ana Torres");
        administrador.setCedula("1200000001");
        administrador.setNombreUsuario("admin.simpa");
        administrador.setEstado(true);
        administrador.setNivelAcceso("TOTAL");

        // Plantación.
        Plantacion plantacion = new Plantacion();
        plantacion.setIdPlantacion(101);
        plantacion.setNombre("Plantación La Esperanza");
        plantacion.setUbicacion("Quevedo, Los Ríos");

        // Lote asociado con la plantación.
        Lote lote = new Lote();
        lote.setIdLote(201);
        lote.setCodigo("LT-001");
        lote.setAreaHectareas(12.5);
        lote.setFechaSiembra(LocalDate.of(2024, 3, 15));
        lote.setEtapaActual("Producción");

        lote._plantacion = plantacion;
        plantacion._lotes.add(lote);

        // Palma perteneciente al lote.
        Palma palma = new Palma();
        palma.setIdPalma(301);
        palma.setCodigo("PAL-001");
        palma.setEstado("Activa");

        palma._lote = lote;
        lote._palmas.add(palma);

        // Trabajador: también demuestra la herencia desde Usuario.
        Trabajador trabajador = new Trabajador();
        trabajador.setIdUsuario(2);
        trabajador.setNombre("Carlos Mendoza");
        trabajador.setCedula("1200000002");
        trabajador.setNombreUsuario("trabajador.simpa");
        trabajador.setEstado(true);
        trabajador.setEquipo("Equipo de mantenimiento A");

        // Labor asociada con el lote y el trabajador.
        Labor labor = new Labor();
        labor.setIdLabor(401);
        labor.setTipo("Fertilización");
        labor.setFecha(LocalDate.of(2026, 7, 19));
        labor.setDescripcion("Aplicación programada de fertilizante");
        labor.setEstado("Pendiente");

        labor._lote = lote;
        labor._responsable = trabajador;
        lote._labores.add(labor);
        trabajador._laboresRealizadas.add(labor);

        // Registro climático asociado con el lote.
        RegistroClimatico clima = new RegistroClimatico();
        clima.setIdRegistro(501);
        clima.setFecha(LocalDate.of(2026, 7, 19));
        clima.setMilimetrosLluvia(18.5);
        clima.setHorasLuz(7.2);

        clima._lote = lote;
        lote._registrosClimaticos.add(clima);

        // Salida demostrable.
        System.out.println("===== DEMOSTRACIÓN SIMPA =====");
        System.out.println("Administrador: " + administrador.getNombre());
        System.out.println("Nivel de acceso: " + administrador.getNivelAcceso());
        System.out.println("Plantación: " + plantacion.getNombre());
        System.out.println("Ubicación: " + plantacion.getUbicacion());
        System.out.println("Lote: " + lote.getCodigo());
        System.out.println("Área: " + lote.getAreaHectareas() + " hectáreas");
        System.out.println("Fecha de siembra: " + lote.getFechaSiembra());
        System.out.println("Palmas registradas: " + lote._palmas.size());
        System.out.println("Trabajador responsable: " + trabajador.getNombre());
        System.out.println("Labor asignada: " + labor.getTipo());
        System.out.println("Estado de la labor: " + labor.getEstado());
        System.out.println("Lluvia registrada: "
                + clima.getMilimetrosLluvia() + " mm");
        System.out.println("Registros climáticos: "
                + lote._registrosClimaticos.size());
        // Demostración CRUD manual en memoria para la entidad Lote.
	System.out.println();
	System.out.println("===== CRUD DE LOTE =====");

	LoteCrud loteCrud = new LoteCrud();

	// CREATE
	boolean creado = loteCrud.crear(lote);
	System.out.println("CREATE - Lote registrado: " + creado);

	// READ
	Lote loteConsultado = loteCrud.buscarPorId(201);
	System.out.println("READ - Lote encontrado: "
	        + (loteConsultado != null ? loteConsultado.getCodigo() : "No encontrado"));
	
	// UPDATE
	boolean actualizado = loteCrud.actualizar(
	        201,
	        "LT-001-A",
	        13.0,
	        "Mantenimiento"
	);
	System.out.println("UPDATE - Lote actualizado: " + actualizado);
	
	Lote loteActualizado = loteCrud.buscarPorId(201);
	System.out.println("READ después de UPDATE - Código: "
	        + loteActualizado.getCodigo());
	System.out.println("READ después de UPDATE - Área: "
	        + loteActualizado.getAreaHectareas());
	System.out.println("READ después de UPDATE - Etapa: "
	        + loteActualizado.getEtapaActual());
	
	// DELETE
	boolean eliminado = loteCrud.eliminar(201);
	System.out.println("DELETE - Lote eliminado: " + eliminado);
	
	// Verificación final
	boolean inexistente = loteCrud.buscarPorId(201) == null;
	System.out.println("Verificación - Lote ya no existe: " + inexistente);
	
	System.out.println("===== FIN DEL CRUD =====");
	System.out.println("===== FIN DE LA DEMOSTRACIÓN =====");
    }
}