package dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IRevisionTecnica;
import utils.HibernateUtils;

public class RevisionTecnicaImpl implements IRevisionTecnica{

	//Añadir revisión técnica
	@Override
	public boolean addRevisionTecnica(RevisionTecnica r1) {
		try {
			Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
			logger.info("[CuentaDao] [addRevisionTecnica] - Entrada al metodo");
			
			Session session=HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			
			Vehiculo v = new Vehiculo();
			v.setMatricula("ZZZZ");
			v.setMarca("GT");
			v.setModelo("Super");
			v.setRevisiontecnica(r1);
			session.save(v);
			
			session.save(r1);
			session.getTransaction().commit();
			System.out.println(r1);
			return true;
			
		} catch (Exception e) {
			Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
			logger.error("[CuentaDao] [addRevisionTecnica] - Error" + e.getMessage());
			return false;
		}

	}
	//Modificar revisión técnica
	@Override
	public boolean modificarRevisionTecnica(RevisionTecnica r1) {
		try {
			Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
			logger.info("[CuentaDao] [modificarRevisionTecnica] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(r1);
			sesion.getTransaction().commit();
			sesion.close();
			return true;
			
		} catch (Exception e) {
			Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
			logger.error("[CuentaDao] [modificarRevisionTecnica] - Error" + e.getMessage());
			return false;
		}

	}
	
	//Borrar revisión técnica
	@Override
	public boolean deleteRevisionTecnica(RevisionTecnica r1) {
		try {
			Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
			logger.info("[CuentaDao] [deleteRevisionTecnica] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.delete(r1);
			sesion.getTransaction().commit();
			sesion.close();
			return true;
			
		} catch (Exception e) {
			Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
			logger.error("[CuentaDao] [deleteRevisionTecnica] - Error" + e.getMessage());
			return false;
		}

	}
	
	//Listar revisiones técnicas
	@Override
	public List<RevisionTecnica> listarRevisionTecnica() {
		Logger logger = Logger.getLogger(VehiculoDAOImpl.class);
		logger.info("[CuentaDao] [listarRevisionTecnica] - Entrada al metodo");
		
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();

		List<RevisionTecnica> results=(List<RevisionTecnica>)session.createQuery("from RevisionTecnica").list();
		
				for(RevisionTecnica r :results) {
					System.out.println(results);
				}
				return results;
	}

}
