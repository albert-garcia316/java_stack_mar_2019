<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New Product</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>New Product</h1>
		<form:form action="/products" method="POST" modelAttribute="product">
			<p>
				<form:label path="name">Name:</form:label>
				<form:errors path="name"></form:errors>
				<form:input path="name" type="text" />
			</p>
			<p>
				<form:label path="description">Description:</form:label>
				<form:errors path="description"></form:errors>
				<form:input path="description" type="text" />
			</p>
			<p>
				<form:label path="price">Price:</form:label>
				<form:errors path="price"></form:errors>
				<form:input path="price" type="number" />
			</p>
			<button type="submit">Create</button>
		</form:form>
	</body>
</html>