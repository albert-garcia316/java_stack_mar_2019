<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>Submitted Info:</h1>
		<table>
			<tr>
				<td>Name:</td>
				<td> <c:out value="${name }"></c:out></td>
			</tr>
			<tr>
				<td>Dojo Location:</td>
				<td> <c:out value="${location }"></c:out></td>
			</tr>
			<tr>
				<td>Favorite Language</td>
				<td> <c:out value="${language }"></c:out></td>
			</tr>
			<tr>
				<td>Comment</td>
				<td> <c:out value="${comment }"></c:out></td>
			</tr>
		</table>
		<a href="/"> 
			<button>Go Back</button>
		</a>
	</body>
</html>