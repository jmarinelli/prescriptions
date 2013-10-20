<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<%@ include file="partials/head.jsp" %>
	<body>
		<div class="form-container">
		
			<form method="post" action="/prescriptions/login">
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
					<input type="submit" value="Iniciar sesion" />
				</div>
			</form>
			
		</div>
	</body>
</html>