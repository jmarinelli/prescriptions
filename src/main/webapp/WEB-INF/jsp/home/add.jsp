<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
		<script type="text/javascript" src="/prescriptions/../assets/js/form.js"></script>
		<c:if test="${message != null}"><script>(function(){ alert(${message}); })();</script></c:if>
	</head>
	<%@ include file="../partials/header.jsp" %>
	<body class="prescription-page-ctn" onload="formEvents();">
		<form:form method="POST" action="add" id="register" commandName="prescriptionForm">
		<form:hidden path="prescription" />
		
		<div class="caratula-afiliado">
			<%@ include file="partials/panel-caratula.jsp" %>
			<%@ include file="partials/panel-receta.jsp" %>
			<%@ include file="partials/panel-afiliado.jsp" %>
			<%@ include file="partials/troquel1.jsp" %>
			<%@ include file="partials/troquel2.jsp" %>
			<%@ include file="partials/troquel3.jsp" %>
			<%@ include file="partials/troquel4.jsp" %>
			<%@ include file="partials/troquel5.jsp" %>
			<%@ include file="partials/troquel6.jsp" %>
		</div>
		
		<input type="submit" value="Cargar Receta" class="big-btn" />
		</form:form>
	</body>
</html>