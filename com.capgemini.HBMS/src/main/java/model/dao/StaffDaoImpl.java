package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.StaffDto;
import dto.UserDto;

public class StaffDaoImpl implements StaffDao
{

	public void staffRegister() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		StaffDto staff=new StaffDto();
		staff.setUsername("Robin");
		staff.setPassword("robin");
		staff.setAddress("spnagar,hyderabad");
		staff.setEmail("robinrooms@gmail.com");
		staff.setMobile("6304606294");
		
		
		manager.persist(staff);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
	}

	public void stafflogin() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		StaffDto staffLogin=manager.find(StaffDto.class, "Robin");
		System.out.println(staffLogin);
		manager.clear();
		managerFactory.close();
	}
	public static void main(String[] args) {
		StaffDaoImpl staff=new StaffDaoImpl();
		staff.staffRegister();
		
	}
	
}
