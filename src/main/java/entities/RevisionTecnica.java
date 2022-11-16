package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
	
@Entity
@Table(name = "revisiontecnica")
public class RevisionTecnica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "calificacion")
	private double calificacion;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@OneToOne(mappedBy = "revisiontecnica")
	private Vehiculo vehiculo;
	
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public RevisionTecnica() {
		
	}
	
	public RevisionTecnica(int codigo, double calificacion) {
		this.codigo = codigo;
		this.calificacion = calificacion;
	}
	
	public String toString() {
		return "Código:" + codigo + " Calificación:" + calificacion;
	}
	
}
