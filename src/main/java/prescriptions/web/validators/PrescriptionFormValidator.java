package prescriptions.web.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import prescriptions.domain.entity.Prescription;
import prescriptions.web.validation.PrescriptionForm;

@Component
public class PrescriptionFormValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return PrescriptionForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Prescription object = (Prescription) target;
		if (object.getOrden() > 999)
			errors.rejectValue("Orden", "inv_value");
		if (!validateDate(object.getFecPrescr()))
			errors.rejectValue("Fecha Prescripcion", "inv_form");
		if (!validateDate(object.getFecDisp()))
			errors.rejectValue("Fecha Dispensacion", "inv_form");
		if (object.getLetMatricula() != "N" && object.getLetMatricula() != "P" && object.getLetMatricula() != "X")
			errors.rejectValue("Letra Matricula", "inv_value");
		if (!validatePeriod(object.getPeriodo()))
			errors.rejectValue("Periodo", "inv_form");
	}
	
	private boolean validatePeriod(String period) {
		if (period.length() > 8)
			return false;
		int month = Integer.valueOf(period.substring(4,5));
		char periodType = period.charAt(6);
		int periodNumber = Integer.valueOf(period.charAt(7));
		if (periodType == 'M' && periodNumber != 1)
			return false;
		if (periodType == 'Q' && !(periodNumber == 1 || periodNumber == 2))
			return false;
		if (periodType != 'Q' && periodType != 'M')
			return false;
		if (month > 12 || month < 1)
			return false;
		return true;
	}
	
	private boolean validateDate(Integer date) {
		if (date > 9999999 || date < 1000000)
			return false;
		int mm = (date / 100) % 100;
		int dd = date % 100;
		if (mm > 12 || mm < 1)
			return false;
		if (dd > 31 || mm < 1)
			return false;
		return true;
	}

}
