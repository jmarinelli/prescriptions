<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../utils/header.jsp" %>

<%@ include file="../utils/noticeUser.jsp" %>

<div class="form-container">

	<form method="post" action="/TPE-PAW/bin/user/login">
		<label>
			<span>Usuario</span>
			<input name="username" type="text" value="${prevUsername}" />
		</label>
		<label>
			<span>Contrase&ntilde;a</span>
			<input name="password" type="password" />
		</label>
		<input type="submit" value="Iniciar sesion" />
		<button name="change" type="submit" >Olvid&eacute; mi contrase&ntilde;a</button>
	</form>
	
</div>

<div><a href="/TPE-PAW/register"><img class="new-ico" src="../../assets/images/new.png">Nueva cuenta</a></div>

<%@ include file="../utils/footer.jsp" %>