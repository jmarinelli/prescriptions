<div class="panel" id="caratula">
	<h3>Caratula</h3>
	<div class="panel-field">
		<span>Serie Caratula</span>
		<form:input path="ser_carat" type="text" value="" id="ser_carat"/>
		<div class="fix-field">
			<form:input path="fix_ser_carat" type="checkbox" class="fix-checkbox"/>
			<span>Fijar</span>
		</div>
		<div class="error">
			<form:errors path="ser_carat" />
		</div>
	</div>
	<div class="panel-field">
		<span>Codigo Caratula</span>
		<form:input path="cod_carat" type="text" value="" id="cod_carat" onblur="getCarat();"/>
		<div class="fix-field">
			<form:input path="fix_cod_carat" type="checkbox" class="fix-checkbox"/>
			<span>Fijar</span>
		</div>
		<div class="error">
			<form:errors path="cod_carat" />
		</div>
	</div>

	<!-- de acá para abajo según lo que dice el excel habria que agregar readonly="true" a los input -->
	<div class="panel-field tabbed">
		<span>Expediente</span>
		<form:input path="expediente" type="number" value="" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="expediente" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Delegacion</span>
		<form:input path="delegacion" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="delegacion" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Codigo O.S.</span>
		<form:input path="cod_obsoc" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="cod_obsoc" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Codigo plan</span>
		<form:input path="cod_plan" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="cod_plan" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Periodo</span>
		<form:input path="periodo" type="text" placeholder="YYYYMMPN" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="periodo" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Codigo Farmacia</span>
		<form:input path="cod_farma" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="cod_farma" />
		</div>
	</div>
	<div class="panel-field tabbed">
		<span>Caja</span>
		<form:input path="caja" type="number" readonly="true" class="readonly"/>
		<div class="error">
			<form:errors path="caja" />
		</div>
	</div>
	<div class="panel-field tabbed recetas">
		<span class="label">Recetas cargadas:</span> <span id="totCargadas">0</span><span>de</span><span id="canRec">0</span>
	</div>
</div>