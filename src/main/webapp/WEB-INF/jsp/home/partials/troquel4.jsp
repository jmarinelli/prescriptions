<div class="panel" id="troquelN4">
	<h3>Cuarto</h3>
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="cod_barra_4" type="text" onblur="loadInfo(this.value, 4);" />
		<span id="alfabetaName4" class="alfabeta-name"></span>
		<div class="error">
			<form:errors path="cod_barra_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="can_presc_4" type="number" />
		<div class="error">
			<form:errors path="can_presc_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="can_disp_4" type="number" />
		<div class="error">
			<form:errors path="can_disp_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="can_real_4" type="number" />
		<div class="error">
			<form:errors path="can_real_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp_4" type="number" />
		<div class="error">
			<form:errors path="pciorp_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcio_real_4" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="pcio_real_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel_4" type="number" />
		<div class="error">
			<form:errors path="troquel_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio_4" type="number" />
		<div class="error">
			<form:errors path="laboratorio_4" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Alfabeta</span>
		<form:input path="alfabeta_4" type="number" />
		<div class="error">
			<form:errors path="alfabeta_4" />
		</div>
	</div>
</div>