
<%
String username = (String) session.getAttribute("username");
if (username != null) {
	session.invalidate();

%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hai appena effettuato il logout</h2>
	<p>
		per rientrare: <a href="form.jsp">Login</a>
	</p>
</body>
</html>

<% 
} else {
response.sendRedirect("form.jsp");
}
%>