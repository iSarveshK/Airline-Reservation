<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method ="post" action="addschedule.airline">

<!-- 
Enter Flight number: <input name="flightNumber"/><br/>
Enter source: <input name="source"/><br/>
Enter destination: <input name="destination"/><br/>		-->
 
<select name="flightName">
<option>F001</option>
<option>F002</option>
</select>
Add Departure Date: <input type="date" name="departureDate"/><br/>
Add Arrival Date: <input type="date" name="arrivalDate"/><br/>
Add Departure Time: <input type="time" name="departureTime"/><br/>
Add Arrival Time: <input type="time" name="arrivalTime"/><br/> 
Enter business seats: <input type ="text" name="economySeatsAvailable"/><br/>
Enter economy seats: <input type="text" name="businessSeatsAvailable"/><br/>
Status: <input name="status"/><br/>
<button type="submit">Submit</button>
</form>
</body>
</html>