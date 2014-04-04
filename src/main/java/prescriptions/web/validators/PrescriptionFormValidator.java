package prescriptions.web.validators;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import prescriptions.web.validation.PrescriptionForm;

@Component
public class PrescriptionFormValidator implements Validator {

	private static final DateTimeFormatter FORMATTER = DateTimeFormat
			.forPattern("yyyyMMdd");

	public boolean supports(Class<?> clazz) {
		return PrescriptionForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		PrescriptionForm object = (PrescriptionForm) target;
		if (object.getOrden() == null || object.getOrden() > 999
				|| object.getOrden() == 0)
			errors.rejectValue("orden", "inv_value.orden");
		if (!validateDate(object.getFec_prescr()))
			errors.rejectValue("fec_prescr", "inv_form.fecha");
		if (!validateDate(object.getFec_disp()))
			errors.rejectValue("fec_disp", "inv_form.fecha");
		if (!validatePrescr(object.getFec_prescr())) {
			errors.rejectValue("fec_prescr", "inv_form.fec_prescr");
		}
		if (object.getTroquel_1() == null) {
			errors.rejectValue("troquel_1", "troquel_not_null");
		}
		if (object.getCod_barra_1() == null || object.getCod_barra_1().equals("")) {
			errors.rejectValue("cod_barra_1", "cod_barra_not_null");
		}
		if (object.getCan_disp_1() == null || object.getCan_disp_1().equals(0) || object.getCan_disp_1() > 9) {
			errors.rejectValue("can_disp_1", "can_not_zero");
		}
		if (object.getCan_disp_2() == null || object.getCan_disp_2().equals(0) || object.getCan_disp_2() > 9) {
			errors.rejectValue("can_disp_2", "can_not_zero");
		}
		if (object.getCan_disp_3() == null || object.getCan_disp_3().equals(0) || object.getCan_disp_3() > 9) {
			errors.rejectValue("can_disp_3", "can_not_zero");
		}
		if (object.getRechazos().length() % 2 != 0) {
			errors.rejectValue("rechazos", "rechazos_impar");
		}
		if (!object.getRechazos().equals("") && object.getAjuste() > 0){
			errors.rejectValue("ajuste", "rechazos_not_ajuste");
		}
		if (object.getAjuste().equals(0) && object.getRechazos().equals("")) {
			errors.rejectValue("rechazos", "ajuste_not_rechazos");
		}
		if (!object.getLet_matricula().toUpperCase().equals("N")
				&& !object.getLet_matricula().toUpperCase().equals("P")
				&& !object.getLet_matricula().toUpperCase().equals("X"))
			errors.rejectValue("let_matricula", "inv_value.let_matricula");
		if (!validateDiff(object.getFec_prescr(), object.getFec_disp()))
			errors.rejectValue("fec_disp", "inv_form.date_diff");
		 if (object.getAjuste() != null && object.getTot_ac() != null && object.getAjuste() > object.getTot_ac())
		 errors.rejectValue("ajuste", "ajuste.invalid");
		for (String s : object.getNulledFields())
			errors.rejectValue(s, "not_null");
	}

	private boolean validateDiff(Integer fec_prescr, Integer fec_disp) {
		if (fec_disp == null || fec_disp == null) {
			return false;
		}

		DateTime fecPrescr, fecDisp;

		try {
			fecPrescr = DateTime.parse(String.valueOf(fec_prescr), FORMATTER);
			fecDisp = DateTime.parse(String.valueOf(fec_disp), FORMATTER);
		} catch (Exception e) {
			return false;
		}

		if (fecDisp.minusMonths(2).isAfter(fecPrescr)
				|| fecPrescr.minusMonths(2).isAfter(fecDisp))
			return false;

		return true;
	}

	private boolean validatePrescr(Integer fec_prescr) {
		if (fec_prescr == null)
			return false;

		DateTime fecPrescr;

		try {
			fecPrescr = DateTime.parse(String.valueOf(fec_prescr), FORMATTER);
		} catch (Exception e) {
			return false;
		}
		int currentYear = DateTime.now().getYear();

		if (fecPrescr.getYear() < currentYear - 1)
			return false;
		return true;
	}

	// private boolean validateAjuste(PrescriptionForm form) {
	// if ((form.getPcio_real_1() != form.getPciorp_1()
	// || form.getPcio_real_2() != form.getPciorp_2() || form
	// .getPcio_real_3() != form.getPciorp_3())
	// && form.getAjuste() != 0)
	// return false;
	// return true;
	// }
	//
	// private boolean validateDates(Integer fecPresc, Integer fecDisp) {
	// if (fecPresc == null || fecDisp == null)
	// return false;
	// if (fecDisp < fecPresc)
	// return false;
	// return true;
	// }

	// private boolean validatePeriod(String period) {
	// if (period == null)
	// return false;
	// if (period.length() != 8)
	// return false;
	// int month = Integer.valueOf(period.substring(4,6));
	// char periodType = period.charAt(6);
	// int periodNumber = Integer.valueOf(period.substring(7));
	// if (periodType == 'M' && periodNumber != 1)
	// return false;
	// if (periodType == 'Q' && !(periodNumber == 1 || periodNumber == 2))
	// return false;
	// if (periodType != 'Q' && periodType != 'M')
	// return false;
	// if (month > 12 || month < 1)
	// return false;
	// return true;
	// }

	private boolean validateDate(Integer date) {
		DateTime now = DateTime.now();
		int numericYear = now.getYear() * 10000 + now.getMonthOfYear() * 100
				+ now.getDayOfMonth();
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
		if (date >= numericYear)
			return false;
		return true;
	}

}
