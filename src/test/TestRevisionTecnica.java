import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.RevisionTecnicaImpl;

class TestPruebaCasos {

	public static RevisionTecnicaImpl revisiontecnica;
	
	@BeforeClass
	public static void setUpClass() {
		revisiontecnica = new RevisionTecnicaImpl();
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
