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
	
		VehiculoDAOImpl vehDao = new VehiculoDAOImpl();
		
		Vehiculo v = new Vehiculo();
		v.setMatricula("Goku");
		v.setMarca("Te");
		v.setModelo("Sa");
		
		Vehiculo v2 = new Vehiculo();
		v.setMatricula("Krilin");
		v.setMarca("Te");
		v.setModelo("Sa");
	
		vehDao.addVehiculo(v);
		
		vehDao.modificarVehiculo(v);

	
		
		HibernateUtils.getSessionFactory().close();
		
		RevisionTecnicaImpl revDAO= new RevisionTecnicaImpl();
		
		RevisionTecnica r1= new RevisionTecnica();
		r1.setCalificacion(1);
		r1.setCodigo(500);
		r1.setVehiculo(v);
		
		
	}

}
