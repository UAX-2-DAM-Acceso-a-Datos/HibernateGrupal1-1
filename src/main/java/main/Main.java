package main;

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
		v.setMarca("Tesla");
		v.setModelo("S");

		
		vehDao.addVehiculo(v);
		HibernateUtils.getSessionFactory().close();
	}

}
