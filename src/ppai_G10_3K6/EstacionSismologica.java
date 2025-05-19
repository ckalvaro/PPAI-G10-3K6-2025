package ppai_G10_3K6;
import java.time.LocalDateTime;
public class EstacionSismologica {
	//Atributos Simples
	private String codigoEstacion; //capaz esta mal el tipo de dato
	private String documentoCertificacionAdq;
	private LocalDateTime fechaSolicitudCetificacion;
	private double latitud;
	private double longitud;
	private String nombre;
	private double nroCertificacionAdquisicion;
	//Setters y Getters
	public String getCodigoEstacion() {
		return codigoEstacion;
	}
	public void setCodigoEstacion(String codigoEstacion) {
		this.codigoEstacion = codigoEstacion;
	}
	public String getDocumentoCertificacionAdq() {
		return documentoCertificacionAdq;
	}
	public void setDocumentoCertificacionAdq(String documentoCertificacionAdq) {
		this.documentoCertificacionAdq = documentoCertificacionAdq;
	}
	public LocalDateTime getFechaSolicitudCetificacion() {
		return fechaSolicitudCetificacion;
	}
	public void setFechaSolicitudCetificacion(LocalDateTime fechaSolicitudCetificacion) {
		this.fechaSolicitudCetificacion = fechaSolicitudCetificacion;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNroCertificacionAdquisicion() {
		return nroCertificacionAdquisicion;
	}
	public void setNroCertificacionAdquisicion(double nroCertificacionAdquisicion) {
		this.nroCertificacionAdquisicion = nroCertificacionAdquisicion;
	}
}
