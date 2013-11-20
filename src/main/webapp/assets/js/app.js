var loadInfo = function(barras, nro) {
	if (!barras)
		return;
	var fecha = parseInt($("#fec_disp").val());
	var settings = {
		complete : function(response) {
			var json = response.responseJSON;
			if (!json) {
				alert("Numero de troquel invalido.");
				return;
			}
			populate(json, nro);
		},
		data : {
			"barras" : barras,
			"fecha" : fecha
		}
	};
	jQuery.ajax("alfabeta", settings);
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
			},
			data : {
				"cod_carat" : cod_carat,
				"ser_carat" : ser_carat
			}
	}
	debugger;
	jQuery.ajax("getCaratula", settings);
}

var populate = function(result, nro) {
	$("#pcio_real_" + nro).val(result.price.precio);
	$("#troquel_" + nro).val(result.alfabeta.troquel);
	$("#laboratorio_" + nro).val(result.alfabeta.codLab);
	$("#alfabeta_" + nro).val(result.alfabeta.registro);
	$("#alfabetaName" + nro).html(result.alfabeta.nombre);
}