import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.RevisionTecnicaImpl;
import dao.VehiculoDAOImpl;
import entities.RevisionTecnica;

class TestRevisionTecnica {

	@Test
	public void deleteRevisionTecnica() {
		RevisionTecnica r1 = new RevisionTecnica();
		RevisionTecnicaImpl r2 = new RevisionTecnicaImpl();
		
		r2.addRevisionTecnica(r1);
		assertTrue(r2.deleteRevisionTecnica(r1));
	}
	
	@Before
	@Test
	public void modificarRevisionTecnica() {
		RevisionTecnica r1 = new RevisionTecnica(12,7);
		RevisionTecnicaImpl r2 = new RevisionTecnicaImpl();
		
		Assert.assertTrue(r2.modificarRevisionTecnica(r1));
	}

}
