<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update book</title>
</head>
<body>
	<h3>Edit Employee</h3>
	<form action="UpdateServlet" method="post">
		<input type="text" name="id" value="${EMPLOYEE.id}" readonly /> <input
			type="text" id="name" name="name" value="${EMPLOYEE.name}" required
			autofocus /> <input type="text" name="designation"
			value="${EMPLOYEE.designation}" required /> <input type="submit"
			value="Update">
	</form>
</body>
</html>