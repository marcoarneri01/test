package com.marco.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessioni")
public class Sessione extends HttpServlet {
	private static final long serialVersionUID = -7246785755877646488L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessione = request.getSession();
		Locale locale = request.getLocale();
		DateFormat italian = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.MEDIUM,
				locale);
		
		String intestazione;
		Integer accessi = (Integer)sessione.getAttribute("contatore");
		if (accessi == null) {
			accessi = 0;
			intestazione = "Benvenuto, nuovo utente";
			
		}else {
			intestazione = "Bentornato";
			accessi += 1;
		}
		
		sessione.setAttribute("contatore", accessi);
		
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n");
		out.println("<title>Elaborazione dati</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>"+intestazione+"</h1");
		out.println("<p> Id univoco di sessione:&nbsp; <%=session.getId() %></p>");
		out.println("Creazione sessione:&nbsp;"+ new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date(sessione.getCreationTime()))+"</p>");
		out.println("Numero accessi "+accessi);
		out.println("</body>");
		out.println("</html>");

		
	}

}
