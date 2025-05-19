package ppai_G10_3K6;

public class ClasificacionSismo {
	//Atributos simples
	private int kmProfundidadDesde;
	private int kmProfundidadHasta;
	private String nombre;
	//Setters y Getters
	public int getKmProfundidadDesde() {
		return kmProfundidadDesde;
	}
	public void setKmProfundidadDesde(int kmProfundidadDesde) {
		this.kmProfundidadDesde = kmProfundidadDesde;
	}
	public int getKmProfundidadHasta() {
		return kmProfundidadHasta;
	}
	public void setKmProfundidadHasta(int kmProfundidadHasta) {
		this.kmProfundidadHasta = kmProfundidadHasta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
