<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show Dojo</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1><c:out value="${dojo.name }"></c:out> Location's Ninjas</h1>
		<table>
			<thead>
				<tr>
					<th>First Name:</th>
					<th>Last Name:</th>
					<th>Age:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ninjas }" var="ninja">
					<tr>
						<td><c:out value="${ninja.firstName }"></c:out></td>
						<td><c:out value="${ninja.lastName }"></c:out></td>
						<td><c:out value="${ninja.age }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>