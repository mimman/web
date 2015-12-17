<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<ul>
	<li><a href="first.action">첫번째 요청</a></li>
	<li><a href="second.action?param1=food&param2=fruit">두번째 요청중에서 파라미터 전달</a></li>
	<li>
		<form method="post" action="second.action">
			<input type="text" name="id" />
			<input type="submit" value="두번쨰 요청중 포스트 방식" />
		</form>
	
	</li>
	<li><a href="third.action">세번째 요청</a></li>
	
	<li><a href="fourth.action?cart=list">네번째 요청1</a></li>
	<li><a href="fourth.action?cart=update">네번째 요청2</a></li>
	<li><a href="fourth.action?cart=delete">네번째 요청3</a></li>
</ul>
</body>
</html>
