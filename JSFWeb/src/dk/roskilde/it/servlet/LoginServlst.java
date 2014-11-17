package dk.roskilde.it.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlst extends HttpServlet {

	private static final long serialVersionUID = -4587623677571227746L;
	
	public LoginServlst() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
		requestDispatcher.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
		requestDispatcher.forward(request, response);
	}
}
