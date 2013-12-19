package prescriptions.domain.repositories;

import java.io.Serializable;
import java.util.List;

import prescriptions.domain.entity.Role;

public interface RoleRepo {

	public Role getByUsername(String username);
	
	public Role get(Serializable id);
	
	public List<Role> findAll();
	
	public Serializable save(Role role);
	
}
