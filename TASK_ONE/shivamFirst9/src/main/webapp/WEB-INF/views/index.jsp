<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<Table border="1" style="width: 100%">
		<tr>
			<th>Id</th>
			<th>name</th>
			<th>email</th>
			<th>age</th>
		</tr>
		<c:forEach var="is" items="${data}">
			<tr>
				<td>${is.id }</td>
				<td>${is.name}</td>
				<td>${is.email}</td>
				<td>${is.age}</td>
			</tr>
		</c:forEach>
	</Table>
</body>
</html>