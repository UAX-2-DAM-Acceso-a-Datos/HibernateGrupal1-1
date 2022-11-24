package main;

import dao.RevisionTecnicaImpl;
import dao.VehiculoDAOImpl;
import entities.RevisionTecnica;
import entities.Vehiculo;
import utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public Main() {
		//Vehiculo pruebas de métodos
		VehiculoDAOImpl vehDao = new VehiculoDAOImpl();
		
		Vehiculo v = new Vehiculo();
		v.setMatricula("Goku");
		v.setMarca("Te");
		v.setModelo("Sa");
		
	
		/*try {
			v.setModelo("Sa");
		} catch (ConstraintViolationException e) {
			session.getTransaction().rollback();
			System.out.println("No se ha podido añadir el vehiculo");
		}
		 * 
		 * */
		
		Vehiculo v2 = new Vehiculo();
		v.setMatricula("Krilin");
		v.setMarca("Te");
		v.setModelo("Sa");
	
		vehDao.addVehiculo(v);

		//vehDao.modificarVehiculo(v);
		
		//vehDao.deleteVehiculo(v2);
		
		//vehDao.listarVehiculo();

	
		//Revision Técnica pruebas de métodos (Falta por completar)
		
		RevisionTecnicaImpl revDAO= new RevisionTecnicaImpl();
		
		RevisionTecnica r1= new RevisionTecnica();
		r1.setCalificacion(10);
		r1.setVehiculo(v);
		
		revDAO.addRevisionTecnica(r1); 

		//revDAO.modificarRevisionTecnica(r1);
		
		//revDAO.deleteRevisionTecnica(r1);
		
		//revDAO.listarRevisionTecnica();
		
		HibernateUtils.getSessionFactory().close();
		
	}

}
