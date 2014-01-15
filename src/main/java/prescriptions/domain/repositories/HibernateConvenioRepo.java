package prescriptions.domain.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Convenio;

@Repository
public class HibernateConvenioRepo extends AbstractHibernateRepo implements ConvenioRepo{
	
	@Autowired
	public HibernateConvenioRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public Convenio get(String name) {
		return super.findOne("from Convenio where name = ?", name);
	}

	public List<Convenio> getAll() {
		return super.find("from Convenio");
	}

}
