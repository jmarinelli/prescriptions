var loadInfo = function(barras, nro) {
	if (!barras)
		return;
	var fecha = $("#fecDisp").val();
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

var populate = function(result, nro) {
	$("#pcioReal" + nro).val(result.price.precio);
	$("#troquel" + nro).val(result.alfabeta.troquel);
	$("#laboratorio" + nro).val(result.alfabeta.codLab);
}