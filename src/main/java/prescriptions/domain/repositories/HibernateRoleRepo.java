package prescriptions.domain.repositories;

import java.io.Serializable;
import java.util.List;

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

	public Role get(Serializable id) {
		return super.get(Role.class, id);
	}

	public List<Role> findAll() {
		return super.find("from Role r where r.roleId = 0");
	}

}
