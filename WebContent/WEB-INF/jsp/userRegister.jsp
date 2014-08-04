<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addData" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="sex" value="male" />Male</td>
				<td><input type="radio" name="sex" value="feMale" />FeMale</td>
			</tr>
			<tr>
				<td>DateOfBirth</td>
				<td><input type="text" name="date" /></td>
			</tr>
			<tr>
				<td>Father's Name</td>
				<td><input type="text" name="fatherName" /></td>
			</tr>
			<tr>
				<td>Mother'sName</td>
				<td><input type="text" name="motherName" /></td>
			</tr>
			<tr>
				<td>Nationality</td>
				<td><input type="text" name="nationality" /></td>
			</tr>
			<tr>
				<td>MailingAddress</td>
				<td><input type="text" name="mailingAddress" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobileNumber" /></td>
			</tr>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="mailId" /></td>
			</tr>
			<tr>
				<td>UpLoad your Photo</td>
				<td><input type="file" name="inputFile" /></td>
			</tr>
			<tr>
				<td>MaritalStatus</td>
				<td><input type="radio" name="status" value="single" />Single</td>
				<td><input type="radio" name="status" value="married" />Married</td>
			</tr>
			<tr>
				<td>Father'sOccupation</td>
				<td><input type="text" name="father'sJob"></td>
			</tr>
			<tr>
				<td>Mother'sOccupation</td>
				<td><input type="text" name="mother'sJob" /></td>
			</tr>
			<tr>
				<td>LandLine</td>
				<td><input type="text" name="landLineNumber"></td>
			</tr>
            <tr>
            <td><input type="submit" value="submit"/></td>
            </tr> 


		</table>
	</form>
</body>
</html>