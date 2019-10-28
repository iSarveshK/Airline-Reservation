<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <link rel="stylesheet" type="text/css" media="screen" href="dashboard_user.css" />
    <script src="main.js"></script>
    <style>
   .head {
   
   }
    </style>
</head>
<body>
    <div class="contentWrap">
        <div id="content">
          <div class="header">
            <h2>
         USER DASHBOARD
        </h2>
          </div>
          <div class="head">
          <h1>Welocme</h1><br><hr>
         <h3>${userLoggedIn.firstName} &nbsp; ${userLoggedIn.lastName}</h3><br/>
         Email-Id:
         <h2>${userLoggedIn.email}</h2>
         Phone :  
          <h2>${userLoggedIn.phone}</h2> 
          </div>
        </div>
        
      </div>
      <div class="sidebarWrap">
        <div id="sidebar">
          <ul id="side-nav" class="commonNav">           
            <li><a href="UserLogin.jsp">Sign out</a></li>
            <li><a href="/user/dashboard/edit/">Hi ${userLoggedIn.firstName}</a></li>
           
          </ul>
          <div class="segment">
          <form action="UserCitySelect.airline" method="POST">
          <button type="submit">Search Flight</button>
          </form>
          </div>
          <div class="segment">
 		  <a href=""> View Previous bookings </a>
          </div>
          
           <div class="segment">
 		  <a href=""> Contact Us </a>
          </div>
        </div>
      </div>


</body>
</html>