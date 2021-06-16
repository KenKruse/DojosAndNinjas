<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<h1 class="display-6">New Ninja</h1>
		
	<form:form action="/ninjas/new" method="post" modelAttribute="ninjaObject">
		<p>
	        <form:label cssClass="h4 font-weight-normal" path="dojo">Dojo:</form:label>
	        <form:select cssClass="custom-select col-4" path="dojo">
				<c:forEach items="${dojos}" var="d">
					<form:option value="${d}"><c:out value="${d.name}"/></form:option>
				</c:forEach>
			</form:select>
	    </p>
	    	  
	    <p><form:errors cssClass="alert alert-danger" path="firstName"/></p>
	    <p>
	        <form:label cssClass="h4 font-weight-normal" path="firstName">First Name:</form:label>
	        <form:input cssClass="form-control col-4" path="firstName"/>
	    </p>
	    
	    <p><form:errors cssClass="alert alert-danger" path="lastName"/></p>
	    <p>
	        <form:label cssClass="h4 font-weight-normal" path="lastName">Last Name:</form:label>
	        <form:input cssClass="form-control col-4" path="lastName"/>
	    </p>
	    
	    <p><form:errors cssClass="alert alert-danger" path="age"/></p>
	    <p>
	        <form:label cssClass="h4 font-weight-normal" path="age">Age:</form:label>
	        <form:input cssClass="form-control col-4" path="age"/>
	    </p>
	    
	    <button type="submit" class="btn btn-primary">Create</button>	 
	    
	</form:form>
</div>	


</body>
</html>