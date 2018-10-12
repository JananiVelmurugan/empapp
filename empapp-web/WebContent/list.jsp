<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>List of Employees</h3>
	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Designation</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${EMPLIST}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.designation}</td>
					<td><a
						href="<%=request.getContextPath()%>/EditServlet?id=${emp.id}">edit</a>
						<a href="<%=request.getContextPath()%>/DeleteServlet?id=${emp.id}">
							delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>











