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
        

              <div class="udaan" style="width: 35%;margin: 30px 521px;">
                  <h1> Welcome to Udaan Airlines</h1>
              </div>
              <div class="contact">
                  <a href="contactUs.html" >Contact Us</a>
              </div>
        
        </div>
    </div>
   
    <div class="container" >
        <div class="form" > 
        ${error }
          <form class="login-form" action="user-login.airline" method="POST">
            <input type="email" name="email"placeholder="User ID" required/>
            <input type="password" name="password" placeholder="Password" required/>
            
            <button type="submit" >Login</button>
            <p class="message">Not registered? <a href="UserRegistration.jsp">Create an account</a></p>
            <p class="message">Are You Admin? <a href="AdminLogin.jsp">Click here to login as admin</a></p>
          </form>
        </div>
      </div>
      
      
    <footer>
        <p>Copyright Reserved @Udaan.com</p>
    </footer>
</body>
</html>