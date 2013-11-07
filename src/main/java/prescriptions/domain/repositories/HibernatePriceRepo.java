package prescriptions.domain.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Price;

@Repository
public class HibernatePriceRepo extends AbstractHibernateRepo implements PriceRepo {

	@Autowired
	public HibernatePriceRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public List<Price> getByRegistro(Integer registro) {
		return super.find("from Price where registro = ?", registro);
	}

}
