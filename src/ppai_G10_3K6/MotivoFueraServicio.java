package ppai_G10_3K6;

public class MotivoFueraServicio {

    //Atributos simples
    private String comentario;

    //Agregación
    private MotivoTipo motivoTipo; 
    //Constructor sin parametros
    public MotivoFueraServicio() {
        // Permite creación sin parámetros y posterior inicialización
    }
    //Constructor completo
    public MotivoFueraServicio(MotivoTipo motivoTipo, String comentario) {
        this.motivoTipo = motivoTipo;
        this.comentario = comentario;
    }

    //Getters y Setters
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