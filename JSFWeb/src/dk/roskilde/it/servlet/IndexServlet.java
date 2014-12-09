package dk.roskilde.it.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dk.roskilde.it.impl.MokItemManager;
import dk.roskilde.it.interfaces.Item;
import dk.roskilde.it.interfaces.ItemManager;

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
		ItemManager im = (ItemManager) getServletContext().getAttribute("items");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/index.jsp");
		requestDispatcher.forward(request, response);
	}

}
