package dk.roskilde.it.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dk.roskilde.it.beans.UserBean;

@WebServlet("/login")
public class LoginServlst extends HttpServlet {

	private static final long serialVersionUID = -4587623677571227746L;
	
	public LoginServlst() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("userbean", null);
		request.setAttribute("message", "");
		request.setAttribute("username", "");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
		requestDispatcher.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("message", "");
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		if (username.equals("h") && password.equals("h")) {
			request.getSession().setAttribute("isloggedin", true);
			request.getSession().setAttribute("userbean", new UserBean(username));
			response.sendRedirect("/JSFWeb/index");
		} else {
			request.setAttribute("message", "wrong login");
			request.setAttribute("username", username);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
