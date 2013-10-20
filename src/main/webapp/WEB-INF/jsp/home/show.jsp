<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<body>
		<h1> Tests: </h1>
		<c:if test="${tests == null}">
			<c:out value="No hay tests" />
		</c:if>
		
		
		<div class="comment-ctn">
			<c:forEach var="current" items="${tests}">
			<div class="comment-box">
				<h3>${current.name}</h3>
				<h3>${current.password}</h3>
			</div>
			</c:forEach>
		</div>
	</body>
</html>