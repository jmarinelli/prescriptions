<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="partials/commons-head.jsp" %>
		<script type="text/javascript">
			(function() {
				var cancel = function() {
					document.querySelector("#codCarat").addEventListener("keydown", function(e) {
						if (e.keyCode == 13) {
							e.returnValue = false;
						}
					});	
				};
				$(document).ready(cancel);
			})();
		</script>
	</head>
	<body class="prescription-page-ctn">
		<form:form method="POST" action="/prescriptions/add" id="register" commandName="prescriptionForm">
		<form:hidden path="prescription" />
		
		<div class="caratula-afiliado">
			<%@ include file="partials/panel-caratula.jsp" %>
			<%@ include file="partials/panel-receta.jsp" %>
			<%@ include file="partials/panel-afiliado.jsp" %>
		</div>
		
		<input type="submit" value="Cargar Receta" class="big-btn" />
		</form:form>
	</body>
</html>