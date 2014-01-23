package persistence;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import domain.User;
import domain.User_;

public class RepoUser extends RepoBase<User> {

	public RepoUser() {
		super(User.class);
	}
	
	public User findByUsername(String username)
	{
		CriteriaBuilder cb = Database.instance().getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> u = cq.from(User.class);
		cq.where(cb.equal(u.get(User_.username), username));
		TypedQuery<User> tq = Database.instance().createQuery(cq);
		List<User> results = tq.getResultList();
		if(!results.isEmpty())
		{
			return results.get(0);
		}
		return null;
	}
}
