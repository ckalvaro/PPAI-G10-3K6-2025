package ppai_G10_3K6;

public class MotivoTipo {

    //Atributos simples
    private String descripcion;
    //Constructor sin parametros
    public MotivoTipo() {
        // Para frameworks o inicialización posterior
    }
    //Constructor completo
    public MotivoTipo(String descripcion) {
        this.descripcion = descripcion;
    }
    //Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}