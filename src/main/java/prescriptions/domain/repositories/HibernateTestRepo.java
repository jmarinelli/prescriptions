package prescriptions.domain.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Test;

@Repository
public class HibernateTestRepo extends AbstractHibernateRepo implements TestRepo{

	@Autowired
	public HibernateTestRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}	
	
	public void save(Test subject) {
		super.save(subject);
	}

	public Test get(int id) {
		return get(Test.class, id);
	}
	
	public List<Test> getAll() {
		return find("from Test");
	}
}
