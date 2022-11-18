package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IVehiculoDAO;
import utils.HibernateUtils;

public class VehiculoDAOImpl implements IVehiculoDAO {

	//Añadir un vehículo
	@Override
	public boolean addVehiculo(Vehiculo v) {
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		RevisionTecnica r = new RevisionTecnica();
		r.setCalificacion(0);
		session.save(r);
		
		v.setRevisiontecnica(r);
		
		try {
			v.setModelo("a");
			session.save(v);
			session.getTransaction().commit();
			session.close();
			
		} catch (ConstraintViolationException e) {
			session.getTransaction().rollback();
			System.out.println("No se ha podido añadir el vehiculo");
		
		}

		return false;
	}

	//Modificar un vehículo
	@Override
	public boolean modificarVehiculo(Vehiculo v) {
		Session sesion = HibernateUtils.getSessionFactory().openSession();
				sesion.beginTransaction();
				sesion.save(v);
				sesion.getTransaction().commit();
				sesion.close();
		return false;
	}
	
	//Borrar un vehículo
	@Override
	public boolean deleteVehiculo(Vehiculo v) {
		Vehiculo sesion = Vehiculo.getCurrentSession();
				sesion.beginTransaction();
				Object Vehiculo = null;
				sesion.delete(Vehiculo);
				((entities.Vehiculo) sesion.getTransaction()).commit();
				sesion.close();
		return false;
	}
	
	//Listar vehículos
	@Override
	public List<Vehiculo> listarVehiculo(String matricula, String marca, String modelo,
			RevisionTecnica revisiontecnica) {
		
		return null;
	}

		
}
