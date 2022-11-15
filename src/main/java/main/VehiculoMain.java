package main;

import entities.Vehiculo;
import utils.HibernateUtils;

public class VehiculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VehiculoMain();
	}
	
	public VehiculoMain() {
		Vehiculo v = new Vehiculo();
		v.setMatricula("Goku");
		v.setMarca("Tesla");
		v.setModelo("S");
		
		
		HibernateUtils.getSessionFactory().close();
	}

}
