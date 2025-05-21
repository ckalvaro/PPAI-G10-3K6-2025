package ppai_G10_3K6;

public class Estado {

    //Atributos simples
    private String ambito;
    private String nombreEstado;
    //Constructor sin parametros
    public Estado() {
        // Permitido para frameworks o inicialización posterior
    }
    //Construcor completo
    public Estado(String ambito, String nombreEstado) {
        this.ambito = ambito;
        this.nombreEstado = nombreEstado;
    }
    //Getters y Setters
    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
}

