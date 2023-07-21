package com.marco.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletStampa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processa(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processa(request, response);
	}
       
	protected void processa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String nome = (String)request.getAttribute("nome");
		String cognome = (String)request.getAttribute("cognome");
		
		if(nome == null || cognome == null || nome.equals("") || cognome.equals("")) {
			response.sendRedirect("index.jsp");
		}else {
			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head><title>Inrcettare una richiesta di tipo POST</title></head>");
			out.println("<body>");
			out.println("<h1>Benvenuto: "+nome+" "+cognome+"</h1>");
			out.println("</body>");
			out.println("</html>");
			out.close();
			
		}
		
	}

}
