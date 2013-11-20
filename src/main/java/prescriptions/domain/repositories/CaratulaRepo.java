package prescriptions.domain.repositories;

import prescriptions.domain.entity.Caratula;

public interface CaratulaRepo {
	
	public void save(Caratula caratula);
	
	public Caratula get(String ser_carat, Integer cod_carat);

}
