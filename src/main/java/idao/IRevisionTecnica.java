package idao;

import java.util.List;

import entities.RevisionTecnica;
import entities.Vehiculo;

public interface IRevisionTecnica {

	public boolean addRevisionTecnica(RevisionTecnica r1);
	public boolean modificarRevisionTecnica(RevisionTecnica r1);
	public  boolean deleteRevisionTecnica(RevisionTecnica r1);
	public List<RevisionTecnica> listarRevisionTecnica();
		
}
