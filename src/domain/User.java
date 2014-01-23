package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import persistence.RepoBase;
import persistence.RepoUser;

@Entity
public class User extends ModelBase{

	@Column(unique=true)
	private String username;
	@Column
	private String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public RepoBase getRepo() {
		return new RepoUser();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
