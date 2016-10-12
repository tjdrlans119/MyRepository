<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<hr/><hr/>
<h3>데이터 찾기</h3><br/>
<hr/><hr/>
	[HttpServletRequest를 이용해서 찾기]<br/>
		데이터1: <%=(String)request.getAttribute("data1") %><br/>
		데이터2: <%=(String)request.getAttribute("data2") %><br/><br/>

	[HttpSession를 이용해서 찾기]<br/>
		데이터1: <%=(String)session.getAttribute("data1") %><br/>
		데이터2: <%=(String)session.getAttribute("data2") %><br/><br/>

	[EL을 이용해서 찾기]<br/>
		데이터1: ${data1} <br/>
		데이터2: ${data2} <br/>

</body>
</html>