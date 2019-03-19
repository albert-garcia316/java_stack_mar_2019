<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show Song</title>
	</head>
	<body>
		<a href="/dashboard">Dashboard</a>
		<table>
			<tr>
				<td>Title:</td>
				<td><c:out value="${song.title }"></c:out></td>
			</tr>
			<tr>
				<td>Artist</td>
				<td><c:out value="${song.artist }"></c:out></td>
			</tr>
			<tr>
				<td>Rating (1-10)</td>
				<td><c:out value="${song.rating }"></c:out></td>	
			</tr>
		</table>
		<form action="/songs/${song.id }" method="POST">
			<input type="hidden" name="_method" value="delete"/>
			<button type="submit">Delete</button>
		</form>
	</body>
</html>