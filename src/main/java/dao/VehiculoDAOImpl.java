package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IVehiculoDAO;
import utils.HibernateUtils;

public class VehiculoDAOImpl implements IVehiculoDAO {

	@Override
	public boolean addVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
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
			// TODO: handle exception
		}

		return false;
	}

	@Override
	public boolean modificarVehiculo(RevisionTecnica r1) {
		
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
