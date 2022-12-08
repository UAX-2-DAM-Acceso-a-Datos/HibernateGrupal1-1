import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.VehiculoDAOImpl;
import entities.Vehiculo;

class TestVehiculo {

	@Test
	public void modificarVehiculo() {
		Vehiculo v1 = new Vehiculo();
		v1.setMatricula("Joker");
		v1.setMarca("Tesla");
		v1.setModelo("Elmio");
		VehiculoDAOImpl v2 = new VehiculoDAOImpl();
		
		Assert.assertTrue(v2.modificarVehiculo(v1));
	}
	
	@Before
	@Test
	public void addVehiculo() {
		Vehiculo v1 = new Vehiculo();
		v1.setMatricula("Joker");
		v1.setMarca("Tesla");
		v1.setModelo("Elmio");
		VehiculoDAOImpl v2 = new VehiculoDAOImpl();
		
		Assert.assertTrue(v2.addVehiculo(v1));
	}
	
}
