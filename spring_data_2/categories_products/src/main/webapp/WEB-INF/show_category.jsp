<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show Category</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1><c:out value="${category.name }"></c:out></h1>
		<h2>Products</h2>
		<ul>
			<c:forEach items="${category.products }" var="pro">
	        		<li><c:out value="${pro.name }"></c:out></li>
        	</c:forEach>
		</ul>
		<form:form action="/addProduct" method="POST" modelAttribute="catPro">
			<form:hidden path="Category" value="${category.id }"/>
			<form:label path="product">Product:</form:label>
	        <form:select path="product">
	        	<c:forEach items="${allOtherProducts }" var="pro">
	        		<form:option value="${pro.id}"><c:out value="${pro.name }"></c:out></form:option>
	        	</c:forEach>
	        </form:select>
   			<button type="submit">Add Product</button>
		</form:form>
	</body>
</html>