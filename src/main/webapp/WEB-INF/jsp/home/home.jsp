<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
		<script type="text/javascript">
			$(document).ready(function() {
				$("a > button").click(function() {
					location.href = $(this).closest("a").attr("href");
				});
			});
		</script>
</head>
	<body>
		<%@ include file="../partials/header.jsp" %>
		<div class="ctn">
			<a href="/prescriptions/bin/home/list"><button class="big-menu-btn">Corregir</button></a>
			<a href="/prescriptions/bin/home/add"><button class="big-menu-btn">Cargar</button></a>
			<c:if test="${isAdmin}"><a href="/prescriptions/bin/admin"><button class="big-menu-btn">Admin panel</button></a></c:if>
		</div>
	</body>
</html>