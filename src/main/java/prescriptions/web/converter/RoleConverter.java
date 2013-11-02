package prescriptions.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.RoleRepo;

@Component
public class RoleConverter implements Converter<Integer,Role>{
	
	private RoleRepo repository;
	
	@Autowired
	public RoleConverter(RoleRepo repository) {
		this.repository = repository;
	}

	public Role convert(Integer id) {
		if (id == 0)
			return null;
		return this.repository.get(id);
	}

}
