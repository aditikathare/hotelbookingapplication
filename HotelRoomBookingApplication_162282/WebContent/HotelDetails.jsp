<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Room Booking Application</title>

<style>
table {
	text-align:center;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
</head>
<body>
<div>
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Rating</th>
				<th>Rate</th>
				<th>Available Rooms</th>
			</tr>
			<c:forEach  var="hotel" items="${hotels}">
				<tr>
					<td>${hotel.id}</td>
				<td><a href="bookingconfirmation">	${hotel.name}</a></td>
				
					<td>${hotel.rating}</td>
					<td>${hotel.rate}</td>
					<td>${hotel.availablerooms}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		
</div>



</body>
</html>