package dk.roskilde.it.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dk.roskilde.it.beans.UserBean;

/**
 * Application Lifecycle Listener implementation class Userinfolistener
 *
 */
@WebListener
public class Userinfolistener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public Userinfolistener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	arg0.getSession().setAttribute("userbean", new UserBean());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
