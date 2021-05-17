<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<div align="center">
	<h1>Add Product</h1>
		<form:form action="add-product" method="post" commandName="eProduct">
			<table border="0">
				<tr>
					<td> Product Name: </td>
					<td> <form:input path="name"/></td>
				</tr>
				
				<tr>
					<td> Product Price: </td>
					<td> <form:input path="price"/></td>
				</tr>
				
				<tr>
					<td> Submit </td>
					<td> <input type="submit" value="Add Product"/></td>
				</tr>
				
			</table>
		</form:form>
	</div>
</body>
</html>