package dao;

import java.util.List;

import org.hibernate.Session;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IVehiculoDAO;
import utils.HibernateUtils;

public class VehiculoDAOImpl implements IVehiculoDAO {

	@Override
	public boolean addVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		
		return false;
	}
	@Override
	public boolean deleteVehiculo(String matricula, String marca, String modelo, RevisionTecnica revisiontecnica) {
		Vehiculo sesion = Vehiculo.getCurrentSession();
				sesion.beginTransaction();
				Object Vehiculo = null;
				sesion.delete(Vehiculo);
				((entities.Vehiculo) sesion.getTransaction()).commit();
				sesion.close();
		return false;
	}

	@Override
	public List<Vehiculo> listarVehiculo(String matricula, String marca, String modelo,
			RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
