package ppai_G10_3K6;
import java.util.List;
import java.util.ArrayList;
public class Perfil {
	//Atributos Simples
	private String descripcion;
	private String nombre;
	//Atributos por referencia
	private List<Permiso> permisos = new ArrayList<>();
	//Setters y Getters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
