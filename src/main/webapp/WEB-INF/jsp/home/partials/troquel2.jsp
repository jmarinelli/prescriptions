<div class="panel" id="troquelN2">
	<h3>Segundo</h3>
	<div class="panel-field">
	  <span>Buscar: </span>
	  <input id="autocomplete_2">
	</div>
	=================
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="cod_barra_2" type="text" onblur="loadInfo(this.value, 2);" />
		<span id="alfabetaName2" class="alfabeta-name"></span>
		<div class="error">
			<form:errors path="cod_barra_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="can_presc_2" type="number" />
		<div class="error">
			<form:errors path="can_presc_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="can_disp_2" type="number" />
		<div class="error">
			<form:errors path="can_disp_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="can_real_2" type="number" />
		<div class="error">
			<form:errors path="can_real_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp_2" type="number" />
		<div class="error">
			<form:errors path="pciorp_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcio_real_2" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="pcio_real_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel_2" type="number" />
		<div class="error">
			<form:errors path="troquel_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio_2" type="number" />
		<div class="error">
			<form:errors path="laboratorio_2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Alfabeta</span>
		<form:input path="alfabeta_2" type="number" />
		<div class="error">
			<form:errors path="alfabeta_2" />
		</div>
	</div>
</div>