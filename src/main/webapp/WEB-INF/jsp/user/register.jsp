<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ include file="../utils/header.jsp" %>

<img class="user-ico" src="../../assets/images/user.png">

<%@ include file="../utils/noticeUser.jsp" %>

<form:form method="POST" action="/TPE-PAW/bin/user/register" class="form-container" id="register" enctype="multipart/form-data" commandName="userForm">

	<form:label path="name"><span class="${nameError}">Nombre</span><form:input path="name" length="30" type="text" class="${nameError}" value="${values.name}" /></form:label>
	<form:label path="surname"><span class="${surnameError}">Apellido</span><form:input path="surname" length="30" type="text" class="${surnameError}" value="${values.surname}" /></form:label>
	<form:label path="username"><span class="${usernameError}">Nombre de Usuario</span><form:input path="username" length="30" type="text" class="${userpathError}" value="${values.username}" /></form:label>
	<form:label path="password"><span class="${passwordError}">Contrase&ntilde;a</span><form:input path="password" length="30" class="${passwordError}" type="password" /></form:label>
	<form:label><span>Reescriba su Contrase&ntilde;a</span><input path="repassword" length="30" class="${passwordError}" type="password" /></form:label>
	<form:label path="question"><span class="${questionError}">Pregunta de Seguridad</span><form:input path="question" length="120" class="${questionError}" type="text" value="${values.question}" /></form:label>
	<form:label path="answer"><span class="${answerError}">Respuesta</span><form:input path="answer" length="50" class="${answerError}" type="text" value="${values.answer}" /></form:label>
	<form:label path="description"><span class="${descriptionError}">Descripci&oacute;n</span><form:input path="description" length="30" type="text" class="${descriptionError}" value="${values.description}" /></form:label>
	<input type="file" name="file"/>
	<input type="submit" value="Enviar" />
	<a href="/TPE-PAW/user/login">Volver al Login</a>
</form:form>

<%@ include file="../utils/footer.jsp" %>