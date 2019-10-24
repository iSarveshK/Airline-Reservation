<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method ="post" action="addschedule.airline">
<select name="flightNumber">
  <option value="1001">1001</option>
  <option value="1002">1002</option>
</select>

Add Departure Date: <input type="date" name="departureDate"/><br/>
Add Arrival Date: <input type="date" name="arrivalDate"/><br/>
Add Departure Time: <input type="text" name="departureTime"/><br/>
Add Arrival Time: <input type="text" name="arrivalTime"/><br/> 
Enter business seats: <input type ="text" name="economySeatsAvailable"/><br/>
Enter economy seats: <input type="text" name="businessSeatsAvailable"/><br/>
Status: <input name="status"/><br/>
Source: <input name="source"/><br/>
Destination: <input name="destination"/><br/>
<button type="submit">Submit</button>
<a href="viewschedule">View Schedule</a>
</form>

</body>
</html>