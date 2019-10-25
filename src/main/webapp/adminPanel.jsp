<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="form.css" />
    
    <script src="main.js"></script>
   <style>
   .panel{
   float:"center";
   
   }
   .textbtn{
box-shadow:none;
border:none;
background-color:whitesmoke;
color:black;
padding: 6px 12px;
display:block;
}
   
   </style>
 

</head>
<body>
        <div> 
                <div class="logo">
                    <a> <img src="C:\Users\Hi\Desktop\Airline\logo.png" alt="logo" ></a>
                      </div>
                
                <ul>
                      <li class="name">
                        <a class="dropbtn">HI USER</a>
                        <div class="dropdown-content">
                                <a href="admin_login.html">Logout</a>
                              </div>
                      </li>
                    </ul>
                </div>
                    

        <!-- Side navigation -->
<div class="sidenav">
  <br/>
  <br/>
  <div>
        <form action="viewflightInfo.airline">
       <input class="textbtn" type="submit" value="View Flight Information"></input>
        </form>
        
           <form action="viewflightSchedule.airline">
       <input class="textbtn" type="submit" value="View Flight Schedule"></input>
        </form>
        
           <form action="AddFlight.jsp">
       <input class="textbtn" type="submit" value="Add Flight"></input>
        </form>
        
           <form action="viewflightInfo.airline">
       <input class="textbtn" type="submit" value="Delete Flight"></input>
        </form>
        </div>
</div>
    
 
 <div class="panel">
  <h1>WELCOME ADMIN</h1>
  <p> Click here to view flight Information </p>
  <form action>
  <button type="submit" >Continue...</button>
 </form>
 
 
  
 </div>  
</body>
</html>