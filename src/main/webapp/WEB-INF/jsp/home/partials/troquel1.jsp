<div class="panel" id="troquelN1">
	<h3>Primero</h3>
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="codBarra1" type="text" onblur="loadInfo(this.value, 1);" />
		<div class="error">
			<form:errors path="codBarra1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="canPresc1" type="number" />
		<div class="error">
			<form:errors path="canPresc1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="canDisp1" type="number" />
		<div class="error">
			<form:errors path="canDisp1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="canReal1" type="number" />
		<div class="error">
			<form:errors path="canReal1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp1" type="number" />
		<div class="error">
			<form:errors path="pciorp1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcioReal1" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="pcioReal1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel1" type="number" />
		<div class="error">
			<form:errors path="troquel1" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio1" type="number" />
		<div class="error">
			<form:errors path="laboratorio1" />
		</div>
	</div>
</div>