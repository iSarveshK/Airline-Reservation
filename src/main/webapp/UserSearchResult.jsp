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
<style>
table{
border-collapse: collapse;
border:1px black solid;
}
</style>
</head>
<body>

<table class="view" border="1px black solid">
<th>
<tr>
<th> Source</th>
<th> Destination </th>
<th> Departure Date</th>
<th> Arrival Date</th>
<th> Departure Time</th>
<th> Arrival Time</th>
<th> Available Economy Seats</th>
<th> Available Business Seats</th>

</tr>
</th>
<tbody>

<c:forEach items="${ flightScheduleInformation }" var="flightSchedule">
<tr>
<td>${ flightSchedule.source } </td> 
<td>${ flightSchedule.destination } </td>
<td>${ flightSchedule.departureDate } </td>
<td>${ flightSchedule.arrivalDate } </td>
<td>${ flightSchedule.departureTime } </td>
<td>${ flightSchedule.arrivalTime } </td>
<td>${ flightSchedule.economySeatsAvailable } </td>
<td>${ flightSchedule.businessSeatsAvailable } </td>
</c:forEach>
</tr>
</tbody>
</body>
</html>