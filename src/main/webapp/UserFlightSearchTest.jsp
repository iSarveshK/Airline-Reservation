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
</head>
<body>
<form method ="GET" action="viewFlightResults.airline">



                    <div class="city">
                    <label>From :</label>
                       <select name="source">
                              <c:forEach  var="cities" items="${cityList}">
                                <option value =	"${ cities.cityName }"> ${ cities.cityName } </option>
                              </c:forEach>
                        </select>
                   </div>

                      <div class="cit" >
                          <label>To:</label>
                          <select name="destination">
                          <c:forEach  var="cities" items=	"${cityList}">
                                 <option value="${ cities.cityName }" > ${ cities.cityName } </option>

                          </c:forEach>
                          </select>
                     </div> 
                 
departure dates: <input type ="date" name="departureDate"/><br/>

<button type="submit">Submit</button>
</form>
</body>
</html>