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
import Service.ServiceUser;

/**
 * Servlet implementation class ServletAccountInformation
 */
@WebServlet("/ServletAccountInformation")
public class ServletAccountInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAccountInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceUser serviceUser = new ServiceUser();
		if(serviceUser.checkLogin(request))
		{
			request.getRequestDispatcher("WEB-INF/jsp/JSPUserAccountInformation.jsp").forward(request, response);
		}
		else
		{
			response.sendRedirect("ServletLogin");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
