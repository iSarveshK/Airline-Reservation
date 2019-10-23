<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='form.css'>

    <script src='main.js'></script>
</head>

<body>

    <div> 
        <div class="logo">
            <a> <img src="C:\Users\Hi\Desktop\Airline\logo.png" alt="logo" ></a>
              </div>
        
        <ul>
              <li class="name">
                <a href="user_login.jsp" class="dropbtn">Home</a>
              </li>
            </ul>
        </div>
    
    <div class="container">
        <div class="form">
          <form class="login-form" action="login.airline" method="POST">
            <input type="text" placeholder="Admin ID" required/>
            <input type="password" placeholder="Password" required/>
            <p class="message"><a href="admin_forgot.html">Forgot Password? </a></p> <br>
            <button type="submit" >Login</button>
          </form>
        </div>
      </div>
</body>
</html>