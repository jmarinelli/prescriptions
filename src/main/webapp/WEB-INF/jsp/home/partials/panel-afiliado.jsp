<div class="panel" id="afiliado">
	<h3>Afiliado</h3>
	<div class="panel-field">
		<span>Numero Afiliado</span>
		<form:input path="num_afi" type="number" />
		<div class="error">
			<form:errors path="num_afi" />
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
		<form:input path="trat_prolongado" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="trat_prolongado" />
		</div>
	</div>
	<div class="panel-field">
		<span>Tipo Documento</span>
		<form:input path="tipo_documento" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="tipo_documento" />
		</div>
	</div>
	<div class="panel-field">
		<span>Numero Docuento</span>
		<form:input path="num_documento" type="number" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="num_documento" />
		</div>
	</div>
	<div class="panel-field">
		<span>Fecha nacimiento</span>
		<form:input path="fec_nacimiento" type="text" class="readonly"
			readonly="true" />
		<div class="error">
			<form:errors path="fec_nacimiento" />
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