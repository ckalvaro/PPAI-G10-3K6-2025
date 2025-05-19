package ppai_G10_3K6;
import java.time.LocalDateTime;
public class TareaAsignada {
	private String comentario;
	private LocalDateTime fechaHoraRealizacion;
	//Atributos por referencia
	private TipoTareaInspeccion tarea;
	private ApreciacionTipo apreciacion;
	//Setters y Getters
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public LocalDateTime getFechaHoraRealizacion() {
		return fechaHoraRealizacion;
	}
	public void setFechaHoraRealizacion(LocalDateTime fechaHoraRealizacion) {
		this.fechaHoraRealizacion = fechaHoraRealizacion;
	}
}
