<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="header.jsp" %>

<div class="info-ctn"><h1>Resultados de usuarios con "${keyword}"</h1></div>

<%@ include file="noticeUser.jsp" %>

<c:forEach var="user" items="${usersFound}">
	<div class="result-usr">
		<p class="bold">${user.surname}, ${user.name} </p>
		<span class="small-font lfloat">se registro como 
		<a href="/TPE-PAW/${user.username}" class="user-lnk">${user.username}</a> el <c:set var="date" value="${user.date}"></c:set>
		<%@ include file="printDate.jsp" %></span>
	</div>
</c:forEach>

<%@ include file="footer.jsp" %>