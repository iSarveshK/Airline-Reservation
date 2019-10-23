<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="RegisterForm.css">
<link rel="stylesheet" type="text/css" href="main.css">
<link rel="stylesheet" type="text/css" href="form.css">
<script type="text/javascript" src="validation.js">
</script>
</head>
<body>


    <div> 
        <div class="logo">
            <a> <img src="C:\Users\Hi\Desktop\Airline\logo.png" alt="logo" ></a>
              </div>
        
        <ul>
              <li class="name">
                <a href="UserLogin.jsp" class="dropbtn">Home</a>
                <a href="Contact.html">Contact Us</a>
              </li>
            </ul>
        </div>
        
<div class="container">
        <div class="form">
          <form class="login-form" action="register.airline" method="post" onsubmit="return validateRegistrationForm()" name="registrationForm">
            <input type="text" name="firstName" placeholder="First Name" required/>
            <input type="text" name="lastName" placeholder="Last Name" required/>
            <input type="email" name="email" placeholder="E-MAIL" required/>
            <input type="password" name="fpassword" placeholder="Password" required/>
            <input type="password" name="spassword" placeholder="Retype Pasword" required/>
            <input type="date" name="dateOfBirth" placeholder="dob" required/><br/><br/>
            <div class="custom-select" style="width:200px;">
 <select name="securityQuestionUser"><br/><br/>
  <option value="11">----Select a Question-----</option>
  <option value="1" >Who is your best friend?</option>
  <option value="2">What is your pet's name?</option>
  <option value="3">What is your school's name </option>
</select>
</div>
            <input type="text" name="securityAnswerUser" placeholder="type answer" required/>
            <input type="tel"  name="phone"  placeholder="Phone" required/>
           <button type="submit"> Register</button></a>
          </form>
        </div>
      </div>
</body>
</html>