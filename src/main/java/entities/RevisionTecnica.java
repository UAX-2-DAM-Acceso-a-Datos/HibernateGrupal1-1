package entities;

public class RevisionTecnica {
	
	private int codigo;
	private double calificacion;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
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
	
}
