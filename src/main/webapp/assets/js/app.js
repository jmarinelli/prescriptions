var loadInfo = function(barras, nro) {
	if (!barras)
		return;
	var fecha = parseInt($("#fec_disp").val());
	if (!fecha) {
		alert("Fecha invalida.");
		return;
	}
	var settings = {
		complete : function(response) {
			var json = response.responseJSON;
			if (!json) {
				var rechazo = "";
				var rechazoMsg = "";
				if (nro == 1 && !validationsMade.troquelOne) {
					rechazo = "56";
					validationsMade.troquelOne = true;
				}
				else if (nro == 2 && !validationsMade.troquelTwo) {
					rechazo = "61";
					validationsMade.troquelTwo = true;
				}
				else if (nro == 3 && !validationsMade.troquelThree) {
					rechazo = "94";
					validationsMade.troquelThree = true;
				}
				
				if (rechazo) {
					rechazoMsg = " Se cargo error " + rechazo;
					$("#rechazos").val($("#rechazos").val() + rechazo);
				}
				alert("Troquel no encontrado, intente nuevamente." + rechazoMsg);
				return;
			} else if (!json.price) {
				alert("Fecha invalida.");
				return;
			}
			if (nro == 1 && validationsMade.troquelOne) {
				$("#rechazos").val($("#rechazos").val().replace("56", ""));
				validationsMade.troquelOne = false;
			}
			else if (nro == 2 && validationsMade.troquelTwo) {
				$("#rechazos").val($("#rechazos").val().replace("61", ""));
				validationsMade.troquelTwo = false;
			}
			else if (nro == 3 && validationsMade.troquelThree) {
				$("#rechazos").val($("#rechazos").val().replace("94", ""));
				validationsMade.troquelThree = false;
			}
			populate(json, nro);
		},
		data : {
			"barras" : barras,
			"fecha" : fecha
		}
	};
	jQuery.ajax("/prescriptions/bin/home/alfabeta", settings);
};

var getCarat = function() {
	var cod_carat = $("#cod_carat").val();
	var ser_carat = $("#ser_carat").val();
	if (!cod_carat || !ser_carat)
		return;
	var settings = {
			complete: function(response) {
				var json = response.responseJSON;
				if (!json) {
					alert("Numero de caratula o serie de caratula invalidos");
					return;
				}
				$("#expediente").val(json.expediente);
				$("#delegacion").val(json.delegacion);
				$("#cod_obsoc").val(json.cod_obsoc);
				$("#cod_plan").val(json.cod_plan);
				$("#periodo").val(json.periodo);
				$("#cod_farma").val(json.cod_farma);
				$("#caja").val(json.caja);
				$("#totCargadas").html(json.cargadas);
				$("#canRec").html(json.can_rec);
//				$("#num_afi").focus()
			},
			data : {
				"ser_carat" : ser_carat,
				"cod_carat" : cod_carat
			}
	};
	jQuery.ajax("/prescriptions/bin/home/getCaratula", settings);
};

var populate = function(result, nro) {
	for (var i = 0 ; i < 3 ; i++) {
		if (i != nro) {
			if ($("#cod_barra_" + i).val() == result.alfabeta.barras || $("#cod_barra_" + i).val() == result.alfabeta.troquel) {
				$("#can_presc_" + i).val(parseInt($("#can_presc_" + i).val()) + parseInt(1));
				$("#can_disp_" + i).val(parseInt($("#can_disp_" + i).val()) + parseInt(1));
				$("#can_real_" + i).val(parseInt($("#can_real_" + i).val()) + parseInt(1));
				$("#pciorp_" + i).val(parseInt($("#pciorp_" + i).val()) + result.price.precio);
				$("#cod_barra_" + nro).val("");
				return;
			}
		}
	}
	if (result.price.precio == $("#tot_rec").val()) {
		$("#pciorp_" + nro).val(result.price.precio);
	}
	$("#can_presc_" + nro).val(1);
	$("#can_disp_" + nro).val(1);
	$("#can_real_" + nro).val(1);
	
	$("#pcio_real_" + nro).val(result.price.precio);
	$("#troquel_" + nro).val(result.alfabeta.troquel);
	$("#laboratorio_" + nro).val(result.alfabeta.codLab);
	$("#alfabeta_" + nro).val(result.alfabeta.registro);
	$("#alfabetaName" + nro).html(result.alfabeta.nombre);
	calculateAjuste();
};