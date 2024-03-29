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
    <link rel="stylesheet" type="text/css" media="screen" href="adminPanel.css" />
    <script src="main.js"></script>
         <base href="/airline-reservation/">
</head>
<body>
    <div class="body">
    <div class="contentWrap">
        <div id="content">
          
          <div class="head">
          <h1>Welocme</h1><br><hr>
         <h3>${userLoggedIn.firstName} &nbsp; ${userLoggedIn.lastName}</h3><br/><hr>
         </div>
        </div>
        
      </div>
      <div class="sidebarWrap">
            
       <div class="icon">
            <img src="<c:url value="/resources/images/download.jpg"/>"/>
                        </div>
                        
            <div class="form">
                  <form action="viewflightInfo.airline" method="get">
                 <input class="textbtn" type="submit" value="View Flight Information"></input>
                  </form>
                  
                     <form action="viewflightSchedule.airline" method="get">
                 <input class="textbtn" type="submit" value="View Flight Schedule"></input>
                  </form>
                  
                     <form action="AddFlight.jsp" method="GET">
                 <input class="textbtn" type="submit" value="Add Flight"></input>
                  </form>
                  
                  
                  </div>
                </div>
            </div>
</body>
</html>