package ppai_G10_3K6;

public class ApreciacionTipo {

    //Atributos simples
    private String color;
    private String leyenda;
    //Constructor sin parametros
    public ApreciacionTipo() {
        // Sin inicializar; color y leyenda deben setearse vía setters o constructor completo
    }
    //Constructor con parametros
    public ApreciacionTipo(String color, String leyenda) {
        this.color   = color;
        this.leyenda = leyenda;
    }

    //Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }
}
