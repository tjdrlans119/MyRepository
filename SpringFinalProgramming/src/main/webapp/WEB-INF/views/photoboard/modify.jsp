<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		글수정
		<hr/>
		<form method="post" enctype="multipart/form-data">
			<input type="hidden"name="bno"value="${photoboard.bno}"/>
		<table>
		
				<tr>
					<td style="background-color:orange; width:70px">제목</td>
					<td><input type="text" name="btitle" style="width:600px" value="${photoboard.btitle}"/></td>
				</tr>
				
				<tr>
					<td style="background-color:orange; width:70px">원본사진</td>
					<td><img src="showPhoto?savedfile=${photoboard.savedfile}" width="500px"/></td>
				</tr>
				
				<tr>
					<td style="background-color:orange; width:70px">새로운사진</td>
					<td><input type="file" name="photo"/></td>
				</tr>
				
		</table>
		<input type="submit" value="글수정" />
		</form>
	</body>
</html>













