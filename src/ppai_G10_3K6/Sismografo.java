package ppai_G10_3K6;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Sismografo {
	//Atributos Simples
	private LocalDateTime fechaAdquisicion;
	private String identificadorSismografo; //capaz esta mal el tipo de dato
	private double nroSerie;
	//Atributos por referencia
	private List<SerieTemporal>serieTemporal = new ArrayList<>();
	private ModeloSismografo modelo;
	private List<CambioEstado>cambioEstado = new ArrayList<>();
	private Estado estadoActual;
	private EstacionSismologica estacionSismologica;
	//Setters y Getters
	public LocalDateTime getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(LocalDateTime fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
	public String getIdentificadorSismografo() {
		return identificadorSismografo;
	}
	public void setIdentificadorSismografo(String identificadorSismografo) {
		this.identificadorSismografo = identificadorSismografo;
	}
	public double getNroSerie() {
		return nroSerie;
	}
	public void setNroSerie(double nroSerie) {
		this.nroSerie = nroSerie;
	}
}
