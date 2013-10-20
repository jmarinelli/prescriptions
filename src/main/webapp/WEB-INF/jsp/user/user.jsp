<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../utils/header.jsp" %>

	<div class="info-ctn">
		<div class="img"><img src="/TPE-PAW/assets/img?u=${profileUser.username}&m=${profileUser.modkey}"></div>
		<div class="lfloat"><h1><c:out value="${profileUser.username}" /></h1></div>
		<div class="name">${profileUser.name} ${profileUser.surname}</div>
		<div class="user-description lfloat"><h2 class="co-title">Descripci&oacute;n</h2><h3>"${profileUser.description}"</h3></div>
	</div>

	<%@ include file="../utils/noticeUser.jsp" %>

	<c:if test="${isUser}">
		<%@ include file="../utils/commentBox.jsp" %>
	</c:if>
	

	<%@ include file="../utils/printComments.jsp" %>
	
<%@ include file="../utils/footer.jsp" %>