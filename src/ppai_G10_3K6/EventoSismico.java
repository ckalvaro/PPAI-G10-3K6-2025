package ppai_G10_3K6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventoSismico {
	//Atributos simples
	private LocalDateTime fechaHoraOcurrencia;
	private double latitudEpicentro;
	private double longitudEpicentro;
	private double latitudHipocentro;
	private double longitudHipocentro;
	private double valorMagnitud;
	//Atributos por referencia
	private Empleado analistaSupervisor;
	private ClasificacionSismo clasificacion;
	private MagnitudRichter magnitud;
	private OrigenDeGeneracion origenGeneracion;
	private AlcanceSismo alcanceSismo;
	private Estado estadoActual;
	private List<CambioEstado> cambioEstado = new ArrayList<>();
	private List<SerieTemporal> serieTemporal = new ArrayList<>();
	//Getters y Setters
	public LocalDateTime getFechaHoraOcurrencia() {
		return fechaHoraOcurrencia;
	}
	public void setFechaHoraOcurrencia(LocalDateTime fechaHoraOcurrencia) {
		this.fechaHoraOcurrencia = fechaHoraOcurrencia;
	}
	public double getLatitudEpicentro() {
		return latitudEpicentro;
	}
	public void setLatitudEpicentro(double latitudEpicentro) {
		this.latitudEpicentro = latitudEpicentro;
	}
	public double getLongitudEpicentro() {
		return longitudEpicentro;
	}
	public void setLongitudEpicentro(double longitudEpicentro) {
		this.longitudEpicentro = longitudEpicentro;
	}
	public double getLatitudHipocentro() {
		return latitudHipocentro;
	}
	public void setLatitudHipocentro(double latitudHipocentro) {
		this.latitudHipocentro = latitudHipocentro;
	}
	public double getLongitudHipocentro() {
		return longitudHipocentro;
	}
	public void setLongitudHipocentro(double longitudHipocentro) {
		this.longitudHipocentro = longitudHipocentro;
	}
	public double getValorMagnitud() {
		return valorMagnitud;
	}
	public void setValorMagnitud(double valorMagnitud) {
		this.valorMagnitud = valorMagnitud;
	}
	public ClasificacionSismo getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(ClasificacionSismo clasificacion) {
		this.clasificacion = clasificacion;
	}
	public MagnitudRichter getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(MagnitudRichter magnitud) {
		this.magnitud = magnitud;
	}
	public OrigenDeGeneracion getOrigenGeneracion() {
		return origenGeneracion;
	}
	public void setOrigenGeneracion(OrigenDeGeneracion origenGeneracion) {
		this.origenGeneracion = origenGeneracion;
	}
	public AlcanceSismo getAlcanceSismo() {
		return alcanceSismo;
	}
	public void setAlcanceSismo(AlcanceSismo alcanceSismo) {
		this.alcanceSismo = alcanceSismo;
	}
	public Estado getEstadoActual() {
		return estadoActual;
	}
	public void setEstadoActual(Estado estadoActual) {
		this.estadoActual = estadoActual;
	}
	public List<CambioEstado> getCambioEstado() {
		return cambioEstado;
	}
	public void setCambioEstado(List<CambioEstado> cambioEstado) {
		this.cambioEstado = cambioEstado;
	}
	public List<SerieTemporal> getSerieTemporal() {
		return serieTemporal;
	}
	public void setSerieTemporal(List<SerieTemporal> serieTemporal) {
		this.serieTemporal = serieTemporal;
	}
}
