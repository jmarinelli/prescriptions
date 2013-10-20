<div class="panel" id="caratula">
	<h3>Caratula</h3>
	<div class="panel-field">
		<span>Serie Caratula</span>
		<form:input path="serCarat" type="text" value=""/>
		<div class="error">
			<form:errors path="serCarat" />
		</div>
	</div>
	<div class="panel-field">
		<span>Codigo Caratula</span>
		<form:input path="codCarat" type="number" value=""/>
		<div class="error">
			<form:errors path="codCarat" />
		</div>
	</div>

	<!-- de acá para abajo según lo que dice el excel habria que agregar readonly="true" a los input -->
	<div class="panel-field tabbed">
		<span>Expediente</span>
		<form:input path="expediente" type="number" value="" class="readonly"/>
		<div class="error">
			<form:errors path="expediente" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Delegacion</span>
		<form:input path="delegacion" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="delegacion" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Codigo O.S.</span>
		<form:input path="codObSoc" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="codObSoc" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Codigo plan</span>
		<form:input path="codPlan" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="codPlan" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Periodo</span>
		<form:input path="periodo" type="text" placeholder="YYYYMMPN" class="readonly"/>
		<div class="error">
			<form:errors path="periodo" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Codigo Farmacia</span>
		<form:input path="codFarma" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="codFarma" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Caja</span>
		<form:input path="caja" type="number" class="readonly"/>
		<div class="error">
			<form:errors path="caja" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Aca va total receta</span>
	</div>
</div>