<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="verify" method="post">
		<table>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>PassWord</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="SignIn" /></td>
				<td><input type="submit" value="Clear" /></td>
			</tr>
		</table>
	</form>
</body>
</html>