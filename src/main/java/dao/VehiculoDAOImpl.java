package dao;

import java.util.List;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IVehiculoDAO;

public class VehiculoDAOImpl implements IVehiculoDAO {

	@Override
	public boolean addVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vehiculo> listarVehiculo(String matricula, String marca, String modelo,
			RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
