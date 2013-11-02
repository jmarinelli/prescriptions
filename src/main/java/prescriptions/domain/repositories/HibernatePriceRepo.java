package prescriptions.domain.repositories;

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

	public Price getByRegistro(Integer registro) {
		return super.findOne("from Price where registro = ?", registro);
	}

}
