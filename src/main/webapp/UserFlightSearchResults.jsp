<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${ searchFlightResults }" var="flightSchedules">
${ flightSchedules.source }  
${ flightSchedules.destination } 
${ flightSchedules.departureDate } 
${ flightSchedules.arrivalDate } 
${ flightSchedules.departureTime } 
${ flightSchedules.arrivalTime } 
${ flightSchedules.economySeatsAvailable } 
${ flightSchedules.businessSeatsAvailable } 
</c:forEach>

</body>
</html>