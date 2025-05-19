package ppai_G10_3K6;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class OrdenDeInspeccion {
	//Atributos Simples
	private LocalDateTime fechaHoraCierre;
	private LocalDateTime fechaHoraFinalizacion;
	private LocalDateTime fechaHoraInicio;
	private double numeroOrden;
	private String observacionCierre;
	//Atributos por referencia
	private EstacionSismologica estacionSismologica;
	private Estado estado;
	private List<TareaAsignada> tareaAsignada = new ArrayList<>();
	private Empleado empleado;
	//Setters y Getters
	public LocalDateTime getFechaHoraCierre() {
		return fechaHoraCierre;
	}
	public void setFechaHoraCierre(LocalDateTime fechaHoraCierre) {
		this.fechaHoraCierre = fechaHoraCierre;
	}
	public LocalDateTime getFechaHoraFinalizacion() {
		return fechaHoraFinalizacion;
	}
	public void setFechaHoraFinalizacion(LocalDateTime fechaHoraFinalizacion) {
		this.fechaHoraFinalizacion = fechaHoraFinalizacion;
	}
	public LocalDateTime getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public double getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(double numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public String getObservacionCierre() {
		return observacionCierre;
	}
	public void setObservacionCierre(String observacionCierre) {
		this.observacionCierre = observacionCierre;
	}
}
