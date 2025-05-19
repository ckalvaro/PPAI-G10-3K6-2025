package ppai_G10_3K6;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class SerieTemporal {

	//Atributos Simples
	private String condicionAlarma;
	private LocalDateTime fechaHoraInicioRegistroMuestras;
	private LocalDateTime fechaHoraRegistro;
	private float frecuenciaMuestreo;
	//Atributos por referencia
	private Estado estado;
	private List<MuestraSismica> muestrasSismica;
	//Setters y Getters
	public String getCondicionAlarma() {
		return condicionAlarma;
	}
	public void setCondicionAlarma(String condicionAlarma) {
		this.condicionAlarma = condicionAlarma;
	}
	public LocalDateTime getFechaHoraInicioRegistroMuestras() {
		return fechaHoraInicioRegistroMuestras;
	}
	public void setFechaHoraInicioRegistroMuestras(LocalDateTime fechaHoraInicioRegistroMuestras) {
		this.fechaHoraInicioRegistroMuestras = fechaHoraInicioRegistroMuestras;
	}
	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}
	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
	public float getFrecuenciaMuestreo() {
		return frecuenciaMuestreo;
	}
	public void setFrecuenciaMuestreo(float frecuenciaMuestreo) {
		this.frecuenciaMuestreo = frecuenciaMuestreo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
