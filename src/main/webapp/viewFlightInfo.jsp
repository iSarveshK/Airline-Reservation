<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.finfo{
float:center;
}
table{
border-collapse: collapse;
border:1px black solid;
}
th{
height:30px
 padding: 15px;
  text-align:center;
}
</style>
</head>
<body>

<table class="finfo" >
<th>
<tr>
<th> Flight Number </th>
<th> Flight Name</th>
<th> Total Business seats</th>
<th> Total Economy seats</th>
</tr>
</th>
<tbody>
<c:forEach items="${ flightInformation }" var="flight">
<tr>
<td>${ flight.flightNumber }  </td>
<td>${ flight.flightName } </td>
<td>${ flight.businessSeats} </td>
<td>${ flight.economySeats } </td>
</tr>

</c:forEach>
</tbody>
</table>
</body>
</html>






