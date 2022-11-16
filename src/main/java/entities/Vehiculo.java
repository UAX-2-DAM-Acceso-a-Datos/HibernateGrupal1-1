package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Column(name = "matricula")
	String matricula;
	
	@Column(name = "marca")
	String marca;
	
	@Column(name = "modelo")
	String modelo;
	
	@OneToOne
	@JoinColumn(name = "codigo_revisiontecnica", nullable = false)
	private Vehiculo vehiculo;


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


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", vehiculo=" + vehiculo
				+ "]";
	}

	
}
