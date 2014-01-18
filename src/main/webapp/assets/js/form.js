var validationsMade = {
		dispensationDate : false,
		prescribedDispensation: false,
		amountDifference: false,
		invalidPrescription: false,
};

var formEvents = function() {
	
	var setValidations = function() {
		$("#fec_disp").blur(function(e) {
			var fecPrescr = $("#fec_prescr").val();
			var fecDisp = $("#fec_disp").val();
			var prescr = new Date(fecPrescr.substring(0,4), fecPrescr.substring(4,6), fecPrescr.substring(6,8));
			var disp = new Date(fecDisp.substring(0,4), fecDisp.substring(4,6), fecDisp.substring(6,8));
			var invalidDispensation = disp.getTime() < prescr.getTime();
			if (!validationsMade.dispensationDate) {
				if (invalidDispensation) {
					$("#rechazos").val($("#rechazos").val() + "83");
					validationsMade.dispensationDate = true;
				}
			} else {
				if (!invalidDispensation) {
					$("#rechazos").val($("#rechazos").val().replace("83", ""));
					validationsMade.dispensationDate = false;
				}
			}
			var prescribed = disp.getTime() > (prescr.getTime() + (30 * 24 * 60 * 60 * 1000));
			if (!validationsMade.prescribedDispensation) {
				if (prescribed) {
					$("#rechazos").val($("#rechazos").val() + "77");
					validationsMade.prescribedDispensation = true;
				}
			} else {
				if (!prescribed) {
					$("#rechazos").val($("#rechazos").val().replace("77", ""));
					validationsMade.prescribedDispensation = false;
				}
			}
		});
		$("#fec_prescr").blur(function(e) {
			var fecPrescr = $("#fec_prescr").val(); 
			var prescr = new Date(fecPrescr.substring(0,4), fecPrescr.substring(4,6), fecPrescr.substring(6,8));
			var today = new Date();
			var future = prescr.getTime() > today.getTime();
			if (!validationsMade.invalidPrescription) {
				if (future) {
					$("#rechazos").val($("#rechazos").val() + "51");
					validationsMade.invalidPrescription = true;
				}
			} else {
				if (!future) {
					$("#rechazos").val($("#rechazos").val().replace("51", ""));
					validationsMade.invalidPrescription = false;
				}
			}
		});
	};
	
	setValidations();

	$("#tot_rec").keypress(function(e){
		if (e.charCode == 45){
			$("#tot_ac").val(e.target.value);
			$("#tot_afil").val(0);
			$("#ajuste").focus();
			return false;
		}
	});
	$("#fec_prescr").keypress(function(e){
		if (e.charCode == 45){
			$("#fec_disp").val(e.target.value);
			$("#posee_marca_comercial").focus();
			return false;
		}
	});
	$("#tot_afil").keypress(function(e){
		if (e.charCode == 48) {
			$("#tot_ac").val($("#tot_rec").val());
		}
	});
	$(document).keydown(function(e) {
		if (e.which == 43 || e.which == 47
				|| e.which == 42 || e.which == 46) {
			e.stopPropagation();
			e.preventDefault();
			return false;
		} else if (e.which == 17) {
			ctrlPressed = true;
		} else if (e.which == 13) {
			if (ctrlPressed) {
				ctrlPressed = false;
				$("#register").submit();
				
			} else {
				e.stopPropagation();
				e.preventDefault();
				return false;
			}
		}
	});
	$(document).keyup(function(e) {
		if (e.which == 17) {
			ctrlPressed = false;
		}
	});
	$("#let_matricula").keypress(function(e) {
		var charCode = e.which || e.keyCode;
		var charStr = String.fromCharCode(charCode);
		if (charStr == "n" || charStr == "N") {
			$("#let_matricula").val("N");
		} else if (charStr == "p" || charStr == "P") {
			$("#let_matricula").val("P");
		} else if (charStr == "x" || charStr == "X") {
			$("#let_matricula").val("X");
		}
		return false;
	});
	$("input").keydown(function(e) {
		if (e.which == 13) {
			if (ctrlPressed) {
				$("#register").submit();
				return false;
			}
			var allInputs = $("input[type=text], input[type=number]");
			for (var i = 0; i < allInputs.length - 1; i++) {
				if (allInputs[i] == this) {
					while ((allInputs[i]).name == (allInputs[i + 1]).name || $(allInputs[i + 1]).attr("readonly")) {
						i++;
					}
					if ((i + 1) < allInputs.length) {
							$(allInputs[i + 1]).focus();
					}
				}
			}
			return false;
		}
	});
	$("input").keypress(function(e) {
		if (e.which == 43) {
			var allInputs = $("input[type=text], input[type=number]");
			for (var i = allInputs.length - 1; i >= 0; i--) {
				if (allInputs[i] == this) {
					while ((allInputs[i]).name == (allInputs[i - 1]).name || $(allInputs[i - 1]).attr("readonly")) {
						i--;
					}
					if ((i - 1) < allInputs.length) {
						$(allInputs[i - 1]).focus();
					}
				}
			}
			return false;
		}
	});
	$("#clean-fields").click(function(e){
		cleanFields();
	});
	for (var i = 0 ; i < 3 ; i++) {
		$("#pciorp_" + i).change(function(e){
			calculateAjuste();
		});
	}
};

var ctrlPressed = false;
var convenio;
var previousConvenio;

var cleanFields = function() {
	$("input[type='text'], input[type='number']").each(function() {
		var readonly = $(this).attr("readonly");
		if (!(readonly && readonly.toLowerCase() !== 'false')) {
			$(this).val("");
		}
	});
}

var calculateAjuste = function() {
	var ajuste = 0;
	for (var i = 0 ; i < 3 ; i++) {
		var diff = $("#pcio_real_" + i).val() - $("#pciorp_" + i).val();
		if (diff)
			ajuste += diff;
	}
	$("#ajuste").val(ajuste);
};

var convenioOnChange = function() {
	var name = $("#convenio_select").val();
	setConvenio(name);
};

var setConvenio = function(name) {
	var settings = {
		complete : function(response) {
			if (!response)
				return;
			if (convenio)
				undoConvenio();
			convenio = response.responseJSON;
			setFieldsByConvenio();
		},
		data : {
			name : name
		}
	};
	jQuery.ajax("/prescriptions/bin/home/convenio", settings);
};

var setFieldsByConvenio = function() {
	var fields = Object.keys(convenio.options);

	for (var i = 0; i < fields.length; i++) {
		var defaults = convenio.options[fields[i]];
		var field = $("#" + fields[i]);
		field.val(defaults.defaultValue);
		field.prop("readonly", !defaults.available);
		if (!defaults.available) {
			field.addClass("readonly");
		} else {
			field.removeClass("readonly");
		}
		if ((fields[i] == "cod_carat" && $("#ser_carat").val())
				|| (fields[i] == "ser_carat" && $("#cod_carat").val())) {
			getCarat();
		}
	}
};

var undoConvenio = function() {
	var fields = Object.keys(convenio.options);
	cleanFields();
	for (var i = 0; i < fields.length; i++) {
		var field = $("#" + fields[i]);
		field.prop("readonly", false);
		field.removeClass("readonly");
	}
	cleanFields();
};