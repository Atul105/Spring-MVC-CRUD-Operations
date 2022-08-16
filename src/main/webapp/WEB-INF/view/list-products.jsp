<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Products</title>
</head>
<style>
	table, th, td , tr{
		border: 2px solid red;
	}
</style>
<body>
	<jsp:include page="../../index.jsp"></jsp:include>

	<h1>List all products</h1>
	<table>
		<thead>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
				<th>Created Date</th>
			</tr>
		</thead>
		<tbody>
			<core:forEach var="product" items="${list}">
				<tr>
					<td>${product.getId()}</td>
					<td>${product.getName()}</td>
					<td>${product.getPrice()}</td>
					<td>${product.getCreatedAt()}</td>
				</tr>
			</core:forEach>

		</tbody>
	</table>

</body>
</html>
© Atul Magar