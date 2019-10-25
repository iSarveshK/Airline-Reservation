<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Search Flight page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="UserSearchFlight.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />

   
</head>

<body>
        <div> 
                <div class="logo">
                    <a> <img src="C:\Users\Hi\Desktop\Airline\logo.png" alt="logo" ></a>
                      </div>
                <div>
                <ul>
                      <li class="name">
                        <a href="" class="dropbtn">Hi ${username}</a>
                        <div class="dropdown-content">
                          <a href="UserLogin.jsp">Logout</a>
                        </div>
                      </li>
                    </ul>
                    </div>
                    
                    <div>
                    <ul>
                    <li class="contact">
                    <a href="contactUs.jsp">Contact Us</a>
                    </ul>
                    
                    </div>
                    
                </div>
            
    <div class="form" >
    <form  method ="GET" action="">
        <div style="float: left;width: 100%;height: 50px;">
           <div  style="float: left;width: 50%;"> 
               <input type="radio" name="journey" onclick="hideFunction()" >One Way
            </div>
            <div  style="float: left;width: 50%;">
                <input type="radio" name="journey">Round Trip
            </div>
        </div>
        <div>
            <input type="text" name="from" placeholder="From">
            <input type="text" name="to" placeholder="To">
        </div>
        <div>
            <div>
                    <label>Departure Date</label>
                <input type="date" name="depart">
                </div>
                <div id="returndate">
                <label >Return Date</label>
                <input type="date" name="return" >
            </div>
            <div style="float: left;width: 100%;height: 50px;">
                <div style="float: left;width: 30%;">
                    Adult
                    <select>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                    </select>
                </div>
                <div style="float: left;width: 30%;">
                    Children
                    <select>
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                    </select>
                </div>
                <div style="float: left;width: 30%;">
                    Infant
                    <select>
                        <option value="0">0</option>
                        <option value="1">1</option>
                    </select>
                </div>
            </div>
        </div>
        <button type="submit">Search Flight</button>
    </form>
    </div>
</body>
</html>