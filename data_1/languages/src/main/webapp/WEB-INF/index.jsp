<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Languages</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<th>Name:</th>
					<th>Creator:</th>
					<th>Version:</th>
					<th>Action:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${languages}" var="language">
					<tr>
						<td><a href="/languages/${language.id }"><c:out value="${language.name }"></c:out></a></td>
						<td><c:out value="${language.creator }"></c:out></td>
						<td><c:out value="${language.version }"></c:out></td>
						<td>
							<a href="/languages/${language.id }/edit"><button>Edit</button></a> |
							<form id="form_button" action="/languages/${language.id }" method="POST">
									    <input type="hidden" name="_method" value="delete">
									    <button type="submit">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form:form action="/languages" method="POST" modelAttribute="languageObj">
		    <p>
		        <form:label path="name">Name:</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>
		    <p>
		        <form:label path="creator">Creator:</form:label>
		        <form:errors path="creator"/>
		        <form:textarea path="creator"/>
		    </p>
		    <p>
		        <form:label path="version">Version:</form:label>
		        <form:errors path="version"/>
		        <form:input path="version"/>
		    </p>
		    <input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>