package idao;

import java.util.List;

import entities.RevisionTecnica;
import entities.Vehiculo;

public interface IRevisionTecnica {

	public boolean addRevisionTecnica(int codigo, double calificacion, Vehiculo vehiculo);
	public boolean modificarRevisionTecnica(int codigo, double calificacion, Vehiculo vehiculo);
	public  boolean deleteRevisionTecnica(int codigo, double calificacion, Vehiculo vehiculo);
	public List<Vehiculo> listarRevisionTecnica(int codigo, double calificacion, Vehiculo vehiculo);
	
}
