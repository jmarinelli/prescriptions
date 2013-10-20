package prescriptions.domain.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Role;

@Repository
public class HibernateRoleRepo extends AbstractHibernateRepo implements RoleRepo {

	@Autowired
	public HibernateRoleRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public Role getByUsername(String username) {
		String query = "from Role u where u.username = ?";
		return super.findOne(query, username);
	}

}
