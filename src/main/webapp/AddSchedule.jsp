<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix = "spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='UserLogin.css'>
    
    <script src='main.js'></script>
    <base href="/airline-reservation/">
</head>


<body bgcolor="lightgrey" style="overflow:scroll;">
    <div class="navbar">
        <div style="width:100%;height:inherit;float:inherit ;display: inline-block">
<div class="logo">
          <img src="<c:url value="/resources/images/logo.png"/>"/>
                      </div>
              <div class="contact">
                  <a href="contactUs.html" >Contact Us</a>
              </div>
        
        </div>
    </div>
    
    <div style="margin: 0 auto;">
<form method ="post" action="addschedule.airline">
<select name="flightNumber">
  <c:forEach items="${ flightnumbers }" var="flight">

<option value =	${ flight.flightNumber } > ${ flight.flightNumber } </option>


</c:forEach>
</select>
</form>

</div>
  <div class="container">
        <div class="form">
        <form action="adminPanel.jsp" method="post">
Add Departure Date: 
<input type="date" name="departureDate"/><br/>

Add Arrival Date: 
<input type="date" name="arrivalDate"/><br/>
Add Departure Time:
 <input type="text" name="departureTime"/><br/>
Add Arrival Time:
 <input type="text" name="arrivalTime"/><br/> 
Enter business seats: <input type ="text" name="economySeatsAvailable"/><br/>
Enter economy seats: <input type="text" name="businessSeatsAvailable"/><br/>
Status: <input name="status"/><br/>
Source: <input name="source"/><br/>
Destination: <input name="destination"/><br/>
<button type="submit">Submit</button>
<a href="viewschedule">View Schedule</a>
</form>
</div>
</div>



</body>
</html>