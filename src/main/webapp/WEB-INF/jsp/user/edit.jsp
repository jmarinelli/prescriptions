<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ include file="../utils/header.jsp" %>

<%@ include file="../utils/noticeUser.jsp" %>

<form:form method="POST" action="/TPE-PAW/bin/user/edit" class="form-container" enctype="multipart/form-data">
	<form:label path="name"><span class="${nameError}">Nombre</span>
		<form:input path="name" length="30" type="text" class="${nameError}" value="${user.name}" /></form:label>
	<form:label path="surname"><span class="${surnameError}">Apellido</span>
		<form:input path="surname" length="30" type="text" class="${surnameError}" value="${user.surname}" /></form:label>
	<form:label path="password"><span class="${passwordError}">Contrase&ntilde;a</span>
		<form:input path="password" length="30" class="${passwordError}" type="password" value="${user.password}" /></form:label>
	<label name="repassword"><span>Reescriba su Contrase&ntilde;a</span>
		<input name="repassword" length="30" type="password" class="${passwordError}" value="${user.password}" /></label>
	<form:label path="description"><span class="${descriptionError}">Descripci&oacute;n</span>
		<form:input path="description" length="30" type="text" class="${descriptionError}" value="${user.description}" /></form:label>
	<input type="file" /><span class="small-font">(Elegir im&aacute;gen si desea cambiar la actual)</span>
	<input type="submit" value="Enviar" />
	<a href="/TPE-PAW/bin/user/show/${user.username}">Cancelar</a>
</form:form>




<%@ include file="../utils/footer.jsp" %>