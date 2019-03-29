<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ninja Gold</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>Your gold <c:out value="${gold }"></c:out> </h1>
		<div id="container">
			<div id="" class="place">
				<h2>Farm</h2>
				<h4>(Earn 10 - 20 gold)</h4>
				<form action="/farm" method="POST">
					<button type="submit">Find Gold!</button>
				</form>
			</div>
			<div id="" class="place">
				<h2>Cave</h2>
				<h4>(Earn 5 - 10 gold)</h4>
				<form action="/cave" method="POST">
					<button type="submit">Find Gold!</button>
				</form>
			</div>
			<div id="" class="place">
				<h2>House</h2>
				<h4>(Earn 2 - 5 gold)</h4>
				<form action="/house" method="POST">
					<button type="submit">Find Gold!</button>
				</form>
			</div>

				<div id="" class="place">
					<h2>Casino</h2>
					<h4>(Earn/Lose 0 - 50 gold)</h4>
					<c:if test="${gold >= 50 }">
						<form action="/casino" method="POST">
							<button type="submit">Find Gold!</button>
						</form>
					</c:if>
				</div>

				<div id="activity">

					<c:if test="${log.size() > 0 }">

						<c:forEach var= "i" begin="${0 }" end="${log.size() - 1 }">

							<c:if test="${ log.get(i).contains('earn')}">
								<p class="green"><c:out value="${log.get(i) }"></c:out></p>
							</c:if>

							<c:if test="${log.get(i).contains('lost') }">
								<p class="red"><c:out value="${log.get(i) }"></c:out></p>
							</c:if>

						</c:forEach>

					</c:if>

				</div>

			</div>
			<a href="/reset"><button>Reset</button></a>
	</body>
</html>