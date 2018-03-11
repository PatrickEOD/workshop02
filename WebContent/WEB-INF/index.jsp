<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index Page</title>
</head>
<body>
	<%@include file="/WEB-INF/fragments/header.jspf"%>
	<h3>Last added results</h3>
	<table>
		<tr>
			<th>Description<th>
			<th>Date of create</th>
			<th>Date of update</th>
			<th>User ID</th>
			<th>Exercise ID</th>
			<th>Actions</th>
		</tr>
	<c:forEach items="${solutions}" var="solution">
		<tr>
			<td>${solution.description}</td>
			<td>${solution.created}</td>
			<td>${solution.updated}</td>
			<td>${solution.user_id}</td>
			<td>${solution.exercise_id}</td>
			<td><a href="ResultDetails?id=${solution.id}">Show Details</a>
		</tr>
	</c:forEach>
	</table>
	<%@include file="/WEB-INF/fragments/footer.jspf" %>
</body>
</html>