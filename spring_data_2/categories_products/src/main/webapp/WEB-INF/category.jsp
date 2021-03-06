<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New Category</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>New Category</h1>
		<form:form action="/categories" method="POST" modelAttribute="category">
			<p>
				<form:label path="name">Name:</form:label>
				<form:errors path="name"></form:errors>
				<form:input path="name" type="text" />
			</p>
			<button type="submit">Create</button>
		</form:form>
	</body>
</html>