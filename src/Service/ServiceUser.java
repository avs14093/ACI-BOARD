package Service;

import persistence.RepoUser;
import domain.User;

public class ServiceUser {
	public boolean login(String username, String password)
	{
		RepoUser repoUser = new RepoUser();
		User foundUser = repoUser.findByUsername(username);
		if(foundUser != null)
		{
			if(foundUser.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
