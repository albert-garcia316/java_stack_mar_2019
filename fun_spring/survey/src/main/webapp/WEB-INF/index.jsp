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
		<form action="/submit" method="POST">
			<p>
				<label for="name">Name:</label>
				<input type="text" name="name"/>
			</p>
			<p>
				<label for="location">Dojo location:</label>
				<select name="location">
					<option value="sanjose">San Jose</option>
					<option value="burbank">Burbank</option>
					<option value="seattle">Seattle</option>
					<option value="dallas">Dallas</option>
				</select>
			</p>
			<p>
				<label for="language">Favorite Language:</label>
				<select name="language">
					<option value="python">Python</option>
					<option value="ruby">Ruby</option>
					<option value="javascript">Javascript</option>
					<option value="java">Java</option>
				</select>
			</p>
			<p>
				<label for="comment">Comment</label>
				<textarea name="comment" cols="30" rows="3"></textarea>
			</p>
			<button type="submit">Submit</button>
		</form>
	</body>
</html>