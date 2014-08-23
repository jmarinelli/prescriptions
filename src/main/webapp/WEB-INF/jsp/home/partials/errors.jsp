<div id="errors" class="errors-panel">
	<div class="panel-field">
		<span>Cargar con errores</span>
		<form:checkbox path="with_errors" class="errors-checkbox"/>
	</div>
	<div class="panel-field">
		<span>Motivo:</span>
		<form:textarea path="errors_reason"/>
		<div class="error">
			<form:errors path="errors_reason" />
		</div>
	</div>
</div>