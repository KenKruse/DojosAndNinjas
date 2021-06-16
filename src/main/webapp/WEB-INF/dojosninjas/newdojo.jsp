<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<h1 class="display-6">New Dojo</h1>
		
	<form:form action="/dojos/new" method="POST" modelAttribute="dojoObject">

		<p><form:errors cssClass="alert alert-danger" path="name" /></p>
		<p>
			<form:label cssClass="h4 font-weight-normal" path="name">Name:</form:label>
			<form:input cssClass="form-control col-4" placeholder="enter dojo location" path="name"/>
		</p>		
		
		<button type="submit" class="btn btn-primary">Create</button>
	</form:form>

</div>	
</body>
</html>