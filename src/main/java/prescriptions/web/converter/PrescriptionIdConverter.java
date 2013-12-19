package prescriptions.web.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prescriptions.domain.entity.Prescription;

@Component
public class PrescriptionIdConverter implements Converter<Prescription, String>{

	public String convert(Prescription pres) {
		return String.valueOf(pres.getId());
	}

}
