<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>secondResult</title>
</head>
<body>
<h2>세번째 요청에 대한 결과 페이지 입니다.</h2>
<c:forEach var="dish" items="${requestScope.foodList}">
	<li>${dish}</li>
</c:forEach>
${f1}<br/>
${f2}<br/>
${f3}<br/>

${day[0]},${day[1]},${day[2]}
</body>
</html>
