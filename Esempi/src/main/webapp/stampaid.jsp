<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listener di contesto</title>
</head>
<body>
<%
	Integer ID = (Integer)session.getAttribute("ID");
	if(ID == null){
%>

	<p>Non hai nessun ID associato</p>
	<a href="contextlistener.jsp">Ottieni ID</a>
	
<%
	} else {
%>

Hai registrato il tuo ID: <%= ID %>

<%
	}
%>
	
</body>
</html>