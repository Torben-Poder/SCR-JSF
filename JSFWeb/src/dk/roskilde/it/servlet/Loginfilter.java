package dk.roskilde.it.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dk.roskilde.it.beans.UserBean;

/**
 * Servlet Filter implementation class Loginfilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/index", "/login" })
public class Loginfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Loginfilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		UserBean user = (UserBean) ((HttpServletRequest) request).getSession().getAttribute("userbean");
		if (user == null) {
			user = new UserBean();
	    	((HttpServletRequest) request).getSession().setAttribute("userbean", user);
		}
		if (!user.isIsloggedin()) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login");
			requestDispatcher.forward(request, response);
			return;
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
