package prescriptions.domain.repositories;

import java.util.List;

import prescriptions.domain.entity.Convenio;

public interface ConvenioRepo {
	
	public Convenio get(String name);
	
	public List<Convenio> getAll();

}
