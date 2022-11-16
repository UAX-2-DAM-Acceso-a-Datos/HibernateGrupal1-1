package idao;

import java.util.List;

import entities.Vehiculo;

public interface IVehiculoDAO {

	public boolean addVehiculo(String user, String password, String token);
	public boolean modificarVehiculo(String user, String password, String token);
	public  boolean deleteVehiculo(String user, String password, String token);
	public List<Vehiculo> listarVehiculo(String user, String password, String token);
	
}
