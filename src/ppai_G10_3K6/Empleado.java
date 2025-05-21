package ppai_G10_3K6;

public class Empleado {

    //Atributos simples
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    //Agregación
    private Rol rol;
    //Constructor sin parametros
    public Empleado() {
        // Permitido para frameworks o inicialización posterior
    }
    //Constructor completo
    public Empleado(String nombre,
                    String apellido,
                    String mail,
                    String telefono,
                    Rol rol) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.mail     = mail;
        this.telefono = telefono;
        this.rol      = rol;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
