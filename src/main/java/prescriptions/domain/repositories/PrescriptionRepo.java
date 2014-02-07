package prescriptions.domain.repositories;

import java.io.Serializable;
import java.util.List;

import prescriptions.domain.entity.Prescription;

public interface PrescriptionRepo {

	public boolean save(Prescription prescription);
	
	public Prescription get(Serializable id);
	
	public List<Prescription> getBySerCarat(String serCarat);
	
}
