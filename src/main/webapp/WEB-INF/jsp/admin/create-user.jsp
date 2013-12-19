<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<%@ include file="../partials/commons-head.jsp" %>
	</head>
	<body>
		<%@ include file="../partials/header.jsp" %>
		<div class="login-form-container">
		<h2>Crear Usuario:</h2>
		
			<form method="post" action="/prescriptions/bin/admin/create-user">
				<div>
					<label>
						<span>Usuario</span>
						<input name="username" type="text" />
					</label>
				</div>
				<div>
					<label>
						<span>Contrase&ntilde;a</span>
						<input name="password" type="password" />
					</label>
				</div>
				<div>
					<input type="submit" value="Crear Usuario" />
				</div>
			</form>
			
		</div>
	</body>
</html>