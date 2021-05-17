<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>
	<div align="center">
	<h1>Update Product</h1>
	<h2> Select option to Update product: </h2>
		<form:form action="update-product" method="put" commandName="uproduct">
		<table border="0">
			<tr>
				<td> Product Name: </td>
				<td> <form:input path="name"/>
			</tr>
			<tr>
				<td> Product Price: </td>
				<td> <form:input path="price"/>
			</tr>
			<tr>
				<td> Submit </td>
				<td> <input type="submit" value="Update Product">
			</tr>
				
		
		</table>
		</form:form>
	</div>
</body>
</html>