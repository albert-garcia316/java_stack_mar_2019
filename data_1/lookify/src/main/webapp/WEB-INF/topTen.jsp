<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Top Ten Songs</title>
	</head>
	<body>
		<a href="/dashboard">Dashboard</a>
		<h1>Top Ten Songs</h1>
		<div>
			<c:forEach items="${songs }" var="song">
				<p>
					<c:out value="${song.rating }"></c:out>. <a href="/songs/${song.id }"><c:out value="${song.title }"></c:out></a> - <c:out value="${song.artist }"></c:out>
				</p>
			</c:forEach>
		</div>
	</body>
</html>