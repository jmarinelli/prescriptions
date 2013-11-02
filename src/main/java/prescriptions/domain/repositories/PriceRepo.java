package prescriptions.domain.repositories;

import prescriptions.domain.entity.Price;

public interface PriceRepo {
	
	public Price getByRegistro(Integer registro);

}
