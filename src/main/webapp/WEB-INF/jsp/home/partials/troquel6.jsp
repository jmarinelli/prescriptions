<div class="panel" id="troquelN6">
	<h3>Sexto</h3>
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="cod_barra_6" type="text" onblur="loadInfo(this.value, 6);" />
		<span id="alfabetaName6" class="alfabeta-name"></span>
		<div class="error">
			<form:errors path="cod_barra_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="can_presc_6" type="number" />
		<div class="error">
			<form:errors path="can_presc_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="can_disp_6" type="number" />
		<div class="error">
			<form:errors path="can_disp_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="can_real_6" type="number" />
		<div class="error">
			<form:errors path="can_real_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp_6" type="number" />
		<div class="error">
			<form:errors path="pciorp_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcio_real_6" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="pcio_real_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel_6" type="number" />
		<div class="error">
			<form:errors path="troquel_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio_6" type="number" />
		<div class="error">
			<form:errors path="laboratorio_6" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Alfabeta</span>
		<form:input path="alfabeta_6" type="number" />
		<div class="error">
			<form:errors path="alfabeta_6" />
		</div>
	</div>
</div>