package idao;

import java.util.List;

import entities.RevisionTecnica;
import entities.Vehiculo;

public interface IVehiculoDAO {

	public boolean addVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica);
	public boolean modificarVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica);
	public  boolean deleteVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica);
	public List<Vehiculo> listarVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica);
	
}
