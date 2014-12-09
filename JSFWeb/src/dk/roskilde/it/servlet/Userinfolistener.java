package dk.roskilde.it.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dk.roskilde.it.impl.Acces;
import dk.roskilde.it.impl.MokItemManager;
import dk.roskilde.it.interfaces.AccesManager;
import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.Item;
import dk.roskilde.it.interfaces.ItemManager;
import dk.roskilde.it.interfaces.User;

/**
 * Application Lifecycle Listener implementation class Userinfolistener
 *
 */
@WebListener
public class Userinfolistener implements HttpSessionListener, ServletContextListener {

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
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		AccesManager am = new Acces();
		am.CreateUser(new User("bruger1", "bruger1", "b1"));
		am.CreateUser(new User("bruger2", "bruger2", "b2"));
		am.CreateUser(new User("bruger3", "bruger3", "b3"));
		am.addGroup(new Group("admin", ""));
		am.addGroup(new Group("superbruger", ""));
		arg0.getServletContext().setAttribute("accesmanager", am);
		ItemManager itembean = new MokItemManager();
		itembean.addItem(new Item("World of Warcraft", 300, false));
		itembean.addItem(new Item("Minecraft", 100, true));
		itembean.addItem(new Item("Diablo 3", 200, false));
		arg0.getServletContext().setAttribute("items", itembean);			
	}
	
}
