package prescriptions.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Price extends PersistentEntity{
	
	private int registro;
	private String fecha;
	private int precio;
	@Column(nullable = true)
	private String turno;
	
	public Price() {}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
}
