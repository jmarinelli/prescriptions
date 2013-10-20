<c:if test="${comments == null}">
	<c:out value="No hay comentarios" />
</c:if>


<div class="comment-ctn">
	<c:forEach var="comment" items="${comments}">
	<div class="comment-box">
		<div class="lfloat"><img class="ltl-img" src="/TPE-PAW/assets/img?u=${comment.user.username}"></div>
		<div class="user-lnk"><a href="/TPE-PAW/${comment.user.username}">${comment.user.username}</a> dijo:</div>
		<div class="description"><p>${comment.description}</p></div>
		<c:if test="${user.username == comment.user.username}">
		<div class="comment-actions">
			<form method="POST" action="/TPE-PAW/comment">
				<input type="hidden" name="commentId" value="${comment.id}">
				<button type="submit" class="btn-delete">x</button>
			</form>
		</div>
	</c:if>
	<div class="date">
		<p>Escrito el <c:set var="date" value="${comment.date}"></c:set><%@ include file="printDate.jsp" %></p>
	</div>
</div>


</c:forEach>
</div>