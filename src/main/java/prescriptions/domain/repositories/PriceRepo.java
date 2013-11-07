package prescriptions.domain.repositories;

import java.util.List;

import prescriptions.domain.entity.Price;

public interface PriceRepo {
	
	public List<Price> getByRegistro(Integer registro);

}
