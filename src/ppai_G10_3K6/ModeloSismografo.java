package ppai_G10_3K6;

public class ModeloSismografo {
	//Atributos Simples
	private String caracteristicas;
	private String nombreModelo;
	//Atributos por referencia
	private Fabricante fabricante;
	//Setters y Getters
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public String getNombreModelo() {
		return nombreModelo;
	}
	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}
}
