<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${msg }
	<form action="addUser">
		<table align="center">
			<tr>
				<td>Enter Email Id</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Enter Phone Number</td>
				<td><input type="text" name="phNum" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Re-Enter Password</td>
				<td><input type="password" name="repassword" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
				<td><input type="submit" value="clear" /></td>
			</tr>

		</table>
	</form>
</body>
</html>