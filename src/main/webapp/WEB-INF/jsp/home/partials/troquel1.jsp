<div class="panel" id="troquelN1">
	<h3>Primero</h3>
	<div class="panel-field">
	  <span>Buscar: </span>
	  <input id="autocomplete_1">
	</div>
	=================
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="cod_barra_1" type="text" onblur="loadInfo(this.value, 1);" />
		<span id="alfabetaName1" class="alfabeta-name"></span>
		<div class="error">
			<form:errors path="cod_barra_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="can_presc_1" type="number" />
		<div class="error">
			<form:errors path="can_presc_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="can_disp_1" type="number" />
		<div class="error">
			<form:errors path="can_disp_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="can_real_1" type="number" />
		<div class="error">
			<form:errors path="can_real_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp_1" type="number" />
		<div class="error">
			<form:errors path="pciorp_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcio_real_1" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="pcio_real_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel_1" type="number" />
		<div class="error">
			<form:errors path="troquel_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio_1" type="number" />
		<div class="error">
			<form:errors path="laboratorio_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Alfabeta</span>
		<form:input path="alfabeta_1" type="number" />
		<div class="error">
			<form:errors path="alfabeta_1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Porc. O.S.</span>
		<form:input path="porc_1" type="number" />
		<div class="error">
			<form:errors path="porc_1" />
		</div>
	</div>
</div>