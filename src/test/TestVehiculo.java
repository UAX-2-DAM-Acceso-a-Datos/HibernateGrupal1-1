import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.VehiculoDAOImpl;

class TestPruebaCasos {

	public static VehiculoDAOImpl vehiculo;
	
	@BeforeClass
	public static void setUpClass() {
		vehiculo = new VehiculoDAOImpl();
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
