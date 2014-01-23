package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.Database;
import Service.ServiceRequest;
import Service.ServiceRest;

/**
 * Servlet implementation class ServletUserLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceRequest ru = new ServiceRequest();
		if(ru.hasParameters(request))
		{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			ServiceRest serviceRest = new ServiceRest();
			String token = serviceRest.getTokenByUserCredentials(username, password);
			if(token != null)
			{
				request.getSession().setAttribute("user_name", username);
				request.getSession().setAttribute("user_token", token);
				
				request.getRequestDispatcher("WEB-INF/jsp/JSPUserHome.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("loginInfo", "Innvalid username or password!");
				request.getRequestDispatcher("WEB-INF/jsp/JSPUserLogin.jsp").forward(request, response);
			}
		}
		else
		{
			request.getRequestDispatcher("WEB-INF/jsp/JSPUserLogin.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
