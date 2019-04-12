<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Details</title>
</head>
<body>
<h1>Hotel</h1>
<form action="/addhotel" method="post">
Id:<input type="text" name="id" />
Name:<input type="text" name="name" />
Address:<input type="text" name="address" />
Mobile:<input type="text" name="mobile" />
Email:<input type="email" name="email"> 
</form>
</body>
</html>