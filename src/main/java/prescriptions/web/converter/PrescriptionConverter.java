package prescriptions.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prescriptions.domain.entity.Prescription;
import prescriptions.domain.repositories.PrescriptionRepo;

@Component
public class PrescriptionConverter implements Converter<String,Prescription>{
	
	private PrescriptionRepo repository;
	
	@Autowired
	public PrescriptionConverter(PrescriptionRepo repository) {
		this.repository = repository;
	}

	public Prescription convert(String id) {
		if (id == "")
			return null;
		return this.repository.get(Integer.valueOf(id));
	}

}
