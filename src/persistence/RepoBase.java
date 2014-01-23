package persistence;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import domain.ModelBase;

public abstract class RepoBase<T extends ModelBase> {
	
	private Class<T> theClass;
	
	public RepoBase(Class<T> theClass) {
		this.theClass = theClass;
	}
	
	public List<T> findAll()
	{
		CriteriaBuilder cb = Database.instance().getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(theClass);
        Root<T> rootEntry = cq.from(theClass);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = Database.instance().createQuery(all);
        return allQuery.getResultList();
	}
	
	public T findById(Long id)
	{
		return Database.instance().find(theClass, id);
	}
	
	public void save(T element)
	{
		Database.instance().getTransaction().begin();
		Database.instance().persist(element);
		Database.instance().getTransaction().commit();
	}
	
	public void remove(T element)
	{
		Database.instance().getTransaction().begin();
		Database.instance().remove(element);
		Database.instance().getTransaction().commit();
	}
}
