package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "matricula")
	String matricula;
	
	@Column(name = "marca")
	String marca;
	
	@Size(min=3, max=20)
	@Column(name = "modelo")
	String modelo;
	
	@OneToOne
	@JoinColumn(name = "codigo_revisiontecnica")
	RevisionTecnica revisiontecnica;


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Vehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.revisiontecnica = revisiontecnica;
	}
	

	public RevisionTecnica getRevisiontecnica() {
		return revisiontecnica;
	}

	public void setRevisiontecnica(RevisionTecnica revisiontecnica) {
		this.revisiontecnica = revisiontecnica;
	}
	
	public Vehiculo() {
		super();
	}
	

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", vehiculo=" + revisiontecnica
				+ "]";
	}
	
}
