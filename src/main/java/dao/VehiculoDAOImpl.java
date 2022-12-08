package dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IVehiculoDAO;
import utils.HibernateUtils;

public class VehiculoDAOImpl implements IVehiculoDAO {

	Logger logger = Logger.getLogger(VehiculoDAOImpl.class);

	@Override
	public boolean addVehiculo(Vehiculo v) {
		try {			
			logger.info("[CuentaDao] [addVehiculo] - Entrada al metodo");
			
			Session session = HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			
			RevisionTecnica r = new RevisionTecnica();
			r.setCalificacion(10);
			session.save(r);
			v.setRevisiontecnica(r);
			
			session.save(v);
			logger.debug("[CuentaDao] [addVehiculo] - Añades vehiculo: "+v);
			session.getTransaction().commit();
			session.close();
			
			logger.info("[CuentaDao] [addVehiculo] - Salida del metodo");
		} catch (Exception e) {
			logger.error("[CuentaDao] [addVehiculo] - Error" + e.getMessage());		
		}
		return true;
	}

	@Override
	public boolean modificarVehiculo(Vehiculo v) {
		try {
			logger.info("[CuentaDao] [modificarVehiculo] - Entrada al metodo");

			Session sesion = HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(v);
			logger.debug("[CuentaDao] [modificarVehiculo] - Modificas vehiculo: "+v);
			sesion.getTransaction().commit();
			sesion.close();
			
			logger.info("[CuentaDao] [modificarVehiculo] - Salida del metodo");
		} catch (Exception e) {
			logger.error("[CuentaDao] [modificarVehiculo] - Error" + e.getMessage());
		}
		return true;
	}
	
	@Override
	public boolean deleteVehiculo(Vehiculo v) {
		try {
			logger.info("[CuentaDao] [deleteVehiculo] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(v);
			logger.debug("[CuentaDao] [deleteVehiculo] - Eliminas vehiculo: "+v);
			sesion.getTransaction().commit();
			sesion.close();
			
			logger.info("[CuentaDao] [deleteVehiculo] - Salida del metodo");
		} catch (Exception e) {
			logger.error("[CuentaDao] [deleteVehiculo] - Error" + e.getMessage());
		}
		return true;
	}

	@Override
	public List<Vehiculo> listarVehiculo() {
		logger.info("[CuentaDao] [listarVehiculo] - Entrada al metodo");
		
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		logger.info("[CuentaDao] [listarVehiculo] - Salida del metodo");

		List<Vehiculo> results=(List<Vehiculo>)session.createQuery("from vehiculo").list();
		
				for(Vehiculo v :results) {
					System.out.println(results);
				}
				return results;
	}
	
}
