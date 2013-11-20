<div class="panel" id="troquelN3">
	<h3>Tercero</h3>
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="cod_barra_3" type="text" onblur="loadInfo(this.value, 3);" />
		<span id="alfabetaName3" class="alfabeta-name"></span>
		<div class="error">
			<form:errors path="cod_barra_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="can_presc_3" type="number" />
		<div class="error">
			<form:errors path="can_presc_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="can_disp_3" type="number" />
		<div class="error">
			<form:errors path="can_disp_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="can_real_3" type="number" />
		<div class="error">
			<form:errors path="can_real_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp_3" type="number" />
		<div class="error">
			<form:errors path="pciorp_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcio_real_3" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="pcio_real_3" />
		</div>
	</div>
	
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel_3" type="number" />
		<div class="error">
			<form:errors path="troquel_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio_3" type="number" />
		<div class="error">
			<form:errors path="laboratorio_3" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Alfabeta</span>
		<form:input path="alfabeta_3" type="number" />
		<div class="error">
			<form:errors path="alfabeta_3" />
		</div>
	</div>
</div>