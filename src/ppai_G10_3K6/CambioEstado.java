package ppai_G10_3K6;

import java.time.LocalDateTime;

public class CambioEstado {

    //Atributos simples
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    //Agregaciones
    private Estado estado;
    private MotivoFueraServicio motivoFueraServicio;
    //Constructor sin parametros
    public CambioEstado() {
        // Permitido para frameworks o inicialización posterior
    }
    //Constructor completo
    public CambioEstado(LocalDateTime fechaHoraInicio,
                        LocalDateTime fechaHoraFin,
                        Estado estado,
                        MotivoFueraServicio motivoFueraServicio) {
        this.fechaHoraInicio       = fechaHoraInicio;
        this.fechaHoraFin          = fechaHoraFin;
        this.estado               = estado;
        this.motivoFueraServicio  = motivoFueraServicio;
    }

    //Getters y Setters

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public MotivoFueraServicio getMotivoFueraServicio() {
        return motivoFueraServicio;
    }

    public void setMotivoFueraServicio(MotivoFueraServicio motivoFueraServicio) {
        this.motivoFueraServicio = motivoFueraServicio;
    }
}
