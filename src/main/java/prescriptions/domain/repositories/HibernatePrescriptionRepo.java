package prescriptions.domain.repositories;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Prescription;

@Repository
public class HibernatePrescriptionRepo extends AbstractHibernateRepo implements PrescriptionRepo {

	@Autowired
	public HibernatePrescriptionRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public boolean save(Prescription prescription) {
		String hql = "from Prescription where ser_carat = ? and cod_carat = ? and orden = ?";
		if (super.findOne(hql, prescription.getSer_carat(), prescription.getCod_carat(), prescription.getOrden()) == null) {
			super.save(prescription);
			return true;
		}
		return false;
	}

	public Prescription get(Serializable id) {
		return super.get(Prescription.class, id);
	}

}
