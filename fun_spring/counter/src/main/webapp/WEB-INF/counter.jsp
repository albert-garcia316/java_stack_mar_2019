<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Counter</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>You have visited /counter <c:out value="${count }"></c:out> times.</h1>
		<a href="/counter">Test another visit?</a>
		<a href="/addtwo">add 2 visits</a>
		<a href="/reset">reset the count</a>
	</body>
</html>