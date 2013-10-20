package prescriptions.domain.repositories;

import prescriptions.domain.entity.Role;

public interface RoleRepo {

	public Role getByUsername(String username);
	
}
