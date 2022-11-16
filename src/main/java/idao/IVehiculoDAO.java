package idao;

import java.util.List;

import entities.Vehiculo;

public interface IVehiculoDAO {

	public boolean addVehiculo(String matricula, String marca, String modelo, String revision);
	public boolean modificarVehiculo(String matricula, String marca, String modelo, String revision);
	public  boolean deleteVehiculo(String matricula, String marca, String modelo, String revision);
	public List<Vehiculo> listarVehiculo(String matricula, String marca, String modelo, String revision);
	
}
