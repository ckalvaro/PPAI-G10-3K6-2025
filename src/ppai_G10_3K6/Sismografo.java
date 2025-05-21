package ppai_G10_3K6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sismografo {

    //Atributos simples
    private LocalDateTime fechaAdquisicion;
    private int identificadorSismografo;
    private double nroSerie;

    //Agregaciones
    private ModeloSismografo modelo;
    private Estado estadoActual;
    private EstacionSismologica estacionSismologica;

    //Composiciones
    private List<SerieTemporal> seriesTemporales = new ArrayList<>();
    private List<CambioEstado> cambiosEstado    = new ArrayList<>();
    //Constructor sin parametros
    public Sismografo() {
        // Permitido para frameworks o inicialización posterior
    }
    //Constructor completo
    public Sismografo(LocalDateTime fechaAdquisicion,
                      int identificadorSismografo,
                      double nroSerie,
                      ModeloSismografo modelo,
                      Estado estadoActual,
                      EstacionSismologica estacionSismologica) {
        this.fechaAdquisicion        = fechaAdquisicion;
        this.identificadorSismografo = identificadorSismografo;
        this.nroSerie                = nroSerie;
        this.modelo                  = modelo;
        this.estadoActual            = estadoActual;
        this.estacionSismologica     = estacionSismologica;
    }

    //Getters y Setters
    public LocalDateTime getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(LocalDateTime fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getIdentificadorSismografo() {
        return identificadorSismografo;
    }
    public void setIdentificadorSismografo(int identificadorSismografo) {
        this.identificadorSismografo = identificadorSismografo;
    }

    public double getNroSerie() {
        return nroSerie;
    }
    public void setNroSerie(double nroSerie) {
        this.nroSerie = nroSerie;
    }

    public ModeloSismografo getModelo() {
        return modelo;
    }
    public void setModelo(ModeloSismografo modelo) {
        this.modelo = modelo;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }
    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public EstacionSismologica getEstacionSismologica() {
        return estacionSismologica;
    }
    public void setEstacionSismologica(EstacionSismologica estacionSismologica) {
        this.estacionSismologica = estacionSismologica;
    }

    //Composición: gestión de series temporales
    public List<SerieTemporal> getSeriesTemporales() {
        return Collections.unmodifiableList(seriesTemporales);
    }
    public void agregarSerieTemporal(SerieTemporal serie) {
        if (serie != null && !seriesTemporales.contains(serie)) {
            seriesTemporales.add(serie);
        }
    }
    public void quitarSerieTemporal(SerieTemporal serie) {
        seriesTemporales.remove(serie);
    }

    //Composición: gestión de cambios de estado
    public List<CambioEstado> getCambiosEstado() {
        return Collections.unmodifiableList(cambiosEstado);
    }
    public void registrarCambioEstado(CambioEstado cambio) {
        if (cambio != null && !cambiosEstado.contains(cambio)) {
            cambiosEstado.add(cambio);
        }
    }
    public void removerCambioEstado(CambioEstado cambio) {
        cambiosEstado.remove(cambio);
    }
}
