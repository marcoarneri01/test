<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Richiesta</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/servlet" method="post">
	<input type="text" name="nome"><br>
	<input type="text" name="cognome"><br>
	<input type="submit" name="invia">
</form>

</body>
</html>