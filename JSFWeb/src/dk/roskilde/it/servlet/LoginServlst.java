package dk.roskilde.it.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dk.roskilde.it.interfaces.AccesManager;
import dk.roskilde.it.interfaces.User;

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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.isEmpty() || password.isEmpty()) {
			request.setAttribute("message", "udfyld felterne");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
			requestDispatcher.forward(request, response);
		} else {
			AccesManager am = (AccesManager) this.getServletContext().getAttribute("accesmanager");
			User user = am.getUser(username);
			if (user == null) {
				request.setAttribute("message", "forkert brugernavn");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
				requestDispatcher.forward(request, response);
			} else {
				if (!user.getPassword().equals(password)) {
					request.setAttribute("message", "forkert password");
					request.getSession().setAttribute("userbean", user);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
					requestDispatcher.forward(request, response);
				} else {
					request.getSession().setAttribute("userbean", user);
					response.sendRedirect("/JSFWeb/index");
				}
			}
		}
		
	}
}
