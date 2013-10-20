<c:set var="classs" value="ok" ></c:set>
<c:if test="${!isValid}">
<c:set var="classs" value="error" ></c:set>
</c:if>
<div class="notice"><span class="${classs}"> ${statusMsg} </span></div>