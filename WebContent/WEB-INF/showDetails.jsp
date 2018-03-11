<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Details for ${solution.id}</title>
</head>
<body>
	<%@include file="/WEB-INF/fragments/header.jspf"%>
	<div style="text-align: center">Details for result ${solution.id}</div>
	<div style="text-align: center">Description : ${solution.description}</div>
	<div style="text-align: center">Date of creation: ${solution.created}</div>
	<div style="text-align: center">Date of update: ${solution.updated}</div>
	<div style="text-align: center">User ID: ${solution.user_id}</div>
	<div style="text-align: center">Exercise ID: ${solution.exercise_id}</div>
</body>
</html>