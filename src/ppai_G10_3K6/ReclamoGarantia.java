package ppai_G10_3K6;
import java.time.LocalDateTime;
public class ReclamoGarantia {
	//Atributos Simples
	private String comentario;
	private LocalDateTime fechaReclamo;
	private LocalDateTime fechaRespuesta;
	private double nroReclamo;
	private String respuestaFabricante;
	//Setters y Getters
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public LocalDateTime getFechaReclamo() {
		return fechaReclamo;
	}
	public void setFechaReclamo(LocalDateTime fechaReclamo) {
		this.fechaReclamo = fechaReclamo;
	}
	public LocalDateTime getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(LocalDateTime fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
	public double getNroReclamo() {
		return nroReclamo;
	}
	public void setNroReclamo(double nroReclamo) {
		this.nroReclamo = nroReclamo;
	}
	public String getRespuestaFabricante() {
		return respuestaFabricante;
	}
	public void setRespuestaFabricante(String respuestaFabricante) {
		this.respuestaFabricante = respuestaFabricante;
	}
}
