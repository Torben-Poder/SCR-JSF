package dk.roskilde.it.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dk.roskilde.it.beans.Item;
import dk.roskilde.it.beans.ItemBean;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public IndexServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemBean itembean = (ItemBean) request.getSession().getAttribute("items");
		if (itembean == null) {
			itembean = new ItemBean(new ArrayList<>(3));
			
		}
		itembean.add(new Item("World of Warcraft", 300, false));
		itembean.add(new Item("Minecraft", 100, true));
		itembean.add(new Item("Diablo 3", 200, false));
		request.getSession().setAttribute("items", itembean);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/index.jsp");
		requestDispatcher.forward(request, response);
	}

}
