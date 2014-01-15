<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
		<script type="text/javascript" src="/prescriptions/assets/js/form.js"></script>
		<script type="text/javascript">
			(function(){
				if (${status} == "success")
					alert("Receta cargada");
				else if (${status} == "duplicated")
					alert("Receta duplicada");
				$(document).ready(function(){
					if (${ser_carat} != '') {
						$("#ser_carat").val(${ser_carat});
						$("#fix_ser_carat").attr("checked", true);
					}
					if (${cod_carat} != '') {
						$("#cod_carat").val(${cod_carat});
						$("#fix_cod_carat").attr("checked", true);
					}
					if (${cod_carat} != '' && ${ser_carat} != '') {
						getCarat();
					}
					if (${fec_prescr} != '') {
						$("#fec_prescr").val(${fec_prescr});
						$("#fix_fec_prescr").attr("checked", true);
					}
					if (${fec_disp} != '') {
						$("#fec_disp").val(${fec_disp});
						$("#fix_fec_disp").attr("checked", true);
					}
					if (${let_matricula} != '') {
						$("#let_matricula").val(${let_matricula});
						$("#fix_let_matricula").attr("checked", true);
					}
					if (${convenio} != '') {
						$("#convenio_select").val(${convenio});
						setConvenio(${convenio});
					}
				});
			})();
		</script>
	</head>
	<%@ include file="../partials/header.jsp" %>
	<body class="prescription-page-ctn" onload="formEvents();">
		<form:form method="POST" action="/prescriptions/bin/home/add" id="register" commandName="prescriptionForm">
		<form:hidden path="Prescription" />
		<div class="panel-field">
			<form:hidden path="duplicated" />
			<div class="duplicated-error">
				<form:errors path="duplicated" />
			</div>
		</div>
		
		
		<form:select id="convenio_select" onchange="convenioOnChange()" path="convenio">
			<form:option value="NONE"> --SELECT--</form:option>
			<c:forEach var="convenio" items="${convenios}">
				<form:option value="${ convenio.name }">${ convenio.name }</form:option>
			</c:forEach>
		</form:select>
		<span class="fix-field-span">
			<form:input path="fix_convenio" type="checkbox" class="fix-checkbox"/>
			<span>Fijar</span>
		</span>
		
		<div class="caratula-afiliado">
			<%@ include file="partials/panel-caratula.jsp" %>
			<%@ include file="partials/panel-afiliado.jsp" %>
			<%@ include file="partials/panel-receta.jsp" %>
			<%@ include file="partials/troquel1.jsp" %>
			<%@ include file="partials/troquel2.jsp" %>
			<%@ include file="partials/troquel3.jsp" %>
		</div>		
		<input type="submit" value="Cargar Receta" class="big-btn" />
		</form:form>
		<input type="button" value="Limpiar todos los campos" id="clean-fields"/>
	</body>
</html>