<div class="panel" id="receta">
	<h3>Receta</h3>
	<div class="sub-panel">
		<div class="panel-field">
			<span>Rechazos</span>
			<form:input path="rechazos" type="text" value="" />
			<div class="error">
				<form:errors path="rechazos" />
			</div>
		</div>
		<div class="panel-field">
			<span>Orden</span>
			<form:input path="orden" type="number" min="1" max="999" />
			<div class="error">
				<form:errors path="orden" />
			</div>
		</div>
		<div class="panel-field">
			<span>Letra Matricula</span>
			<form:input path="let_matricula" type="text" value="" maxlength="1" />
			<div class="fix-field">
				<form:checkbox path="fix_let_matricula" class="fix-checkbox"/>
			</div>
			<div class="error">
				<form:errors path="let_matricula" />
			</div>
		</div>
		<div class="panel-field">
			<span>Numero Matricula</span>
			<form:input path="num_matricula" type="number" />
			<div class="error">
				<form:errors path="num_matricula" />
			</div>
		</div>
		<div class="panel-field">
			<span>Fecha Prescripcion</span>
			<form:input path="fec_prescr" type="number" />
			<div class="fix-field">
				<form:checkbox path="fix_fec_prescr" class="fix-checkbox"/>
			</div>
			<div class="error">
				<form:errors path="fec_prescr" max="21200000" />
			</div>
		</div>
		<div class="panel-field">
			<span>Posee Marca Comercial</span>
			<form:input path="posee_marca_comercial" type="number" class="checkbox"/>
			<div class="error">
				<form:errors path="posee_marca_comercial" />
			</div>
		</div>
		<div class="panel-field">
			<span>Comentarios (opcional)</span>
			<div>
				<form:textarea path="comentarios"/>
			</div>
		</div>
	</div>
	<div class="sub-panel">
		<div class="panel-field">
			<span>Posee Ticket</span>
			<form:input path="posee_ticket" type="number" class="checkbox"/>
			<div class="error">
				<form:errors path="posee_ticket" />
			</div>
		</div>
		<div class="panel-field">
			<span>Fecha Dispensacion</span>
			<form:input path="fec_disp" type="number" max="21200000" />
			<div class="fix-field">
				<form:checkbox path="fix_fec_disp" class="fix-checkbox"/>
			</div>
			<div class="error">
				<form:errors path="fec_disp" />
			</div>
		</div>
		<div class="panel-field">
			<span>Total Receta</span>
			<form:input path="tot_rec" type="number" />
			<div class="error">
				<form:errors path="tot_rec" />
			</div>
		</div>
		<div class="panel-field">
			<span>Total Afiliado</span>
			<form:input path="tot_afil" type="number" />
			<div class="error">
				<form:errors path="tot_afil" />
			</div>
		</div>
		<div class="panel-field">
			<span>Total O.S.</span>
			<form:input path="tot_ac" type="number" />
			<div class="error">
				<form:errors path="tot_ac" />
			</div>
		</div>
		<div class="panel-field">
			<span>Ajuste</span>
			<form:input path="ajuste" type="number" />
			<div class="error">
				<form:errors path="ajuste" />
			</div>
		</div>
		<div class="panel-field">
			<span>Serie Vale</span>
			<form:input path="ser_vale" type="text" value="" readonly="true" class="readonly"/>
			<div class="error">
				<form:errors path="ser_vale" />
			</div>
		</div>
		<div class="panel-field">
			<span>Codigo Vale</span>
			<form:input path="cod_vale" type="number" readonly="true" class="readonly"/>
			<div class="error">
				<form:errors path="cod_vale" />
			</div>
		</div>
		<div class="panel-field">
			<span>Serie receta</span>
			<form:input path="ser_receta" type="text" value="" />
			<div class="error">
				<form:errors path="ser_receta" />
			</div>
		</div>
		<div class="panel-field">
			<span>Numero de receta</span>
			<form:input path="num_receta" type="number" />
			<div class="error">
				<form:errors path="num_receta" />
			</div>
		</div>
	</div>
</div>