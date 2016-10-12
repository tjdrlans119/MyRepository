<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<hr /><hr />
	<h1>exam02 요청 처리</h1>
	<hr /><hr />
		<h3>1.<a href="/kimoon/exam02/join?mid=user1&mname=홍길동&mage=30">가입</a></h3><br/>
		<h3>2.<a href="/kimoon/exam02/login?id=user1&password=12345">로그인</a></h3><br/>
		<h3>3.<a href="/kimoon/exam02/oder?pid=5&pname=마우스&pprice=5000&pcompany=삼성">주문</a></h3><br/>
		<h3>4.<a href="/kimoon/exam02/write?bno=10&title=게시물제목&content=게시물내용">글쓰기</a></h3><br/>
		<h3>5.<a href="/kimoon/exam02/update?bno=15&title=게시물제목&content=게시물내용&count=3">글수정</a></h3><br/>
		<h3>6.<a href="/kimoon/exam02/send?bno=20&title=게시물제목&content=게시물내용">보내기</a></h3>
</body>
</html>