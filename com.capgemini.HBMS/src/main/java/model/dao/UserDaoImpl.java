package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import dto.UserDto;

public class UserDaoImpl implements UserDao{

	public boolean userRegister(UserDto user) 
	{
		System.out.println("deo");
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("PersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		return true;
	}

	public boolean userLogin(UserDto user)
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("PersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		UserDto userLogin=manager.find(UserDto.class, "Robin");
		System.out.println(userLogin);
		manager.clear();
		managerFactory.close();
		return true;
	}
	
}
