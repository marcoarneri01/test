<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listener di sessione</title>
</head>
<body>

	<span style="float:right">
		<a href="destroysession.jsp">Logout</a>
	</span>
	
	<form action="loaduser.jsp" method="post">
		<h1>Inserire il nome</h1>
		<input type="text" name="utente"><br>
		<input type="submit" value="aggiungi">
	</form>
	
	<%
		ArrayList<?> utenti = (ArrayList<?>)session.getAttribute("utenti");
		for (int i = 0; utenti != null && i < utenti.size(); i++){
			out.println("<br>" + utenti.get(i));
		}
	%>

</body>
</html>