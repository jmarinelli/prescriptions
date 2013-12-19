<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
		<script type="text/javascript">
			(function(){
				if (${status} == "success")
					alert("Receta actualizada");
			})();
		</script>
	</head>
	<body class="prescription-page-ctn">
		<%@ include file="../partials/header.jsp" %>
		<div>
			<div>
				<h1>Usuario:</h3>
				<h2>${user.username}</h2>
			</div>
			<div>
				<h2>Cantidad cargada: ${user.presQty}</h3>
			</div>
		</div>
		<div>
			<c:forEach var="prescription" items="${user.prescriptions}">
				<div><a href="/prescriptions/bin/home/edit/${prescription.id}">Codigo caratula: ${prescription.cod_carat}, Orden: ${prescription.orden}</a></div>
			</c:forEach>
		</div>
	</body>
</html>