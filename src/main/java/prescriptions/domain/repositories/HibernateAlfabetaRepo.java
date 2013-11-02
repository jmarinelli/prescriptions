package prescriptions.domain.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Alfabeta;

@Repository
public class HibernateAlfabetaRepo extends AbstractHibernateRepo implements AlfabetaRepo{

	@Autowired
	public HibernateAlfabetaRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public Alfabeta getByTroquel(String troquel) {
		return super.findOne("from Alfabeta where troquel = ?", troquel);
	}

}
