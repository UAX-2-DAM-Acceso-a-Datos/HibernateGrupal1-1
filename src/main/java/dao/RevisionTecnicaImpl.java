package dao;

import java.util.List;

import org.hibernate.Session;

import entities.RevisionTecnica;
import entities.Vehiculo;
import idao.IRevisionTecnica;
import utils.HibernateUtils;

public class RevisionTecnicaImpl implements IRevisionTecnica{

	//Añadir revisión técnica
	@Override
	public boolean addRevisionTecnica(RevisionTecnica r1) {
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(r1);
		session.getTransaction().commit();
		System.out.println(r1);
		
		return false;
	}
	//Modificar revisión técnica
	@Override
	public boolean modificarRevisionTecnica(RevisionTecnica r1) {
		
		return false;
	}
	
	//Borrar revisión técnica
	@Override
	public boolean deleteRevisionTecnica(RevisionTecnica r1) {
		
		return false;
	}
	
	//Listar revisiones técnicas
	@Override
	public List<RevisionTecnica> listarRevisionTecnica() {
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		List<RevisionTecnica> results=(List<RevisionTecnica>)session.createQuery("from RevisionTecnica").list();
		
				for(RevisionTecnica r :results) {
					System.out.println(results);
				}
				return results;
	}

}
