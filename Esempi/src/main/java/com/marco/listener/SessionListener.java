package com.marco.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("creata sessione");
    }


    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("distrutta sessione");
    }
	
}
