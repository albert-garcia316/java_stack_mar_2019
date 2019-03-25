<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New Ninja</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>New Ninja</h1>
		<form:form action="/ninjas" method="POST" modelAttribute="ninja">
			<p>
		        <form:label path="dojo">Dojo::</form:label>
		        <form:errors path="dojo"/>
		        <form:select path="dojo">
		        	<c:forEach items="${dojos }" var="dojo">
		        		<form:option value="${dojo}"><c:out value="${dojo.name }"></c:out></form:option>
		        	</c:forEach>
		        </form:select>
			</p>
			<p>
				<form:label path="firstName">First Name:</form:label>
				<form:errors path="firstName"></form:errors>
				<form:input path="firstName"></form:input>
			</p>
			<p>
				<form:label path="lastName"> Last Name:</form:label>
				<form:errors path="lastName"></form:errors>
				<form:input path="lastName"></form:input>
			</p>
			<p>
				<form:label path="age"> Age:</form:label>
				<form:errors path="age"></form:errors>
				<form:input path="age" type="number"></form:input>
			</p>
			<button type="submit">Create</button>
		</form:form>
	</body>
</html>