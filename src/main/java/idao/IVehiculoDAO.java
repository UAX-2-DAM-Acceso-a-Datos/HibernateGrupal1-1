package idao;

import java.util.List;

import entities.RevisionTecnica;
import entities.Vehiculo;

public interface IVehiculoDAO {

	public boolean addVehiculo(Vehiculo v);
	public boolean modificarVehiculo(RevisionTecnica r1);
	public  boolean deleteVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica);
	public List<Vehiculo> listarVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica);
	
}
