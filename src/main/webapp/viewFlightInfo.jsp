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
     <base href="/airline-reservation/">
     <link rel="stylesheet" type="text/css" media="screen" href="viewFlightInfo.css" />
<title>Insert title here</title>
</head>

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
        <div class="card">Flight Number</div>
        </div>

 <div class="column">
            <div class="card">Flight Name</div>
        </div>
        
         <div class="column">
          <div class="card">Total Business Seats</div>
        </div>
        
         <div class="column">
       <div class="card"> Total Economy Seats</div>
        </div>
        

</div>

<div class="flight_details">
<c:forEach items="${ flightInformation }" var="flight">
<div class="flight-card">
        <div class="column">
        <div class="card">${ flight.flightNumber } </div>
        </div>

 <div class="column">
            <div class="card">${ flight.flightName } </div>
        </div>
        
         <div class="column">
          <div class="card">${ flight.businessSeats} </div>
        </div>
        
         <div class="column">
       <div class="card">${ flight.economySeats } </div>
        </div>
</div>
</c:forEach>
</div>   
    <footer>
        <p>Copyright Reserved @Udaan.com</p>
    </footer>
</body>
</html>







