<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddFlight</title>
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
<link rel="stylesheet" type="text/css" media="screen" href="form.css" />

</head>
<body>
    
    <div> 
        <ul>
              <li class="name">
                <a href="name" class="dropbtn">Hi Name</a>
                <div class="dropdown-content">
                  <a href="admin_login.html">Logout</a>
                </div>
              </li>
            </ul>
          </div> 

  
<div class="container">
    
<form class="form" method="post" action="adminpanel.airline">
<table>
<tr>
<td><label>Flight Number</label></td>
<td>
<input type= "text" name="flightNumber"  /><br/><br/>
</td>
</tr>
<tr>
<td><label>Flight Name</label></td>
<td>
<input type= "text" name="flightName"><br/><br/>
</td>
</tr>

<!--
<tr>
<td>
<label>Route Id</label></td>
<td><input type= "number" name="route_id" value="" ></input><br/><br/></td>
</tr>
<tr>
-->
    <td><label>Total Business Class Seats</label></td>
    <td><input type= "number" name="businessSeats"></input><br/><br/>
    </td>
</tr>
<tr>
        <td><label>Totatl Economy class seats</label></td>
        <td><input type= "number" name="economySeats"></input><br/><br/>
        </td>
</tr>


</table>

<button type = "submit" >Continue TO ADD SCHEDULE..</button><br/><br/>

</form>
</div>

</body>
</html>