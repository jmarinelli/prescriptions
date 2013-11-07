<div class="panel" id="troquelN2">
	<h3>Segundo</h3>
	<div class="panel-field">
		<span>C&oacute;digo de barra</span>
		<form:input path="codBarra2" type="text" onblur="loadInfo(this.value, 2);"/>
		<div class="error">
			<form:errors path="codBarra2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Presc.</span>
		<form:input path="canPresc2" type="number" />
		<div class="error">
			<form:errors path="canPresc2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Disp.</span>
		<form:input path="canDisp2" type="number" />
		<div class="error">
			<form:errors path="canDisp2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cant. Pagada.</span>
		<form:input path="canReal2" type="number" />
		<div class="error">
			<form:errors path="canReal2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Farm.</span>
		<form:input path="pciorp2" type="number" />
		<div class="error">
			<form:errors path="pciorp2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Precio Real</span>
		<form:input path="pcioReal2" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="pcioReal2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Nro. Troquel</span>
		<form:input path="troquel2" type="number" />
		<div class="error">
			<form:errors path="troquel2" />
		</div>
	</div>
	<div class="panel-field">
		<span>Cod. Laboratorio</span>
		<form:input path="laboratorio2" type="number" />
		<div class="error">
			<form:errors path="laboratorio2" />
		</div>
	</div>
</div>