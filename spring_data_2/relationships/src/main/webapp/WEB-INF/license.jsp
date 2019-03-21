<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New License</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>New License</h1>
		<form:form action="/licenses" method="POST" modelAttribute="license">
		    <p>
		        <form:label path="person">Person:</form:label>
		        <form:errors path="person"/>
		        <form:select path="person">
		        	<c:forEach items="${people }" var="person">
		        		<form:option value="${person}"><c:out value="${person.firstName }"></c:out> <c:out value="${person.lastName }"></c:out></form:option>
		        	</c:forEach>
		        </form:select>
		    </p>
		    <p>
		        <form:label path="State">State:</form:label>
		        <form:errors path="State"/>
		        <form:input type="text" path="State"/>
		    </p>
   		    <p>
		        <form:label path="expirationDate">Expiration Date:</form:label>
		        <form:errors path="expirationDate"/>
		        <form:input type="date" path="expirationDate"/>
		    </p>
		    <input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>