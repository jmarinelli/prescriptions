var formEvents = function() {
	$("#tot_rec").keypress(function(e){
		if (e.charCode == 43){
			$("#tot_ac").val(e.target.value);
			$("#tot_afil").val(0);
			return false;
		}
	});
	$("#tot_afil").keypress(function(e){
		if (e.charCode == 48) {
			$("#tot_ac").val($("#tot_rec").val());
		}
	})
}