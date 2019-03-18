<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Edit</title>
		<link rel="stylesheet" type="text/css" href="../../css/style.css">
	</head>
	<body>
		<div id="right">
	 		<form id="form_button" action="/languages/${language.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <button type="submit">Delete</button>
			</form> 
		 	<a href="/languages"><button>Dashboard</button></a> 
		</div>

		<form:form action="/languages/${language.id }" method="POST" modelAttribute="language">
			<input type="hidden" name="_method" value="put">
		    <p>
		        <form:label path="name">Name:</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>
		    <p>
		        <form:label path="creator">Creator:</form:label>
		        <form:errors path="creator"/>
		        <form:textarea path="creator"/>
		    </p>
		    <p>
		        <form:label path="version">Version:</form:label>
		        <form:errors path="version"/>
		        <form:input path="version"/>
		    </p>
		    <input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>