<div class="panel" id="troquelN5">
	<h3>Quinto</h3>
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="cod_barra_5" type="text" onblur="loadInfo(this.value, 5);" />
		<span id="alfabetaName5" class="alfabeta-name"></span>
		<div class="error">
			<form:errors path="cod_barra_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="can_presc_5" type="number" />
		<div class="error">
			<form:errors path="can_presc_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="can_disp_5" type="number" />
		<div class="error">
			<form:errors path="can_disp_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="can_real_5" type="number" />
		<div class="error">
			<form:errors path="can_real_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp_5" type="number" />
		<div class="error">
			<form:errors path="pciorp_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcio_real_5" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="pcio_real_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel_5" type="number" />
		<div class="error">
			<form:errors path="troquel_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio_5" type="number" />
		<div class="error">
			<form:errors path="laboratorio_5" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Alfabeta</span>
		<form:input path="alfabeta_5" type="number" />
		<div class="error">
			<form:errors path="alfabeta_5" />
		</div>
	</div>
</div>