package dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IRevisionTecnica;
import utils.HibernateUtils;

public class RevisionTecnicaImpl implements IRevisionTecnica{

	Logger logger = Logger.getLogger(RevisionTecnicaImpl.class);
	
	@Override
	public boolean addRevisionTecnica(RevisionTecnica r1) {
		try {
			logger.info("[CuentaDao] [addRevisionTecnica] - Entrada al metodo");
			
			Session session=HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			
			Vehiculo v = new Vehiculo();
			session.save(v);
			r1.setVehiculo(v);
			
			session.save(r1);
			logger.debug("[CuentaDao] [addRevisionTecnica] - Añades revision tecnica: "+r1);
			session.getTransaction().commit();
			session.close();
			
			logger.info("[CuentaDao] [addRevisionTecnica] - Salida del metodo");
		} catch (Exception e) {
			logger.error("[CuentaDao] [addRevisionTecnica] - Error" + e.getMessage());
		}
		return true;
	}

	@Override
	public boolean modificarRevisionTecnica(RevisionTecnica r1) {
		try {
			logger.info("[CuentaDao] [modificarRevisionTecnica] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(r1);
			logger.debug("[CuentaDao] [addRevisionTecnica] - Modificas revision tecnica: "+r1);
			sesion.getTransaction().commit();
			sesion.close();

			logger.info("[CuentaDao] [modificarRevisionTecnica] - Salida del metodo");
		} catch (Exception e) {
			logger.error("[CuentaDao] [modificarRevisionTecnica] - Error" + e.getMessage());
		}
		return true;
	}
	
	@Override
	public boolean deleteRevisionTecnica(RevisionTecnica r1) {
		try {
			logger.info("[CuentaDao] [deleteRevisionTecnica] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.delete(r1);
			logger.debug("[CuentaDao] [deleteRevisionTecnica] - Eliminas revision tecnica: "+r1);
			sesion.getTransaction().commit();
			sesion.close();
			
			logger.info("[CuentaDao] [deleteRevisionTecnica] - Salida del metodo");
		} catch (Exception e) {
			logger.error("[CuentaDao] [deleteRevisionTecnica] - Error" + e.getMessage());
		}
		return true;
	}
	
	@Override
	public List<RevisionTecnica> listarRevisionTecnica() {
		logger.info("[CuentaDao] [listarRevisionTecnica] - Entrada al metodo");
		
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		logger.info("[CuentaDao] [listarRevisionTecnica] - Salida del metodo");
		
		List<RevisionTecnica> results=(List<RevisionTecnica>)session.createQuery("from revisiontecnica").list();
		
				for(RevisionTecnica r :results) {
					System.out.println(results);
				}
				return results;
	}

}
