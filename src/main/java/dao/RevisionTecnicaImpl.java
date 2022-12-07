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
			v.setMatricula("ZZZZ");
			v.setMarca("GT");
			v.setModelo("Super");
			v.setRevisiontecnica(r1);
			session.save(v);
			
			session.save(r1);
			session.getTransaction().commit();
			System.out.println(r1);
			
		} catch (Exception e) {
			logger.error("[CuentaDao] [addRevisionTecnica] - Error" + e.getMessage());
			return false;
		}
		return true;
	}
	//Modificar revisión técnica
	@Override
	public boolean modificarRevisionTecnica(RevisionTecnica r1) {
		try {
			logger.info("[CuentaDao] [modificarRevisionTecnica] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(r1);
			sesion.getTransaction().commit();
			sesion.close();
			
		} catch (Exception e) {
			logger.error("[CuentaDao] [modificarRevisionTecnica] - Error" + e.getMessage());
			return false;
		}
		return true;
	}
	
	//Borrar revisión técnica
	@Override
	public boolean deleteRevisionTecnica(RevisionTecnica r1) {
		try {
			logger.info("[CuentaDao] [deleteRevisionTecnica] - Entrada al metodo");
			
			Session sesion =HibernateUtils.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.delete(r1);
			sesion.getTransaction().commit();
			sesion.close();
			
		} catch (Exception e) {
			logger.error("[CuentaDao] [deleteRevisionTecnica] - Error" + e.getMessage());
			return false;
		}
		return true;
	}
	
	//Listar revisiones técnicas
	@Override
	public List<RevisionTecnica> listarRevisionTecnica() {
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
