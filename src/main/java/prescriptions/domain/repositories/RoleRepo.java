package prescriptions.domain.repositories;

import java.io.Serializable;

import prescriptions.domain.entity.Role;

public interface RoleRepo {

	public Role getByUsername(String username);
	
	public Role get(Serializable id);
	
}
