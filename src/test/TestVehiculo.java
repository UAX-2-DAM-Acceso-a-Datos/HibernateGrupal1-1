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
	
	@Test
	public void testEquals() {
	Set<String> set1 = new HashSet<String>();
	set1.add(Vehiculo1);
	set1.add(Vehiculo2);
	set1.add(Vehiculo3);
	Set<String> set2 = new HashSet<String>();
	assertFalse(set1.equals(set2));
	set2.add(Vehiculo1);
	assertFalse(set1.equals(set2));
	set2.add(Vehiculo2);
	assertFalse(set1.equals(set2));
	set2.add(Vehiculo3);
	assertTrue(set1.equals(set2));
	assertTrue(set2.equals(set1));
	
	}
	
	@Test
	public void testNotNull() {
	Set<String> set = new HashSet<String>();
	assertEquals(0, set.size());
	assertTrue(set.add(Vehiculo1));
	assertEquals(1, set.size());
	assertTrue(set.add(Vehiculo2));
	assertEquals(2, set.size());
	assertFalse(set.add(Vehiculo3));
	assertEquals(2, set.size());
	}


}
