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
		try {
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
			return true;

		} catch (Exception e) {
			return false;		
		}
	}

	//Modificar un vehículo
	@Override
	public boolean modificarVehiculo(Vehiculo v) {
		try {
			Session sesion = HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(v);
			sesion.getTransaction().commit();
			sesion.close();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	//Borrar un vehículo
	@Override
	public boolean deleteVehiculo(Vehiculo v) {
		try {
			Vehiculo sesion = Vehiculo.getCurrentSession();
			sesion.beginTransaction();
			Object Vehiculo = null;
			sesion.delete(Vehiculo);
			((entities.Vehiculo) sesion.getTransaction()).commit();
			sesion.close();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<Vehiculo> listarVehiculo() {
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();

		List<Vehiculo> results=(List<Vehiculo>)session.createQuery("from Vehiculo").list();
		
				for(Vehiculo v :results) {
					System.out.println(results);
				}
				return results;
	}

		
}
