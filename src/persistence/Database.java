package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Database {
	
	private static EntityManager instance;
	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManager instance()
	{
		if(instance == null || !instance.isOpen())
		{
			entityManagerFactory = Persistence.createEntityManagerFactory( "LearnProjectPU" );
			instance = entityManagerFactory.createEntityManager();
		}
		return instance;
	}
	
	public static void close()
	{
		if(instance != null)
		{
			instance.close();
			entityManagerFactory.close();
		}
	}
}
