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
		return;
	}

}
