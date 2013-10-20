<div class="panel">
	<h3>Receta</h3>
	<div class="sub-panel">
		<div class="panel-field">
			<span>Serie receta</span>
			<form:input path="serReceta" type="text" value="" />
			<div class="error">
				<form:errors path="serReceta" />
			</div>
		</div>
		<div class="panel-field">
			<span>Numero de receta</span>
			<form:input path="numReceta" type="number" />
			<div class="error">
				<form:errors path="numReceta" />
			</div>
		</div>
		<div class="panel-field">
			<span>Orden</span>
			<form:input path="orden" type="number" max="999" />
			<div class="error">
				<form:errors path="orden" />
			</div>
		</div>
		<div class="panel-field">
			<span>Fecha Prescripcion</span>
			<form:input path="fecPrescr" type="number" />
			<div class="error">
				<form:errors path="fecPrescr" max="21200000" />
			</div>
		</div>
		<div class="panel-field">
			<span>Fecha Dispensacion</span>
			<form:input path="fecDisp" type="number" max="21200000" />
			<div class="error">
				<form:errors path="fecDisp" />
			</div>
		</div>
		<div class="panel-field">
			<span>Letra Matricula</span>
			<form:input path="letMatricula" type="text" value="" maxlength="1" />
			<div class="error">
				<form:errors path="letMatricula" />
			</div>
		</div>
		<div class="panel-field">
			<span>Numero Matricula</span>
			<form:input path="numMatricula" type="number" />
			<div class="error">
				<form:errors path="numMatricula" />
			</div>
		</div>
		<div class="panel-field">
			<span>Total Receta</span>
			<form:input path="totRec" type="number" />
			<div class="error">
				<form:errors path="totRec" />
			</div>
		</div>
		<div class="panel-field">
			<span>Total Afiliado</span>
			<form:input path="totAfil" type="number" />
			<div class="error">
				<form:errors path="totAfil" />
			</div>
		</div>
		<div class="panel-field">
			<span>Total O.S.</span>
			<form:input path="totAc" type="number" />
			<div class="error">
				<form:errors path="totAc" />
			</div>
		</div>
		<div class="panel-field">
			<span>Ajuste</span>
			<form:input path="ajuste" type="number" />
			<div class="error">
				<form:errors path="ajuste" />
			</div>
		</div>
	</div>
	<div class="sub-panel">
		<div class="panel-field">
			<span>Rechazos</span>
			<form:input path="rechazos" type="text" value="" />
			<div class="error">
				<form:errors path="rechazos" />
			</div>
		</div>
		<div class="panel-field">
			<span>Posee Ticket</span>
			<form:input path="poseeTicket" type="checkbox" />
			<div class="error">
				<form:errors path="poseeTicket" />
			</div>
		</div>
		<div class="panel-field">
			<span>Posee Marca Comercial</span>
			<form:input path="poseeMarcaComercial" type="checkbox" />
			<div class="error">
				<form:errors path="poseeMarcaComercial" />
			</div>
		</div>
		<div class="panel-field">
			<span>Serie Vale</span>
			<form:input path="serVale" type="text" value="" readonly="true" />
			<div class="error">
				<form:errors path="serVale" />
			</div>
		</div>
		<div class="panel-field">
			<span>Codigo Vale</span>
			<form:input path="codVale" type="number" readonly="true" />
			<div class="error">
				<form:errors path="codVale" />
			</div>
		</div>
	</div>
</div>