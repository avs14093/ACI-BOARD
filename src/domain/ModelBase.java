package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import persistence.RepoBase;

@MappedSuperclass
public abstract class ModelBase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public ModelBase() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if(id == null)
		{
			this.id = id;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ModelBase)
		{
			return ((ModelBase) obj).getId().equals(id);
		}
		return false;
	}
	
	public abstract RepoBase getRepo();
	
	public void save()
	{
		getRepo().save(this);
	}
}
