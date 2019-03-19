<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dashboard</title>
	</head>
	<body>
		<a href="/songs/new">Add New</a>
		<a href="search/topTen">Top Ten</a>
		<form style="display: inline-block" action="/search" method="post">
			<p>
				<label for="search">Search</label>
				<input type="text" name="search"/>
				<button type="submit">Search Artists</button>
			</p>
		</form>
		<table>
			<thead>
				<tr>
					<th>Title:</th>
					<th>Artist:</th>
					<th>Rating:</th>
					<th>Actions:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs }" var="song">
					<tr>
						<td><a href="/songs/${song.id }"><c:out value="${song.title }"></c:out></a></td>
						<td><c:out value="${song.artist }"></c:out></td>
						<td><c:out value="${song.rating }"></c:out></td>
						<td>
							<form action="/songs/${song.id }" method="POST">
								<input type="hidden" name="_method" value="delete"/>
								<button type="submit">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>