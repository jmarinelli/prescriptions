<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
	</head>
	<body class="prescription-page-ctn">
		<%@ include file="../partials/header.jsp" %>
		<h2>Usuarios:</h2>
		<c:forEach var="user" items="${users}">
			<div>
				<div>
					<h3>Nombre:</h3>
					<h3><a href="/prescriptions/admin/user/${user.id}">${user.username}</a></h3>
				</div>
				<div>
					<h3>Cantidad cargada: ${user.presQty}</h3>
				</div>
			</div>
		</c:forEach>
	</body>
</html>