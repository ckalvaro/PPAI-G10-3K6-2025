package ppai_G10_3K6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenDeInspeccion {
    // Atributos simples
    private double numeroOrden;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFinalizacion;
    private LocalDateTime fechaHoraCierre;
    private String observacionCierre;

    // Agregaciones
    private Empleado empleado;
    private EstacionSismologica estacionSismologica;
    private Estado estado;

    // Composición
    private List<TareaAsignada> tareasAsignadas = new ArrayList<>();

    // Constructor para crear una orden antes de cerrarla
    public OrdenDeInspeccion(double numeroOrden,
                             LocalDateTime fechaHoraInicio,
                             LocalDateTime fechaHoraFinalizacion,
                             Empleado empleado,
                             EstacionSismologica estacionSismologica,
                             Estado estado) {
        this.numeroOrden          = numeroOrden;
        this.fechaHoraInicio      = fechaHoraInicio;
        this.fechaHoraFinalizacion= fechaHoraFinalizacion;
        this.empleado             = empleado;
        this.estacionSismologica  = estacionSismologica;
        this.estado               = estado;
        // fechaHoraCierre y observacionCierre quedan null hasta el cierre
    }

    // Constructor completo (por si quisieras inicializarlo todo de una vez)
    public OrdenDeInspeccion(double numeroOrden,
                             LocalDateTime fechaHoraInicio,
                             LocalDateTime fechaHoraFinalizacion,
                             LocalDateTime fechaHoraCierre,
                             String observacionCierre,
                             Empleado empleado,
                             EstacionSismologica estacionSismologica,
                             Estado estado,
                             List<TareaAsignada> tareasIniciales) {
        this(numeroOrden, fechaHoraInicio, fechaHoraFinalizacion, empleado, estacionSismologica, estado);
        this.fechaHoraCierre     = fechaHoraCierre;
        this.observacionCierre   = observacionCierre;
        if (tareasIniciales != null) {
            this.tareasAsignadas.addAll(tareasIniciales);
        }
    }

    // Getters y setters para atributos simples y agregaciones
    public double getNumeroOrden() { return numeroOrden; }
    public void setNumeroOrden(double numeroOrden) { this.numeroOrden = numeroOrden; }

    public LocalDateTime getFechaHoraInicio() { return fechaHoraInicio; }
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) { this.fechaHoraInicio = fechaHoraInicio; }

    public LocalDateTime getFechaHoraFinalizacion() { return fechaHoraFinalizacion; }
    public void setFechaHoraFinalizacion(LocalDateTime fechaHoraFinalizacion) {
        this.fechaHoraFinalizacion = fechaHoraFinalizacion;
    }

    public LocalDateTime getFechaHoraCierre() { return fechaHoraCierre; }
    public void setFechaHoraCierre(LocalDateTime fechaHoraCierre) { this.fechaHoraCierre = fechaHoraCierre; }

    public String getObservacionCierre() { return observacionCierre; }
    public void setObservacionCierre(String observacionCierre) { this.observacionCierre = observacionCierre; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public EstacionSismologica getEstacionSismologica() { return estacionSismologica; }
    public void setEstacionSismologica(EstacionSismologica estacionSismologica) {
        this.estacionSismologica = estacionSismologica;
    }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    // --- Composición: gestión de tareas asignadas ---
    /**
     * Devuelve una lista de solo lectura de las tareas asociadas
     */
    public List<TareaAsignada> getTareasAsignadas() {
        return Collections.unmodifiableList(tareasAsignadas);
    }

    /** Agrega una tarea a la orden */
    public void agregarTarea(TareaAsignada tarea) {
        if (tarea != null && !tareasAsignadas.contains(tarea)) {
            tareasAsignadas.add(tarea);
        }
    }

    /** Quita una tarea de la orden */
    public void quitarTarea(TareaAsignada tarea) {
        tareasAsignadas.remove(tarea);
    }
}
