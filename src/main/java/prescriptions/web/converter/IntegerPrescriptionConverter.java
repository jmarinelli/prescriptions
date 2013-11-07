package prescriptions.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prescriptions.domain.entity.Prescription;
import prescriptions.domain.repositories.PrescriptionRepo;

@Component
public class IntegerPrescriptionConverter implements Converter<Integer,Prescription>{
	
	private PrescriptionRepo repository;
	
	@Autowired
	public IntegerPrescriptionConverter(PrescriptionRepo repository) {
		this.repository = repository;
	}

	public Prescription convert(Integer id) {
		if (id == null)
			return null;
		return this.repository.get(id);
	}

}
