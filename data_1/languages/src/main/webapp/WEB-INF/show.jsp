<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show</title>
	</head>
	<body>	
		<p><a href="/languages">Dashboard</a></p>	
		<h1><c:out value="${language.name}"/></h1>
		<p>Description: <c:out value="${langauge.creator}"/></p>
		<p>Language: <c:out value="${language.version}"/></p>		
		<p><a href="/languages/${language.id}/edit"><button>Edit</button></a></p>
		<form action="/languages/${language.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <button type="submit">Delete</button>
		</form>
	</body>
</html>