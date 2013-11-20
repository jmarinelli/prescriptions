package prescriptions.domain.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Caratula;

@Repository
public class HibernateCaratulaRepo extends AbstractHibernateRepo implements CaratulaRepo {

	@Autowired
	public HibernateCaratulaRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(Caratula caratula) {
		super.save(caratula);
	}

	public Caratula get(String ser_carat, Integer cod_carat) {
		String hql = "from Caratula where cod_carat = ? and ser_carat = ?";
		return super.findOne(hql, cod_carat, ser_carat);
	}

}
