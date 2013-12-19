var formEvents = function() {

	$("#tot_rec").keypress(function(e){
		if (e.charCode == 45){
			$("#tot_ac").val(e.target.value);
			$("#tot_afil").val(0);
			return false;
		}
	});
	$("#fec_prescr").keypress(function(e){
		if (e.charCode == 45){
			$("#fec_disp").val(e.target.value);
			$("#let_matricula").focus();
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
		debugger;
		if (e.which == 47) {
			$("#let_matricula").val("N");
		} else if (e.which == 42) {
			$("#let_matricula").val("P");
		} else if (e.which == 46) {
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
		$("input[type='text'], input[type='number']").each(function() {
			var readonly = $(this).attr("readonly");
			if (!(readonly && readonly.toLowerCase() !== 'false')) {
				$(this).val("");
			}
		});
	});
	for (var i = 0 ; i < 3 ; i++) {
		$("#pciorp_" + i).change(function(e){
			calculateAjuste();
		});
	}
};

var ctrlPressed = false;

var calculateAjuste = function() {
	var ajuste = 0;
	for (var i = 0 ; i < 3 ; i++) {
		var diff = $("#pcio_real_" + i).val() - $("#pciorp_" + i).val();
		if (diff)
			ajuste += diff;
	}
	$("#ajuste").val(ajuste);
};