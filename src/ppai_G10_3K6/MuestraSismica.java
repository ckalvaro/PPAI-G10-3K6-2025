package ppai_G10_3K6;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class MuestraSismica {
	//Atributos Simples
	private LocalDateTime fechaHoraMuestra;
	//Atributos por referencia
	private List<DetalleMuestraSismica> detalleMuestraSismica = new ArrayList<>();
	//Setters y Getters
	public LocalDateTime getFechaHoraMuestra() {
		return fechaHoraMuestra;
	}
	public void setFechaHoraMuestra(LocalDateTime fechaHoraMuestra) {
		this.fechaHoraMuestra = fechaHoraMuestra;
	}
}
