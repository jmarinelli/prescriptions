<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../utils/header.jsp" %>

<%@ include file="../utils/noticeUser.jsp" %>

<div class="co-title"><h2>Recupero de Contrase&ntilde;a</h2></div>

<form method="POST" action="/TPE-PAW/user/change" class="form-container">

	<label><span>Usuario: <p>${values.username}</p></span></label>
	<input name="username" value="${values.username}" class="hidden">

	<label><span>Pregunta: <p style="text-style=italc;">${values.question}</p></span></label>
	<input name="question" value="${values.question}" class="hidden">

	<label><span class="${answerError}">Respuesta</span><input name="answer" length="60" type="text" class="${answerError}" ></label>

	<label><span class="${passwordError}">Nueva Contrase&ntilde;a</span>
		<input name="password" length="30" class="${passwordError}" type="password" ></label>

	<label><span class="${passwordError}">Reescriba su Nueva Contrase&ntilde;a</span>
		<input name="repassword" length="30" type="password" ></label>

	<button type="submit">Guardar</button>
	<a href="/TPE-PAW/user/change">Volver a ingresar nombre de usuario</a>

</form>

<%@ include file="../utils/footer.jsp" %>