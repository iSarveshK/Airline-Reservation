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
<style>

.container{
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
  height: 100%;
  
}

body {
    background-image: url("p2.jpg");
    height: 100%;
    background-repeat:no-repeat; 
    background-size: cover;
}

.container{
  float: right;
  padding-right: 30px;
}
</style>
<body>
    <div class="navbar">
        <div style="width:100%;height:inherit;float:inherit ;display: inline-block">

        <div class="logo">
            <a> <img src="C:\Users\Hi\Desktop\Airline\logo.png" alt="logo" ></a>
              </div>
        
        </div>
    </div>

    <div class="container" >
        <div class="form"> 
          <form class="login-form" action="user-login.airline" method="POST">
            <input type="email" name="email"placeholder="User ID" required/>
            <input type="password" name="password" placeholder="Password" required/>
            <p class="message"><a href="#">Forgot Password? </a></p> <br>
            <button type="submit" >Login</button>
            <p class="message">Not registered? <a href="UserRegistration.jsp">Create an account</a></p>
            <p class="message">Are You Admin? <a href="admin_login.jsp">Click here to login as admin</a></p>
          </form>
        </div>
      </div>
</body>
</html>