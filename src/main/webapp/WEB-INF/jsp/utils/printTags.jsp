<c:if test="${tags == null}">
<c:out value="No hubo resultados" />
</c:if>


<div class="comment-ctn">
	<c:forEach var="item" items="${tags}">
	<div class="comment-box">
		
		<c:set var="s" value="veces"/>
		<div><a href="/TPE-PAW/hash?tag=${item.key.tag}">#${item.key.tag}</a> ha sido mencionado ${item.value} <c:if test="${item.value == 1}"><c:set var="s" value="vez"/></c:if>${s}</div>
		<div class="small-font"><span>Creado por: </span><a href="/TPE-PAW/${item.key.creator.username}">${item.key.creator.username}</a></div>
</div>


</c:forEach>
</div>