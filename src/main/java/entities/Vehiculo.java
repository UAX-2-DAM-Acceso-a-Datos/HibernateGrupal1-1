package entities;

public class Vehiculo {

	String matricula;
	String marca;
	String modelo;
	String revision;

	
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", revision=" + revision
				+ "]";
	}


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


	public String getRevision() {
		return revision;
	}


	public void setRevision(String revision) {
		this.revision = revision;
	}
	
	
	
}
