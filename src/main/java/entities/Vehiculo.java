package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import jakarta.validation.constraints.Size;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "matricula")
	String matricula;
	
	@Column(name = "marca")
	@Size(min=3, max=20)
	String marca;
	
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


	public RevisionTecnica getRevisiontecnica() {
		return revisiontecnica;
	}


	public void setRevisiontecnica(RevisionTecnica revisiontecnica) {
		this.revisiontecnica = revisiontecnica;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", vehiculo=" + revisiontecnica
				+ "]";
	}


	public void beginTransaction() {
	}


	public Object getTransaction() {
		return null;
	}


	public static Vehiculo getCurrentSession() {
		return null;
	}


	public void delete(Object vehiculo) {
	}

	
	public void commit() {
		
	}
	
	
	public void close() {
	}

	
}
