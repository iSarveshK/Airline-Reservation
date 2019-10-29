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

<body bgcolor="lightgrey">
    <div class="navbar">
        <div style="width:100%;height:inherit;float:inherit ;display: inline-block">
<div class="logo">
          <img src="<c:url value="/resources/images/logo.png"/>"/>
                      </div>
        

              <div class="Udaan" style="width: 35%;margin: 30px 521px;">
                  <h1> Welcome to Udaan Airlines</h1>
              </div>
              <div class="contact">
                  <a href="contactUs.html" >Contact Us</a>
              </div>
        
        </div>
    </div>
   
<div class="container">
    
<form class="form" method="post" action="adminpanel.airline" >
<table>
<tr>
<td><label>Flight Number</label></td>
<td>
<input type= "number" name="flightNumber"  /><br/><br/>
</td>
</tr>
<tr>
<td><label>Flight Name</label></td>
<td>
<input type= "text" name="flightName"><br/><br/>
</td>
</tr>

<!--
<tr>
<td>
<label>Route Id</label></td>
<td><input type= "number" name="route_id" value="" ></input><br/><br/></td>
</tr>
<tr>
-->
    <td><label>Total Business Class Seats</label></td>
    <td><input type= "number" name="businessSeats"></input><br/><br/>
    </td>
</tr>
<tr>
        <td><label>Totatl Economy class seats</label></td>
        <td><input type= "number" name="economySeats"></input><br/><br/>
        </td>
</tr>


</table>

<button type = "submit" >Continue TO ADD SCHEDULE..</button><br/><br/>

</form>
</div>

</body>
</html>