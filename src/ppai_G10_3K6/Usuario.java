package ppai_G10_3K6;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	//Atributos Simples
	private String contrasena;
	private String nombreUsuario;
	//Atributos por referencia
	private List<Perfil> perfil = new ArrayList<>();
	//Setters y Getters
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public List<Perfil> getPerfil() {
		return perfil;
	}
	public void setPerfil(List<Perfil> perfil) {
		this.perfil = perfil;
	}
}
