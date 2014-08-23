package prescriptions.domain.repositories;

import java.util.List;

import prescriptions.domain.entity.Alfabeta;

public interface AlfabetaRepo {
	
	public Alfabeta getByBarras(String barras);
	
	public Alfabeta getByTroquel(String troquel);
	
	public List<Alfabeta> getByName(String name);

}
