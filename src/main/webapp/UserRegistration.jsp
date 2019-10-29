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
        <div style="width:100%;height:20px;float:inherit ;display: inline-block">
<div class="logo">
          <img src="<c:url value="/resources/images/logo.png"/>"/>
                      </div>
        </div>
    </div>
   
<div class="container">
        <div class="form">
          <form class="login-form" action="register.airline" method="post" onsubmit="return validateRegistrationForm()" name="registrationForm">
            <input type="text" name="firstName" placeholder="First Name" required/>
            <input type="text" name="lastName" placeholder="Last Name" required/>
            <input type="email" name="email" placeholder="E-MAIL" required/>
            <input type="password" name="fpassword" placeholder="Password" required/>
           
            <input type="date" name="dateOfBirth" placeholder="dob" required/><br/><br/>
            <div class="custom-select" style="width:200px;">
 
            <input type="tel"  name="phone"  placeholder="Phone" required/>
           <button type="submit"> Register</button></a>
          </form>
        </div>
      </div>
</body>
</html>