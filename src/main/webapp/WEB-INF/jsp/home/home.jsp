<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
	</head>
	<body>
		<%@ include file="../partials/header.jsp" %>
		<div class="ctn">
			<a href="/prescriptions/list"><button class="big-menu-btn">Corregir</button></a>
			<a href="/prescriptions/add"><button class="big-menu-btn">Cargar</button></a>
			<c:if test="${isAdmin}"><a href="/prescriptions/admin"><button class="big-menu-btn">Admin panel</button></a></c:if>
		</div>
	</body>
</html>