package Service;

import javax.servlet.http.HttpServletRequest;

import Servlet.ServletHome;
import persistence.RepoUser;
import domain.User;

public class ServiceUser {
//	public boolean login(String username, String password)
//	{
//		RepoUser repoUser = new RepoUser();
//		User foundUser = repoUser.findByUsername(username);
//		if(foundUser != null)
//		{
//			if(foundUser.getPassword().equals(password))
//			{
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean checkLogin(HttpServletRequest httpServletRequest)
	{
		String userName = (String) httpServletRequest.getSession().getAttribute("user_name");
		String userToken = (String) httpServletRequest.getSession().getAttribute("user_token");

		if(userName != null && userToken != null)
		{
			return true;
		}
		return false;
	}
}
