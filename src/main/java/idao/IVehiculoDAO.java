package idao;

import java.util.List;

import entities.RevisionTecnica;
import entities.Vehiculo;

public interface IVehiculoDAO {
	
	public boolean addVehiculo(Vehiculo v);
	public boolean modificarVehiculo(Vehiculo v);
	public  boolean deleteVehiculo(Vehiculo v);
	public List<Vehiculo> listarVehiculo();
	
}
