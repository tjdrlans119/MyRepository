<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		<hr/><hr/>
		<h1>SpringFinalProgramming</h1> 
		<hr/><hr/><br/>
		<h3>
		1.<a href="<%=pageContext.getServletContext().getContextPath() %>member/login">로그인</a><br/>
		2.<a href="${pageContext.servletContext.contextPath}/freeboard/list">자유 게시판</a><br/>
		3.<a href="${pageContext.servletContext.contextPath}/photoboard/list">포토 게시판</a><br/>
		
		
		
		</h3>
		</body>
</html>
