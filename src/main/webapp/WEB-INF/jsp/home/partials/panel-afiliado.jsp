<div class="panel" id="afiliado">
	<h3>Afiliado</h3>
	<div class="panel-field">
		<span>Numero Afiliado</span>
		<form:input path="numAfi" type="number" />
		<div class="error">
			<form:errors path="numAfi" />
		</div>
	</div>
	<div class="panel-field">
		<span>Numero de Parentesco</span>
		<form:input path="parentesco" type="number" />
		<div class="error">
			<form:errors path="parentesco" />
		</div>
	</div>
	<div class="panel-field">
		<span>Sexo</span>
		<form:input path="sexo" type="text" class="readonly" readonly="true" />
		<div class="error">
			<form:errors path="sexo" />
		</div>
	</div>
	<div class="panel-field">
		<span>Tratamiento prolongado</span>
		<form:input path="tratProlongado" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="tratProlongado" />
		</div>
	</div>
	<div class="panel-field">
		<span>Tipo Documento</span>
		<form:input path="tipoDocumento" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="tipoDocumento" />
		</div>
	</div>
	<div class="panel-field">
		<span>Numero Docuento</span>
		<form:input path="numDocumento" type="number" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="numDocumento" />
		</div>
	</div>
	<div class="panel-field">
		<span>Fecha nacimiento</span>
		<form:input path="fecNacimiento" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="fecNacimiento" />
		</div>
	</div>
	<div class="panel-field">
		<span>Telefono</span>
		<form:input path="telefono" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="telefono" />
		</div>
	</div>
</div>