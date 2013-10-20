package prescriptions.domain.repositories;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Prescription;

@Repository
public class HibernatePrescriptionRepo extends AbstractHibernateRepo implements PrescriptionRepo{

	@Autowired
	public HibernatePrescriptionRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(Prescription prescription) {
		super.save(prescription);
	}

	public Prescription get(Serializable id) {
		return super.get(Prescription.class, id);
	}

}
