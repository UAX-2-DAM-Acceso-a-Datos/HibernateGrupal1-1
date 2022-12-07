package main;

import org.hibernate.exception.ConstraintViolationException;

import dao.RevisionTecnicaImpl;
import dao.VehiculoDAOImpl;
import entities.RevisionTecnica;
import entities.Vehiculo;
import utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		VehiculoDAOImpl vDao = new VehiculoDAOImpl();
		RevisionTecnicaImpl revDAO= new RevisionTecnicaImpl();
		
		//Creamos los vehiculos
		Vehiculo v1 = new Vehiculo();
		v1.setMatricula("Goku");
		v1.setMarca("Tesla");	
		try {
			v1.setModelo("Saaa");
		} catch (ConstraintViolationException e) {
			System.out.println("No se ha podido aniadir el vehiculo");
		}

		Vehiculo v2 = new Vehiculo();
		v2.setMatricula("Krilin");
		v2.setMarca("Tesla");
		v2.setModelo("Sa2");
	
		//Creamos las revisiones
		RevisionTecnica r1= new RevisionTecnica();
		r1.setCalificacion(10);
		r1.setVehiculo(v1);
		
		RevisionTecnica r2= new RevisionTecnica();
		r2.setCalificacion(7);
		r2.setVehiculo(v2);
		
		//Añadimos los vehiculos y las revisiones a la base de datos 
		vDao.addVehiculo(v1);
		vDao.addVehiculo(v2);
		revDAO.addRevisionTecnica(r1);
		revDAO.addRevisionTecnica(r2);
		
		HibernateUtils.getSessionFactory().close();
	}
}
