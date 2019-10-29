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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" media="screen" href="userSearchFlightResult.css" />
    
      <base href="/airline-reservation/">
</head>
<body>

<body bgcolor="lightgrey">
    <div class="navbar">
        <div style="width:100%;height:inherit;float:inherit ;display: inline-block">
<div class="logo">
          <img src="<c:url value="/resources/images/logo.png"/>"/>
                      </div>
        
        </div>
    </div>


<div class="flight_details">
<div class="flight-card">
        <div class="column">
        <div class="card">Source</div>
        </div>

 <div class="column">
            <div class="card">Destination</div>
        </div>
        
         <div class="column">
          <div class="card">Dept Date</div>
        </div>
        
         <div class="column">
       <div class="card"> Arrival Date</div>
        </div>
        
        
         <div class="column">
            <div class="card">Dept Time</div>
        </div>
        
         <div class="column">
          <div class="card">Arrival Time</div>
        </div>
        
         <div class="column">
    <div class="card">Eco Seats</div>
          </div>
        
         <div class="column">
          <div class="card">Business Seats</div>
        </div>
</div>

</div>



<div class="flight_details">
<c:forEach items="${ searchFlightResults }" var="flightSchedule">
<div class="flight-card">
        <div class="column">
        <div class="card"><a href="passenger.jsp">${ flightSchedule.source }</a></div>
        </div>

 <div class="column">
            <div class="card">${ flightSchedule.destination } </div>
        </div>
        
         <div class="column">
          <div class="card">${ flightSchedule.departureDate } </div>
        </div>
        
         <div class="column">
       <div class="card">${ flightSchedule.arrivalDate } </div>
        </div>
        
        
         <div class="column">
            <div class="card">${ flightSchedule.departureTime } </div>
        </div>
        
         <div class="column">
          <div class="card">${ flightSchedule.arrivalTime } </div>
        </div>
        
         <div class="column">
    <div class="card">${ flightSchedule.economySeatsAvailable }</div>
          </div>
        
         <div class="column">
          <div class="card">${ flightSchedule.businessSeatsAvailable } </div>
        </div>
</div>
</c:forEach>
</div>


     
    <footer>
        <p>Copyright Reserved @Udaan.com</p>
    </footer>
</body>
</html>