<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method ="post" action="addschedule.airline">
<sql:setDataSource var = "myEmf" driver = "oracle.jdbc.driver.OracleDriver"
         url = "jdbc:oracle:thin:@192.168.100.237:1521:xe"
         user = "airline_p"  password = "abcd1234"/>
 <sql:query dataSource = "${myEmf}" var = "result">
            SELECT FLIGHT_NUMBER from TBL_FLIGHT_INFO;
         </sql:query>
<c:forEach var = "row" items = "${result.rows}">
<select name="flightNumber">
  <option><c:out value = "${row.flightNumber}"/></option>
</select>
</c:forEach>
Add Departure Date: <input type="date" name="departureDate"/><br/>
Add Arrival Date: <input type="date" name="arrivalDate"/><br/>
Add Departure Time: <input type="time" name="departureTime"/><br/>
Add Arrival Time: <input type="time" name="arrivalTime"/><br/> 
Enter business seats: <input type ="text" name="economySeatsAvailable"/><br/>
Enter economy seats: <input type="text" name="businessSeatsAvailable"/><br/>
Status: <input name="status"/><br/>
Source: <input name="source"/><br/>
Destination: <input name="destination"/><br/>
<button type="submit">Submit</button>
</form>
</body>
</html>