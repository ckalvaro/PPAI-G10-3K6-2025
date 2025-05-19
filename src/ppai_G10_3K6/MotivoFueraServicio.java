package ppai_G10_3K6;

public class MotivoFueraServicio {
	//Atributos Simples
	private String comentario;
	//Atributos por referencia
	private MotivoTipo motivoTipo;
	//Setters y Getters
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public MotivoTipo getMotivoTipo() {
		return motivoTipo;
	}
	public void setMotivoTipo(MotivoTipo motivoTipo) {
		this.motivoTipo = motivoTipo;
	}
}
