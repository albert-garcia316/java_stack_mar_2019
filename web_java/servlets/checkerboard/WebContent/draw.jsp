<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CheckerBoard</title>
<style><%@include file="/NewFile.css"%></style>
</head>
<body>
	<% int width = 10; %>
	<% int height = 10; %>
	<% String w = request.getParameter("width"); %>
	<%if(w == null){ %>
		
		<% width = 10; %>
	<%} else { %>
	<% width = Integer.parseInt(w);  %>
	<%} %>
	<% String h = request.getParameter("height"); %>
	<%if(h == null){ %>
		<% height = 10; %>
	<%} else { %>
		<% height = Integer.parseInt(h);  %>
	<%} %>

	<h1>Checker board: <%= width %>w X <%= height %>h</h1>
	<%for(int i = 1; i <= height; i++){ %>
		<div class="row">
			<%for(int j = 1; j <= width; j++){ %>
			
				<%if(i % 2 != 0){ %>
					<%if(j % 2 != 0){ %>
						<div class="blue"></div>
					<%} else {%>
						<div class="red"></div>
					<%} %>	
				<%} else { %>	
					<%if(j % 2 != 0){ %>
						<div class="red"></div>
					<%} else {%>
						<div class="blue"></div>
					<%} %>	
				<%} %>	
		
			<%} %>	
		</div>
	<!-- close height loop "i"  -->
	<%} %>	
</body>
</html>