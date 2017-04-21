<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple CRUD</title>
</head>
<body>
	<h2>Add Student</h2>
	<form method="POST" action="StudentServlet">
		<label for="name">Name:</label>
		<input type="text" name="name" />
		<button type="submit">add</button>
	</form>
	<c:forEach items="${name}" var="item">
	<form method="POST" action="StudentServlet">
		<br>${item.key} ${item.value}<br>
		<input type="hidden" name="delKey" value=${item.key} />
		<button>remove</button>
	</form>
	</c:forEach>
</body>
</html>