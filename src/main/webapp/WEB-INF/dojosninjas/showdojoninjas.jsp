<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container text-center">
		<h1 class="display-4"><c:out value="${dojo.name }"/> Location Ninjas</h1>
	</div>
	
	<div class="container">
		<table class="table table striped table-hover table-dark">
		  
		  <thead>
		    <tr>
		      <th scope="col">First Name</th>
		      <th scope="col">Last Name</th>
		      <th scope="col">Age</th>		    
		    </tr>
		  </thead>
		  
		  <tbody>		  	
		  	<c:forEach items="${dojo.ninjas}" var="ninja" >
			    <tr>			      
			      <td> ${ninja.firstName} </td>
			      <td> ${ninja.lastName} </td>
			      <td> ${ninja.age} </td>
			    </tr>
			</c:forEach>		  
		  </tbody>
		  		   
		</table>		
	</div>

</body>
</html>