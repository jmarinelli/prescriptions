package prescriptions.domain.repositories;

import prescriptions.domain.entity.Alfabeta;

public interface AlfabetaRepo {
	
	public Alfabeta getByBarras(String barras);
	
	public Alfabeta getByTroquel(String troquel);

}
