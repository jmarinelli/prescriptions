<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<%@ include file="partials/commons-head.jsp" %>
	</head>
	<body class="prescription-page-ctn">
		<c:forEach var="prescription" items="${prescriptions}">
			<div><a href="edit/${prescription.id}">${prescription.serReceta}, ${prescription.numReceta}</a></div>
		</c:forEach>
	</body>
</html>