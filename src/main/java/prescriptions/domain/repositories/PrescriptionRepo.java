package prescriptions.domain.repositories;

import java.io.Serializable;

import prescriptions.domain.entity.Prescription;

public interface PrescriptionRepo {

	public void save(Prescription prescription);
	
	public Prescription get(Serializable id);
	
}
