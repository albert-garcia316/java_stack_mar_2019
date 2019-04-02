<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show Product</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1><c:out value="${product.name }"></c:out></h1>
		<h2>Categories</h2>
		<ul>
			<c:forEach items="${product.categories }" var="cat">
	        		<li><c:out value="${cat.name }"></c:out></li>
        	</c:forEach>
		</ul>
		<form:form action="/addCategory" method="POST" modelAttribute="catPro">
			<form:hidden path="product" value="${product.id }"/>
			<form:label path="category">Category:</form:label>
	        <form:select path="category">
	        	<c:forEach items="${allOtherCategoires }" var="cat">
	        		<form:option value="${cat.id}"><c:out value="${cat.name }"></c:out></form:option>
	        	</c:forEach>
	        </form:select>
   			<button type="submit">Add Category</button>
		</form:form>
	</body>
</html>