package prescriptions.web.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import prescriptions.web.validation.PrescriptionForm;

@Component
public class PrescriptionFormValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return PrescriptionForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		PrescriptionForm object = (PrescriptionForm) target;
		if (object.getOrden() == null || object.getOrden() > 999)
			errors.rejectValue("orden", "inv_value");
		if (!validateDate(object.getFecPrescr()))
			errors.rejectValue("fecPrescr", "inv_form.fecha");
		if (!validateDate(object.getFecDisp()))
			errors.rejectValue("fecDisp", "inv_form.fecha");
		if (!object.getLetMatricula().equals("N") && !object.getLetMatricula().equals("P") && !object.getLetMatricula().equals("X"))
			errors.rejectValue("letMatricula", "inv_value");
		if (!validatePeriod(object.getPeriodo()))
			errors.rejectValue("periodo", "inv_form.periodo");
		for (String s : object.getNulledFields())
			errors.rejectValue(s, "not_null");
	}
	
	private boolean validatePeriod(String period) {
		if (period == null)
			return false;
		if (period.length() != 8)
			return false;
		int month = Integer.valueOf(period.substring(4,6));
		char periodType = period.charAt(6);
		int periodNumber = Integer.valueOf(period.substring(7));
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
		if (date == null)
			return false;
		if (date > 99999999 || date < 10000000)
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
