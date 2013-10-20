<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp" %>

<%@ include file="noticeUser.jsp" %>

<div class="co-title"><h2>Recupero de Contrase&ntilde;a</h2></div>

<form method="POST" action="/TPE-PAW/change" class="form-container">

	<label><span>${username}</span></label>

	<label><span>Pregunta: <p style="text-style=italc;">${values.question}</p></span></label>

	<label><span class="${answerError}">Respuesta</span><input name="answer" length="60" type="text" class="${answerError}" ></label>

	<label><span class="${passwordError}">Nueva Contrase&ntilde;a</span>
		<input name="password" length="30" class="${passwordError}" type="password" ></label>

	<label><span>Reescriba su Nueva Contrase&ntilde;a</span>
		<input name="repassword" length="30" type="password" ></label>

	<button type="submit">Guardar</button>
	<a href="/TPE-PAW/change">Volver a ingresar nombre de usuario</a>

</form>

<%@ include file="footer.jsp" %>