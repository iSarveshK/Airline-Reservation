<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="user-login.css" media='screen' type="text/css">
 <link rel='stylesheet' type='text/css' media='screen' href='form.css'>
 <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
  <script src='main.js'></script>
</head>
  <div class="navbar">
        <div style="width:100%;height:inherit;float:inherit ;display: inline-block">

        <div class="logo">
            <a> <img src="image" alt="logo" ></a>
              </div>
        
        </div>
    </div>

    <div class="login-page">
        <div class="form">
          <form class="login-form" action="user-login.airline" method="post">
            <input type="email" name="email" placeholder="User ID" required/>
            <input type="password" name="password" placeholder="Password" required/>
            <p class="message"><a href="#">Forgot Password? </a></p> <br>
            <button type="submit">Login</button>
            <p class="message">Not registered? <a href="UserRegistration.jsp">Create an account</a></p>
            <p class="message">Are You Admin? <a href="login.jsp">Click here to login as admin</a></p>
          </form>
        </div>
      </div>
</body>
</html>