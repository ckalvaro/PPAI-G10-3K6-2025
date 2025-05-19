package ppai_G10_3K6;
import java.time.LocalDateTime;
public class CambioEstado {
	//Atributos Simples
	private LocalDateTime fechaHoraFin;
	private LocalDateTime fechaHoraInicio;
	//Atributos por referencia
	private Estado estado;
	private MotivoFueraServicio motivoFueraServicio;
	//Setters y Getters
	public LocalDateTime getFechaHoraFin() {
		return fechaHoraFin;
	}
	public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}
	public LocalDateTime getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public MotivoFueraServicio getMotivoFueraServicio() {
		return motivoFueraServicio;
	}
	public void setMotivoFueraServicio(MotivoFueraServicio motivoFueraServicio) {
		this.motivoFueraServicio = motivoFueraServicio;
	}
}
