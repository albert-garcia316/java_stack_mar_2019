<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Title</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1><c:out value="${person.firstName }"></c:out> <c:out value="${person.lastName }"></c:out></h1>
		<p>License Number: <c:out value="${person.license.number }"></c:out></p>
		<p>State: <c:out value="${person.license.state }"></c:out></p>
		<p>Expiration Date: <c:out value="${person.license.expirationDate }"></c:out></p>
	</body>
</html>