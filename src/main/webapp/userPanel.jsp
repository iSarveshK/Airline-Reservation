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
</head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>User Dashboard | Udaan </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="userPanel.css" />
    <script src="main.js"></script>
        <base href="/airline-reservation/">
  
</head>
<body>
  
    <div class="contentWrap">
      <div class="icon">
        <img src="icon.jpg" alt="icon">
      </div>
        <div id="content">
          
          <div class="head">
          <h1>Welocme</h1><hr>
         <h3>${userLoggedIn.firstName} &nbsp; ${userLoggedIn.lastName}</h3><br/><hr>
         Email-Id:
         <h2>${userLoggedIn.email}</h2>
         Phone : 
          <h2>${userLoggedIn.phone}</h2> 
          </div>
        </div>
        
      </div>
      <div class="sidebarWrap">
        <div id="sidebar">
           <div class="form">
          <form action="user-logout.airline" method="POST">
          <button class="textbtn"  type="submit">Sign Out</button>
          </form>
          </div>
          
          <div class="form">
          <form action="UserCitySelect.airline" method="POST">
          <button class="textbtn"  type="submit">Book Flight</button>
          </form>
          </div>
         
           <div class="segment">
             <div id="contactUs">
       <a href="contactUs.html"> Contact Us </a>
      </div>
          </div>
        </div>
      </div>
  <footer>
        <p>Copyright Reserved @Udaan.com</p>
    </footer>

</body>
</html>